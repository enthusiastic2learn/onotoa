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
/**
 * 
 */
package de.topicmapslab.tmcledit.model.dialogs;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import de.topicmapslab.tmcledit.model.KindOfTopicType;
import de.topicmapslab.tmcledit.model.ModelFactory;
import de.topicmapslab.tmcledit.model.TopicType;
import de.topicmapslab.tmcledit.model.index.ModelIndexer;

/**
 * @author Hannes Niederhausen
 *
 */
public class NewTopicTypeWizard extends Wizard {

	private NewTypeWizardPage page1;
	
	private TopicType newTopicType;
	private KindOfTopicType defaultType = KindOfTopicType.TOPIC_TYPE;
	
	public NewTopicTypeWizard() {
		setWindowTitle("New Topic Type..");
	}
	
	@Override
	public void addPages() {
		page1 = new NewTypeWizardPage();
		page1.setDefaultType(defaultType);
		addPage(page1);
	}
	
	@Override
	public boolean performFinish() {
		newTopicType = page1.createNewType();
		return true;
	}
	
	public TopicType getNewTopicType() {
		return newTopicType;
	}

	
	
	public void setDefaultType(KindOfTopicType type) {
		this.defaultType = type;
		if (page1!=null)
			page1.setDefaultType(type);
	}



	private class NewTypeWizardPage extends WizardPage {

		private Text nameText;
		private Text identifierText;
		private Text locatorText;

		private boolean syncIdentifier;
		
		private Button buttons[];
		private int selButton = 0;
		
		protected NewTypeWizardPage() {
			super("new type");
			setTitle("Topic Type");
			String baseLocator = ModelIndexer.getInstance().getTopicMapSchema().getBaseLocator();
			syncIdentifier = ((baseLocator!=null) && (baseLocator.length()>0));
		}

		public void createControl(Composite parent) {
			Composite comp = new Composite(parent, SWT.NONE);
			comp.setLayout(new GridLayout());
			
			createTypeControl(comp);
			createNameControl(comp);
			
			
			setControl(comp);
			setPageComplete(false);
		}

		private void createTypeControl(Composite parent) {
			Group group = new Group(parent, SWT.BORDER);
			group.setLayoutData(new GridData(GridData.FILL_BOTH));
			group.setText("Type:");
			group.setLayout(new GridLayout(3, false));
			
			String labels[] = {"Topic Type",  "Occurrence Type", "Name Type", 
					"Role Type", "Association Type", "Scope Type"};
			
			buttons = new Button[labels.length];
			
			for (int i=0; i<labels.length; i++) {
				buttons[i] = new Button(group, SWT.RADIO);
				buttons[i].setText(labels[i]);
				
			}
			
			buttons[selButton].setSelection(true);
			
		}
		
		public void setDefaultType(KindOfTopicType type) {
			this.selButton = type.getValue();
		}

		private void createNameControl(Composite parent) {
			Composite comp = new Composite(parent, SWT.NONE);
			comp.setLayoutData(new GridData(GridData.FILL_BOTH));
			comp.setLayout(new GridLayout(2, false));
			
			GridDataFactory fac = GridDataFactory.createFrom(new GridData(
					GridData.FILL_HORIZONTAL));
			
			Label label = new Label(comp, SWT.NONE);
			label.setText("Name:");
			
			nameText = new Text(comp, SWT.BORDER);
			fac.applyTo(nameText);
			nameText.addModifyListener(new ModifyListener() {

				public void modifyText(ModifyEvent e) {
					if (nameText.getText().length()>0) {
						if (syncIdentifier) {
							String bl = ModelIndexer.getInstance().getTopicMapSchema().getBaseLocator();
							identifierText.setText(bl+"/"+nameText.getText().toLowerCase());
							syncIdentifier=true;
						}
						setPageComplete(true);
					} else {
						if (syncIdentifier) {
							identifierText.setText("");
							syncIdentifier=true;
						}
						setPageComplete(false);
					}
					
				}
				
			});
			
			label = new Label(comp, SWT.NONE);
			label.setText("Subject Identifier:");
			
			identifierText = new Text(comp, SWT.BORDER);
			identifierText.addModifyListener(new ModifyListener() {
				
				public void modifyText(ModifyEvent e) {
					syncIdentifier = false;
				}
			});
			fac.applyTo(identifierText);
			
			label = new Label(comp, SWT.NONE);
			label.setText("Subject Locator:");
			
			locatorText = new Text(comp, SWT.BORDER);
			fac.applyTo(locatorText);
		}

		@Override
		public void setVisible(boolean visible) {
			super.setVisible(visible);
			if (visible)
				nameText.setFocus();
		}
		
		private TopicType createNewType() {
			ModelFactory factory = ModelFactory.eINSTANCE;
			TopicType type = factory.createTopicType();
			int selection = -1;
			for (int i=0; i<buttons.length; i++) {
				if (buttons[i].getSelection())
					selection = i;
			}
			
			switch(selection) {
			case KindOfTopicType.ASSOCIATION_TYPE_VALUE:
				type = factory.createAssociationType();
				break;
			case KindOfTopicType.ROLE_TYPE_VALUE:
				type = factory.createRoleType();
				break;
			case KindOfTopicType.NAME_TYPE_VALUE:
				type = factory.createNameType();
				break;
			case KindOfTopicType.OCCURRENCE_TYPE_VALUE:
				type = factory.createOccurrenceType();
				break;
			default:
				type = factory.createTopicType();
				
				break;
			}
			type.setKind(KindOfTopicType.get(selection));
			type.setName(nameText.getText());
			
			if (identifierText.getText().length()>0)
				type.getIdentifiers().add(identifierText.getText());

			if (locatorText.getText().length()>0)
				type.getLocators().add(locatorText.getText());
	
			return type;
		}
	}
}
