package org.eclipse.emf.emfstore.client.test.server;

import static org.junit.Assert.assertTrue;

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
import org.eclipse.emf.emfstore.client.model.Usersession;
import org.eclipse.emf.emfstore.client.test.SetupHelper;
import org.eclipse.emf.emfstore.common.model.Project;
import org.eclipse.emf.emfstore.common.model.util.ModelUtil;
import org.eclipse.emf.emfstore.modelgenerator.ModelGenerator;
import org.eclipse.emf.emfstore.modelgenerator.common.ModelGeneratorConfiguration;
import org.eclipse.emf.emfstore.modelgenerator.common.ModelGeneratorUtil;
import org.eclipse.emf.emfstore.modelgenerator.modelchanger.ModelChanger;
import org.eclipse.emf.emfstore.server.exceptions.EmfStoreException;
import org.eclipse.emf.emfstore.server.model.ProjectInfo;
import org.eclipse.emf.emfstore.server.model.versioning.ChangePackage;
import org.eclipse.emf.emfstore.server.model.versioning.PrimaryVersionSpec;
import org.eclipse.emf.emfstore.server.model.versioning.VersionSpec;
import org.junit.Before;
import org.junit.Test;

public class ModelGeneratorTest extends ServerTests {
	// private Project fullProject;
	private ProjectInfo projectInfo;
	private ProjectSpace projectSpace;
	private String modelKey = "http://org/eclipse/example/bowling";
	private int width = 10;
	private int depth = 2;
	private String projectName = "generated";
	private String projectDescription = "TestProject2";

	@Override
	@Before
	public void beforeTest() throws EmfStoreException {
		super.beforeTest();

		projectSpace = org.eclipse.emf.emfstore.client.model.ModelFactory.eINSTANCE.createProjectSpace();
		projectSpace.setProject(org.eclipse.emf.emfstore.common.model.ModelFactory.eINSTANCE.createProject());
		projectSpace.setProjectName(projectName);
		projectSpace.setProjectDescription(projectDescription);
		projectSpace.setLocalOperations(org.eclipse.emf.emfstore.client.model.ModelFactory.eINSTANCE
			.createOperationComposite());
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getLoadOptions().putAll(ModelUtil.getResourceLoadOptions());
		projectSpace.initResources(resourceSet);

		Usersession session = org.eclipse.emf.emfstore.client.model.ModelFactory.eINSTANCE.createUsersession();
		session.setServerInfo(SetupHelper.getServerInfo());
		session.setUsername("super");
		session.setPassword("super");
		session.setSessionId(getSessionId());
		projectSpace.setUsersession(session);
		projectSpace.eResource().getContents().add(session);
		projectSpace.eResource().getContents().add(session.getServerInfo());

		EPackage pckge = ModelGeneratorUtil.getEPackage(modelKey);

		for (int i = 0; i < width; i++) {
			EClass validClass = getValidEClass(projectSpace.getProject(), pckge, new ArrayList<EClass>());
			ModelGeneratorConfiguration config = new ModelGeneratorConfiguration(pckge, validClass, width, depth);
			EObject obj = ModelGenerator.generateModel(config);
			projectSpace.getProject().addModelElement(obj);
		}

		// count num of projects
		assertTrue(getConnectionManager().getProjectList(getSessionId()).size() == getProjectsOnServerBeforeTest());

		// add project to Server
		projectSpace.shareProject(session);
		projectInfo = projectSpace.getProjectInfo();

		// check that number increased
		assertTrue(getConnectionManager().getProjectList(getSessionId()).size() == getProjectsOnServerBeforeTest() + 1);
	}

	private EClass getValidEClass(EObject root, EPackage pckge, List<EClass> ignoredClasses) {
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
		Collections.shuffle(allEClasses, new Random(System.currentTimeMillis()));
		return allEClasses.get(0);
	}

	@Test
	public void generateModelTest() throws EmfStoreException {
		Project pro = getConnectionManager().getProject(getSessionId(), projectSpace.getProjectId(),
			VersionSpec.HEAD_VERSION);
		assertEqual(projectSpace.getProject(), pro);

	}

	@Test
	public void changeModelTest() throws EmfStoreException {
		// try {
		System.out.println("BEFORE CHANGES:" + projectSpace.getProject().getAllModelElements().size());
		// System.out.println(ModelUtil.eObjectToString(projectSpace.getProject()));
		ModelChanger.generateChanges(projectSpace.getProject(), System.currentTimeMillis(), true);

		System.out.println("VERSION BEFORE commit:" + projectInfo.getVersion().getIdentifier());
		PrimaryVersionSpec version = projectSpace.commit();
		System.out.println("VERSION AFTER commit:" + version.getIdentifier());

		ChangePackage cpServer = getConnectionManager().getChanges(getSessionId(), projectInfo.getProjectId(),
			projectInfo.getVersion(), VersionSpec.HEAD_VERSION).get(0);
		ChangePackage changePackage = projectSpace.getChanges(projectInfo.getVersion(), version).get(0);

		// System.out.println("CHANGES LOCAL:");
		// System.out.println(ModelUtil.eObjectToString(changePackage));
		// System.out.println("CHANGES SERVER:");
		// System.out.println(ModelUtil.eObjectToString(cpServer));

		Project pro = getConnectionManager().getProject(getSessionId(), projectSpace.getProjectId(),
			VersionSpec.HEAD_VERSION);

		System.out.println("APPLIED CHANGES:" + projectSpace.getProject().getAllModelElements().size());
		// System.out.println(ModelUtil.eObjectToString(projectSpace.getProject()));
		System.out.println("FROM SERVER:" + pro.getAllModelElements().size());
		// System.out.println(ModelUtil.eObjectToString(pro));
		assertEqual(projectSpace.getProject(), pro);
		// } catch (SerializationException e) {
		// e.printStackTrace();
		// }
	}

}
