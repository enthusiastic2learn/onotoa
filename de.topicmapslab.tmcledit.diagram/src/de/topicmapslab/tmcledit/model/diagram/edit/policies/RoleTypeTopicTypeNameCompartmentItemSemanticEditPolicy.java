package de.topicmapslab.tmcledit.model.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import de.topicmapslab.tmcledit.model.ModelPackage;
import de.topicmapslab.tmcledit.model.diagram.edit.commands.NameTypeConstraint2CreateCommand;
import de.topicmapslab.tmcledit.model.diagram.providers.TmcleditElementTypes;

/**
 * @generated
 */
public class RoleTypeTopicTypeNameCompartmentItemSemanticEditPolicy extends
		TmcleditBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (TmcleditElementTypes.NameTypeConstraint_2009 == req
				.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(ModelPackage.eINSTANCE
						.getTopicType_NameContraints());
			}
			return getGEFWrapper(new NameTypeConstraint2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}