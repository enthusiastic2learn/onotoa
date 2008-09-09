/**
 * 
 */
package de.topicmapslab.tmcledit.application;

import java.util.Iterator;

import org.eclipse.emf.common.ui.action.WorkbenchWindowActionDelegate;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.edit.ui.action.LoadResourceAction;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.Dialog;

public class OpenURIAction extends WorkbenchWindowActionDelegate {

	@SuppressWarnings("unchecked")
	public void run(IAction action) {
		LoadResourceAction.LoadResourceDialog loadResourceDialog = new LoadResourceAction.LoadResourceDialog(
				getWindow().getShell());
		if (Dialog.OK == loadResourceDialog.open()) {
			for (Iterator i = loadResourceDialog.getURIs().iterator(); i
					.hasNext();) {
				DiagramEditorActionBarAdvisor.openEditor(getWindow().getWorkbench(), (URI) i.next());
			}
		}
	}
}