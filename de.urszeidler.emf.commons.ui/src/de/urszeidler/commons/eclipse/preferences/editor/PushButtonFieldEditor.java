/*******************************************************************************
 *Urs Zeidler
 *******************************************************************************/
package de.urszeidler.commons.eclipse.preferences.editor;

import org.eclipse.jface.preference.FieldEditor;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

/**
 * A field editor for a color type preference.
 */
public abstract class PushButtonFieldEditor extends FieldEditor {


	private Button btn;

	/**
	 * Creates a new color field editor
	 */
	protected PushButtonFieldEditor() {
		// No default behavior
	}

	/**
	 * Creates a color field editor.
	 * 
	 * @param name
	 *            the name of the preference this field editor works on
	 * @param labelText
	 *            the label text of the field editor
	 * @param parent
	 *            the parent of the field editor's control
	 */
	public PushButtonFieldEditor(String name, String labelText, Composite parent) {
		super(name, labelText, parent);
	}

	 /*
	 * (non-Javadoc) Method declared on FieldEditor.
	 */
	 protected void adjustForNumColumns(int numColumns) {
	 ((GridData) btn.getLayoutData()).horizontalSpan =
	 numColumns - 1;
	 }

	/**
	 * Computes the size of the color image displayed on the button.
	 * <p>
	 * This is an internal method and should not be called by clients.
	 * </p>
	 * 
	 * @param window
	 *            the window to create a GC on for calculation.
	 * @return Point The image size
	 * 
	 */
	protected Point computeImageSize(Control window) {
		// Make the image height as high as a corresponding character. This
		// makes sure that the button has the same size as a "normal" text
		// button.
		GC gc = new GC(window);
		Font f = JFaceResources.getFontRegistry().get(JFaceResources.DEFAULT_FONT);
		gc.setFont(f);
		int height = gc.getFontMetrics().getHeight();
		gc.dispose();
		Point p = new Point(height * 3 - 6, height);
		return p;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.jface.preference.FieldEditor#doFillIntoGrid(org.eclipse.swt
	 * .widgets.Composite, int)
	 */
	protected void doFillIntoGrid(Composite parent, int numColumns) {
		Control control = getLabelControl(parent);
		GridData gd = new GridData();
		gd.horizontalSpan = numColumns - 1;
		control.setLayoutData(gd);

		Button colorButton = getChangeControl(parent);
		colorButton.setLayoutData(new GridData());

	}

	/**
	 * Returns the change button for this field editor.
	 * 
	 * @param parent
	 *            The control to create the button in if required.
	 * @return the change button
	 */
	protected Button getChangeControl(Composite parent) {
		if (btn == null) {
			btn = new Button(parent, SWT.PUSH);// new ColorSelector(parent);
			btn.addSelectionListener(new SelectionListener() {

				@Override
				public void widgetSelected(SelectionEvent e) {
					doButtonPressed();

				}

				@Override
				public void widgetDefaultSelected(SelectionEvent e) {
				}
			});
			btn.setText("ok");
		}
		return btn;
	}

	protected abstract void doButtonPressed();

	/*
	 * (non-Javadoc) Method declared on FieldEditor.
	 */
	public int getNumberOfControls() {
		return 2;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.preference.FieldEditor#setEnabled(boolean,
	 * org.eclipse.swt.widgets.Composite)
	 */
	public void setEnabled(boolean enabled, Composite parent) {
		super.setEnabled(enabled, parent);
		getChangeControl(parent).setEnabled(enabled);
	}

	@Override
	protected void doLoad() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void doLoadDefault() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void doStore() {
		// TODO Auto-generated method stub
		
	}

}
