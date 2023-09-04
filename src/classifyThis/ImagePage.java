package classifyThis;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.jface.viewers.ComboViewer;

public class ImagePage extends Composite {

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public ImagePage(Composite parent, int style) {
		super(parent, style);
		
		Button ctrlImage = new Button(this, SWT.NONE);
		ctrlImage.setImage(SWTResourceManager.getImage("C:\\Users\\emily\\OneDrive\\Pictures\\Screenshots\\Screenshot 2023-08-12 130526.png"));
		ctrlImage.setBounds(26, 0, 436, 304);
		
		ComboViewer comboViewer = new ComboViewer(this, SWT.NONE);
		Combo combo = comboViewer.getCombo();
		combo.setBounds(26, 311, 436, 28);
		
		Button btnPrevious = new Button(this, SWT.NONE);
		btnPrevious.setBounds(26, 352, 90, 30);
		btnPrevious.setText("Previous");
		
		Button btnNext = new Button(this, SWT.NONE);
		btnNext.setBounds(372, 352, 90, 30);
		btnNext.setText("Next");

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
}
