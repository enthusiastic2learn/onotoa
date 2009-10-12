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
package de.topicmapslab.tmcledit.domaindiagram.editparts;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.NodeEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.requests.DirectEditRequest;
import org.eclipse.gef.tools.DirectEditManager;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

import de.topicmapslab.tmcledit.diagram.DiagramActivator;
import de.topicmapslab.tmcledit.diagram.preferences.ColorScheme;
import de.topicmapslab.tmcledit.diagram.preferences.ColorScheme.ColorDefinition;
import de.topicmapslab.tmcledit.diagram.util.SWTPattern;
import de.topicmapslab.tmcledit.domaindiagram.action.AddImageAction;
import de.topicmapslab.tmcledit.domaindiagram.directedit.TMCLDirectEditManager;
import de.topicmapslab.tmcledit.domaindiagram.figures.LineFigure;
import de.topicmapslab.tmcledit.domaindiagram.figures.ScalableImageFigure;
import de.topicmapslab.tmcledit.domaindiagram.policies.TopicTypeDirectEditPolicy;
import de.topicmapslab.tmcledit.domaindiagram.policies.TypeContainerEditPolicy;
import de.topicmapslab.tmcledit.domaindiagram.policies.TypeNodeLayoutEditPolicy;
import de.topicmapslab.tmcledit.model.Diagram;
import de.topicmapslab.tmcledit.model.ModelPackage;
import de.topicmapslab.tmcledit.model.TopicType;
import de.topicmapslab.tmcledit.model.TypeNode;
import de.topicmapslab.tmcledit.model.util.Base64;

/**
 * @author Hannes Niederhausen
 * 
 */
