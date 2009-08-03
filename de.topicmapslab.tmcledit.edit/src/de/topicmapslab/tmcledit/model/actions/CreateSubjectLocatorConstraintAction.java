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
package de.topicmapslab.tmcledit.model.actions;

import org.eclipse.emf.common.command.Command;

import de.topicmapslab.tmcledit.model.commands.CreateSubjectLocatorConstraintCommand;
import de.topicmapslab.tmcledit.model.views.ModelView;

/**
 * @author Hannes Niederhausen
 *
 */
public class CreateSubjectLocatorConstraintAction extends AbstractCreateConstraintAction {

	public CreateSubjectLocatorConstraintAction(ModelView view) {
	    super(view);
	    setText("Create &Subject Locator Constraint..");
    }

	@Override
	protected Command getCommand() {
		return new CreateSubjectLocatorConstraintCommand(getTopicType());
	}

}