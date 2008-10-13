package de.topicmapslab.tmcledit.diagram;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class DiagramActivator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "de.topicmapslab.tmcledit.diagram";

	// The shared instance
	private static DiagramActivator plugin;
	
	/**
	 * The constructor
	 */
	public DiagramActivator() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static DiagramActivator getDefault() {
		return plugin;
	}
	/*
	public static final Diagram getCurrentDiagram() {
		// getting the model of the current editor
		
		IWorkbenchPage page = getDefault().getWorkbench().getActiveWorkbenchWindow()
				.getActivePage();
		if (page != null) {
			IEditorPart ep = page.getActiveEditor();
			if ((ep != null) && (ep instanceof TMCLDiagramEditor)) {

				return ((TMCLDiagramEditor) ep).getDiagram();
			}
		}
			return null;
	}
*/
}