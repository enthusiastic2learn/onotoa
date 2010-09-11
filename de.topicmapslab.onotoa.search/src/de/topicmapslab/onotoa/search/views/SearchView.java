package de.topicmapslab.onotoa.search.views;

import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.internal.contexts.NestableContextService;
import org.eclipse.ui.part.ViewPart;

import de.topicmapslab.kuria.annotation.AnnotationBindingFactory;
import de.topicmapslab.kuria.annotation.Text;
import de.topicmapslab.kuria.runtime.IBindingContainer;
import de.topicmapslab.kuria.swtgenerator.IContextMenuListener;
import de.topicmapslab.kuria.swtgenerator.WidgetGenerator;
import de.topicmapslab.kuria.swtgenerator.widgets.MasterDetailWidget;
import de.topicmapslab.onotoa.search.util.ImageCallBack;
import de.topicmapslab.onotoa.search.wrapper.IDoubleClickHandler;
import de.topicmapslab.onotoa.search.wrapper.SubjectIdentifierWrapper;
import de.topicmapslab.onotoa.search.wrapper.TopicTypeWrapper;

/**
 * This sample class demonstrates how to plug-in a new workbench view. The view
 * shows data obtained from the model. The sample creates a dummy model on the
 * fly, but a real implementation would connect to the model available either in
 * this or another plug-in (e.g. the workspace). The view is connected to the
 * model using a content provider.
 * <p>
 * The view uses a label provider to define how model objects should be
 * presented in the view. Each view can present the same model objects using
 * different labels and icons, if needed. Alternatively, a single label provider
 * can be shared between views in order to ensure that objects of the same type
 * are presented in the same way everywhere.
 * <p>
 */

public class SearchView extends ViewPart {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "de.topicmapslab.onotoa.search.views.SearchView";

	// private TableViewer viewer;
	// private Action action1;
	// private Action action2;
	// private Action doubleClickAction;
	private Container container;

	private TreeViewer viewer;

	/*
	 * The content provider class is responsible for providing objects to the
	 * view. It can wrap existing objects in adapters or simply return objects
	 * as-is. These objects may be sensitive to the current input of the view,
	 * or ignore it and always show the same content (like Task List, for
	 * example).
	 */

	class ViewContentProvider implements IStructuredContentProvider {
		public void inputChanged(Viewer v, Object oldInput, Object newInput) {
		}

		public void dispose() {
		}

		public Object[] getElements(Object parent) {
			return new String[] { "One", "Two", "Three" };
		}
	}

	class ViewLabelProvider extends LabelProvider implements ITableLabelProvider {
		public String getColumnText(Object obj, int index) {
			return getText(obj);
		}

		public Image getColumnImage(Object obj, int index) {
			return getImage(obj);
		}

