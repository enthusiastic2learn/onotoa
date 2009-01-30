/**
 * 
 */
package de.topicmapslab.tmcledit.model.validation.actions;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.ui.PlatformUI;

import de.topicmapslab.tmcledit.model.TopicMapSchema;
import de.topicmapslab.tmcledit.model.commands.CreatePrefixMappingCommand;
import de.topicmapslab.tmcledit.model.dialogs.NewPrefixMappingDialog;

/**
 * @author Hannes Niederhausen
 *
 */
public class NewPrefixAction extends ValidationAction {

	private TopicMapSchema schema;
	private String key;
	
	public NewPrefixAction(TopicMapSchema schema, String prefix) {
		this.schema = schema;
		this.key = prefix;
		setText("Create new prefix entry");
	}

	@Override
	public void run() {
		NewPrefixMappingDialog dlg = new NewPrefixMappingDialog(PlatformUI
				.getWorkbench().getActiveWorkbenchWindow().getShell());
		dlg.setKey(key);
		if (Dialog.OK==dlg.open()) {
			CreatePrefixMappingCommand cmd = new CreatePrefixMappingCommand(schema, 
					dlg.getKey(), dlg.getUri());
			if (cmd.canExecute())
				cmd.execute();
		}	

	}

}