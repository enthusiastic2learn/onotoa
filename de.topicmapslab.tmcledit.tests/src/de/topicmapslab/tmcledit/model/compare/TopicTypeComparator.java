/**
 * (C) 2008 Hannes Niederhausen, Topic Maps Lab
 *
 * $Id$
 */

package de.topicmapslab.tmcledit.model.compare;

import org.eclipse.emf.common.util.EList;
import de.topicmapslab.tmcledit.model.TopicType;

/**
 * <!-- begin-user-doc --> A test case for the model object '
 * <em><b>Topic Type</b></em>'. <!-- end-user-doc -->
 * 
 * @generated
 */
public class TopicTypeComparator extends TMCLConstructComperator {

	public boolean equals(TopicType o1, TopicType o2) {

		if ((o1 == null) ^ (o2 == null))
			return false;

		if ((o1 == null) && (o2 == null))
			return true;

		if (super.equals(o1, o2) == false)
			return false;

		if (o1.getIdType() != o2.getIdType())
			return false;

		if (stringCompare(o1.getName(), o2.getName()) == false)
			return false;

		if (o1.isAbstract() != o2.isAbstract())
			return false;

		if (o1.getIsa().size() == o2.getIsa().size()) {
			if (topicTypeListCompare(o1.getIsa(), o2.getIsa()) == false)
				return false;
		} else
			return false;

		if (o1.getAko().size() == o2.getAko().size()) {
			if (topicTypeListCompare(o1.getAko(), o2.getAko()) == false)
				return false;
		} else
			return false;

		if (o1.getOverlap().size() == o2.getOverlap().size()) {
			if (topicTypeListCompare(o1.getOverlap(), o2.getOverlap()) == false)
				return false;
		} else
			return false;

		if (stringListCompare(o1.getLocators(), o2.getLocators()) == false)
			return false;

		if (stringListCompare(o1.getIdentifiers(), o2.getIdentifiers()) == false)
			return false;
		
		return true;

	}

	/**
	 * Compares two lists with topic type entries
	 * 
	 * @param list1
	 * @param list2
	 * @return boolean result of the compare
	 */

	protected boolean topicTypeListCompare(EList<TopicType> list1,
			EList<TopicType> list2) {

		TopicTypeComparator comp = new TopicTypeComparator();

		for (int i = 0; i < list1.size(); i++) {

			if (comp.equals(list1.get(i), list2.get(i)) == false) {
				return false;
			}
		}
		return true;
	}

} // TopicTypeTest