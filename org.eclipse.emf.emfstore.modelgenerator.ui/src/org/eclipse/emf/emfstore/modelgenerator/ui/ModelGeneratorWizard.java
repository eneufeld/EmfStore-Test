/**
O * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.modelgenerator.ui;

import org.eclipse.jface.wizard.Wizard;

/**
 * Wizard to configure a model generation.
 * 
 * @author Franziska
 * 
 */
public class ModelGeneratorWizard extends Wizard {

	/**
	 * NsUri of the ecore model which shall be used to generate a model.
	 */
	private String nsUri;
	
	/**
	 * Width is the maximum amount of children a root object can contain.
	 */
	private int width;
	
	/**
	 * Depth is the maximum hierarchy of the generated model.
	 */
	private int depth;

	private String pageOne = "pageone";
	private String pageTwo = "pagetwo";

	/**
	 *default Constructor.
	 */
	public ModelGeneratorWizard() {
		setWindowTitle("Model Generator");
	}

	@Override
	public void addPages() {
		super.addPage(new ModelGeneratorWizardPageOne(pageOne));
		super.addPage(new ModelGeneratorWizardPageTwo(pageTwo));
	}

	@Override
	public boolean canFinish() {
		if (getNsUri() != null && getWidth() > 0 && getDepth() > 0) {
			return true;
		}
		return false;
	}

	/**
	 * Returns nsUri of model to generate.
	 * @return nsUri.
	 */
	public String getNsUri() {
		return nsUri;
	}

	
	/**
	 * Sets nsUri of model to generate.
	 * @param nsUri of model to generate.
	 */
	public void setNsUri(String nsUri) {
		this.nsUri = nsUri;
	}

	
	/**
	 * Get width of model to generate.
	 * @return width.
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * Sets width of model to generate.
	 * @param width of model to generate.
	 */
	public void setWidth(int width) {
		this.width = width;
	}

	
	/**
	 * Get depth of model to generate.
	 * @return depth.
	 */
	public int getDepth() {
		return depth;
	}

	/**
	 * Sets depth of model to generate.
	 * @param depth of model to generate.
	 */
	public void setDepth(int depth) {
		this.depth = depth;
	}

	@Override
	public boolean performFinish() {
		// TODO Auto-generated method stub
		return true;
	}

}
