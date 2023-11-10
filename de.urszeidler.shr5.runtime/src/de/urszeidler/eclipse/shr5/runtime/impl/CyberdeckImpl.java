/**
 */
package de.urszeidler.eclipse.shr5.runtime.impl;

import org.eclipse.emf.ecore.EClass;

import de.urszeidler.eclipse.shr5.Cyberdeck;
import de.urszeidler.eclipse.shr5.runtime.RuntimePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cyberdeck</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CyberdeckImpl extends MatrixDeviceImpl<Cyberdeck> implements de.urszeidler.eclipse.shr5.runtime.Cyberdeck {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CyberdeckImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RuntimePackage.Literals.CYBERDECK;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * This is specialized for the more specific type known in this context.
     * @generated
     */
    @Override
    public void setDevice(Cyberdeck newDevice) {
        super.setDevice(newDevice);
    }

} //CyberdeckImpl
