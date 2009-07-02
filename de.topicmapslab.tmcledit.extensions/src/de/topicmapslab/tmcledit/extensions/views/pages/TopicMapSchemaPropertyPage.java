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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;

import de.topicmapslab.tmcledit.model.ModelPackage;
import de.topicmapslab.tmcledit.model.TopicMapSchema;
import de.topicmapslab.tmcledit.model.commands.GenericSetCommand;

public class TopicMapSchemaPropertyPage extends AbstractModelPage {

	private Text name;
	private Text baseLocator;

	public TopicMapSchemaPropertyPage() {
		super("topicmapschema");
	}

	@Override
	public void updateUI() {
		if (name == null)
			return;
		if (getCastedModel() != null) {
			String tmp = getCastedModel().getBaseLocator();
			if (tmp != null)
				baseLocator.setText(tmp);
			else
				baseLocator.setText("urn:x-ontopia");
		} else {
			name.setText("");
			baseLocator.setText("");
		}
	}

	public TopicMapSchema getCastedModel() {
		return (TopicMapSchema) getModel();
	}

	@Override
	public void createControl(Composite parent) {
		FormToolkit toolkit = new FormToolkit(parent.getDisplay());

		Section section = toolkit.createSection(parent, SWT.TITLE);
		section.setText("Topic Map Schema");
		Composite comp = toolkit.createComposite(section);
		comp.setLayoutData(new GridData(GridData.FILL_BOTH));
		comp.setLayout(new GridLayout(2, false));

		toolkit.createLabel(comp, "Name:");
		name = toolkit.createText(comp, "");
		name.setToolTipText("The name of the Topic Map.");

		toolkit.createLabel(comp, "Base Locator:");
		baseLocator = toolkit.createText(comp, "");
		baseLocator
				.setToolTipText("The base locator of the Topic Map. It is used to create subject identifiers"
						+ " or subject locators using this url and the name of the topic.");

		updateUI();

		name.addFocusListener(new TextFocusListener(ModelPackage.TOPIC_MAP_SCHEMA__NAME));
		baseLocator.addFocusListener(new TextFocusListener(ModelPackage.TOPIC_MAP_SCHEMA__BASE_LOCATOR));

		section.setClient(comp);
		setControl(section);
	}

	public void notifyChanged(Notification notification) {
		updateUI();
	}

	private final class TextFocusListener extends FocusAdapter {
		private final int feature;

		
		public TextFocusListener(int feature) {
			super();
			this.feature = feature;
		}

		public void focusLost(FocusEvent e) {
			Text text = (Text) e.widget;
			getCommandStack().execute(
					new GenericSetCommand(getModel(), feature, text.getText()));
		}
	}

}
