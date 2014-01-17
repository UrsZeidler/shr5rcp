/**
 * 
 */
package de.urszeidler.shr5.ecp.dialogs;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.ui.celleditor.FeatureEditorDialog;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

import de.urszeidler.eclipse.shr5.util.ShadowrunTools;

public class FeatureEditorDialogWert extends FeatureEditorDialog {

	private Label gesamtPreisLabel;
	//private Label gesamtStrassenPreisLabel;

	public FeatureEditorDialogWert(Shell parent, ILabelProvider labelProvider, EObject object,
			EStructuralFeature structuralFeature, String displayName, List<?> choiceOfValues) {
		super(parent, labelProvider, object, structuralFeature, displayName, choiceOfValues);
		INotifyChangedListener listner = new INotifyChangedListener() {
			@Override
			public void notifyChanged(org.eclipse.emf.common.notify.Notification notification) {
				if (notification.getEventType() == org.eclipse.emf.common.notify.Notification.ADD
						|| notification.getEventType() == org.eclipse.emf.common.notify.Notification.REMOVE
						|| notification.getEventType() == org.eclipse.emf.common.notify.Notification.REMOVE_MANY
						|| notification.getEventType() == org.eclipse.emf.common.notify.Notification.ADD_MANY) {
					gesamtPreisLabel.setText(ShadowrunTools.calcListenWertToString(values.getChildren())+"¥");
//					gesamtStrassenPreisLabel.setText(PersonaEditor.calcStrassenListenWert(values.getChildren())+"¥");
//					gesamtStrassenPreisLabel.setText(PersonaEditor.calcListenGewicht_(values.getChildren())+"Kg");
				}
			}
		};

		values.addListener(listner);
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite composite = (Composite) super.createDialogArea(parent);
		Composite choiceComposite = new Composite(composite, SWT.NONE);
		GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, false);
		gridData.grabExcessHorizontalSpace = true;
		gridData.horizontalSpan = 3;
		choiceComposite.setLayoutData(gridData);
		GridLayout gridLayout = new GridLayout(3, false);
		gridLayout.marginWidth = 5;
		gridLayout.marginHeight = 5;
		gridLayout.verticalSpacing = 5;
		gridLayout.horizontalSpacing = 5;
		choiceComposite.setLayout(gridLayout);

		Label label = new Label(choiceComposite, SWT.NONE);
		label.setText("gesamtpreis");
		gridData = new GridData(SWT.FILL, SWT.FILL, true, true);
		gesamtPreisLabel = new Label(choiceComposite, SWT.NONE);
		gesamtPreisLabel.setLayoutData(gridData);
		EList<Object> list = values.getChildren();
		gesamtPreisLabel.setText(ShadowrunTools.calcListenWertToString(list)+"¥");
		label = new Label(choiceComposite, SWT.NONE);
		
//		label = new Label(choiceComposite, SWT.NONE);
//		label.setText("Straßen Gesamtpreis");
//		gridData = new GridData(SWT.FILL, SWT.FILL, true, true);
//		gesamtStrassenPreisLabel = new Label(choiceComposite, SWT.NONE);
//		gesamtStrassenPreisLabel.setLayoutData(gridData);
//		gesamtStrassenPreisLabel.setText(PersonaEditor.calcStrassenListenWert(list)+"¥");
//		label = new Label(choiceComposite, SWT.NONE);
//		
//		label = new Label(choiceComposite, SWT.NONE);
//		label.setText("Gesamt Gewicht");
//		gridData = new GridData(SWT.FILL, SWT.FILL, true, true);
//		gesamtStrassenPreisLabel = new Label(choiceComposite, SWT.NONE);
//		gesamtStrassenPreisLabel.setLayoutData(gridData);
//		gesamtStrassenPreisLabel.setText(PersonaEditor.calcListenGewicht_(list)+"Kg");
//		label = new Label(choiceComposite, SWT.NONE);
		
		
		return composite;
	}
}