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

import de.urszeidler.eclipse.shr5Management.CharacterGenerator;
import de.urszeidler.eclipse.shr5Management.ManagedCharacter;
import de.urszeidler.eclipse.shr5Management.Resourcen;
import de.urszeidler.eclipse.shr5Management.Shr5Generator;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage.Literals;
import de.urszeidler.shr5.ecp.binding.NumberInRangeValidator;

public class ResourceGeneratorOption extends Composite {
	private DataBindingContext m_bindingContext;

	private FormToolkit toolkit;//= new FormToolkit(Display.getCurrent());
	private Resourcen object;
	private ManagedCharacter context;
	private EditingDomain editingDomain;
	private Label lblspend;
	private Label lblleft;

    private int minSize = 50;

    private NumberInRangeValidator resourceInRangeValidator;
	/**
	 * Create the composite.
	 * 
	 * @param parent
	 * @param style
	 */
	public ResourceGeneratorOption(Composite parent, int style) {
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
	public ResourceGeneratorOption(Composite parent, int style, Resourcen object, ManagedCharacter context,
			FormToolkit toolkit, EditingDomain editingDomain) {
		super(parent, style);
		this.toolkit = toolkit;
		this.object = object;
		this.context = context;
		this.editingDomain = editingDomain;
		createWidgets();
	}

	private void createWidgets() {
	    resourceInRangeValidator = new NumberInRangeValidator(0, object.getResource());
		toolkit.adapt(this);
		toolkit.paintBordersFor(this);
		GridLayout gridLayout = new GridLayout(3, false);
		gridLayout.horizontalSpacing = 10;
		setLayout(gridLayout);
		
		toolkit.createLabel(this, "Resource (spend/left):", SWT.NONE);

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
				context.getChracterSource(), Literals.SHR5_GENERATOR__RESOURCE_SPEND);

		EMFUpdateValueStrategy modelToTarget = new EMFUpdateValueStrategy();
		modelToTarget.setAfterGetValidator(resourceInRangeValidator);
//		modelToTarget.setConverter(new Converter(Integer.class, String.class) {
//			@Override
//			public Object convert(Object fromObject) {
//				int calcAttributesSpend = object.calcResourceSpend(context);
//				return "spend :" + calcAttributesSpend + "";
//			}
//		});
		Binding bindValue = bindingContext.bindValue(observeTextLblspendObserveWidget, objectAttibutePointsSpendObserveValue,
				new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER), modelToTarget);
		ControlDecorationSupport.create(bindValue, SWT.TOP | SWT.LEFT);
		//
		IObservableValue observeTextLblleftObserveWidget = WidgetProperties.text().observe(lblleft);
		IObservableValue objectAttibutePointsLeftObserveValue = EMFEditObservables.observeValue(editingDomain,
				context.getChracterSource(), Literals.SHR5_GENERATOR__RESOURCE_SPEND);

		modelToTarget = new EMFUpdateValueStrategy();
		modelToTarget.setConverter(new Converter(Integer.class, String.class) {
			@Override
			public Object convert(Object fromObject) {
				int calcAttributesSpend = object.calcResourceSpend(context);
				CharacterGenerator generator = context.getChracterSource();
				int karmaToResource = 0;
				if (generator instanceof Shr5Generator) {
					Shr5Generator sr5g = (Shr5Generator) generator;
					karmaToResource = sr5g.getKarmaToResource() * sr5g.getShr5Generator().getKarmaToResourceFactor();
				}
				
				return (object.getResource()+karmaToResource - calcAttributesSpend + "");
			}
		});
		bindingContext.bindValue(observeTextLblleftObserveWidget, objectAttibutePointsLeftObserveValue, new UpdateValueStrategy(
				UpdateValueStrategy.POLICY_NEVER), modelToTarget);
	}
}
