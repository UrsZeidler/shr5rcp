/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.impl;

import java.math.BigDecimal;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.urszeidler.eclipse.shr5.AbtraktGranate;
import de.urszeidler.eclipse.shr5.MiniGrenate;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.Substance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mini Grenate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.MiniGrenateImpl#getBlast <em>Blast</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.MiniGrenateImpl#getChemical <em>Chemical</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MiniGrenateImpl extends MunitionImpl implements MiniGrenate {
    /**
     * The default value of the '{@link #getBlast() <em>Blast</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBlast()
     * @generated
     * @ordered
     */
    protected static final String BLAST_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBlast() <em>Blast</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBlast()
     * @generated
     * @ordered
     */
    protected String blast = BLAST_EDEFAULT;

    /**
     * The cached value of the '{@link #getChemical() <em>Chemical</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getChemical()
     * @generated
     * @ordered
     */
    protected Substance chemical;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MiniGrenateImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Shr5Package.Literals.MINI_GRENATE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getBlast() {
        return blast;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBlast(String newBlast) {
        String oldBlast = blast;
        blast = newBlast;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.MINI_GRENATE__BLAST, oldBlast, blast));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Substance getChemical() {
        return chemical;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    public NotificationChain basicSetChemical(Substance newChemical, NotificationChain msgs) {
        Substance oldChemical = chemical;
        chemical = newChemical;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Shr5Package.MINI_GRENATE__CHEMICAL, oldChemical, newChemical);
            if (msgs == null) msgs = notification; else msgs.add(notification);
 
            notification = new ENotificationImpl(this, Notification.SET, Shr5Package.MINI_GRENATE__WERT_VALUE, oldChemical, newChemical);
            msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setChemical(Substance newChemical) {
        if (newChemical != chemical) {
            NotificationChain msgs = null;
            if (chemical != null)
                msgs = ((InternalEObject)chemical).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Shr5Package.MINI_GRENATE__CHEMICAL, null, msgs);
            if (newChemical != null)
                msgs = ((InternalEObject)newChemical).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Shr5Package.MINI_GRENATE__CHEMICAL, null, msgs);
            msgs = basicSetChemical(newChemical, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.MINI_GRENATE__CHEMICAL, newChemical, newChemical));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case Shr5Package.MINI_GRENATE__CHEMICAL:
                return basicSetChemical(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Shr5Package.MINI_GRENATE__BLAST:
                return getBlast();
            case Shr5Package.MINI_GRENATE__CHEMICAL:
                return getChemical();
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
            case Shr5Package.MINI_GRENATE__BLAST:
                setBlast((String)newValue);
                return;
            case Shr5Package.MINI_GRENATE__CHEMICAL:
                setChemical((Substance)newValue);
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
            case Shr5Package.MINI_GRENATE__BLAST:
                setBlast(BLAST_EDEFAULT);
                return;
            case Shr5Package.MINI_GRENATE__CHEMICAL:
                setChemical((Substance)null);
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
            case Shr5Package.MINI_GRENATE__BLAST:
                return BLAST_EDEFAULT == null ? blast != null : !BLAST_EDEFAULT.equals(blast);
            case Shr5Package.MINI_GRENATE__CHEMICAL:
                return chemical != null;
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
        if (baseClass == AbtraktGranate.class) {
            switch (derivedFeatureID) {
                case Shr5Package.MINI_GRENATE__BLAST: return Shr5Package.ABTRAKT_GRANATE__BLAST;
                case Shr5Package.MINI_GRENATE__CHEMICAL: return Shr5Package.ABTRAKT_GRANATE__CHEMICAL;
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
        if (baseClass == AbtraktGranate.class) {
            switch (baseFeatureID) {
                case Shr5Package.ABTRAKT_GRANATE__BLAST: return Shr5Package.MINI_GRENATE__BLAST;
                case Shr5Package.ABTRAKT_GRANATE__CHEMICAL: return Shr5Package.MINI_GRENATE__CHEMICAL;
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

        StringBuilder result = new StringBuilder(super.toString());
        result.append(" (blast: ");
        result.append(blast);
        result.append(')');
        return result.toString();
    }

    @Override
    public BigDecimal getWert() {

        BigDecimal w = super.getWert();
        if (getChemical() != null && getChemical().getWert()!=null)
            if (w != null)
                return w.add(getChemical().getWert().multiply(new BigDecimal(getAnzahl())));
            else
                return getChemical().getWert();

        return w;
    }

} //MiniGrenateImpl
