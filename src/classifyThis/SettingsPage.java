package classifyThis;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.wb.swt.SWTResourceManager;

public class SettingsPage extends Composite {

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public SettingsPage(Composite parent, int style) {
		super(parent, style);
		
		Button btnPrevious = new Button(this, SWT.NONE);
		btnPrevious.setText("Previous");
		btnPrevious.setBounds(239, 535, 90, 30);
		
		ComboViewer comboViewer = new ComboViewer(this, SWT.NONE);
		Combo combo = comboViewer.getCombo();
		combo.setBounds(239, 494, 436, 28);

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}

}
