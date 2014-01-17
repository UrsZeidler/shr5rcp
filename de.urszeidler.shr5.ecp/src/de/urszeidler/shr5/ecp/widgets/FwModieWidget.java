/**
 * 
 */
package de.urszeidler.shr5.ecp.widgets;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecp.edit.internal.swt.actions.AddAttributeAction;
import org.eclipse.emf.ecp.edit.internal.swt.actions.ECPSWTAction;
import org.eclipse.emf.ecp.edit.internal.swt.controls.AttributeMultiControlTester;
import org.eclipse.emf.ecp.edit.internal.swt.controls.ControlMessages;
import org.eclipse.emf.ecp.edit.internal.swt.controls.MultiControl;
import org.eclipse.emf.ecp.edit.spi.util.ECPStaticApplicableTester;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.swt.widgets.Composite;

/**
 * @author urs
 *
 */
@Deprecated
@SuppressWarnings("restriction")
public class FwModieWidget extends MultiControl {

	/**
	 * @wbp.parser.entryPoint
	 */
	protected void createContentControl(Composite composite) {
		super.createContentControl(composite);
	}

	@Override
	protected ECPSWTAction[] instantiateActions() {
		final ECPSWTAction[] actions = new ECPSWTAction[1];
		actions[0] = new AddAttributeAction(getModelElementContext(), getItemPropertyDescriptor(),
			getStructuralFeature());
		return actions;
	}

	@Override
	protected int getTesterPriority(ECPStaticApplicableTester tester, IItemPropertyDescriptor itemPropertyDescriptor,
		EObject eObject) {
		return AttributeMultiControlTester.getTesterPriority(tester,
			(EStructuralFeature) itemPropertyDescriptor.getFeature(eObject), eObject);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.ecp.edit.internal.swt.util.SWTControl#getUnsetLabelText()
	 */
	@Override
	protected String getUnsetLabelText() {
		return ControlMessages.AttributeMultiControl_NotSetClickToSet;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.ecp.edit.internal.swt.util.SWTControl#getUnsetButtonTooltip()
	 */
	@Override
	protected String getUnsetButtonTooltip() {
		return ControlMessages.AttributeMultiControl_Unset;
	}
}