public class TypeNodeEditPart extends
		de.topicmapslab.tmcledit.domaindiagram.editparts.NodeEditPart implements
		NodeEditPart, IActionProvider {
	protected DirectEditManager editManager;

	private Label titleLabel;

	protected Figure compartmentFigure;

	private Font nameFont;

	private LineFigure lineFigure;

	private ScalableImageFigure imageFigure;

	private String currFigString;
	
	@Override
	protected IFigure createFigure() {
		if (figure == null) {
			figure = new Figure() {
				@Override
				public void paint(Graphics graphics) {
					ColorScheme scheme = DiagramActivator
							.getCurrentColorScheme();

					graphics.pushState();

					Color bg = scheme.getTopicColor().createColor(null);
					graphics.setBackgroundColor(bg);
					ColorDefinition tsc = scheme.getTopicSecondaryColor();
					Rectangle rec = getBounds();
					if (tsc != null) {
						Rectangle r = rec;
						graphics.setBackgroundPattern(new SWTPattern(null, r.x
								+ r.width / 2, r.y, r.x + r.width / 2, r.y
								+ r.height, bg, tsc.createColor(null)));
					}
					graphics.fillRectangle(rec);
					Rectangle rec2 = new Rectangle(rec.x, rec.y, rec.width - 1,
							rec.height - 1);
					graphics.drawRoundRectangle(rec2, 10, 10);

					graphics.setForegroundColor(scheme.getTopicFontColor()
							.createColor(null));
					graphics.pushState();
					paintClientArea(graphics);
					graphics.popState();
					graphics.popState();
				}
			};

//			ToolbarLayout layout = new ToolbarLayout(false);
//			layout.setStretchMinorAxis(true);
//			layout.setSpacing(2);
			
			GridLayout layout = new GridLayout(1, true);
			
			figure.setLayoutManager(layout);
			
			GridData gd = getGridData();
			imageFigure = new ScalableImageFigure();
			imageFigure.setBorder(new MarginBorder(5));
			imageFigure.setImageSize(64, 64);
			layout.setConstraint(imageFigure, gd);
			

			gd = getGridData();
			titleLabel = new Label();
			titleLabel.setBorder(new MarginBorder(1, 5, 1, 5));
			figure.add(titleLabel);
			layout.setConstraint(titleLabel, gd);

			figure.setOpaque(false);
			figure.setBackgroundColor(ColorConstants.yellow);

			
			lineFigure = new LineFigure();
			compartmentFigure = new Figure();
			compartmentFigure.setBorder(new MarginBorder(1, 5, 1, 5));
			compartmentFigure.setLayoutManager(new ToolbarLayout(false));

		}
		return figure;
	}

	private GridData getGridData() {
		GridData gd = new GridData(GridData.CENTER);
		gd.widthHint = 120;
		return gd;
	}

	private void updateImage() {

		String base64 = getCastedModel().getImage();
		
		if (currFigString==null) { 
			if (base64==null) {
				return;
			}
		} else if (currFigString.equals(base64))
			return;
		
		if (base64 == null) {
			if (getFigure().equals(imageFigure.getParent())) {
				getFigure().remove(imageFigure);
				imageFigure.dispose();
			}
			currFigString = base64;
			return;
		}

		if (!getFigure().equals(imageFigure.getParent())) {
			byte[] buf = Base64.base64ToByteArray(base64);
			Image image = new Image(Display.getCurrent(),
					new ByteArrayInputStream(buf));
			imageFigure.setImage(image);
			getFigure().add(imageFigure, 0);
		}
		currFigString = base64;
	}

	private void createNameFont() {
		if (nameFont != null) {
			nameFont.dispose();
		}
		Font tmp = Display.getCurrent().getSystemFont();
		FontData fd = tmp.getFontData()[0];
		if (getCastedModel().getTopicType().isAbstract())
			fd.setStyle(SWT.ITALIC);

		nameFont = new Font(Display.getCurrent(), fd);
		titleLabel.setFont(nameFont);
	}

	@Override
	protected void createEditPolicies() {
		super.createEditPolicies();
		installEditPolicy(EditPolicy.DIRECT_EDIT_ROLE,
				new TopicTypeDirectEditPolicy());
		installEditPolicy(EditPolicy.CONTAINER_ROLE,
				new TypeContainerEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE,
				new TypeNodeLayoutEditPolicy());
	}

	@Override
	protected void refreshVisuals() {
		TypeNode tn = (TypeNode) getModel();
		if (titleLabel.isVisible()) {
			TopicType tt = (TopicType) tn.getTopicType();
			titleLabel.setText(tt.getName());

			createNameFont();
		}
		Rectangle r = new Rectangle(tn.getPosX(), tn.getPosY(), -1, -1);
		try {
			if (getParent() != null)
				((GraphicalEditPart) getParent()).setLayoutConstraint(this,
						getFigure(), r);
		} catch (NullPointerException e) {
			throw new RuntimeException(e);
		}
		updateImage();
		getFigure().invalidate();
	}

	@Override
	public void performRequest(Request req) {
		if (req.getType() == RequestConstants.REQ_DIRECT_EDIT) {
			if (req instanceof DirectEditRequest
					&& !directEditHitTest(((DirectEditRequest) req)
							.getLocation().getCopy()))
				return;
			performDirectEdit();
		}
		super.performRequest(req);
	}

	private void performDirectEdit() {
		if (editManager == null) {
			editManager = new TMCLDirectEditManager(this, TextCellEditor.class,
					titleLabel);
		}
		editManager.show();
	}

	private boolean directEditHitTest(Point requestLoc) {
		titleLabel.translateToRelative(requestLoc);
		if (titleLabel.containsPoint(requestLoc))
			return true;
		return false;
	}

	public TypeNode getCastedModel() {
		return (TypeNode) getModel();
	}

	@SuppressWarnings("unchecked")
	@Override
	protected List getModelChildren() {
		List<EObject> list = new ArrayList<EObject>();
		TopicType topicType = getCastedModel().getTopicType();
		list.addAll(topicType.getOccurrenceConstraints());
		list.addAll(topicType.getNameContraints());

		return list;
	}

	public void handleNameChange(String value) {
		titleLabel.setText(value);
		titleLabel.setVisible(false);
		refreshVisuals();
	}

	public void revertNameChange() {
		titleLabel.setVisible(true);
		refreshVisuals();
	}

	@Override
	public void activate() {
		super.activate();
		TypeNode tn = (TypeNode) getModel();
		tn.getTopicType().eAdapters().add(this);
	}

	@Override
	public void deactivate() {
		TypeNode tn = (TypeNode) getModel();
		tn.getTopicType().eAdapters().remove(this);

		super.deactivate();
	}

	public void notifyChanged(Notification notification) {
		if (notification.getEventType() == Notification.REMOVING_ADAPTER)
			return;

		if (notification.getNotifier() instanceof Diagram) {
			if (notification.getEventType() == Notification.REMOVE)
				return;
			if (notification.getFeatureID(EList.class) == ModelPackage.DIAGRAM__EDGES) {
				refreshSourceConnections();
				refreshTargetConnections();
			}
		}

		if (notification.getNotifier().equals(
				((TypeNode) getModel()).getTopicType())) {
			refreshChildren();
		}
		refreshVisuals();
	}

	/**
	 * adds the figure of the child editpart to the corresponding compartment
	 * figure
	 */
	@Override
	protected void addChildVisual(EditPart childEditPart, int index) {
		IFigure child = ((GraphicalEditPart) childEditPart).getFigure();

		if (childEditPart instanceof OccurrenceTypeConstraintEditPart) {
			int i = compartmentFigure.getChildren().size();
			compartmentFigure.add(child, i);
		} else if (childEditPart instanceof NameTypeConstraintEditPart) {
			compartmentFigure.add(child, 0);
		}
		updateCompartment();
	}

	@Override
	protected void removeChildVisual(EditPart childEditPart) {
		super.removeChildVisual(childEditPart);
		updateCompartment();
	}

	private void updateCompartment() {
		if (getContentPane().getChildren().size() == 0) {
			getFigure().remove(lineFigure);
			getFigure().remove(getContentPane());
		} else {
			if (!getFigure().getParent().equals(getContentPane())) {
				getFigure().add(lineFigure);
				getFigure().add(getContentPane());
			}
		}

	}

	public List<IAction> getActions() {
		
		
		Action a = new AddImageAction(this.getCastedModel(), "Add Image...");
		
		List<IAction> list = new ArrayList<IAction>(4);
		list.add(a);
		return list;
	}

	@Override
	public IFigure getContentPane() {
		return compartmentFigure;
	}

}
