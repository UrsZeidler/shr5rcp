package de.urszeidler.shr5.ecp.editor.widgets;

import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.conversion.Converter;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.databinding.EMFUpdateValueStrategy;
import org.eclipse.emf.databinding.edit.EMFEditObservables;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.databinding.fieldassist.ControlDecorationSupport;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.forms.widgets.FormToolkit;

import de.urszeidler.eclipse.shr5Management.ManagedCharacter;
import de.urszeidler.eclipse.shr5Management.MetaType;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage.Literals;
import de.urszeidler.shr5.ecp.binding.NumberInRangeValidator;

public class MetaTypGeneratorOption extends Composite {
	private DataBindingContext m_bindingContext;

	private FormToolkit toolkit;//= new FormToolkit(Display.getCurrent());
	private MetaType object;
	private ManagedCharacter context;
	private EditingDomain editingDomain;
	private Label lblspend;
	private Label lblleft;

    private int minSize = 40;
    private NumberInRangeValidator specialPointsInRangeValidator;

	/**
	 * Create the composite.
	 * 
	 * @param parent
	 * @param style
	 */
	public MetaTypGeneratorOption(Composite parent, int style) {
		super(parent, style);
		toolkit = new FormToolkit(Display.getCurrent());
		addDisposeListener(new DisposeListener() {
			public void widgetDisposed(DisposeEvent e) {
				toolkit.dispose();
			}
		});
		createWidgets();
	}

	/**
	 * The main contructor.
	 * 
	 * @param parent
	 * @param style
	 * @param object
	 * @param context
	 * @param toolkit
	 * @param editingDomain
	 */
	public MetaTypGeneratorOption(Composite parent, int style, MetaType object, ManagedCharacter context,
			FormToolkit toolkit, EditingDomain editingDomain) {
		super(parent, style);
		this.toolkit = toolkit;
		this.object = object;
		this.context = context;
		this.editingDomain = editingDomain;
		specialPointsInRangeValidator = new NumberInRangeValidator(0, object.getSpecialPoints());
		createWidgets();
	}

	private void createWidgets() {
		toolkit.adapt(this);
		toolkit.paintBordersFor(this);
		GridLayout gridLayout = new GridLayout(3, false);
		gridLayout.horizontalSpacing = 10;
		setLayout(gridLayout);
		
		toolkit.createLabel(this, "Special (spend/left):", SWT.NONE);

		lblspend = new Label(this, SWT.NONE);
		GridData gd_lblspend = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_lblspend.widthHint = minSize;
		lblspend.setLayoutData(gd_lblspend);
		toolkit.adapt(lblspend, true, true);
		lblspend.setText("spend : too much");

		lblleft = new Label(this, SWT.NONE);
		GridData gd_lblleft = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_lblleft.widthHint = minSize;
		lblleft.setLayoutData(gd_lblleft);
		toolkit.adapt(lblleft, true, true);
		lblleft.setText("New Label");
		m_bindingContext = initDataBindings();
		internalBinding(m_bindingContext);
	}

	protected DataBindingContext initDataBindings() {
		DataBindingContext bindingContext = new DataBindingContext();
		//
		//

		//
		return bindingContext;
	}

	private void internalBinding(DataBindingContext bindingContext) {
		IObservableValue observeTextLblspendObserveWidget = WidgetProperties.text().observe(lblspend);
		IObservableValue objectAttibutePointsSpendObserveValue = EMFEditObservables.observeValue(editingDomain,
				context.getChracterSource(), Literals.SHR5_GENERATOR__SPECIAL_POINT_SPEND);

		EMFUpdateValueStrategy modelToTarget = new EMFUpdateValueStrategy();
		//modelToTarget.setAfterGetValidator(specialPointsInRangeValidator);
//		modelToTarget.setConverter(new Converter(Integer.class, String.class) {
//			@Override
//			public Object convert(Object fromObject) {
//				int calcAttributesSpend = object.calcSpecialPointsSpend(context);
//				return "spend :" + calcAttributesSpend + "";
//			}
//		});
		Binding bindValue = bindingContext.bindValue(observeTextLblspendObserveWidget, objectAttibutePointsSpendObserveValue,
				new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER), modelToTarget);
		ControlDecorationSupport.create(bindValue, SWT.TOP | SWT.LEFT);
		//
		IObservableValue observeTextLblleftObserveWidget = WidgetProperties.text().observe(lblleft);
		IObservableValue objectAttibutePointsLeftObserveValue = EMFEditObservables.observeValue(editingDomain,
				context.getChracterSource(), Literals.SHR5_GENERATOR__SPECIAL_POINT_SPEND);

		modelToTarget = new EMFUpdateValueStrategy();
		modelToTarget.setConverter(new Converter(Integer.class, String.class) {
			@Override
			public Object convert(Object fromObject) {
				int calcAttributesSpend = object.calcSpecialPointsSpend(context);
				return (object.getSpecialPoints() - calcAttributesSpend + "");
			}
		});
		bindingContext.bindValue(observeTextLblleftObserveWidget, objectAttibutePointsLeftObserveValue, new UpdateValueStrategy(
				UpdateValueStrategy.POLICY_NEVER), modelToTarget);
	}
}
