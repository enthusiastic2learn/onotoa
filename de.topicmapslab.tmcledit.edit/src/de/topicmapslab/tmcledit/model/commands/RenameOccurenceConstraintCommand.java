/**
 * 
 */
package de.topicmapslab.tmcledit.model.commands;


import org.eclipse.emf.common.command.AbstractCommand;

import de.topicmapslab.tmcledit.model.OccurenceTypeConstraint;

/**
 * @author Hannes Niederhausen
 *
 */
public class RenameOccurenceConstraintCommand extends AbstractCommand{

	private final OccurenceTypeConstraint otc;
	private final String oldName;
	private final String newName;

	
	
	public RenameOccurenceConstraintCommand(OccurenceTypeConstraint otc, String newName) {
		super();
		this.otc = otc;
		this.oldName = otc.getName();
		this.newName = newName;
	}

	@Override
	public void execute() {
		otc.setName(newName);
	}
	
	@Override
	public void undo() {
		otc.setName(oldName);
	}
	
	@Override
	public void redo() {
		execute();
	}
	
	@Override
	protected boolean prepare() {
		return true;
	}
}
