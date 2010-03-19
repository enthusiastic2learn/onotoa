/**
 * (C) 2008 Hannes Niederhausen, Topic Maps Lab
 *
 * $Id$
 */
package de.topicmapslab.tmcledit.model.compare;

import de.topicmapslab.tmcledit.model.ModelFactory;
import de.topicmapslab.tmcledit.model.TypeNode;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc --> A test case for the model object '
 * <em><b>Type Node</b></em>'. <!-- end-user-doc -->
 * 
 * @generated
 */
public class TypeNodeComparator extends NodeComparator {

	public boolean equals(TypeNode o1, TypeNode o2) {

		if ((o1 == null) ^ (o2 == null))
			return false;

		if ((o1 == null) && (o2 == null))
			return true;

		if (super.equals(o1, o2) == false)
			return false;
		
		if (super.stringCompare(o1.getImage(), o2.getImage()) == false)
			return false;

		return true;

	}

} // TypeNodeTest