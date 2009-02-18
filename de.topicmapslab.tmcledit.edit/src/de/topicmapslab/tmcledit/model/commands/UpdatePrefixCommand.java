/**
 * 
 */
package de.topicmapslab.tmcledit.model.commands;


import org.eclipse.emf.common.command.AbstractCommand;

import de.topicmapslab.tmcledit.model.MappingElement;

/**
 * @author Hannes Niederhausen
 *
 */
public class UpdatePrefixCommand extends AbstractCommand {

	private final MappingElement me;
	private final String oldKey;
	private final String newKey;
	private final String oldValue;
	private final String newValue;

	
	
	public UpdatePrefixCommand(MappingElement me, String newKey, String newValue) {
		super();
		this.me = me;
		this.oldKey = me.getKey();
		this.oldValue = me.getValue();
		this.newKey = newKey;
		this.newValue = newValue;
	}

	@Override
	public void execute() {
		me.eSetDeliver(false);
		me.setKey(newKey);
		me.eSetDeliver(true);
		me.setValue(newValue);
	}
	
	@Override
	public void undo() {
		me.eSetDeliver(false);
		me.setKey(oldKey);
		me.eSetDeliver(true);
		me.setValue(oldValue);
	}

	@Override
	public void redo() {
		execute();
	}
	
	@Override
	public String getLabel() {
		return "Update Prefix Mapping";
	}
	
	@Override
	protected boolean prepare() {
		return true;
	}
}
