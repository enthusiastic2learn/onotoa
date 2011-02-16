/**
 * (C) 2008 Hannes Niederhausen, Topic Maps Lab
 *
 * $Id$
 */
package de.topicmapslab.tmcledit.model.compare;

import de.topicmapslab.tmcledit.model.ReifiableTopicType;

public class ReifiableTopicTypeComparator extends TopicTypeComparator {

	public boolean equals(ReifiableTopicType o1, ReifiableTopicType o2) {

		if ((o1 == null) ^ (o2 == null))
			return false;

		if ((o1 == null) && (o2 == null))
			return true;

		if (super.equals(o1, o2) == false)
			return false;
		
		ReifierConstraintComparator comp = new ReifierConstraintComparator();

		if (comp.equals(o1.getReifierConstraint(), o2.getReifierConstraint()) == false)
			return false;

		return true;

	}

} // ReifiableTopicTypeTest
