package de.topicmapslab.tmcledit.extensions.dialogs;

import java.util.Comparator;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.FilteredItemsSelectionDialog;

import de.topicmapslab.tmcledit.extensions.Activator;
import de.topicmapslab.tmcledit.model.KindOfTopicType;
import de.topicmapslab.tmcledit.model.TopicType;
import de.topicmapslab.tmcledit.model.util.ModelIndexer;

public class FilterTopicSelectionDialog extends FilteredItemsSelectionDialog {

	private static final String SETTINGS = FilterTopicSelectionDialog.class.getCanonicalName();
	
	private KindOfTopicType kindOfTopicType = null;

	private TopicTypeComparator topicTypeComparator;
	
	public FilterTopicSelectionDialog(Shell shell, KindOfTopicType kindOfTopicType) {
		this(shell, false);
		this.kindOfTopicType = kindOfTopicType;
		setInitialPattern("?");
	}
	
	public FilterTopicSelectionDialog(Shell shell, boolean multi) {
		super(shell, multi);
		
		setListLabelProvider(new ListLabelProvider());
		setDetailsLabelProvider(new DetailLabelProvider());
		
	}
	
	@Override
	protected Control createExtendedContentArea(Composite parent) {
		return new Composite(parent, SWT.NONE);
	}

	@Override
	protected ItemsFilter createFilter() {
		return new TopicFilter();
	}
	
	@Override
	protected void fillContentProvider(AbstractContentProvider contentProvider,
			ItemsFilter itemsFilter, IProgressMonitor progressMonitor)
			throws CoreException {
		List<TopicType> types = ModelIndexer.getInstance().getTopicTypes();
		progressMonitor.beginTask("Filling Topic List", types.size());

		for (TopicType type : types) {
			if (kindOfTopicType!=null) {
				if (type.getKind()==kindOfTopicType) {
					contentProvider.add(type, itemsFilter);
				}
			} else {
				contentProvider.add(type, itemsFilter);
			}
			progressMonitor.worked(1);
		}
		
		
	}

	@Override
	protected IDialogSettings getDialogSettings() {
		IDialogSettings settings = Activator.getDefault().getDialogSettings().getSection(SETTINGS);
		if (settings==null)
			settings = Activator.getDefault().getDialogSettings().addNewSection(SETTINGS);
		
		return settings;
	}

	@Override
	public String getElementName(Object item) {
		return ((TopicType)item).getName();
	}

	@SuppressWarnings("unchecked")
	@Override
	protected Comparator getItemsComparator() {
		if (topicTypeComparator==null)
			topicTypeComparator = new TopicTypeComparator();
		
		return topicTypeComparator;
	}

	@Override
	protected IStatus validateItem(Object item) {
		return Status.OK_STATUS;
	}

	private final class TopicTypeComparator implements Comparator<TopicType> {
		@Override
		public int compare(TopicType o1, TopicType o2) {
			if (o1.equals(o2))
				return 0;
			
			TopicType tt1 = (TopicType) o1;
			TopicType tt2 = (TopicType) o2;
			
			return tt1.getName().compareTo(tt2.getName());
		}
	}

	private class TopicFilter extends ItemsFilter {

		@Override
		public boolean isConsistentItem(Object item) {
			return true;
		}

		@Override
		public boolean matchItem(Object item) {

			TopicType tt = (TopicType) item;
			
			return matches(tt.getName());
		}
		
	}
	
	private class ListLabelProvider implements ILabelProvider {

		@Override
		public Image getImage(Object element) {
			return null;
		}

		@Override
		public String getText(Object element) {
			if (element==null)
				return "";
				
			TopicType tt = (TopicType) element;
			return tt.getName();
		}

		@Override
		public void addListener(ILabelProviderListener listener) {
		}

		@Override
		public void dispose() {
		}

		@Override
		public boolean isLabelProperty(Object element, String property) {
			return false;
		}

		@Override
		public void removeListener(ILabelProviderListener listener) {
		}
		
	}
	
	private class DetailLabelProvider implements ILabelProvider {

		@Override
		public Image getImage(Object element) {
			return null;
		}

		@Override
		public String getText(Object element) {
			if (element==null)
				return "";
			TopicType tt = (TopicType) element;
			return tt.getName();
		}

		@Override
		public void addListener(ILabelProviderListener listener) {
		}

		@Override
		public void dispose() {
		}

		@Override
		public boolean isLabelProperty(Object element, String property) {
			return false;
		}

		@Override
		public void removeListener(ILabelProviderListener listener) {
		}
		
	}
	
}
