/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.impl;

import de.urszeidler.eclipse.shr5.RiggerCommandConsole;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.util.ShadowrunTools;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rigger Command Console</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.RiggerCommandConsoleImpl#getRauschunterdrueckung <em>Rauschunterdrueckung</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.RiggerCommandConsoleImpl#getZugriff <em>Zugriff</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.RiggerCommandConsoleImpl#getDatenverarbeitungBasis <em>Datenverarbeitung Basis</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.RiggerCommandConsoleImpl#getFirewallBasis <em>Firewall Basis</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.RiggerCommandConsoleImpl#getZugriffBasis <em>Zugriff Basis</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RiggerCommandConsoleImpl extends CommlinkImpl implements RiggerCommandConsole {
    /**
     * The default value of the '{@link #getRauschunterdrueckung() <em>Rauschunterdrueckung</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRauschunterdrueckung()
     * @generated
     * @ordered
     */
    protected static final int RAUSCHUNTERDRUECKUNG_EDEFAULT = 0;

    /**
     * The default value of the '{@link #getZugriff() <em>Zugriff</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getZugriff()
     * @generated
     * @ordered
     */
    protected static final int ZUGRIFF_EDEFAULT = 0;

    /**
     * The default value of the '{@link #getDatenverarbeitungBasis() <em>Datenverarbeitung Basis</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDatenverarbeitungBasis()
     * @generated
     * @ordered
     */
    protected static final int DATENVERARBEITUNG_BASIS_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getDatenverarbeitungBasis() <em>Datenverarbeitung Basis</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDatenverarbeitungBasis()
     * @generated
     * @ordered
     */
    protected int datenverarbeitungBasis = DATENVERARBEITUNG_BASIS_EDEFAULT;

    /**
     * The default value of the '{@link #getFirewallBasis() <em>Firewall Basis</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFirewallBasis()
     * @generated
     * @ordered
     */
    protected static final int FIREWALL_BASIS_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getFirewallBasis() <em>Firewall Basis</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFirewallBasis()
     * @generated
     * @ordered
     */
    protected int firewallBasis = FIREWALL_BASIS_EDEFAULT;

    /**
     * The default value of the '{@link #getZugriffBasis() <em>Zugriff Basis</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getZugriffBasis()
     * @generated
     * @ordered
     */
    protected static final int ZUGRIFF_BASIS_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getZugriffBasis() <em>Zugriff Basis</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getZugriffBasis()
     * @generated
     * @ordered
     */
    protected int zugriffBasis = ZUGRIFF_BASIS_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RiggerCommandConsoleImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Shr5Package.Literals.RIGGER_COMMAND_CONSOLE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    public int getRauschunterdrueckung() {
       int geraetestufe = getGeraetestufe();
       int val = geraetestufe - getZugriffBasis();
       return val +ShadowrunTools.getModificatorValue(Shr5Package.Literals.RIGGER_COMMAND_CONSOLE__RAUSCHUNTERDRUECKUNG, getMods());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    public int getZugriff() {
        return getZugriffBasis()+ ShadowrunTools.getModificatorValue(Shr5Package.Literals.RIGGER_COMMAND_CONSOLE__ZUGRIFF, getMods());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int getFirewall() {
        return getFirewallBasis() + ShadowrunTools.getModificatorValue(Shr5Package.Literals.MATRIX_DEVICE__FIREWALL, getMods());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int getDatenverarbeitung() {
        return getDatenverarbeitungBasis() + ShadowrunTools.getModificatorValue(Shr5Package.Literals.MATRIX_DEVICE__DATENVERARBEITUNG, getMods());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getDatenverarbeitungBasis() {
        return datenverarbeitungBasis;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDatenverarbeitungBasis(int newDatenverarbeitungBasis) {
        int oldDatenverarbeitungBasis = datenverarbeitungBasis;
        datenverarbeitungBasis = newDatenverarbeitungBasis;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.RIGGER_COMMAND_CONSOLE__DATENVERARBEITUNG_BASIS, oldDatenverarbeitungBasis, datenverarbeitungBasis));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getFirewallBasis() {
        return firewallBasis;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFirewallBasis(int newFirewallBasis) {
        int oldFirewallBasis = firewallBasis;
        firewallBasis = newFirewallBasis;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.RIGGER_COMMAND_CONSOLE__FIREWALL_BASIS, oldFirewallBasis, firewallBasis));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getZugriffBasis() {
        return zugriffBasis;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setZugriffBasis(int newZugriffBasis) {
        int oldZugriffBasis = zugriffBasis;
        zugriffBasis = newZugriffBasis;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.RIGGER_COMMAND_CONSOLE__ZUGRIFF_BASIS, oldZugriffBasis, zugriffBasis));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Shr5Package.RIGGER_COMMAND_CONSOLE__RAUSCHUNTERDRUECKUNG:
                return getRauschunterdrueckung();
            case Shr5Package.RIGGER_COMMAND_CONSOLE__ZUGRIFF:
                return getZugriff();
            case Shr5Package.RIGGER_COMMAND_CONSOLE__DATENVERARBEITUNG_BASIS:
                return getDatenverarbeitungBasis();
            case Shr5Package.RIGGER_COMMAND_CONSOLE__FIREWALL_BASIS:
                return getFirewallBasis();
            case Shr5Package.RIGGER_COMMAND_CONSOLE__ZUGRIFF_BASIS:
                return getZugriffBasis();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case Shr5Package.RIGGER_COMMAND_CONSOLE__DATENVERARBEITUNG_BASIS:
                setDatenverarbeitungBasis((Integer)newValue);
                return;
            case Shr5Package.RIGGER_COMMAND_CONSOLE__FIREWALL_BASIS:
                setFirewallBasis((Integer)newValue);
                return;
            case Shr5Package.RIGGER_COMMAND_CONSOLE__ZUGRIFF_BASIS:
                setZugriffBasis((Integer)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case Shr5Package.RIGGER_COMMAND_CONSOLE__DATENVERARBEITUNG_BASIS:
                setDatenverarbeitungBasis(DATENVERARBEITUNG_BASIS_EDEFAULT);
                return;
            case Shr5Package.RIGGER_COMMAND_CONSOLE__FIREWALL_BASIS:
                setFirewallBasis(FIREWALL_BASIS_EDEFAULT);
                return;
            case Shr5Package.RIGGER_COMMAND_CONSOLE__ZUGRIFF_BASIS:
                setZugriffBasis(ZUGRIFF_BASIS_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case Shr5Package.RIGGER_COMMAND_CONSOLE__RAUSCHUNTERDRUECKUNG:
                return getRauschunterdrueckung() != RAUSCHUNTERDRUECKUNG_EDEFAULT;
            case Shr5Package.RIGGER_COMMAND_CONSOLE__ZUGRIFF:
                return getZugriff() != ZUGRIFF_EDEFAULT;
            case Shr5Package.RIGGER_COMMAND_CONSOLE__DATENVERARBEITUNG_BASIS:
                return datenverarbeitungBasis != DATENVERARBEITUNG_BASIS_EDEFAULT;
            case Shr5Package.RIGGER_COMMAND_CONSOLE__FIREWALL_BASIS:
                return firewallBasis != FIREWALL_BASIS_EDEFAULT;
            case Shr5Package.RIGGER_COMMAND_CONSOLE__ZUGRIFF_BASIS:
                return zugriffBasis != ZUGRIFF_BASIS_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (datenverarbeitungBasis: ");
        result.append(datenverarbeitungBasis);
        result.append(", firewallBasis: ");
        result.append(firewallBasis);
        result.append(", zugriffBasis: ");
        result.append(zugriffBasis);
        result.append(')');
        return result.toString();
    }

} //RiggerCommandConsoleImpl
