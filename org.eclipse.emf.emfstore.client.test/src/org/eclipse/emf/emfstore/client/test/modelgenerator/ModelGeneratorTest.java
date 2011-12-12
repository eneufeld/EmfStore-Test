package org.eclipse.emf.emfstore.client.test.modelgenerator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.emfstore.client.model.ProjectSpace;
import org.eclipse.emf.emfstore.common.model.Project;
import org.eclipse.emf.emfstore.common.model.util.ModelUtil;
import org.eclipse.emf.emfstore.common.model.util.SerializationException;
import org.eclipse.emf.emfstore.modelgenerator.ModelGenerator;
import org.eclipse.emf.emfstore.modelgenerator.common.ModelGeneratorConfiguration;
import org.eclipse.emf.emfstore.modelgenerator.common.ModelGeneratorUtil;
import org.eclipse.emf.emfstore.modelgenerator.modelchanger.ModelChanger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ModelGeneratorTest {

	private String modelKey = "http://org/eclipse/example/bowling";
	private int width = 5;
	private int depth = 5;
	private String projectName = "generated";
	private String projectDescription = "TestProject2";

	@Before
	public void beforeTest() {

	}

	@After
	public void afterTest() {

	}

	@Test
	public void testSeedGeneration() {
		long seed = 1l;
		ProjectSpace prjSpace1 = generateProjectSpace();
		ProjectSpace prjSpace2 = generateProjectSpace();

		EPackage pckge = ModelGeneratorUtil.getEPackage(modelKey);

		fillProject(prjSpace1.getProject(), pckge, seed);
		fillProject(prjSpace2.getProject(), pckge, seed);

		assertEqual(prjSpace1.getProject(), prjSpace2.getProject());
	}

	@Test
	public void testSeedChange() {
		long seed = 1l;
		ProjectSpace prjSpace1 = generateProjectSpace();
		ProjectSpace prjSpace2 = generateProjectSpace();

		EPackage pckge = ModelGeneratorUtil.getEPackage(modelKey);

		fillProject(prjSpace1.getProject(), pckge, seed);
		fillProject(prjSpace2.getProject(), pckge, seed);

		ModelChanger.generateChanges(prjSpace1.getProject(), seed, true);
		ModelChanger.generateChanges(prjSpace2.getProject(), seed, true);

		assertEqual(prjSpace1.getProject(), prjSpace2.getProject());
	}

	private ProjectSpace generateProjectSpace() {
		ProjectSpace projectSpace = org.eclipse.emf.emfstore.client.model.ModelFactory.eINSTANCE.createProjectSpace();
		projectSpace.setProject(org.eclipse.emf.emfstore.common.model.ModelFactory.eINSTANCE.createProject());
		projectSpace.setLocalOperations(org.eclipse.emf.emfstore.client.model.ModelFactory.eINSTANCE
			.createOperationComposite());
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getLoadOptions().putAll(ModelUtil.getResourceLoadOptions());
		projectSpace.initResources(resourceSet);
		return projectSpace;
	}

	private void fillProject(Project prj, EPackage pckge, long seed) {
		for (int i = 0; i < width; i++) {
			EClass validClass = getValidEClass(prj, pckge, new ArrayList<EClass>(), seed);
			ModelGeneratorConfiguration config = new ModelGeneratorConfiguration(pckge, validClass, width, depth);
			config.setSeed(seed);
			EObject obj = ModelGenerator.generateModel(config);
			prj.addModelElement(obj);
		}
	}

	private EClass getValidEClass(EObject root, EPackage pckge, List<EClass> ignoredClasses, long seed) {
		List<EClass> allEClasses = new LinkedList<EClass>();
		for (EReference reference : root.eClass().getEAllContainments()) {
			allEClasses.addAll(ModelGeneratorUtil.getAllEContainments(reference));
		}
		// only allow EClasses that appear in the specified EPackage
		allEClasses.retainAll(ModelGeneratorUtil.getAllEClasses(pckge));
		// don't allow any EClass or sub class of all EClasses specified in ignoredClasses
		for (EClass eClass : ignoredClasses) {
			allEClasses.remove(eClass);
			allEClasses.removeAll(ModelGeneratorUtil.getAllSubEClasses(eClass));
		}
		if (allEClasses.isEmpty()) {
			// no valid EClass left
			return null;
		}
		Collections.shuffle(allEClasses, new Random(seed));
		return allEClasses.get(0);
	}

	public static void assertEqual(Project expected, Project compare) {
		try {
			if (!ModelUtil.eObjectToString(expected).equals(ModelUtil.eObjectToString(compare))) {
				throw new AssertionError("Projects are not equal.");
			}
		} catch (SerializationException e) {
			throw new AssertionError("Couldn't compare projects.");
		}
	}
}
