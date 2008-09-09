package de.topicmapslab.tmcledit.extensions.views;


import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.IDocumentProvider;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.dialogs.IInputValidator;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.DrillDownAdapter;
import org.eclipse.ui.part.ViewPart;

import de.topicmapslab.tmcledit.extensions.command.RenameCommand;
import de.topicmapslab.tmcledit.model.AssociationsType;
import de.topicmapslab.tmcledit.model.NameType;
import de.topicmapslab.tmcledit.model.OccurenceType;
import de.topicmapslab.tmcledit.model.RoleType;
import de.topicmapslab.tmcledit.model.TopicMapSchema;
import de.topicmapslab.tmcledit.model.TopicType;
import de.topicmapslab.tmcledit.model.diagram.part.TmcleditDiagramEditor;

/**
 * This view renders the model behind a diagram. It is used to add model
 * elements to the diagram or get an overview of the model.
 * 
 * Elements which are removed from a diagram may still be in the model and this
 * view makes it possible to see the domain model.
 */

public class ModelView extends ViewPart implements IPartListener, IEditingDomainProvider {
	private TreeViewer viewer;
	private ViewContentProvider contentProvider;
	private DrillDownAdapter drillDownAdapter;
	private Action action1;
	private Action action2;
	private Action doubleClickAction;
	private TmcleditDiagramEditor currentEditor;

	class ViewContentProvider implements IStructuredContentProvider,
			ITreeContentProvider {
		private TreeParent invisibleRoot;

		private TopicMapSchema currTms;

		private AdapterImpl tmsListener = new AdapterImpl() {
			@Override
			public void notifyChanged(Notification msg) {
				if ((msg.getEventType() == Notification.ADD)
						&& (msg.getNewValue() instanceof TopicType)) {
					addType((TopicType) msg.getNewValue());
				}

				if ((msg.getEventType() == Notification.REMOVE)
						&& (msg.getNewValue() instanceof TopicType)) {
					removeType((TopicType) msg.getNewValue());
				}

				viewer.setInput(getViewSite());
			}
		};

		private TreeParent ttNode;
		private TreeParent rtNode;
		private TreeParent ntNode;
		private TreeParent otNode;
		private TreeParent atNode;

		public void inputChanged(Viewer v, Object oldInput, Object newInput) {
		}

		public void dispose() {
		}

		public Object[] getElements(Object parent) {
			if (parent.equals(getViewSite())) {
				if (invisibleRoot == null)
					initialize();
				return getChildren(invisibleRoot);
			}
			return getChildren(parent);
		}

		public Object getParent(Object child) {
			if (child instanceof TreeObject) {
				return ((TreeObject) child).getParent();
			}
			return null;
		}

		public Object[] getChildren(Object parent) {
			if (parent instanceof TreeParent) {
				return ((TreeParent) parent).getChildren();
			}
			return new Object[0];
		}

		public boolean hasChildren(Object parent) {
			if (parent instanceof TreeParent)
				return ((TreeParent) parent).hasChildren();
			return false;
		}

		public void initialize() {

			invisibleRoot = new TreeParent(viewer, "");

			if (currTms != null)
				currTms.eAdapters().remove(tmsListener);

			// getting the model of the current editor
			IWorkbenchPage page = getSite().getWorkbenchWindow()
					.getActivePage();
			if (page != null) {
				IEditorPart ep = getSite().getWorkbenchWindow().getActivePage()
						.getActiveEditor();
				if ((ep != null) && (ep instanceof TmcleditDiagramEditor)) {

					currentEditor = (TmcleditDiagramEditor) ep;
					IDocumentProvider dp = currentEditor.getDocumentProvider();
					currTms = (TopicMapSchema) ((Diagram) dp.getDocument(
							currentEditor.getEditorInput()).getContent()).getElement();

					currTms.eAdapters().add(tmsListener);

					ttNode = new TreeParent(viewer, "TopicTypes");
					rtNode = new TreeParent(viewer, "RoleTypes");
					ntNode = new TreeParent(viewer, "NameTypes");
					otNode = new TreeParent(viewer, "OccurenceTypes");
					atNode = new TreeParent(viewer, "AssociationTypes");

					invisibleRoot.addChild(ttNode);
					invisibleRoot.addChild(rtNode);
					invisibleRoot.addChild(ntNode);
					invisibleRoot.addChild(otNode);
					invisibleRoot.addChild(atNode);

					for (TopicType tt : currTms.getTopicTypes()) {
						addType(tt);
					}

					return;
				}
			}

			TreeParent root = new TreeParent(viewer, "No Diagramm Editor Open");

			invisibleRoot.addChild(root);
		}

		private void addType(TopicType tt) {
			TreeTopic to = new TreeTopic(viewer, tt, ModelView.this);

			if (tt instanceof RoleType)
				rtNode.addChild(to);
			else if (tt instanceof NameType)
				ntNode.addChild(to);
			else if (tt instanceof OccurenceType)
				otNode.addChild(to);
			else if (tt instanceof AssociationsType)
				atNode.addChild(to);
			else if (tt instanceof TopicType)
				ttNode.addChild(to);
		}

		private void removeType(TopicType tt) {
			TreeParent parent = ttNode;

			if (tt instanceof RoleType)
				parent = rtNode;
			else if (tt instanceof NameType)
				parent = ntNode;
			else if (tt instanceof OccurenceType)
				parent = otNode;
			else if (tt instanceof AssociationsType)
				parent = atNode;

			for (TreeObject to : parent.getChildren()) {
				if (((TreeTopic)to).getTopic().equals(tt))
					parent.removeChild(to);
			}
		}
	}

