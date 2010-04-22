package de.topicmapslab.tmcledit.model.command.tests;

import java.util.List;

import de.topicmapslab.tmcledit.model.RoleCombinationConstraint;
import de.topicmapslab.tmcledit.model.compare.RoleCombinationConstraintComparator;

public class Tools {

	public static boolean roleCombinationConstraintListCompare(
			List<RoleCombinationConstraint> list1,
			List<RoleCombinationConstraint> list2) {

		if (list1.size() != list2.size())
			return false;

		RoleCombinationConstraintComparator comp = new RoleCombinationConstraintComparator();

		for (int i = 0; i < list1.size(); i++) {

			if (comp.equals(list1.get(i), list2.get(i)) == false)
				return false;

		}

		return true;

	}

	public static boolean roleCombinationConstraintCompare(
			RoleCombinationConstraint o1, RoleCombinationConstraint o2) {

		RoleCombinationConstraintComparator comp = new RoleCombinationConstraintComparator();

		if (comp.equals(o1, o2) == false)
			return false;

		return true;

	}
	
}