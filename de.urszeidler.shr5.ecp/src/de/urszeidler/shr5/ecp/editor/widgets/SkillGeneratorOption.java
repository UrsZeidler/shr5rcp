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
import de.urszeidler.eclipse.shr5Management.Skill;

public class SkillGeneratorOption extends Composite {
	private DataBindingContext m_bindingContext;

	private FormToolkit toolkit;//= new FormToolkit(Display.getCurrent());
	private Skill object;
	private ManagedCharacter context;
	private EditingDomain editingDomain;
	private Label lblspend;
	private Label lblleft;

	private Label lblgrpSpend;

	private Label lblgrpLeft;
	private Label lblKnowlegPoints;
	private Label lblSpendKnowlegePoints;

	/**
	 * Create the composite.
	 * 
	 * @param parent
	 * @param style
	 */
	public SkillGeneratorOption(Composite parent, int style) {
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
	public SkillGeneratorOption(Composite parent, int style, Skill object, ManagedCharacter context,
			FormToolkit toolkit, EditingDomain editingDomain) {
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
		gd_lblspend.widthHint = 100;
		lblspend.setLayoutData(gd_lblspend);
		toolkit.adapt(lblspend, true, true);
		lblspend.setText("New Label");

		lblleft = new Label(this, SWT.NONE);
		GridData gd_lblleft = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_lblleft.widthHint = 100;
		lblleft.setLayoutData(gd_lblleft);
		toolkit.adapt(lblleft, true, true);
		lblleft.setText("New Label");
		
		lblgrpSpend = new Label(this, SWT.NONE);
		GridData gd_lblgrpSpend = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_lblgrpSpend.widthHint = 100;
		lblgrpSpend.setLayoutData(gd_lblgrpSpend);
		toolkit.adapt(lblgrpSpend, true, true);
		lblgrpSpend.setText("New Label");
		
		lblgrpLeft = new Label(this, SWT.NONE);
		GridData gd_lblgrpLeft = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_lblgrpLeft.widthHint = 100;
		lblgrpLeft.setLayoutData(gd_lblgrpLeft);
		toolkit.adapt(lblgrpLeft, true, true);
		lblgrpLeft.setText("New Label");
		
		lblKnowlegPoints = toolkit.createLabel(this, "New Label", SWT.NONE);
		GridData gd_lblKnowlegPoints = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_lblKnowlegPoints.widthHint = 100;
		lblKnowlegPoints.setLayoutData(gd_lblKnowlegPoints);
		
		lblSpendKnowlegePoints = toolkit.createLabel(this, "New Label", SWT.NONE);
		GridData gd_lblSpendKnowlegePoints = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_lblSpendKnowlegePoints.widthHint = 100;
		lblSpendKnowlegePoints.setLayoutData(gd_lblSpendKnowlegePoints);
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
				int calcAttributesSpend = object.calcSkillSpend(context);
				return "spend :" + calcAttributesSpend + "";
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
				int calcAttributesSpend = object.calcSkillSpend(context);
				return "left :" + (object.getSkillPoints() - calcAttributesSpend + "");
			}
		});
		bindingContext.bindValue(observeTextLblleftObserveWidget, objectAttibutePointsLeftObserveValue, new UpdateValueStrategy(
				UpdateValueStrategy.POLICY_NEVER), modelToTarget);
		//----
		 observeTextLblspendObserveWidget = WidgetProperties.text().observe(lblgrpSpend);
		 objectAttibutePointsSpendObserveValue = EMFEditObservables.observeValue(editingDomain,
				context.getChracterSource(), Literals.SHR5_GENERATOR__KARMA_SPEND);

		 modelToTarget = new EMFUpdateValueStrategy();
		modelToTarget.setConverter(new Converter(Integer.class, String.class) {
			@Override
			public Object convert(Object fromObject) {
				int calcAttributesSpend = object.calcGroupSpend(context);
				return "spend :" + calcAttributesSpend + "";
			}
		});
		bindingContext.bindValue(observeTextLblspendObserveWidget, objectAttibutePointsSpendObserveValue,
				new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER), modelToTarget);
		//
		 observeTextLblleftObserveWidget = WidgetProperties.text().observe(lblgrpLeft);
		 objectAttibutePointsLeftObserveValue = EMFEditObservables.observeValue(editingDomain,
				context.getChracterSource(), Literals.SHR5_GENERATOR__KARMA_SPEND);

		modelToTarget = new EMFUpdateValueStrategy();
		modelToTarget.setConverter(new Converter(Integer.class, String.class) {
			@Override
			public Object convert(Object fromObject) {
				int calcAttributesSpend = object.calcGroupSpend(context);
				return "left :" + (object.getGroupPoints() - calcAttributesSpend + "");
			}
		});
		bindingContext.bindValue(observeTextLblleftObserveWidget, objectAttibutePointsLeftObserveValue, new UpdateValueStrategy(
				UpdateValueStrategy.POLICY_NEVER), modelToTarget);

		//----
		 observeTextLblspendObserveWidget = WidgetProperties.text().observe(lblKnowlegPoints);
		 objectAttibutePointsSpendObserveValue = EMFEditObservables.observeValue(editingDomain,
				context.getChracterSource(), Literals.SHR5_GENERATOR__KARMA_SPEND);

		 modelToTarget = new EMFUpdateValueStrategy();
		modelToTarget.setConverter(new Converter(Integer.class, String.class) {
			@Override
			public Object convert(Object fromObject) {
				int calcAttributesSpend = object.calcKnowledgeSkillPoints(context);
				return "Wissens :" + calcAttributesSpend + "";
			}
		});
		bindingContext.bindValue(observeTextLblspendObserveWidget, objectAttibutePointsSpendObserveValue,
				new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER), modelToTarget);
		//
		 observeTextLblleftObserveWidget = WidgetProperties.text().observe(lblSpendKnowlegePoints);
		 objectAttibutePointsLeftObserveValue = EMFEditObservables.observeValue(editingDomain,
				context.getChracterSource(), Literals.SHR5_GENERATOR__KARMA_SPEND);

		modelToTarget = new EMFUpdateValueStrategy();
		modelToTarget.setConverter(new Converter(Integer.class, String.class) {
			@Override
			public Object convert(Object fromObject) {
				int calcAttributesSpend = object.calcKnowledgeSkillSpend(context);
				return "left :" + (object.calcKnowledgeSkillPoints(context) - calcAttributesSpend + "");
			}
		});
		bindingContext.bindValue(observeTextLblleftObserveWidget, objectAttibutePointsLeftObserveValue, new UpdateValueStrategy(
				UpdateValueStrategy.POLICY_NEVER), modelToTarget);

	}
}
