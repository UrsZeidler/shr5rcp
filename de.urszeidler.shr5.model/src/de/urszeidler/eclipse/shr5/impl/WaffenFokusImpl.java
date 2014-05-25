/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.impl;

import de.urszeidler.eclipse.shr5.Erlernbar;
import java.math.BigDecimal;

import de.urszeidler.eclipse.shr5.Fokus;
import de.urszeidler.eclipse.shr5.MagischeStufe;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.WaffenFokus;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Waffen Fokus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.WaffenFokusImpl#getStufe <em>Stufe</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.WaffenFokusImpl#getBindungskosten <em>Bindungskosten</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WaffenFokusImpl extends NahkampfwaffeImpl implements WaffenFokus {
    /**
     * The default value of the '{@link #getStufe() <em>Stufe</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStufe()
     * @generated
     * @ordered
     */
    protected static final int STUFE_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getStufe() <em>Stufe</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStufe()
     * @generated
     * @ordered
     */
    protected int stufe = STUFE_EDEFAULT;

    /**
     * The default value of the '{@link #getBindungskosten() <em>Bindungskosten</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBindungskosten()
     * @generated
     * @ordered
     */
    protected static final int BINDUNGSKOSTEN_EDEFAULT = 0;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected WaffenFokusImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Shr5Package.Literals.WAFFEN_FOKUS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getStufe() {
        return stufe;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStufe(int newStufe) {
        int oldStufe = stufe;
        stufe = newStufe;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.WAFFEN_FOKUS__STUFE, oldStufe, stufe));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    public int getBindungskosten() {
       return getStufe()*3;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Shr5Package.WAFFEN_FOKUS__STUFE:
                return getStufe();
            case Shr5Package.WAFFEN_FOKUS__BINDUNGSKOSTEN:
                return getBindungskosten();
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
            case Shr5Package.WAFFEN_FOKUS__STUFE:
                setStufe((Integer)newValue);
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
            case Shr5Package.WAFFEN_FOKUS__STUFE:
                setStufe(STUFE_EDEFAULT);
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
            case Shr5Package.WAFFEN_FOKUS__STUFE:
                return stufe != STUFE_EDEFAULT;
            case Shr5Package.WAFFEN_FOKUS__BINDUNGSKOSTEN:
                return getBindungskosten() != BINDUNGSKOSTEN_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
        if (baseClass == MagischeStufe.class) {
            switch (derivedFeatureID) {
                case Shr5Package.WAFFEN_FOKUS__STUFE: return Shr5Package.MAGISCHE_STUFE__STUFE;
                default: return -1;
            }
        }
        if (baseClass == Erlernbar.class) {
            switch (derivedFeatureID) {
                default: return -1;
            }
        }
        if (baseClass == Fokus.class) {
            switch (derivedFeatureID) {
                case Shr5Package.WAFFEN_FOKUS__BINDUNGSKOSTEN: return Shr5Package.FOKUS__BINDUNGSKOSTEN;
                default: return -1;
            }
        }
        return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
        if (baseClass == MagischeStufe.class) {
            switch (baseFeatureID) {
                case Shr5Package.MAGISCHE_STUFE__STUFE: return Shr5Package.WAFFEN_FOKUS__STUFE;
                default: return -1;
            }
        }
        if (baseClass == Erlernbar.class) {
            switch (baseFeatureID) {
                default: return -1;
            }
        }
        if (baseClass == Fokus.class) {
            switch (baseFeatureID) {
                case Shr5Package.FOKUS__BINDUNGSKOSTEN: return Shr5Package.WAFFEN_FOKUS__BINDUNGSKOSTEN;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
        result.append(" (stufe: ");
        result.append(stufe);
        result.append(')');
        return result.toString();
    }

    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public BigDecimal getWert() {
        if (getWertValue() != null)
            return getWertValue().multiply(new BigDecimal(getStufe()));
        return new BigDecimal(0);
    }

} //WaffenFokusImpl
