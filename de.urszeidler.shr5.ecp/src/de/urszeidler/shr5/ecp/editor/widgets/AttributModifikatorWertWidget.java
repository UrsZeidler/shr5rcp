package de.urszeidler.shr5.ecp.editor.widgets;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.emf.commons.ui.binding.BindingToolkit;



public class AttributModifikatorWertWidget extends Composite {

	public AttributModifikatorWertWidget(Composite parent, int style,
			BindingToolkit bindingToolkit) {
		super(parent, style);
		GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 3;
		this.setLayout(gridLayout);

		createContent(bindingToolkit);
	}

	/**
	 * @param toolkit
	 * @param bindingToolkit
	 */
	protected void createContent(BindingToolkit bindingToolkit) {

		createwertContent(bindingToolkit);

		createattributContent(bindingToolkit);

		createmodifiziertesContent(bindingToolkit);

	}

	/**
	 * @param toolkit
	 * @param bindingToolkit
	 */
	protected void createwertContent(BindingToolkit bindingToolkit) {
		GridData gridData;
		Label label;

		label = new Label(this, SWT.NONE);
		label.setText("wert");

		gridData = new GridData();
		gridData.horizontalAlignment = GridData.FILL;
		gridData.grabExcessHorizontalSpace = true;
		gridData.verticalAlignment = GridData.CENTER;
		gridData.horizontalSpan = 2;

		Text wertComp = new Text(this, SWT.SINGLE); //toolkit.createText(this, "");
		wertComp.setLayoutData(gridData);
		bindingToolkit.bindTextFeature(wertComp, Shr5Package.eINSTANCE
				.getAttributModifikatorWert_Wert());

	}

	/**
	 * @param toolkit
	 * @param bindingToolkit
	 */
	protected void createattributContent(BindingToolkit bindingToolkit) {
		GridData gridData;
		Label label;

		label = new Label(this, SWT.NONE);
		label.setText("attribut");

		gridData = new GridData();
		gridData.horizontalAlignment = GridData.FILL;
		gridData.grabExcessHorizontalSpace = true;
		gridData.verticalAlignment = GridData.CENTER;
		gridData.horizontalSpan = 1;

		Text attributComp = new Text(this, SWT.BORDER);
		attributComp.setLayoutData(gridData);

		Button attributChooseBtn = new Button(this, SWT.PUSH);
		attributChooseBtn.setText("...");
		attributChooseBtn.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				handleattributChooseBtnClick();
			}
		});
		bindingToolkit.bindFeature(attributComp, Shr5Package.eINSTANCE
				.getAttributModifikatorWert_Attribut());

	}

	/**
	 * @param toolkit
	 * @param bindingToolkit
	 */
	protected void createmodifiziertesContent(BindingToolkit bindingToolkit) {
		GridData gridData;
		Label label;

		label = new Label(this, SWT.NONE);
		label.setText("modifiziertes");

		gridData = new GridData();
		gridData.horizontalAlignment = GridData.FILL;
		gridData.grabExcessHorizontalSpace = true;
		gridData.verticalAlignment = GridData.CENTER;
		gridData.horizontalSpan = 1;

		Text modifiziertesComp = new Text(this, SWT.BORDER | SWT.READ_ONLY);
		modifiziertesComp.setLayoutData(gridData);

		Button modifiziertesChooseBtn = new Button(this, SWT.PUSH);
		modifiziertesChooseBtn.setText("...");
		modifiziertesChooseBtn.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				handlemodifiziertesChooseBtnClick();
			}
		});
		
		bindingToolkit.bindFeature(modifiziertesComp,
				Shr5Package.eINSTANCE
						.getAttributModifikatorWert_Modifiziertes());

	}

	protected void handleattributChooseBtnClick() {
	}

	protected void handlemodifiziertesChooseBtnClick() {
	}

}
