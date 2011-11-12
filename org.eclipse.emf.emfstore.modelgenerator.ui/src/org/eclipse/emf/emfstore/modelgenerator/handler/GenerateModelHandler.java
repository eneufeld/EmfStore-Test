/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.modelgenerator.handler;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.emfstore.client.model.ProjectSpace;
import org.eclipse.emf.emfstore.client.model.WorkspaceManager;
import org.eclipse.emf.emfstore.client.model.util.EMFStoreCommand;
import org.eclipse.emf.emfstore.common.model.Project;
import org.eclipse.emf.emfstore.modelgenerator.ModelGenerator;
import org.eclipse.emf.emfstore.modelgenerator.common.ModelGeneratorConfiguration;
import org.eclipse.emf.emfstore.modelgenerator.common.ModelGeneratorUtil;
import org.eclipse.emf.emfstore.modelgenerator.ui.ModelGeneratorWizard;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.internal.keys.model.ModelElement;


/**
 * Handler for the "Generate Model" context menu command for the ECP.
 * The command is available if nothing or an EObject is selected.
 * This handler generates a model using values from the selection made,
 * the package defined in <code>modelKey</code> and width
 * and depth as defined in <code>width</code> and <code>depth</code>.
 */
public class GenerateModelHandler extends AbstractHandler {
	
	/**
	 * The NsURI of the EPackage to generate EObjects from.
	 * This is only used if a project or nothing is selected,
	 * otherwise the root package of the selected EObject will be used.
	 */
	//private final String modelKey = "http://www.eclipse.org/emf/2002/Ecore";
	private String modelKey = "http://eclipse.org/emf/emfstore/client/test/model";
	
	/**
	 * The maximum number of children for each EObject.
	 */
	private int width = 5;
	
	/**
	 * The maximum hierarchy depth of the project.
	 */
	private int depth = 5;
	
	/**
	 * {@inheritDoc}
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		final ISelection selection = HandlerUtil.getCurrentSelection(event);
		
		ModelGeneratorWizard wizard = new ModelGeneratorWizard();
		WizardDialog dialog = new WizardDialog(Display.getCurrent().getActiveShell(), wizard);
		dialog.create();
		dialog.open();
		
		modelKey = wizard.getNsUri();
		width = wizard.getWidth();
		depth = wizard.getDepth();
				
		new EMFStoreCommand() {

			@Override
			protected void doRun() {
				EObject rootObject = validateSelection(selection);
				EPackage pckge = getRootPackage(rootObject);
				generate(rootObject, pckge);
			}
		}.run(false);

		return null;
	}
	
	/**
	 * Splits the actual generation process into <code>width</code> sub-processes,
	 * due to performance issues. Every root of the performed sub-processes is added
	 * to <code>rootObject</code> as a child.
	 * 
	 * @param rootObject the rootObject of the model to generate
	 * @param pckge the EPackage to use for the generation process
	 * @see #addAsChild(EObject, EObject)
	 */
	private void generate(EObject rootObject, EPackage pckge) {
		List<EClass> ignoredClasses = new LinkedList<EClass>();
		// create width subroots
		for(int i=0; i<width; i++) {
			EClass subRootClass = getValidEClass(rootObject, pckge, ignoredClasses);
			if(subRootClass == null) {
				// no valid EClasses left -> cancel process
				return;
			}
			ModelGeneratorConfiguration config = new ModelGeneratorConfiguration(pckge, subRootClass, 
				ignoredClasses, width, depth-1, System.currentTimeMillis(), true);
			// generate sub-hierarchy and add the new subroot as a child to the actual root
			addAsChild(rootObject, ModelGenerator.generateModel(config));
		}
	}
	
