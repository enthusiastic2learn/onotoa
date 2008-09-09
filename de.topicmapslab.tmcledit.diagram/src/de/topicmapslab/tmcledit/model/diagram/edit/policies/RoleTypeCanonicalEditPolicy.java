package de.topicmapslab.tmcledit.model.diagram.edit.policies;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.notation.View;

import de.topicmapslab.tmcledit.model.ModelPackage;
import de.topicmapslab.tmcledit.model.diagram.edit.parts.OccurenceTypeConstraint3EditPart;
import de.topicmapslab.tmcledit.model.diagram.edit.parts.SubjectIdentifierConstraint3EditPart;
import de.topicmapslab.tmcledit.model.diagram.edit.parts.SubjectLocatorConstraint4EditPart;
import de.topicmapslab.tmcledit.model.diagram.part.TmcleditDiagramUpdater;
import de.topicmapslab.tmcledit.model.diagram.part.TmcleditNodeDescriptor;
import de.topicmapslab.tmcledit.model.diagram.part.TmcleditVisualIDRegistry;

/**
 * @generated
 */
public class RoleTypeCanonicalEditPolicy extends CanonicalEditPolicy {

	/**
	 * @generated
	 */
	Set myFeaturesToSynchronize;

	/**
	 * @generated
	 */
	protected List getSemanticChildrenList() {
		View viewObject = (View) getHost().getModel();
		List result = new LinkedList();
		for (Iterator it = TmcleditDiagramUpdater
				.getRoleType_1003SemanticChildren(viewObject).iterator(); it
				.hasNext();) {
			result.add(((TmcleditNodeDescriptor) it.next()).getModelElement());
		}
		return result;
	}

	/**
	 * @generated
	 */
	protected boolean isOrphaned(Collection semanticChildren, final View view) {
		int visualID = TmcleditVisualIDRegistry.getVisualID(view);
		switch (visualID) {
		case OccurenceTypeConstraint3EditPart.VISUAL_ID:
		case SubjectIdentifierConstraint3EditPart.VISUAL_ID:
		case SubjectLocatorConstraint4EditPart.VISUAL_ID:
			if (!semanticChildren.contains(view.getElement())) {
				return true;
			}
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected String getDefaultFactoryHint() {
		return null;
	}

	/**
	 * @generated
	 */
	protected Set getFeaturesToSynchronize() {
		if (myFeaturesToSynchronize == null) {
			myFeaturesToSynchronize = new HashSet();
			myFeaturesToSynchronize.add(ModelPackage.eINSTANCE
					.getTopicType_OccurenceConstraints());
			myFeaturesToSynchronize.add(ModelPackage.eINSTANCE
					.getTopicType_SubjectIdentifierConstraints());
			myFeaturesToSynchronize.add(ModelPackage.eINSTANCE
					.getTopicType_SubjectLocatorConstraint());
		}
		return myFeaturesToSynchronize;
	}

}