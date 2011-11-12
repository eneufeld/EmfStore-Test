/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.modelgenerator.ui;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Spinner;

/**
 * Second page of ModelGeneratorWizard. 
 * Fill width and depth of the generated model.
 * 
 * @author Franziska
 *
 */
public class ModelGeneratorWizardPageTwo extends WizardPage {

	/**
	 * Constructor.
	 * @param pagename of the second wizard page.
	 */
	public ModelGeneratorWizardPageTwo(String pagename) {
		super(pagename);
		setPageComplete(false);
		setTitle("Model Generator");
		setDescription("Fill generated project width and depth");
	}

	/**
	 * Create controls of the wizard page.
	 * 
	 * @param parent swt widget. 
	 */
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);

		GridLayout glcontainer = new GridLayout();
		glcontainer.numColumns = 2;
		container.setLayout(glcontainer);

		Label lblProjectWidth = new Label(container, SWT.NONE);
		lblProjectWidth.setBounds(23, 13, 93, 22);
		lblProjectWidth.setText("Project width");

		final Spinner widthSpinner = new Spinner(container, SWT.BORDER);
		widthSpinner.setBounds(122, 10, 47, 22);
		widthSpinner.setMinimum(0);
		widthSpinner.setIncrement(5);

		widthSpinner.addModifyListener(new ModifyListener() {

			public void modifyText(ModifyEvent e) {
				ModelGeneratorWizard wizard = (ModelGeneratorWizard) getWizard();
				wizard.setWidth(widthSpinner.getSelection());
				getWizard().getContainer().updateButtons();

			}

		});

		setControl(container);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);

		Label lblProjectHeigth = new Label(container, SWT.NONE);
		lblProjectHeigth.setBounds(23, 58, 81, 22);
		lblProjectHeigth.setText("Project depth");

		final Spinner depthSpinner = new Spinner(container, SWT.BORDER);
		depthSpinner.setBounds(122, 55, 47, 22);
		depthSpinner.setMinimum(0);
		depthSpinner.setIncrement(5);

		depthSpinner.addModifyListener(new ModifyListener() {

			public void modifyText(ModifyEvent e) {
				ModelGeneratorWizard wizard = (ModelGeneratorWizard) getWizard();
				wizard.setDepth(depthSpinner.getSelection());
				getWizard().getContainer().updateButtons();

			}

		});
	}

	/**
	 *{@inheritDoc}.
	 */
	public boolean canFlipToNextPage() {
		return false;
	}
}
