/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.modelgenerator;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.emfstore.modelgenerator.common.ModelGeneratorConfiguration;
import org.eclipse.emf.emfstore.modelgenerator.common.ModelGeneratorUtil;

/**
 * Class for generating Ecore models, static methods only.
 * Generating a model includes:<br>
 * - creating EObjects from a certain model package<br>
 * - building up a hierarchy starting from a certain root EObject<br>
 * - setting random attributes for every created EObject<br>
 * - setting references between the EObjects
 *
 * @see #generateModel(EPackage, EObject)
 * @see #generateModel(ModelGeneratorConfiguration)
 * @see #generateModel(ModelGeneratorConfiguration, IProgressMonitor)
 */
public final class ModelGenerator {

	/**
	 * The configuration containing settings for the generation process.
	 * 
	 * @see ModelGeneratorConfiguration
	 */
	private static ModelGeneratorConfiguration config;
	
	/**
	 * Private constructor.
	 */
	private ModelGenerator() {
		// all methods should be accessed in a static way
	}
	
	/**
	 * Generates EObjects for a certain model indicated by <code>modelPackage</code> and adds them 
	 * as children to <code>rootEObject</code>, setting attributes and references. This method uses
	 * default values for <code>width, depth, seed</code> and <code>ignoreAndLog</code>.<p>
	 * This method call is equivalent to<br>
	 * <code>generateModel(new ModelGeneratorConfiguration(modelPackage, rootEObject))</code>.
	 * 
	 * @param modelPackage the EPackage to create new EObjects from
	 * @param rootEObject the EObject that shall be the root container for all generated EObjects
	 * @return the validated root EObject of the resulting Ecore hierarchy
	 */
	public static EObject generateModel(EPackage modelPackage, EObject rootEObject) {
		return generateModel(new ModelGeneratorConfiguration(modelPackage, rootEObject));
	}
	
	/**
	 * Generates EObjects using the settings specified in <code>config</code>.
	 * 
	 * @param configuration the ModelGeneratorConfiguration to use for generating EObjects
	 * @return the validated root EObject of the resulting Ecore hierarchy
	 * @see ModelGeneratorConfiguration
	 */
	public static EObject generateModel(ModelGeneratorConfiguration configuration) {
		config = configuration;
		ModelGeneratorHelper.init(config);
		EObject rootEObject = generateModel();
		Map<EClass, List<EObject>> allObjectsByEClass = ModelGeneratorUtil.getAllClassesAndObjects(rootEObject);
		for(EClass eClass : allObjectsByEClass.keySet()) {
			for(EObject generatedEObject : allObjectsByEClass.get(eClass)) {
				generateReferences(generatedEObject, allObjectsByEClass);			
			}
		}
		return rootEObject;
	}
	
	/**
	 * Generates EObjects using the settings specified in <code>config</code>, showing
	 * a ProgressBar during the generation process. This also allows to cancel the process.
	 * 
	 * @param configuration the ModelGeneratorConfiguration to use for generating EObjects
	 * @param monitor the progress of the generation process
	 * @return the validated root EObject of the resulting Ecore hierarchy
	 * @see ModelGeneratorConfiguration
	 */
	public static EObject generateModel(ModelGeneratorConfiguration configuration, IProgressMonitor monitor) {
		config = configuration;
		ModelGeneratorHelper.init(config);
		monitor.beginTask("Generation progress", ModelGeneratorHelper.computeAmountOfWork());
		EObject rootEObject = generateModel(monitor);
		Map<EClass, List<EObject>> allObjectsByEClass = ModelGeneratorUtil.getAllClassesAndObjects(rootEObject);
		for(EClass eClass : allObjectsByEClass.keySet()) {
			if(monitor.isCanceled()) {
				break;
			}
			for(EObject generatedEObject : allObjectsByEClass.get(eClass)) {
				if(monitor.isCanceled()) {
					break;
				}
				generateReferences(generatedEObject, allObjectsByEClass);		
			}
		}
		monitor.done();
		return rootEObject;
	}
	
	/**
	 * The method that actually performs the generation. This can only be
	 * accessed by calling {@link #generateModel(EPackage, EObject)} or
	 * {@link #generateModel(ModelGeneratorConfiguration)}
	 * 
	 * @return the valid root EObject used for generating the model
	 * @see #generateModel(EPackage, EObject)
	 * @see #generateModel(ModelGeneratorConfiguration)
	 */
	private static EObject generateModel() {
		EObject rootEObject = ModelGeneratorHelper.validateRoot(config.getRootEObject());
		Map<Integer, List<EObject>> depthToParentObjects = new LinkedHashMap<Integer, List<EObject>>();
		List<EObject> parentsInThisDepth = new LinkedList<EObject>();
		parentsInThisDepth.add(rootEObject);
		int currentDepth = 1;
		depthToParentObjects.put(2, new LinkedList<EObject>());
		while(currentDepth <= config.getDepth()) {
			// for all parent EObjects in this depth
			for(EObject nextParentEObject : parentsInThisDepth) {
				List<EObject> children = generateChildren(nextParentEObject); 
				// will the just created EObjects have children?
				if(currentDepth < config.getDepth()) {
					depthToParentObjects.get(currentDepth+1).addAll(children);
				}
			}
			// proceed to the next level
			currentDepth++;
			parentsInThisDepth = depthToParentObjects.get(currentDepth);
			depthToParentObjects.put((currentDepth+1), new LinkedList<EObject>());
		}
		return rootEObject;
	}
	
	
	/**
	 * The method that actually performs the generation. This can only be
	 * accessed by calling {@link #generateModel(ModelGeneratorConfiguration, IProgressMonitor)}.
	 * Shows a progress bar during the generation process. This also allows
	 * to cancel the process.
	 * 
	 * @param monitor the progress of the generation process
	 * @return the valid root EObject used for generating the model
	 * @see #generateModel(ModelGeneratorConfiguration, IProgressMonitor)
	 */
	private static EObject generateModel(IProgressMonitor monitor) {
		EObject rootEObject = ModelGeneratorHelper.validateRoot(config.getRootEObject());
		Map<Integer, List<EObject>> depthToParentObjects = new LinkedHashMap<Integer, List<EObject>>();
		List<EObject> parentsInThisDepth = new LinkedList<EObject>();
		parentsInThisDepth.add(rootEObject);
		int currentDepth = 1;
		depthToParentObjects.put(2, new LinkedList<EObject>());
		while(currentDepth <= config.getDepth()) {
			if(monitor.isCanceled()) {
				break;
			}
			// for all parent EObjects in this depth
			for(EObject nextParentEObject : parentsInThisDepth) {
				if(monitor.isCanceled()) {
					break;
				}
				List<EObject> children = generateChildren(nextParentEObject); 
				// will the just created EObjects have children?
				if(currentDepth < config.getDepth()) {
					depthToParentObjects.get(currentDepth+1).addAll(children);
				}
				monitor.worked(config.getWidth());
			}
			// proceed to the next level
			currentDepth++;
			parentsInThisDepth = depthToParentObjects.get(currentDepth);
			depthToParentObjects.put((currentDepth+1), new LinkedList<EObject>());
		}
		return rootEObject;
	}
	
