package classifyThis;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class ClassifyThis {

	protected Shell shell;
	private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());
	private String pageName = "welcome";
	private Composite currentComponent = null;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			ClassifyThis window = new ClassifyThis();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(601, 534);
		shell.setText("SWT Application");
		
		showPage("welcome");

		Button btnSettingsSwitch = new Button(shell, SWT.NONE);
		btnSettingsSwitch.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				showPage("settings");
			}
		});
		btnSettingsSwitch.setBounds(30, 422, 90, 30);
		formToolkit.adapt(btnSettingsSwitch, true, true);
		btnSettingsSwitch.setText("Switch to settings");
		
		Button btnImage = new Button(shell, SWT.NONE);
		btnImage.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				showPage("image");
			}
		});
		btnImage.setBounds(411, 434, 90, 30);
		formToolkit.adapt(btnImage, true, true);
		btnImage.setText("Image");
	}
	
	private void showPage(String pageName) {
		if (currentComponent != null) {
			currentComponent.dispose();
		}
		
		switch(pageName) {
			case "welcome":
				currentComponent = new WelcomePage(shell, SWT.NONE);
				break;
			case "image":
				currentComponent = new ImagePage(shell, SWT.NONE);
				break;
			case "settings":
				currentComponent = new SettingsPage(shell, SWT.NONE);
				break;
		}

		currentComponent.setBounds(20, 10, 481, 406);
		formToolkit.adapt(currentComponent);
		formToolkit.paintBordersFor(currentComponent);
		
	}
}
