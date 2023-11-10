/**
 */
package de.urszeidler.eclipse.shr5.runtime.impl;

import org.eclipse.emf.ecore.EClass;

import de.urszeidler.eclipse.shr5.RiggerCommandConsole;
import de.urszeidler.eclipse.shr5.runtime.RiggerConsole;
import de.urszeidler.eclipse.shr5.runtime.RuntimePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rigger Console</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class RiggerConsoleImpl extends MatrixDeviceImpl<RiggerCommandConsole> implements RiggerConsole {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RiggerConsoleImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RuntimePackage.Literals.RIGGER_CONSOLE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * This is specialized for the more specific type known in this context.
     * @generated
     */
    @Override
    public void setDevice(RiggerCommandConsole newDevice) {
        super.setDevice(newDevice);
    }

} //RiggerConsoleImpl