	/**
	 * Generates children for a certain parent EObject. Generation includes
	 * setting containment references and attributes. All required references
	 * are set first, thus the specified width might be exceeded.
	 * 
	 * @param parentEObject the EObject to generate children for
	 * @return all generated children as a list
	 * @see #generateContainments(EObject, EReference, int)
	 */
	private static List<EObject> generateChildren(EObject parentEObject) {
		List<EObject> result = new LinkedList<EObject>();
		// set all valid required references
		for(EReference reference : parentEObject.eClass().getEAllContainments()) {
			if(!ModelGeneratorHelper.isValid(parentEObject, reference)) {
				continue;
			}
			// reference's lowerBound is the maximum amount -> only necessary EObjects are created
			result.addAll(generateContainments(parentEObject, reference, reference.getLowerBound()));
		}
		List<EReference> possibleReferences = new LinkedList<EReference>(parentEObject.eClass().getEAllContainments()); 
		// set all possible references until width EObjects are created
		for(int i=result.size(); i<config.getWidth() && !possibleReferences.isEmpty(); i++) {
			EReference reference = ModelGeneratorHelper.getRandomReference(parentEObject, possibleReferences);
			if(reference==null) {
				possibleReferences.remove(reference);
				i--;
				continue;
			}
			// create only one child to guarantee variety
			List<EObject> newChildren = generateContainments(parentEObject, reference, 1);
			if(newChildren.isEmpty()) {
				possibleReferences.remove(reference);
				i--;
			}
			result.addAll(newChildren);
		}
		return result;
	}
	
	/**
	 * Creates <code>maxAmount</code> EObjects, if possible, and adds them as children
	 * to <code>parentEObject</code>.
	 * 
	 * @param parentEObject the EObject to add the created children to
	 * @param reference the reference used to add the created children
	 * @param maxAmount the maxAmount of EObjects to create as children
	 * @return all created children as a list
	 */
	private static List<EObject> generateContainments(EObject parentEObject, 
			EReference reference, int maxAmount) {
		// initialize the generation process
		List<EObject> result = new LinkedList<EObject>();
		int index = ModelGeneratorHelper.getStartingIndex(parentEObject.eClass());
		List<EClass> elementsToCreate = ModelGeneratorHelper.getElementsToCreate(reference);
		// repeat maxAmount times
		for(int i=0; i<maxAmount; i++) {
			EClass currentChildClass = ModelGeneratorHelper.getNextClassToCreate(elementsToCreate, index++);
			if(currentChildClass==null) {
				// no possible child left -> cancel the process
				break;
			}
			// create child and add it to parentEObject
			EObject newChild = ModelGeneratorHelper.setContainment(parentEObject, currentChildClass, reference);
			// was creating the child successful?
			if(newChild!=null) {
				result.add(newChild);
			}
		}
		// save index for later use
		ModelGeneratorHelper.updateIndex(parentEObject.eClass(), index);
		return result;
	}

	/**
	 * Returns the Exception-Log for the last {@link #generateModel()}-call.
	 * The log is empty if no RuntimeException occurred or <code>ignoreAndLog</code>
	 * was set to <code>false</code> in the last configuration used.
	 * 
	 * @return a set of RuntimeExceptions that occurred during the last generation process
	 */
	public static Set<RuntimeException> getLog() {
		return ModelGeneratorHelper.getExceptionLog();
	}

	/**
	 * Generates references (no containment references) for an EObject.
	 * All valid references are set with EObjects generated during the generation process.
	 * 
	 * @param eObject the EObject to set references for
	 * @param allObjectsByEClass all possible EObjects that can be referenced, mapped to their EClass 
	 * @see ModelGeneratorHelper#setReference(EObject, EClass, EReference, Map)
	 */
	private static void generateReferences(EObject eObject, Map<EClass, List<EObject>> allObjectsByEClass) {
		for(EReference reference : ModelGeneratorHelper.getValidReferences(eObject)) {
			for(EClass nextReferenceClass : ModelGeneratorUtil.getReferenceClasses(reference, allObjectsByEClass.keySet())) {
				ModelGeneratorHelper.setReference(eObject, nextReferenceClass, reference, allObjectsByEClass);
			}
		}
	}
}