		public Image getImage(Object obj) {
			return PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJ_ELEMENT);
		}
	}

	class NameSorter extends ViewerSorter {
	}

	/**
	 * The constructor.
	 */
	public SearchView() {

	}

	/**
	 * This is a callback that will allow us to create the viewer and initialize
	 * it.
	 */
	public void createPartControl(Composite parent) {

		Composite comp = new Composite(parent, SWT.NONE);
		comp.setLayoutData(new GridData(GridData.FILL_BOTH));
		comp.setLayout(new GridLayout());

		AnnotationBindingFactory fac = new AnnotationBindingFactory();
		fac.addClass(SubjectIdentifierWrapper.class);
		fac.addClass(TopicTypeWrapper.class);
		fac.addClass(Container.class);
		IBindingContainer bc = fac.getBindingContainer();

		WidgetGenerator gen = new WidgetGenerator(bc);
		WidgetGenerator.addImageCallback(new ImageCallBack());
		// viewer = gen.generateTree(comp, true);
		viewer = gen.generateTree(comp, true, new ContextMenuListener());
		viewer.getTree().setLayoutData(new GridData(GridData.FILL_BOTH));

		viewer.setInput(container);
		viewer.expandAll();

		viewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {

				IStructuredSelection sel = (IStructuredSelection) event.getSelection();

				Object o = sel.getFirstElement();
				if (o instanceof IDoubleClickHandler) {

					((IDoubleClickHandler) o).doubleClickHappend();

				}

				// if (sel.isEmpty())
				// setSelection(sel);
				// else {
				// ValidationResult r = (ValidationResult)
				// sel.getFirstElement();
				// setSelection(new StructuredSelection(r.getObject()));
				// try {
				// getSite().getWorkbenchWindow().getActivePage().showView(PropertyDetailView.ID);
				// } catch (PartInitException e) {
				// throw new RuntimeException(e);
				// }
				// }
			}

		});

		// viewer = new TableViewer(parent, SWT.MULTI | SWT.H_SCROLL |
		// SWT.V_SCROLL);
		// viewer.setContentProvider(new ViewContentProvider());
		// viewer.setLabelProvider(new ViewLabelProvider());
		// viewer.setSorter(new NameSorter());
		// viewer.setInput(getViewSite());
		//
		// // Create the help context id for the viewer's control
		// PlatformUI.getWorkbench().getHelpSystem().setHelp(viewer.getControl(),
		// "de.topicmapslab.onotoa.search.viewer");
		// makeActions();
		// hookContextMenu();
		// hookDoubleClickAction();
		// contributeToActionBars();
	}

	public void setContent(Container container) {
		this.container = container;
		viewer.setInput(container);
	}

	@Override
	public void init(IViewSite site) throws PartInitException {
		super.init(site);
		// Container con = new Container("");
		// this.container = con;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.part.WorkbenchPart#setFocus()
	 */
	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

	private class ContextMenuListener implements IContextMenuListener {

		/*
		 * (non-Javadoc)
		 * 
		 * @see
		 * de.topicmapslab.kuria.swtgenerator.IContextMenuListener#createMenu
		 * (org.eclipse.jface.action.IMenuManager)
		 */
		public void createMenu(IMenuManager arg0) {

			//TODO: Create Menu

		}

	}

	// private void hookContextMenu() {
	// MenuManager menuMgr = new MenuManager("#PopupMenu");
	// menuMgr.setRemoveAllWhenShown(true);
	// menuMgr.addMenuListener(new IMenuListener() {
	// public void menuAboutToShow(IMenuManager manager) {
	// Searchr.this.fillContextMenu(manager);
	// }
	// });
	// Menu menu = menuMgr.createContextMenu(viewer.getControl());
	// viewer.getControl().setMenu(menu);
	// getSite().registerContextMenu(menuMgr, viewer);
	// }

	// private void contributeToActionBars() {
	// IActionBars bars = getViewSite().getActionBars();
	// fillLocalPullDown(bars.getMenuManager());
	// fillLocalToolBar(bars.getToolBarManager());
	// }
	//
	// private void fillLocalPullDown(IMenuManager manager) {
	// manager.add(action1);
	// manager.add(new Separator());
	// manager.add(action2);
	// }
	//
	// private void fillContextMenu(IMenuManager manager) {
	// manager.add(action1);
	// manager.add(action2);
	// // Other plug-ins can contribute there actions here
	// manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
	// }
	//
	// private void fillLocalToolBar(IToolBarManager manager) {
	// manager.add(action1);
	// manager.add(action2);
	// }
	//
	// private void makeActions() {
	// action1 = new Action() {
	// public void run() {
	// showMessage("Action 1 executed");
	// }
	// };
	// action1.setText("Action 1");
	// action1.setToolTipText("Action 1 tooltip");
	// action1.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
	// getImageDescriptor(ISharedImages.IMG_OBJS_INFO_TSK));
	//
	// action2 = new Action() {
	// public void run() {
	// showMessage("Action 2 executed");
	// }
	// };
	// action2.setText("Action 2");
	// action2.setToolTipText("Action 2 tooltip");
	// action2.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
	// getImageDescriptor(ISharedImages.IMG_OBJS_INFO_TSK));
	// doubleClickAction = new Action() {
	// public void run() {
	// ISelection selection = viewer.getSelection();
	// Object obj = ((IStructuredSelection)selection).getFirstElement();
	// showMessage("Double-click detected on "+obj.toString());
	// }
	// };
	// }
	//
	// private void hookDoubleClickAction() {
	// viewer.addDoubleClickListener(new IDoubleClickListener() {
	// public void doubleClick(DoubleClickEvent event) {
	// doubleClickAction.run();
	// }
	// });
	// }
	// private void showMessage(String message) {
	// MessageDialog.openInformation(
	// viewer.getControl().getShell(),
	// "Sample View",
	// message);
	// }

	/**
	 * Passing the focus request to the viewer's control.
	 */
	// public void setFocus() {
	// viewer.getControl().setFocus();
	// }
	// public void setSelection(ISelection selection) {
	// currentSelection = selection;
	// SelectionChangedEvent e = new SelectionChangedEvent(this, selection);
	// for (ISelectionChangedListener l : listeners) {
	// l.selectionChanged(e);
	// }
	// }

}