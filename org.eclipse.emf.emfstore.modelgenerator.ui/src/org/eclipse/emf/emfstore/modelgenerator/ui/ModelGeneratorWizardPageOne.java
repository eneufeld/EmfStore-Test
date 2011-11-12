/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.emfstore.modelgenerator.ui;

import java.util.Set;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.emfstore.modelgenerator.common.ModelGeneratorUtil;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;

/**
 * First page of ModelGeneratorWizard. 
 * Shows a table of available ecore models. One model has to be selected to continue.
 * The selected ecore model is used to generate a random model.
 * 
 * @author Franziska
 *
 */
public class ModelGeneratorWizardPageOne extends WizardPage {

	private Table table;

	/**
	 * Constructor.
	 *  @param pagename of the wizard page.
	 */
	public ModelGeneratorWizardPageOne(String pagename) {
		super(pagename);
		setTitle("Model Generator");
		setDescription("Choose a ecore model to generate");
	}

	/**
	 * Create controls of the wizard page.
	 * 
	 * @param parent swt widget. 
	 */
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);

		table = new Table(container, SWT.BORDER | SWT.FULL_SELECTION);
		table.setBounds(0, 10, 574, 272);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);

		GridData data = new GridData(SWT.FILL, SWT.FILL, true, true);
		table.setLayoutData(data);

		String[] titles = { "Name", "NsPrefix", "NsUri" };
		for (int i = 0; i < titles.length; i++) {
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setText(titles[i]);
		}

		initTableItems(table);

		for (int i = 0; i < titles.length; i++) {
			table.getColumn(i).pack();
		}

		table.addSelectionListener(new SelectionListener() {

			public void widgetSelected(SelectionEvent e) {
				TableItem[] selected = table.getSelection();
				ModelGeneratorWizard wizard = (ModelGeneratorWizard) getWizard();
				for (int i = 0; i < selected.length; i++) {
					String nsUri = selected[i].getText(2);
					wizard.setNsUri(nsUri);
					getWizard().getContainer().updateButtons();
				}

			}

			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub

			}

		});

		setControl(container);
		setPageComplete(false);
	}

	private void initTableItems(Table table) {
		Set<EPackage> models = ModelGeneratorUtil.getAllRootEPackages();
		for (EPackage model : models) {
			TableItem item = new TableItem(table, SWT.NONE);
			item.setText(0, model.getName());
			item.setText(1, model.getNsPrefix());
			item.setText(2, model.getNsURI());
		}

	}

	
	/**
	 *{@inheritDoc}.
	 */
	public boolean canFlipToNextPage() {
		if (table.getSelectionCount() > 0) {
			return true;
		} 
		return false;
	}
}
