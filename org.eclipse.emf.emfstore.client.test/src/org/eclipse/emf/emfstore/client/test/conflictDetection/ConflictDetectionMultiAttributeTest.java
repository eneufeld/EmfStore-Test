/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.client.test.conflictDetection;

import static org.junit.Assert.assertEquals;

import org.eclipse.emf.emfstore.client.model.util.EMFStoreCommand;
import org.eclipse.emf.emfstore.client.model.util.EMFStoreCommandWithParameter;
import org.eclipse.emf.emfstore.client.model.util.EMFStoreCommandWithResult;
import org.eclipse.emf.emfstore.client.test.testmodel.TestElement;
import org.eclipse.emf.emfstore.server.model.versioning.operations.AbstractOperation;
import org.eclipse.emf.emfstore.server.model.versioning.operations.MultiAttributeMoveOperation;
import org.eclipse.emf.emfstore.server.model.versioning.operations.MultiAttributeOperation;
import org.eclipse.emf.emfstore.server.model.versioning.operations.MultiAttributeSetOperation;
import org.junit.Test;

/**
 * Conflicttests for MultiAttribute, -Set and -Move operations.
 * 
 * @author wesendon
 */
public class ConflictDetectionMultiAttributeTest extends ConflictDetectionTest {

	private TestElement getFilledTestElement(int count) {
		TestElement testElement = getTestElement();
		for (int i = 0; i < count; i++) {
			testElement.getStrings().add("value" + i);
		}
		return testElement;
	}

	/**
	 * Remove vs add.
	 */
	@Test
	public void multiAttRemoveVsAdd() {

		TestElement testElement = new EMFStoreCommandWithResult<TestElement>() {
			@Override
			protected TestElement doRun() {
				TestElement testElement = getFilledTestElement(3);
				clearOperations();
				testElement.getStrings().remove(0);
				return testElement;
			}
		}.run(false);

		AbstractOperation removeOp = new EMFStoreCommandWithResult<AbstractOperation>() {

			@Override
			protected AbstractOperation doRun() {
				AbstractOperation removeOp = checkAndGetOperation(MultiAttributeOperation.class);
				return removeOp;
			}
		}.run(false);

		new EMFStoreCommandWithParameter<TestElement>() {
			@Override
			public void doRun(TestElement testElement) {
				testElement.getStrings().add(1, "inserted");
			}
		}.run(testElement, false);

		AbstractOperation addOp = new EMFStoreCommandWithResult<AbstractOperation>() {

			@Override
			protected AbstractOperation doRun() {
				AbstractOperation addOp = checkAndGetOperation(MultiAttributeOperation.class);
				return addOp;
			}
		}.run(false);

		assertEquals(true, doConflict(removeOp, addOp));
		assertEquals(true, doConflict(addOp, removeOp));
	}

