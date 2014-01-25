package de.urszeidler.shr5.ecp.editor.widgets;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.conversion.Converter;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.databinding.EMFUpdateValueStrategy;
import org.eclipse.emf.databinding.edit.EMFEditObservables;
import org.eclipse.emf.edit.domain.EditingDomain;
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
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage.Literals;
import de.urszeidler.eclipse.shr5Management.SpecialType;
import de.urszeidler.eclipse.shr5Management.Spellcaster;
import de.urszeidler.eclipse.shr5Management.Technomancer;

public class MagicGeneratorOption extends Composite {
	private DataBindingContext m_bindingContext;

	private FormToolkit toolkit;// = new FormToolkit(Display.getCurrent());
	private SpecialType object;
	private ManagedCharacter context;
	private EditingDomain editingDomain;
	private Label lblspend;
	private Label lblleft;
	private Label lblSpellSpend;
	private Label lblSpellLeft;
	private Label lblCFormSpend;
	private Label lblCFormLeft;

    private int minSize = 100;
	/**
	 * Create the composite.
	 * 
	 * @param parent
	 * @param style
	 */
	public MagicGeneratorOption(Composite parent, int style) {
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
	public MagicGeneratorOption(Composite parent, int style, SpecialType object, ManagedCharacter context, FormToolkit toolkit,
			EditingDomain editingDomain) {
		super(parent, style);
		this.toolkit = toolkit;
		this.object = object;
		this.context = context;
		this.editingDomain = editingDomain;
		createWidgets();
	}
	
	private void createWidgets() {
		toolkit.adapt(this);
		toolkit.paintBordersFor(this);
		setLayout(new GridLayout(2, false));

		lblspend = new Label(this, SWT.NONE);
		GridData gd_lblspend = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_lblspend.widthHint = minSize;
		lblspend.setLayoutData(gd_lblspend);
		toolkit.adapt(lblspend, true, true);
		lblspend.setText("New Label");

		lblleft = new Label(this, SWT.NONE);
		GridData gd_lblleft = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_lblleft.widthHint = minSize;
		lblleft.setLayoutData(gd_lblleft);
		toolkit.adapt(lblleft, true, true);
		lblleft.setText("New Label");

		if (object instanceof Spellcaster) {
			lblSpellSpend = new Label(this, SWT.NONE);
			toolkit.adapt(lblSpellSpend, true, true);
			lblSpellSpend.setText("New Label");

			lblSpellLeft = new Label(this, SWT.NONE);
			toolkit.adapt(lblSpellLeft, true, true);
			lblSpellLeft.setText("New Label");

		} else if (object instanceof Technomancer) {
			lblCFormSpend = new Label(this, SWT.NONE);
			toolkit.adapt(lblCFormSpend, true, true);
			lblCFormSpend.setText("New Label");

			lblCFormLeft = new Label(this, SWT.NONE);
			toolkit.adapt(lblCFormLeft, true, true);
			lblCFormLeft.setText("New Label");

		}

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
				context.getChracterSource(), Literals.SHR5_GENERATOR__KARMA_SPEND);

		EMFUpdateValueStrategy modelToTarget = new EMFUpdateValueStrategy();
		modelToTarget.setConverter(new Converter(Integer.class, String.class) {
			@Override
			public Object convert(Object fromObject) {
				int calcAttributesSpend = object.calcSkillsSpend(context);
				return "Skills spend :" + calcAttributesSpend + "";
			}
		});
		bindingContext.bindValue(observeTextLblspendObserveWidget, objectAttibutePointsSpendObserveValue,
				new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER), modelToTarget);
		//
		IObservableValue observeTextLblleftObserveWidget = WidgetProperties.text().observe(lblleft);
		IObservableValue objectAttibutePointsLeftObserveValue = EMFEditObservables.observeValue(editingDomain,
				context.getChracterSource(), Literals.SHR5_GENERATOR__KARMA_SPEND);

