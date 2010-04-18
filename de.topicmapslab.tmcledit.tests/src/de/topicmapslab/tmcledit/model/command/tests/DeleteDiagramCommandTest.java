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
package de.topicmapslab.tmcledit.model.command.tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import de.topicmapslab.tmcledit.model.Diagram;
import de.topicmapslab.tmcledit.model.File;
import de.topicmapslab.tmcledit.model.ModelFactory;
import de.topicmapslab.tmcledit.model.commands.DeleteDiagramCommand;

/**
 * @author Hannes Niederhausen
 * 
 */
public class DeleteDiagramCommandTest {

	private Diagram dia;
	private DeleteDiagramCommand command;
	private File file;
	private int size;

	@Before
	public void prepare() {

		if (dia == null) {

			dia = ModelFactory.eINSTANCE.createDiagram();
			file = ModelFactory.eINSTANCE.createFile();
			file.getDiagrams().add(dia);

		}

		if (command == null)
			command = new DeleteDiagramCommand(dia);

	}

	@After
	public void shutdown() {

		dia = null;
		command = null;

	}

	@Test
	public void canExecute() {

		Assert.assertTrue(command.canExecute());

	}

	@Test
	public void executeTest() {

		size = file.getDiagrams().size();
		Assert.assertTrue(file.getDiagrams().contains(dia));
		command.execute();
		Assert.assertTrue((size - 1) == file.getDiagrams().size());
		Assert.assertFalse(file.getDiagrams().contains(dia));

	}
	
	@Test
	public void canUndoTest(){
		
		Assert.assertTrue(command.canUndo());
		
	}

	@Test
	public void undoTest() {

		command.execute();

		size = file.getDiagrams().size();
		Assert.assertFalse(file.getDiagrams().contains(dia));
		command.undo();
		Assert.assertTrue((size + 1) == file.getDiagrams().size());
		Assert.assertTrue(file.getDiagrams().contains(dia));

	}

	@Test
	public void redoTest() {

		command.execute();
		command.undo();

		size = file.getDiagrams().size();
		Assert.assertTrue(file.getDiagrams().contains(dia));
		command.redo();
		Assert.assertTrue((size - 1) == file.getDiagrams().size());
		Assert.assertFalse(file.getDiagrams().contains(dia));

	}

}