	/**
	 * Add vs add.
	 */
	@Test
	public void multiAttAddVsAdd() {
		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				TestElement testElement = getFilledTestElement(3);
				clearOperations();

				testElement.getStrings().add(0, "inserted1");
				AbstractOperation add1 = checkAndGetOperation(MultiAttributeOperation.class);

				testElement.getStrings().add(1, "inserted2");
				AbstractOperation add2 = checkAndGetOperation(MultiAttributeOperation.class);

				assertEquals(true, doConflict(add1, add2));
				assertEquals(true, doConflict(add2, add1));
			}
		}.run(false);
	}

	/**
	 * remove vs remove.
	 */
	@Test
	public void multiAttRemoveVsRemove() {
		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				TestElement testElement = getFilledTestElement(3);
				clearOperations();

				testElement.getStrings().remove(2);
				AbstractOperation remove1 = checkAndGetOperation(MultiAttributeOperation.class);

				testElement.getStrings().remove(1);
				AbstractOperation remove2 = checkAndGetOperation(MultiAttributeOperation.class);

				assertEquals(true, doConflict(remove1, remove2));
				assertEquals(true, doConflict(remove2, remove1));
			}
		}.run(false);
	}

	/**
	 * Move vs add.
	 */
	@Test
	public void multiAttMoveVsAdd() {
		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				TestElement testElement = getFilledTestElement(3);
				clearOperations();

				testElement.getStrings().add(0, "inserted");
				AbstractOperation add = checkAndGetOperation(MultiAttributeOperation.class);

				testElement.getStrings().move(1, 2);
				AbstractOperation move = checkAndGetOperation(MultiAttributeMoveOperation.class);

				assertEquals(true, doConflict(add, move));
				assertEquals(true, doConflict(move, add));
			}
		}.run(false);
	}

	/**
	 * Move vs remove.
	 */
	@Test
	public void multiAttMoveVsRemove() {
		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				TestElement testElement = getFilledTestElement(3);
				clearOperations();

				testElement.getStrings().move(2, 0);
				AbstractOperation move = checkAndGetOperation(MultiAttributeMoveOperation.class);

				testElement.getStrings().remove(0);
				AbstractOperation add = checkAndGetOperation(MultiAttributeOperation.class);

				assertEquals(true, doConflict(add, move));
				assertEquals(true, doConflict(move, add));
			}
		}.run(false);
	}

	/**
	 * Move vs move - conflict.
	 */
	// Move vs move is a soft conflict
	// @Test
	// public void multiAttMoveVsMoveConflict() {
	// new EMFStoreCommand() {
	// @Override
	// protected void doRun() {
	// TestElement testElement = getFilledTestElement(3);
	// clearOperations();
	//
	// testElement.getStrings().move(1, 2);
	// AbstractOperation move1 = checkAndGetOperation(MultiAttributeMoveOperation.class);
	//
	// testElement.getStrings().move(1, 0);
	// AbstractOperation move2 = checkAndGetOperation(MultiAttributeMoveOperation.class);
	//
	// assertEquals(true, doConflict(move2, move1));
	// assertEquals(true, doConflict(move1, move2));
	// }
	// }.run(false);
	// }

	/**
	 * Move vs move - no conflict.
	 */
	@Test
	public void multiAttMoveVsMoveNoConflict() {
		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				TestElement testElement = getFilledTestElement(4);
				clearOperations();

				testElement.getStrings().move(0, 1);
				AbstractOperation move1 = checkAndGetOperation(MultiAttributeMoveOperation.class);

				testElement.getStrings().move(2, 3);
				AbstractOperation move2 = checkAndGetOperation(MultiAttributeMoveOperation.class);

				assertEquals(false, doConflict(move2, move1));
				assertEquals(false, doConflict(move1, move2));
			}
		}.run(false);
	}

	/**
	 * Set vs add - no conflict.
	 */
	@Test
	public void multiAttSetVsAddNoConflict() {
		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				TestElement testElement = getFilledTestElement(4);
				clearOperations();

				testElement.getStrings().set(0, "set");
				AbstractOperation set = checkAndGetOperation(MultiAttributeSetOperation.class);

				testElement.getStrings().add(1, "added");
				AbstractOperation add = checkAndGetOperation(MultiAttributeOperation.class);

				assertEquals(false, doConflict(set, add));
				assertEquals(false, doConflict(add, set));
			}
		}.run(false);
	}

	/**
	 * Set vs add - conflict.
	 */
	@Test
	public void multiAttSetVsAddConflict() {
		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				TestElement testElement = getFilledTestElement(4);
				clearOperations();

				testElement.getStrings().set(1, "set");
				AbstractOperation set = checkAndGetOperation(MultiAttributeSetOperation.class);

				testElement.getStrings().add(0, "added");
				AbstractOperation add = checkAndGetOperation(MultiAttributeOperation.class);

				assertEquals(true, doConflict(set, add));
				assertEquals(true, doConflict(add, set));
			}
		}.run(false);
	}

	/**
	 * Set vs remove - no conflict.
	 */
	@Test
	public void multiAttSetVsRemoveNoConflict() {
		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				TestElement testElement = getFilledTestElement(4);
				clearOperations();

				testElement.getStrings().set(0, "set");
				AbstractOperation set = checkAndGetOperation(MultiAttributeSetOperation.class);

				testElement.getStrings().remove(1);
				AbstractOperation remove = checkAndGetOperation(MultiAttributeOperation.class);

				assertEquals(false, doConflict(set, remove));
				assertEquals(false, doConflict(remove, set));
			}
		}.run(false);
	}

	/**
	 * Set vs remove - conflict.
	 */
	@Test
	public void multiAttSetVsRemoveConflict() {
		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				TestElement testElement = getFilledTestElement(4);
				clearOperations();

				testElement.getStrings().set(1, "set");
				AbstractOperation set = checkAndGetOperation(MultiAttributeSetOperation.class);

				testElement.getStrings().remove(0);
				AbstractOperation remove = checkAndGetOperation(MultiAttributeOperation.class);

				assertEquals(true, doConflict(set, remove));
				assertEquals(true, doConflict(remove, set));
			}
		}.run(false);
	}

	/**
	 * Move vs Set - conflict.
	 */
	@Test
	public void multiAttSetVsMoveConflict() {
		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				TestElement testElement = getFilledTestElement(4);
				clearOperations();

				testElement.getStrings().set(1, "set");
				AbstractOperation set = checkAndGetOperation(MultiAttributeSetOperation.class);

				testElement.getStrings().move(0, 2);
				AbstractOperation move = checkAndGetOperation(MultiAttributeMoveOperation.class);

				assertEquals(true, doConflict(set, move));
				assertEquals(true, doConflict(move, set));
			}
		}.run(false);
	}

	/**
	 * Move vs Set - no conflict.
	 */
	@Test
	public void multiAttSetVsMoveNoConflict() {
		new EMFStoreCommand() {
			@Override
			protected void doRun() {
				TestElement testElement = getFilledTestElement(4);
				clearOperations();

				testElement.getStrings().set(1, "set");
				AbstractOperation set = checkAndGetOperation(MultiAttributeSetOperation.class);

				testElement.getStrings().move(2, 3);
				AbstractOperation move = checkAndGetOperation(MultiAttributeMoveOperation.class);

				assertEquals(false, doConflict(set, move));
				assertEquals(false, doConflict(move, set));
			}
		}.run(false);
	}
}
