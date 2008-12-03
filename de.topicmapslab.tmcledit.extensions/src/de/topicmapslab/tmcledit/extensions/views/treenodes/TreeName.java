package de.topicmapslab.tmcledit.extensions.views.treenodes;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.graphics.Image;

import de.topicmapslab.tmcledit.extensions.views.ModelView;
import de.topicmapslab.tmcledit.model.NameTypeConstraint;
import de.topicmapslab.tmcledit.model.TopicType;
import de.topicmapslab.tmcledit.model.util.ImageConstants;
import de.topicmapslab.tmcledit.model.util.ImageProvider;

public class TreeName extends TreeObject{

	
	public TreeName(ModelView modelView, NameTypeConstraint ntc) {
		this(modelView, ntc, null);
	}

	public TreeName(ModelView modelView, NameTypeConstraint ntc, String name) {
		super(modelView, name);
		setModel(ntc);
	}

	public NameTypeConstraint getNameTypeConstraint() {
		return (NameTypeConstraint) getModel();
	}
	
	@Override
	public void setModel(EObject model) {
		super.setModel(model);
		if (getNameTypeConstraint().getType()!=null)
			getNameTypeConstraint().getType().eAdapters().add(this);
		
	}
	
	public void dispose() {
		if ( (getModel()!=null) && (getNameTypeConstraint().getType()!=null) )
			getNameTypeConstraint().getType().eAdapters().remove(this);
		super.dispose();
	}
	
	@Override
	public String getName() {
		if (getNameTypeConstraint().getType()==null)
			return "No name type set";
		return getNameTypeConstraint().getType().getName();
	}
	
	@Override
	public void notifyChanged(Notification notification) {
		if (notification.getNotifier().equals(getNameTypeConstraint())) {
			if (notification.getNewValue() instanceof TopicType) {
				if (notification.getOldValue()!=null)
					((TopicType)notification.getOldValue()).eAdapters().remove(this);
				((TopicType)notification.getNewValue()).eAdapters().add(this);
			}
			return;
		}
		
		if (notification.getNotifier().equals(getNameTypeConstraint().getType())) {
			getModelView().getViewer().refresh(this);
		}
	}
	
	@Override
	public Image getImage() {
		return ImageProvider.getImage(ImageConstants.NAMECONSTRAINT);
	}
	
}
