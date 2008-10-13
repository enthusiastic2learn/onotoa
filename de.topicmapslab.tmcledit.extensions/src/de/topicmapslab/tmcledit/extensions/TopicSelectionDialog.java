/**
 * 
 */
package de.topicmapslab.tmcledit.extensions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;

import de.topicmapslab.tmcledit.model.TopicType;

/**
 * @author Hannes Niederhausen
 *
 */
public class TopicSelectionDialog extends Dialog {

	private List<TopicType> selectedTopics = Collections.emptyList();
	private List<TopicType> availableTopics = Collections.emptyList();
	
	private ListViewer availableTopicList;
	private ListViewer selectedTopicList;
	
	public TopicSelectionDialog(Shell parentShell) {
		super(parentShell);
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite comp = new Composite(parent, SWT.NONE);
		comp.setLayout(new GridLayout(3, false));
		comp.setLayoutData(new GridData(GridData.FILL_BOTH));
		
		availableTopicList = new ListViewer(comp);
		GridData gd = new GridData(GridData.FILL_BOTH);
		gd.widthHint = 150;
		availableTopicList.getList().setLayoutData(gd);
		availableTopicList.setContentProvider(new ArrayContentProvider());
		availableTopicList.setLabelProvider(new TopicLableProvider());
		availableTopicList.setInput(availableTopics);
		availableTopicList.addFilter(new ViewerFilter() {

			@Override
			public boolean select(Viewer viewer, Object parentElement,
					Object element) {
				if (selectedTopics.contains(element))
					return false;
				return true;
			}
			
		});
		
		createButtonRow(comp);
		
		selectedTopicList = new ListViewer(comp);
		gd = new GridData(GridData.FILL_BOTH);
		gd.widthHint = 150;
		selectedTopicList.getList().setLayoutData(gd);
		selectedTopicList.setContentProvider(new ArrayContentProvider());
		selectedTopicList.setLabelProvider(new TopicLableProvider());
		selectedTopicList.setInput(selectedTopics);
		
		return comp;
	}
	
	private void createButtonRow(Composite parent) {
		Composite comp = new Composite(parent, SWT.NONE);
		comp.setLayout(new GridLayout());
		comp.setLayoutData(new GridData(GridData.FILL_VERTICAL));
		GridData gd = new GridData();
		gd.widthHint = 100;
		GridDataFactory fac = GridDataFactory.createFrom(gd);
		
		Button addButton = new Button(comp, SWT.PUSH);
		addButton.setText(">");
		addButton.setToolTipText("Add selected Topics");
		fac.applyTo(addButton);
		addButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				addSelection();
			}
		});
		
		Button addAllButton = new Button(comp, SWT.PUSH);
		addAllButton.setText(">>");
		addAllButton.setToolTipText("Add all Topics");
		fac.applyTo(addAllButton);
		
		Button removeButton = new Button(comp, SWT.PUSH);
		removeButton.setText("<");
		removeButton.setToolTipText("Remove selected Topics");
		fac.applyTo(removeButton);
		removeButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				removeSelection();
			}
		});
		
		Button removeAllButton = new Button(comp, SWT.PUSH);
		removeAllButton.setText("<<");
		removeAllButton.setToolTipText("Remove all Topics");
		fac.applyTo(removeAllButton);
		
		Button createButton = new Button(comp, SWT.PUSH);
		createButton.setToolTipText("Create new Topic");
		createButton.setText("New..");
		fac.applyTo(createButton);
	}

	@SuppressWarnings("unchecked")
	private void addSelection() {
		IStructuredSelection sel = (IStructuredSelection) availableTopicList.getSelection();
		for (Iterator it = sel.iterator(); it.hasNext();) {
			selectedTopics.add((TopicType) it.next());
		}
		availableTopicList.refresh();
		selectedTopicList.refresh();
	}
	
	@SuppressWarnings("unchecked")
	private void removeSelection() {
		IStructuredSelection sel = (IStructuredSelection) selectedTopicList.getSelection();
		for (Iterator it = sel.iterator(); it.hasNext();) {
			selectedTopics.remove((TopicType) it.next());
		}
		availableTopicList.refresh();
		selectedTopicList.refresh();
	}
	
	@Override
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		newShell.setSize(500, 400);
	}
	
	public void setAvailableTopics(List<TopicType> availableTopics) {
		this.availableTopics=new ArrayList<TopicType>();
		this.availableTopics.addAll(availableTopics);
	}
	
	public List<TopicType> getSelectedTopics() {
		return selectedTopics;
	}
	
	public void setSelectedTopics(List<TopicType> selectedTopics) {
		this.selectedTopics = new ArrayList<TopicType>();
		this.selectedTopics.addAll(selectedTopics);
	}
	
	private class TopicLableProvider extends LabelProvider {
		@Override
		public String getText(Object element) {
			if (element instanceof TopicType)
				return ((TopicType)element).getId();
			
			return super.getText(element);
		}
	}
}