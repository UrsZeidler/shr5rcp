/**
 * (c) Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.gameplay.impl;

import org.eclipse.emf.ecore.EClass;

import de.urszeidler.eclipse.shr5.gameplay.GameplayPackage;
import de.urszeidler.eclipse.shr5.gameplay.SimpleAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SimpleActionImpl extends SubjectCommandImpl implements SimpleAction {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SimpleActionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return GameplayPackage.Literals.SIMPLE_ACTION;
    }

    
    @Override
    public void redo() {
      prepareRedo();

      executeSubActions();
      setExecuted(true);
      executing = false;
    }
} //SimpleActionImpl
