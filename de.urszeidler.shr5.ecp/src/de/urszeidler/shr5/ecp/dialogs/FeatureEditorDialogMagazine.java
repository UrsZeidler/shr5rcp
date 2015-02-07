package de.urszeidler.shr5.ecp.dialogs;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Shell;

import de.urszeidler.eclipse.shr5.Feuerwaffe;
import de.urszeidler.eclipse.shr5.Magazin;
import de.urszeidler.eclipse.shr5.gameplay.util.GameplayTools;

public class FeatureEditorDialogMagazine extends FeatureEditorDialogWert {
    public FeatureEditorDialogMagazine(Shell parent, ILabelProvider labelProvider, EObject object, EStructuralFeature structuralFeature,
            String displayName, List<?> choiceOfValues) {
        super(parent, labelProvider, object, structuralFeature, displayName, choiceOfValues,object,false);
        this.unique = false;
    }

    protected void updateLabel() {
        if (this.object instanceof Magazin) {
            Magazin m = (Magazin)this.object;
            Feuerwaffe type = GameplayTools.getMagazingType(m);
            if (type != null) {
                int kapazitaet = type.getKapazitaet();
                int size = this.values.getChildren().size();
                gesamtPreisLabel.setText(String.format("%s(%d/%d)", type.getName(), kapazitaet, size));
//                if(kapazitaet<size)
//                    this.values.getChildren().remove(kapazitaet-1);
            }
        }
    }
    
    @Override
    protected boolean capacityReached(Object value) {
        if (this.object instanceof Magazin) {
            Magazin m = (Magazin)this.object;
            Feuerwaffe type = GameplayTools.getMagazingType(m);
            if (type != null) {
                return this.values.getChildren().size()>= m.getCapacity();
            }
            return false;
        }
        return false;
    }

    
    
    protected void addContollButtons(org.eclipse.swt.widgets.Composite controlButtons) {
        final Button downButton = new Button(controlButtons, SWT.PUSH);
        downButton.setText("add all");
        GridData downButtonGridData = new GridData();
        downButtonGridData.verticalAlignment = SWT.FILL;
        downButtonGridData.horizontalAlignment = SWT.FILL;
        downButton.setLayoutData(downButtonGridData);

        downButton.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                Magazin m = (Magazin)object;
                Feuerwaffe type = GameplayTools.getMagazingType(m);
                if (type != null) {
                    int kapazitaet = type.getKapazitaet();
                    EList<Object> children = values.getChildren();
                    int size = children.size();
                    for (int i = size; i < kapazitaet&& values.getChildren().size()<=kapazitaet; i++) {
                        IStructuredSelection selection = (IStructuredSelection)choiceTableViewer.getSelection();
                        for (Iterator<?> i1 = selection.iterator(); i1.hasNext();) {
                            Object value = i1.next();
                            if (!unique || !children.contains(value)) {
                                if(!capacityReached(value))
                                    children.add(value);
                            }
                        }
                        choiceTableViewer.refresh();
                        
                    }
                }
            }
        });

    }
}