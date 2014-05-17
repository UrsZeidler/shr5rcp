/**
 */
package de.urszeidler.eclipse.shr5.impl;

import java.math.BigDecimal;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.urszeidler.eclipse.shr5.Lifestyle;
import de.urszeidler.eclipse.shr5.LifestyleOption;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.util.ShadowrunTools;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lifestyle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.LifestyleImpl#getOptions <em>Options</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.LifestyleImpl#isOwned <em>Owned</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LifestyleImpl extends IntervallVertragImpl implements Lifestyle {
    /**
     * The cached value of the '{@link #getOptions() <em>Options</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOptions()
     * @generated
     * @ordered
     */
    protected EList<LifestyleOption> options;
    /**
     * The default value of the '{@link #isOwned() <em>Owned</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isOwned()
     * @generated
     * @ordered
     */
    protected static final boolean OWNED_EDEFAULT = false;
    /**
     * The cached value of the '{@link #isOwned() <em>Owned</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isOwned()
     * @generated
     * @ordered
     */
    protected boolean owned = OWNED_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LifestyleImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Shr5Package.Literals.LIFESTYLE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<LifestyleOption> getOptions() {
        if (options == null) {
            options = new EObjectContainmentEList<LifestyleOption>(LifestyleOption.class, this, Shr5Package.LIFESTYLE__OPTIONS);
        }
        return options;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isOwned() {
        return owned;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOwned(boolean newOwned) {
        boolean oldOwned = owned;
        owned = newOwned;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.LIFESTYLE__OWNED, oldOwned, owned));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case Shr5Package.LIFESTYLE__OPTIONS:
                return ((InternalEList<?>)getOptions()).basicRemove(otherEnd, msgs);
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
            case Shr5Package.LIFESTYLE__OPTIONS:
                return getOptions();
            case Shr5Package.LIFESTYLE__OWNED:
                return isOwned();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case Shr5Package.LIFESTYLE__OPTIONS:
                getOptions().clear();
                getOptions().addAll((Collection<? extends LifestyleOption>)newValue);
                return;
            case Shr5Package.LIFESTYLE__OWNED:
                setOwned((Boolean)newValue);
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
            case Shr5Package.LIFESTYLE__OPTIONS:
                getOptions().clear();
                return;
            case Shr5Package.LIFESTYLE__OWNED:
                setOwned(OWNED_EDEFAULT);
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
            case Shr5Package.LIFESTYLE__OPTIONS:
                return options != null && !options.isEmpty();
            case Shr5Package.LIFESTYLE__OWNED:
                return owned != OWNED_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public BigDecimal getWert() {
        BigDecimal wert = ShadowrunTools.calcListenWert(getOptions());
        if (getWertValue() == null)
            return wert;

        return getWertValue().add(wert);
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
        result.append(" (owned: ");
        result.append(owned);
        result.append(')');
        return result.toString();
    }

} // LifestyleImpl
