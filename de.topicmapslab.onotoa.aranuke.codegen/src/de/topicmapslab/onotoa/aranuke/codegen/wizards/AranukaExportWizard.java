/**
 * 
 */
package de.topicmapslab.onotoa.aranuke.codegen.wizards;

import java.io.File;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IExportWizard;
import org.eclipse.ui.IWorkbench;
import org.tmapi.core.TopicMap;

import de.topicmapslab.aranuka.codegen.core.CodeGenerator;
import de.topicmapslab.tmcledit.export.builder.TMCLTopicMapBuilder;
import de.topicmapslab.tmcledit.model.TopicMapSchema;
import de.topicmapslab.tmcledit.model.index.ModelIndexer;

/**
 * 
 * 
 * @author Hannes Niederhausen
 * 
 */
public class AranukaExportWizard extends Wizard implements IExportWizard {

	private String path;
	private String packageName;

	/**
	 * 
	 */
	public AranukaExportWizard() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.wizard.Wizard#performFinish()
	 */
	@Override
	public boolean performFinish() {
		try {
			TopicMapSchema schema = ModelIndexer.getInstance()
					.getTopicMapSchema();

			TMCLTopicMapBuilder builder = new TMCLTopicMapBuilder(schema, false);

			TopicMap topicMap = builder.createTopicMap();

			CodeGenerator gen = new CodeGenerator();
			gen.generateCode(topicMap, new File(path), packageName);
		} catch (Exception e) {
			MessageDialog.openError(getShell(), "Error while generating code",
					"An error occurred:" + e.getMessage() + "["
							+ e.getClass().getName() + "]");

			return true;
		}

		return true;
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {

	}

	@Override
	public void addPages() {
		addPage(new ExportPage());
	}

	private class ExportPage extends WizardPage {
		private Text sourcePathText;
		private Text packageNameText;
		private Button browseButton;

		protected ExportPage() {
			super("Export");
		}

		@Override
		public void createControl(Composite parent) {
			Composite comp = new Composite(parent, SWT.NONE);
			comp.setLayout(new GridLayout(3, false));

			Label l = new Label(comp, SWT.NONE);
			l.setText("Target Directory:");

			sourcePathText = new Text(comp, SWT.BORDER);
			sourcePathText
					.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

			browseButton = new Button(comp, SWT.PUSH);
			browseButton.setText("...");

			l = new Label(comp, SWT.NONE);
			l.setText("package name:");
			packageNameText = new Text(comp, SWT.BORDER);
			packageNameText
					.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
			hookListeners();

			setControl(comp);

			sourcePathText.setText("/tmp/aranuka");
			packageNameText.setText("de.test");
			path = sourcePathText.getText();
			packageName = packageNameText.getText();
		}

		private void hookListeners() {
			browseButton.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					DirectoryDialog dlg = new DirectoryDialog(getShell());
					String s = dlg.open();
					if (s != null) {
						sourcePathText.setText(s);
					}
				}
			});

			sourcePathText.addModifyListener(new ModifyListener() {

				@Override
				public void modifyText(ModifyEvent e) {
					path = sourcePathText.getText();
				}
			});

			packageNameText.addModifyListener(new ModifyListener() {

				@Override
				public void modifyText(ModifyEvent e) {
					packageName = packageNameText.getText();
				}
			});
		}

		@Override
		public boolean canFlipToNextPage() {
			File file = new File(sourcePathText.getText());
			if (!file.isDirectory())
				return false;

			for (char c : packageNameText.getText().toCharArray()) {
				if (!(Character.isLetterOrDigit(c) || (c == '.')))
					return false;
			}

			path = sourcePathText.getText();
			if (!(path.endsWith("/")))
				path += "/";
			packageName = packageNameText.getText();

			return true;
		}

	}
}
