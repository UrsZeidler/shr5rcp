package de.urszeidler.shr5.runtime.ui.widgets;

import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.list.IListChangeListener;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.list.ListChangeEvent;
import org.eclipse.core.databinding.observable.list.ListDiffEntry;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.IValueChangeListener;
import org.eclipse.core.databinding.observable.value.ValueChangeEvent;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.databinding.EMFObservables;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.wb.swt.SWTResourceManager;

import de.urszeidler.eclipse.shr5.gameplay.CombatTurn;
import de.urszeidler.eclipse.shr5.gameplay.GameplayPackage;
import de.urszeidler.eclipse.shr5.gameplay.InitativePass;

public class CombatTurnList extends Composite implements IValueChangeListener, IListChangeListener {

    private WritableValue combatTurn = new WritableValue();
    private Composite composite;
    private Composite composite1;
    private ListDiffEntry[] listDiff;
    private IObservableList observeList;
    private IObservableValue detailValue;

    /**
     * Create the composite.
     * 
     * @param parent
     * @param style
     */
    public CombatTurnList(Composite parent, int style) {
        super(parent, style);
        setLayout(new FillLayout(SWT.HORIZONTAL));

        composite = new Composite(this, SWT.NONE);
        composite.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
        composite.setLayout(new FillLayout());

        combatTurn.addValueChangeListener(this);
    }

    @Override
    public void dispose() {
        combatTurn.removeValueChangeListener(this);
        combatTurn.dispose();
        observeList.removeListChangeListener(this);
        observeList.dispose();
        detailValue.removeValueChangeListener(this);
        detailValue.dispose();
        super.dispose();
    }

    private void updateCombatTurn() {
        if (composite1 != null)
            composite1.dispose();

        composite1 = new Composite(composite, SWT.NONE);
        composite1.setLayout(new GridLayout(1, true));
        composite1.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));

        CombatTurn value = (CombatTurn)combatTurn.getValue();
        if (value != null) {
            EList<InitativePass> actionPhases = value.getActionPhases();
            for (InitativePass phaseCmd : actionPhases) {
                if(phaseCmd.isExecuted())
                    continue;
                ActionPhaseWidget actionPhaseComposite = new ActionPhaseWidget(composite1, SWT.NONE, "Phase :" + phaseCmd.getPhase());
                actionPhaseComposite.setCharacter(phaseCmd);// setNameable(((SubjectCommand)phaseCmd).getSubject().getCharacter().getPersona());
                actionPhaseComposite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
                if (phaseCmd.equals(value.getCurrentTurn()))
                    actionPhaseComposite.setActiv(true);
                else
                    actionPhaseComposite.setActiv(false);
                
                RuntimeCharacterTooltip testTooltip = new RuntimeCharacterTooltip(actionPhaseComposite.getLabel_image(),phaseCmd.getSubject());
//                testTooltip.set
            }
        }
        composite1.setSize(composite1.computeSize(SWT.DEFAULT, SWT.DEFAULT));
        composite1.layout(true, true);
        composite.setSize(composite1.computeSize(SWT.DEFAULT, SWT.DEFAULT));
        composite.getParent().getParent().layout(true, true);
        if (composite.getParent().getParent() instanceof ScrolledComposite) {
            ScrolledComposite sc = (ScrolledComposite)composite.getParent().getParent();
            sc.setMinSize(composite1.computeSize(SWT.DEFAULT, SWT.DEFAULT));
        }
    }

    public void setCombatTurn(CombatTurn ct) {
        combatTurn.setValue(ct);
        if (observeList != null) {
            observeList.removeListChangeListener(this);
            observeList.dispose();
        }
        if (detailValue != null) {
            detailValue.removeValueChangeListener(this);
            detailValue.dispose();
        }

        observeList = EMFObservables.observeList(ct, GameplayPackage.Literals.COMBAT_TURN__ACTION_PHASES);
        observeList.addListChangeListener(this);

        detailValue = EMFObservables.observeDetailValue(Realm.getDefault(), combatTurn, GameplayPackage.Literals.COMBAT_TURN__CURRENT_TURN);
        detailValue.addValueChangeListener(this);
    }

    @Override
    protected void checkSubclass() {
        // Disable the check that prevents subclassing of SWT components
    }

    @Override
    public void handleValueChange(ValueChangeEvent event) {
        if (this.isDisposed() || !this.isVisible())
            return;
        updateCombatTurn();
    }

    @Override
    public void handleListChange(ListChangeEvent event) {
        if (this.isDisposed() || !this.isVisible())
            return;
        Object source = event.getSource();
        if (source instanceof IObservableList) {
            IObservableList ol = (IObservableList)source;
            if (!ol.isEmpty()) {
                if (!compareDiff(event.diff.getDifferences())) {
                    updateCombatTurn();
                    listDiff = event.diff.getDifferences();
                }
            }
        }
    }

    private boolean compareDiff(ListDiffEntry[] listDiff2) {
        if (listDiff == null)
            return false;
        if (listDiff2.length != listDiff.length)
            return false;

        for (int i = 0; i < listDiff2.length; i++) {
            ListDiffEntry listDiffEntry = listDiff[i];
            ListDiffEntry listDiffEntry2 = listDiff2[i];
            if (!(listDiffEntry.isAddition() == listDiffEntry2.isAddition() && listDiffEntry.getPosition() == listDiffEntry2.getPosition()
                    && listDiffEntry.getElement() != null && listDiffEntry.getElement().equals(listDiffEntry2.getElement())))
                return false;

        }

        return true;
    }

}
