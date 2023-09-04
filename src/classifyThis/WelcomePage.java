package classifyThis;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;

public class WelcomePage extends Composite {

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public WelcomePage(Composite parent, int style) {
		super(parent, style);
		
		Button ctrlImage = new Button(this, SWT.NONE);
		ctrlImage.setImage(SWTResourceManager.getImage("C:\\Users\\emily\\OneDrive\\Pictures\\Screenshots\\Screenshot 2023-08-12 130526.png"));
		ctrlImage.setBounds(29, 10, 436, 304);

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}

}
