/*******************************************************************************
 * Copyright (c) 2008, 2009 Topic Maps Lab and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Hannes Niederhausen - initial API and implementation
 *******************************************************************************/
package de.topicmapslab.tmcledit.extensions.views.pages;

import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.events.HyperlinkAdapter;
import org.eclipse.ui.forms.events.HyperlinkEvent;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Hyperlink;
import org.eclipse.ui.forms.widgets.Section;

import de.topicmapslab.tmcledit.model.KindOfTopicType;
import de.topicmapslab.tmcledit.model.ModelPackage;
import de.topicmapslab.tmcledit.model.NameTypeConstraint;
import de.topicmapslab.tmcledit.model.TopicType;
import de.topicmapslab.tmcledit.model.commands.GenericSetCommand;
import de.topicmapslab.tmcledit.model.dialogs.FilterTopicSelectionDialog;
import de.topicmapslab.tmcledit.model.dialogs.NewTopicTypeWizard;
import de.topicmapslab.tmcledit.model.util.ModelIndexer;

public class NameConstraintDetailPage extends AbstractConstraintModelPage {

	private Text typeText;
	private Button typeButton;
	private Section section;
	
	private NameTypeModelPage typeModelPage;
	
	public NameConstraintDetailPage() {
		super("name constraint");
	}
	
	@Override
	public void createControl(Composite parent) {
		FormToolkit toolkit = new FormToolkit(parent.getDisplay());
		typeModelPage = new NameTypeModelPage();
		CTabFolder folder = new CTabFolder(parent, SWT.NONE);
		typeModelPage.createControl(folder);
		
		CTabItem item1 = new CTabItem(folder, SWT.NONE);
		item1.setText("Name Constraint Properties");
		item1.setControl(createConstraintComposite(folder, toolkit));
		
		
		CTabItem item2 = new CTabItem(folder, SWT.NONE);
		item2.setText("Name Type Properties");
		item2.setControl(typeModelPage.getControl());
		
		
		folder.setSelection(item1);
		setControl(folder);
		
	}

	@Override
	public void setModel(Object model) {
		super.setModel(model);
		if (typeModelPage!=null)
			typeModelPage.setModel(getCastedModel().getType());
	}
	
	private Composite createConstraintComposite(Composite parent, FormToolkit toolkit) {
		section = toolkit.createSection(parent, Section.EXPANDED
				| Section.TITLE_BAR);
		section.setText("Name Constraint");
		Composite comp = toolkit.createComposite(section);
		comp.setLayout(new GridLayout(2, false));

		Hyperlink link = toolkit.createHyperlink(comp, "Type:", SWT.NONE);
		link.addHyperlinkListener(new HyperlinkAdapter() {
			@Override
			public void linkActivated(HyperlinkEvent e) {
				NewTopicTypeWizard wizard = new NewTopicTypeWizard();
				wizard.setDefaultType(KindOfTopicType.NAME_TYPE);
				WizardDialog dlg = new WizardDialog(section.getShell(), wizard);
				
				if (dlg.open()==Dialog.OK) {
					TopicType tt = wizard.getNewTopicType();
					ModelIndexer.getInstance().getTopicMapSchema().getTopicTypes().add(tt);
					getCastedModel().setType(tt);
				}
				
			}
		});
		createTypeComposite(toolkit, comp);
		
		hookButtonListener();
		
		createCommonConstraintControls(comp, toolkit);
		
		section.setClient(comp);
		return section;
	}

	private void createTypeComposite(FormToolkit toolkit, Composite parent) {
		Composite typeComp = toolkit.createComposite(parent);
		typeComp.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		GridLayout layout = new GridLayout(2, false);
		layout.marginWidth = 0;
		
		typeComp.setLayout(layout);
		typeText = toolkit.createText(typeComp, "", SWT.BORDER);
		typeText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		
		typeButton = toolkit.createButton(typeComp, "...", SWT.PUSH);
	}
	
	private void hookButtonListener() {
		typeButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				KindOfTopicType type = null;
				if (ModelIndexer.getInstance().getTopicMapSchema()
						.isActiveNameTypeConstraint()) {
					type = KindOfTopicType.NAME_TYPE;
				}
				FilterTopicSelectionDialog dlg = new FilterTopicSelectionDialog(typeButton.getShell(), type);
				if (Dialog.OK==dlg.open()) {
					getCommandStack().execute(
									new GenericSetCommand(
											getModel(),
											ModelPackage.NAME_TYPE_CONSTRAINT__TYPE,
											dlg.getFirstResult()));
				}
			}
		});
		
	}

	@Override
	public void updateUI() {
		if ( (getCastedModel().getType()!=null) && (getCastedModel().getType().getName()!=null) )
			typeText.setText(getCastedModel().getType().getName());
		else
			typeText.setText("");
		super.updateUI();
	}
	
	protected NameTypeConstraint getCastedModel() {
		return (NameTypeConstraint) getModel();
	}
	
	@Override
	public void setCommandStack(CommandStack commandStack) {
		super.setCommandStack(commandStack);
		if (typeModelPage!=null)
			typeModelPage.setCommandStack(commandStack);
	}
}
