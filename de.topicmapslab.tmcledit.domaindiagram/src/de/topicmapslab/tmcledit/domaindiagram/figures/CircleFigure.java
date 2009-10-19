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
package de.topicmapslab.tmcledit.domaindiagram.figures;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Rectangle;

public class CircleFigure extends Figure {
	public CircleFigure() {
		setOpaque(false);
	}

	@Override
	public void paint(Graphics graphics) {
		Rectangle rec = getBounds();
		int height = rec.height;
		int width = rec.width;
	
		int posX = rec.x + ((width-height)/2);
		
		graphics.pushState();
		graphics.setBackgroundColor(getBackgroundColor());
		graphics.setForegroundColor(getForegroundColor());
		
//		graphics.setBackgroundPattern(new Pattern(Display.getCurrent(), posX, rec.y, posX, rec.y+height, getForegroundColor(), getBackgroundColor()));
		
		graphics.fillOval(posX, rec.y, height, height);
		
		graphics.popState();
		
		
	}

}