		modelToTarget = new EMFUpdateValueStrategy();
		modelToTarget.setConverter(new Converter(Integer.class, String.class) {
			@Override
			public Object convert(Object fromObject) {
				int calcAttributesSpend = object.calcSkillsSpend(context);
				return "left :" + (object.getSkillNumber() - calcAttributesSpend + "");
			}
		});
		bindingContext.bindValue(observeTextLblleftObserveWidget, objectAttibutePointsLeftObserveValue, new UpdateValueStrategy(
				UpdateValueStrategy.POLICY_NEVER), modelToTarget);

		// ---
		if (object instanceof Spellcaster) {
			final Spellcaster sc = (Spellcaster) object;
			observeTextLblspendObserveWidget = WidgetProperties.text().observe(lblSpellSpend);
			objectAttibutePointsSpendObserveValue = EMFEditObservables.observeValue(editingDomain, context.getChracterSource(),
					Literals.SHR5_GENERATOR__KARMA_SPEND);

			modelToTarget = new EMFUpdateValueStrategy();
			modelToTarget.setConverter(new Converter(Integer.class, String.class) {
				@Override
				public Object convert(Object fromObject) {
					int calcAttributesSpend = sc.calcSpellPointsSpend(context);
					return "Spells spend :" + calcAttributesSpend + "";
				}
			});
			bindingContext.bindValue(observeTextLblspendObserveWidget, objectAttibutePointsSpendObserveValue,
					new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER), modelToTarget);
			//
			observeTextLblleftObserveWidget = WidgetProperties.text().observe(lblSpellLeft);
			objectAttibutePointsLeftObserveValue = EMFEditObservables.observeValue(editingDomain, context.getChracterSource(),
					Literals.SHR5_GENERATOR__KARMA_SPEND);

			modelToTarget = new EMFUpdateValueStrategy();
			modelToTarget.setConverter(new Converter(Integer.class, String.class) {
				@Override
				public Object convert(Object fromObject) {
					int calcAttributesSpend = sc.calcSpellPointsSpend(context);
					return "left :" + (object.getSkillNumber() - calcAttributesSpend + "");
				}
			});
			bindingContext.bindValue(observeTextLblleftObserveWidget, objectAttibutePointsLeftObserveValue,
					new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER), modelToTarget);
		}
		// ---
		if (object instanceof Technomancer) {
			final Technomancer sc = (Technomancer) object;
			observeTextLblspendObserveWidget = WidgetProperties.text().observe(lblCFormSpend);
			objectAttibutePointsSpendObserveValue = EMFEditObservables.observeValue(editingDomain, context.getChracterSource(),
					Literals.SHR5_GENERATOR__KARMA_SPEND);

			modelToTarget = new EMFUpdateValueStrategy();
			modelToTarget.setConverter(new Converter(Integer.class, String.class) {
				@Override
				public Object convert(Object fromObject) {
					int calcAttributesSpend = sc.calcComplexFormsSpend(context);
					return "Forms spend :" + calcAttributesSpend + "";
				}
			});
			bindingContext.bindValue(observeTextLblspendObserveWidget, objectAttibutePointsSpendObserveValue,
					new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER), modelToTarget);
			//
			observeTextLblleftObserveWidget = WidgetProperties.text().observe(lblCFormLeft);
			objectAttibutePointsLeftObserveValue = EMFEditObservables.observeValue(editingDomain, context.getChracterSource(),
					Literals.SHR5_GENERATOR__KARMA_SPEND);

			modelToTarget = new EMFUpdateValueStrategy();
			modelToTarget.setConverter(new Converter(Integer.class, String.class) {
				@Override
				public Object convert(Object fromObject) {
					int calcAttributesSpend = sc.calcComplexFormsSpend(context);
					return "left :" + (object.getSkillNumber() - calcAttributesSpend + "");
				}
			});
			bindingContext.bindValue(observeTextLblleftObserveWidget, objectAttibutePointsLeftObserveValue,
					new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER), modelToTarget);

		}

	}
}
