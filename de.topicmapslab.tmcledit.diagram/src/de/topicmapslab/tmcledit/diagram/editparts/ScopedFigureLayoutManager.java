/**
 * 
 */
package de.topicmapslab.tmcledit.diagram.editparts;

import java.util.Iterator;

import org.eclipse.draw2d.AbstractLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;

import de.topicmapslab.tmcledit.diagram.figures.LineFigure;

/**
 * @author Hannes Niederhausen
 *
 */
public class ScopedFigureLayoutManager extends AbstractLayout {

	
	@Override
	protected Dimension calculatePreferredSize(IFigure container, int hint,
			int hint2) {
		
		Maximum max = calculateMaximums(container);
		
		int height = max.height+10;
		int width = max.nameWidth+max.typeWidth+15;
		return new Dimension(width, height);
	}
	
	@SuppressWarnings("unchecked")
	private Maximum calculateMaximums(IFigure container) {
		Maximum max = new Maximum();

		Iterator<IFigure> it = container.getChildren().iterator();
		while (it.hasNext()) {
			IFigure child = it.next();
			if (child instanceof LineFigure)
				max.height += 10;
			else {
				IFigure f = (IFigure) child.getChildren().get(0);
				Dimension preferredSize2 = f.getPreferredSize();
				int w = preferredSize2.width;
				int h = preferredSize2.height;

				if (max.nameWidth < w)
					max.nameWidth = w;

				f = (IFigure) child.getChildren().get(1);
				preferredSize2 = f.getPreferredSize();
				w = preferredSize2.width;
				if (max.typeWidth < w)
					max.typeWidth = w;

				if (h < preferredSize2.height)
					h = preferredSize2.height;

				max.height += h;
			}
		}

		return max;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.draw2d.LayoutManager#layout(org.eclipse.draw2d.IFigure)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void layout(IFigure container) {
		Maximum max = calculateMaximums(container);
		int height = 0;

		
		Iterator<IFigure> it = container.getChildren().iterator();
		int posY = container.getBounds().y+3;
		int posX = container.getBounds().x+10;
		Dimension calculatePreferredSize = calculatePreferredSize(container, -1, -1);
		while (it.hasNext()) {

			int maxHeight = 0;
			IFigure child = it.next();

			if (child instanceof LineFigure) {
				Rectangle parentBounds = container.getParent().getBounds();
				Rectangle rec = new Rectangle();
				rec.x = parentBounds.x;
				rec.y = posY;
				rec.width = parentBounds.width;
				rec.height = 10;
				posY += rec.height;
				child.setBounds(rec);
			} else {

				height += child.getPreferredSize().height;

				IFigure f = (IFigure) child.getChildren().get(0);
				Rectangle rec = new Rectangle();
				Dimension dim = f.getPreferredSize();
				rec.setSize(dim);
				rec.width = max.nameWidth;
				rec.setLocation(posX, posY);
				f.setBounds(rec);
				maxHeight = rec.height;

				f = (IFigure) child.getChildren().get(1);

				rec = new Rectangle();
				dim = f.getPreferredSize();
				dim.width = max.typeWidth;
				rec.setSize(dim);
				rec.x = posX + max.nameWidth;
				rec.y = posY;
				f.setBounds(rec);
				if (rec.height > maxHeight)
					maxHeight = rec.height;

				rec = child.getBounds();
				rec.y = posY;
				rec.x = posX;
				rec.setSize(child.getPreferredSize());
				rec.width = calculatePreferredSize.width - 10;
				rec.height = maxHeight;
				posY += rec.height;
				child.setBounds(rec);
			}
		}
	}

	private class Maximum {
		int nameWidth = 0;
		int typeWidth = 0;
		int height = 0;
	}
}