	/**
	 * Adds/Sets <code>childObject</code> as a child to <code>parentEObject</code> using
	 * Add/SetCommands, if <code>parentEObject</code> is no project. Otherwise, uses the
	 * {@link Project#addModelElement(ModelElement)}-method to add a new ModelElement.
	 * 
	 * @param parentEObject the EObject <code>childObject</code> shall be added to
	 * @param childObject the EObject that shall be added to <code>parentEObject</code>
	 */
	private void addAsChild(EObject parentEObject, EObject childObject) {
		if(parentEObject instanceof Project) {
			((Project) parentEObject).addModelElement(childObject);
			return;
		}
		for(EReference reference : ModelGeneratorUtil.getAllPossibleContainingReferences(childObject.eClass(), parentEObject.eClass())) {
			if(reference.isMany()) {
				// was the adding successful?
				if(ModelGeneratorUtil.addPerCommand(parentEObject, reference, childObject,
					null, false) != null) {
					// then we are done
					return;
				}
			}
			else {
				// was setting the reference successful?
				if(ModelGeneratorUtil.setPerCommand(parentEObject, reference, childObject,
					null, false) != null) {
					// then we are done
					return;
				}
			}
		}
	}
	
	/**
	 * Returns the root EPackage of an EObject or the EPackage
	 * specified by <code>MODEL_KEY</code> if <code>eObject</code>
	 * is a Project.
	 * 
	 * @param eObject the EObject to get the root package for
	 * @return the root EPackage of <code>eObject</code>
	 */
	private EPackage getRootPackage(EObject eObject) {
		if(eObject instanceof Project) {
			return ModelGeneratorUtil.getEPackage(modelKey);
		} else {
			EPackage pckge;
			pckge = eObject.eClass().getEPackage();
			while(pckge.getESuperPackage() != null) {
				pckge = pckge.getESuperPackage();
			}
			return pckge;
		}
	}
	
	/**
	 * Returns the selected EObject, or a project if a ProjectSpace was selected.
	 * If nothing was selected, creates and returns a new Project.
	 * Otherwise this method shouldn't be called, and therefore an 
	 * IllegalArgumentException is thrown.
	 * 
	 * @param selection the current selection made
	 * @return the valid EObject made from the selection
	 * @throws IllegalArgumentException if selection failed or no EObject is selected
	 */
	private EObject validateSelection(ISelection selection) {
		if(selection != null && selection instanceof IStructuredSelection) {
			IStructuredSelection strucSel = (IStructuredSelection) selection;
			Object selectedElement = strucSel.getFirstElement();
			if(selectedElement instanceof ProjectSpace) {
				return ((ProjectSpace) selectedElement).getProject();
			} else if(selectedElement instanceof EObject) {
				return (EObject) selectedElement;
			} else if(selectedElement==null) {
				return WorkspaceManager.getInstance().getCurrentWorkspace().createLocalProject("Generated Project", "Generated").getProject();
			} else {
				throw new IllegalArgumentException("No EObject selected!");
			}
		} else {
			throw new IllegalArgumentException("Selection Error!");
		}
	}
	
	/**
	 * Returns the next valid EClass, that is an EClass that is neither
	 * abstract, nor an interface, from an EPackage. Any EClass that is contained in 
	 * <code>ignoredClasses</code> or a subclass of any EClass contained in 
	 * <code>ignoredClasses</code> won't be returned.
	 * 
	 * @param ignoredClasses list of all EClasses that shouldn't be instantiated. All
	 * subClasses will be ignored as well 
	 * @param allEClasses all EClasses to choose from
	 * @return the next EClass that can be instantiated or <code>null</code>
	 * if there is no such EClass
	 */
	private EClass getValidEClass(EObject root, EPackage pckge, List<EClass> ignoredClasses) {
		List<EClass> allEClasses = new LinkedList<EClass>();
		for(EReference reference : root.eClass().getEAllContainments()) {
			allEClasses.addAll(ModelGeneratorUtil.getAllEContainments(reference));
		}
		// only allow EClasses that appear in the specified EPackage
		allEClasses.retainAll(ModelGeneratorUtil.getAllEClasses(pckge));
		// don't allow any EClass or sub class of all EClasses specified in ignoredClasses
		for(EClass eClass : ignoredClasses) {
			allEClasses.remove(eClass);
			allEClasses.removeAll(ModelGeneratorUtil.getAllSubEClasses(eClass));
		}
		if(allEClasses.isEmpty()) {
			// no valid EClass left
			return null;
		}
		Collections.shuffle(allEClasses);
		return allEClasses.get(0);
	}
}
