/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.urszeidler.eclipse.shr5.MartialartStyle;
import de.urszeidler.eclipse.shr5.PersonaMartialartStyle;
import de.urszeidler.eclipse.shr5.PersonaMartialartTechnique;
import de.urszeidler.eclipse.shr5.Shr5Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Persona Martialart Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.PersonaMartialartStyleImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.PersonaMartialartStyleImpl#getTechniques <em>Techniques</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersonaMartialartStyleImpl extends SpezialisierungImpl implements PersonaMartialartStyle {
    /**
     * The cached value of the '{@link #getStyle() <em>Style</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStyle()
     * @generated
     * @ordered
     */
    protected MartialartStyle style;

    /**
     * The cached value of the '{@link #getTechniques() <em>Techniques</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTechniques()
     * @generated
     * @ordered
     */
    protected EList<PersonaMartialartTechnique> techniques;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PersonaMartialartStyleImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Shr5Package.Literals.PERSONA_MARTIALART_STYLE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MartialartStyle getStyle() {
        if (style != null && style.eIsProxy()) {
            InternalEObject oldStyle = (InternalEObject)style;
            style = (MartialartStyle)eResolveProxy(oldStyle);
            if (style != oldStyle) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5Package.PERSONA_MARTIALART_STYLE__STYLE, oldStyle, style));
            }
        }
        return style;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MartialartStyle basicGetStyle() {
        return style;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public void setStyle(MartialartStyle newStyle) {
        MartialartStyle oldStyle = style;
        style = newStyle;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.PERSONA_MARTIALART_STYLE__STYLE, oldStyle, style));

        if (newStyle != null) {
            beschreibung = newStyle.getBeschreibung();
            page = newStyle.getPage();
            setName(newStyle.getName());
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<PersonaMartialartTechnique> getTechniques() {
        if (techniques == null) {
            techniques = new EObjectContainmentEList<PersonaMartialartTechnique>(PersonaMartialartTechnique.class, this, Shr5Package.PERSONA_MARTIALART_STYLE__TECHNIQUES);
        }
        return techniques;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case Shr5Package.PERSONA_MARTIALART_STYLE__TECHNIQUES:
                return ((InternalEList<?>)getTechniques()).basicRemove(otherEnd, msgs);
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
            case Shr5Package.PERSONA_MARTIALART_STYLE__STYLE:
                if (resolve) return getStyle();
                return basicGetStyle();
            case Shr5Package.PERSONA_MARTIALART_STYLE__TECHNIQUES:
                return getTechniques();
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
            case Shr5Package.PERSONA_MARTIALART_STYLE__STYLE:
                setStyle((MartialartStyle)newValue);
                return;
            case Shr5Package.PERSONA_MARTIALART_STYLE__TECHNIQUES:
                getTechniques().clear();
                getTechniques().addAll((Collection<? extends PersonaMartialartTechnique>)newValue);
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
            case Shr5Package.PERSONA_MARTIALART_STYLE__STYLE:
                setStyle((MartialartStyle)null);
                return;
            case Shr5Package.PERSONA_MARTIALART_STYLE__TECHNIQUES:
                getTechniques().clear();
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
            case Shr5Package.PERSONA_MARTIALART_STYLE__STYLE:
                return style != null;
            case Shr5Package.PERSONA_MARTIALART_STYLE__TECHNIQUES:
                return techniques != null && !techniques.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //PersonaMartialartStyleImpl