	class ViewLabelProvider extends LabelProvider {

		public String getText(Object obj) {
			return obj.toString();
		}

		public Image getImage(Object obj) {
			return ((TreeObject) obj).getImage();
		}
	}

	class NameSorter extends ViewerSorter {
		
	}
	
	

	/**
	 * The constructor.
	 */
	public ModelView() {
	}

	/**
	 * This is a callback that will allow us to create the viewer and initialize
	 * it.
	 */
	public void createPartControl(Composite parent) {
		viewer = new TreeViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
		drillDownAdapter = new DrillDownAdapter(viewer);

		contentProvider = new ViewContentProvider();
		viewer.setContentProvider(contentProvider);
		viewer.setLabelProvider(new ViewLabelProvider());
		viewer.setSorter(new NameSorter());
		viewer.getTree().addKeyListener(new org.eclipse.swt.events.KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				IStructuredSelection sel = (IStructuredSelection) viewer.getSelection();
				if (sel.isEmpty())
					return;
				
				TreeObject obj = (TreeObject) sel.getFirstElement();
				if (obj instanceof TreeTopic) {
					TopicType tt = ((TreeTopic)obj).getTopic();
					
					String oldName = tt.getId();
					InputDialog dlg = new InputDialog(viewer.getTree().getShell(), "New Topic Id..",
							"Please enter the new Topic ID", oldName,
							new IInputValidator() {

								@Override
								public String isValid(String newText) {
									if (newText.length()==0)
										return "no name given";
									
									// TODO check if there's a topic with the same name
									
									return null;
								}
					});
					if (InputDialog.OK==dlg.open()) {
						if (currentEditor!=null) {
							currentEditor.getEditingDomain().getCommandStack().
									execute(new RenameCommand(tt, dlg.getValue()));
						
						}
						else 
							return;
					}
					viewer.refresh(obj);
					
				}
				
				
			}
		});
		viewer.setInput(getViewSite());

		// Create the help context id for the viewer's control
		PlatformUI.getWorkbench().getHelpSystem().setHelp(viewer.getControl(),
				"de.topicmapslab.tmcledit.extensions.viewer");
		makeActions();
		hookContextMenu();
		hookDoubleClickAction();
		contributeToActionBars();

		for (IWorkbenchPage page : getSite().getWorkbenchWindow().getPages())
			page.addPartListener(this);
		
		getSite().setSelectionProvider(viewer);
		
	}

	private void hookContextMenu() {
		MenuManager menuMgr = new MenuManager("#PopupMenu");
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {
				ModelView.this.fillContextMenu(manager);
			}
		});
		Menu menu = menuMgr.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(menu);
		getSite().registerContextMenu(menuMgr, viewer);
	}

	@Override
	public void dispose() {
		for (IWorkbenchPage page : getSite().getWorkbenchWindow().getPages())
			page.removePartListener(this);
		super.dispose();
	}

	private void contributeToActionBars() {
		IActionBars bars = getViewSite().getActionBars();
		fillLocalPullDown(bars.getMenuManager());
		fillLocalToolBar(bars.getToolBarManager());
	}

	private void fillLocalPullDown(IMenuManager manager) {
		manager.add(action1);
		manager.add(new Separator());
		manager.add(action2);
	}

	private void fillContextMenu(IMenuManager manager) {
		manager.add(action1);
		manager.add(action2);
		manager.add(new Separator());
		drillDownAdapter.addNavigationActions(manager);
		// Other plug-ins can contribute there actions here
		manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
	}

	private void fillLocalToolBar(IToolBarManager manager) {
		manager.add(action1);
		manager.add(action2);
		manager.add(new Separator());
		drillDownAdapter.addNavigationActions(manager);
	}

	private void makeActions() {
		action1 = new Action() {
			public void run() {
				contentProvider.initialize();
				viewer.setInput(getViewSite());
			}
		};
		action1.setText("Refresh");
		action1.setToolTipText("Refreshs the Model View");
		action1.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages()
				.getImageDescriptor(ISharedImages.IMG_ELCL_SYNCED));

		action2 = new Action() {
			public void run() {
				showMessage("Action 2 executed");
			}
		};
		action2.setText("Action 2");
		action2.setToolTipText("Action 2 tooltip");
		action2.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages()
				.getImageDescriptor(ISharedImages.IMG_OBJS_INFO_TSK));
		doubleClickAction = new Action() {
			public void run() {
				ISelection selection = viewer.getSelection();
				Object obj = ((IStructuredSelection) selection)
						.getFirstElement();
				showMessage("Double-click detected on " + obj.toString());
			}
		};
	}

	private void hookDoubleClickAction() {
		viewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				doubleClickAction.run();
			}
		});
	}

	private void showMessage(String message) {
		MessageDialog.openInformation(viewer.getControl().getShell(),
				"Model View", message);
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		viewer.getControl().setFocus();
	}

	@Override
	public void partActivated(IWorkbenchPart part) {
		if (part instanceof TmcleditDiagramEditor) {
			if (currentEditor==part)
				return;
			
			contentProvider.initialize();
			viewer.setInput(getViewSite());
			currentEditor = (TmcleditDiagramEditor) part;
			
		}
	}

	@Override
	public void partBroughtToTop(IWorkbenchPart part) {
	}

	@Override
	public void partClosed(IWorkbenchPart part) {
	}

	@Override
	public void partDeactivated(IWorkbenchPart part) {
	}

	@Override
	public void partOpened(IWorkbenchPart part) {
	}

	@Override
	public EditingDomain getEditingDomain() {
		if (currentEditor!=null)
			return currentEditor.getEditingDomain();
		return null;
	}
}