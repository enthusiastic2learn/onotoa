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
package de.topicmapslab.tmcledit.model.util;

import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gef.ui.actions.ActionRegistry;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IPersistableElement;

import de.topicmapslab.tmcledit.model.Diagram;

/**
 * @author Hannes Niederhausen
 *
 */
public class TMCLEditorInput implements IEditorInput {

	private final Diagram diagram;
	private final boolean exists;
	private final EditingDomain editingDomain;
	
	private final ActionRegistry actionRegistry;
	
	
	
	
	public TMCLEditorInput(Diagram diagram, EditingDomain editingDomain,
			ActionRegistry actionRegistry, boolean exists) {
		super();
		this.diagram = diagram;
		this.editingDomain = editingDomain;
		this.exists = exists;
		this.actionRegistry = actionRegistry;
	}

	public boolean exists() {
		return exists;
	}

	public ImageDescriptor getImageDescriptor() {
		return null;
	}

	public String getName() {
		return diagram.getName();
	}

	public IPersistableElement getPersistable() {
		return null;
	}

	public String getToolTipText() {
		return diagram.getName();
	}

	@SuppressWarnings("unchecked")
	public Object getAdapter(Class adapter) {
		return null;
	}
	
	public EditingDomain getEditingDomain() {
		return editingDomain;
	}

	public Diagram getDiagram() {
		return diagram;
	}

	public ActionRegistry getActionRegistry() {
	    return actionRegistry;
    }
}