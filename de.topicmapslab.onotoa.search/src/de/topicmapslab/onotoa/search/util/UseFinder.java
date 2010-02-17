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
package de.topicmapslab.onotoa.search.util;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;

import de.topicmapslab.onotoa.search.model.tree.TreeNode;
import de.topicmapslab.onotoa.search.model.tree.TreeNodeType;
import de.topicmapslab.tmcledit.model.NameTypeConstraint;
import de.topicmapslab.tmcledit.model.OccurrenceTypeConstraint;
import de.topicmapslab.tmcledit.model.TopicMapSchema;
import de.topicmapslab.tmcledit.model.TopicType;

/**
 * @author Hannes Niederhausen
 *
 */
public class UseFinder {

	
	public static final List<TreeNode> findUse(TopicType type, IProgressMonitor monitor) {
		List<TreeNode> result = new ArrayList<TreeNode>();
		
		TopicMapSchema schema = (TopicMapSchema) type.eContainer();
		
		monitor.beginTask("Search topic type using "+type.getName(), schema.getTopicTypes().size()-1);
		
		for (TopicType tt : schema.getTopicTypes()) {
			if (tt.equals(type))
				continue;
			
			monitor.subTask("Check: "+tt.getName());
			TreeNode child = getUse(type, tt);
			if (child!=null)
				result.add(child);
			
			monitor.worked(1);
		}
		
		
		monitor.done();
		
		return result;		
	}

	/**
	 * @param tt
	 * @return
	 */
	private static TreeNode getUse(TopicType type, TopicType tt) {
		TreeNode tn = new TreeNode(tt, TreeNodeType.User);
		for (TopicType isa : tt.getIsa()) {
			if (isa.equals(type))
				tn.addChild(new TreeNode(isa, TreeNodeType.Type));
		}
		
		for (TopicType ako : tt.getAko()) {
			if (ako.equals(type))
				tn.addChild(new TreeNode(ako, TreeNodeType.Supertype));
		}
		
		for (NameTypeConstraint ntc : tt.getNameContraints()) {
			if (ntc.getType().equals(type)) {
				tn.addChild(new TreeNode(ntc, TreeNodeType.Nametype));
			}
		}
		
		for (OccurrenceTypeConstraint otc : tt.getOccurrenceConstraints()) {
			if (otc.getType().equals(type)) {
				tn.addChild(new TreeNode(otc, TreeNodeType.OccurrenceType));
			}
		}
		
		if (tn.getChildren().size()>0)
			return tn;
		return null;
	}

	
}
