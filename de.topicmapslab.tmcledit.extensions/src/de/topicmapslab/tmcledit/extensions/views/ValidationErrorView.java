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
package de.topicmapslab.tmcledit.extensions.views;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.part.ViewPart;

import de.topicmapslab.tmcledit.model.validation.ValidationResult;

/**
 * @author Hannes Niederhausen
 *
 */
public class ValidationErrorView extends ViewPart implements ISelectionProvider {

	public static final String ID = "de.topicmapslab.tmcledit.extensions.views.ValidationErrorView";
	
	private TableViewer viewer;
	
	private List<ISelectionChangedListener> listeners = Collections.emptyList();
	private ISelection currentSelection;

	@Override
	public void createPartControl(Composite parent) {
		FormToolkit toolkit = new FormToolkit(parent.getDisplay());
		
		Composite comp = toolkit.createComposite(parent);
		TableColumnLayout layout = new TableColumnLayout();
		comp.setLayout(layout);
		
		Table table = toolkit.createTable(comp, SWT.BORDER|SWT.FULL_SELECTION);
		table.setHeaderVisible(true);
		
		TableColumn tc = new TableColumn(table, SWT.None);
		tc.setText("Message");
		layout.setColumnData(tc, new ColumnWeightData(10, 150, true));
		
		viewer = new TableViewer(table);
		viewer.setContentProvider(new ArrayContentProvider());
		viewer.setLabelProvider(new ValidationLabelProvider());
		viewer.addDoubleClickListener(new IDoubleClickListener() {

			public void doubleClick(DoubleClickEvent event) {
				IStructuredSelection sel = (IStructuredSelection) event.getSelection();
				if (sel.isEmpty())
					setSelection(sel);
				else {
					ValidationResult r = (ValidationResult) sel.getFirstElement();
					setSelection(new StructuredSelection(r.getObject()));
				}				
			}
			
		});
				
		hookContextMenu();
		setSelection(new StructuredSelection());
		getSite().setSelectionProvider(this);
	}
	private void hookContextMenu() {
		MenuManager menuMgr = new MenuManager("#PopupMenu");
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {
				ValidationErrorView.this.fillContextMenu(manager);
			}
		});
		Menu menu = menuMgr.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(menu);
		getSite().registerContextMenu(menuMgr, viewer);
	}
	
	protected void fillContextMenu(IMenuManager manager) {
		IStructuredSelection sel = (IStructuredSelection) viewer.getSelection();
		
		if (sel.isEmpty())
			return;
		
		ValidationResult result = (ValidationResult) sel.getFirstElement();
		for (IAction a : result.getActions()) {
			manager.add(a);
		}
		
	}
	
	@Override
	public void setFocus() {
	}

	public void setValidationResults(List<ValidationResult> results) {
		viewer.setInput(results);
	}
	
	public void addSelectionChangedListener(ISelectionChangedListener listener) {
		if (listeners==Collections.EMPTY_LIST)
			listeners = new ArrayList<ISelectionChangedListener>();
		listeners.add(listener);
	}
	public ISelection getSelection() {
		return currentSelection;
	}
	public void removeSelectionChangedListener(
			ISelectionChangedListener listener) {
		if (listeners==Collections.EMPTY_LIST)
			return;
		listeners.remove(listener);
	}
	public void setSelection(ISelection selection) {
		currentSelection = selection;
		SelectionChangedEvent e = new SelectionChangedEvent(this, selection);
		for (ISelectionChangedListener l : listeners) {
			l.selectionChanged(e);
		}
	}

	private class ValidationLabelProvider implements ITableLabelProvider {
	
		public Image getColumnImage(Object element, int columnIndex) {
			return PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJS_ERROR_TSK);
		}
	
		public String getColumnText(Object element, int columnIndex) {
			return ((ValidationResult)element).getMessage();
		}
	
		public void addListener(ILabelProviderListener listener) {
		}
	
		public void dispose() {
		}
	
		public boolean isLabelProperty(Object element, String property) {
			return false;
		}
	
		public void removeListener(ILabelProviderListener listener) {
		}
		
	}
}
