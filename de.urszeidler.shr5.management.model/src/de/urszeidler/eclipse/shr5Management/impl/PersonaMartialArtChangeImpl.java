/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.google.common.base.Predicate;
import com.google.common.collect.FluentIterable;

import de.urszeidler.eclipse.shr5.Erlernbar;
import de.urszeidler.eclipse.shr5.MartialartStyle;
import de.urszeidler.eclipse.shr5.MartialartTechnique;
import de.urszeidler.eclipse.shr5.PersonaFertigkeit;
import de.urszeidler.eclipse.shr5.PersonaMartialartStyle;
import de.urszeidler.eclipse.shr5.PersonaMartialartTechnique;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5Management.PersonaMartialArtChange;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Persona Martial Art Change</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.PersonaMartialArtChangeImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.PersonaMartialArtChangeImpl#getTechnique <em>Technique</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersonaMartialArtChangeImpl extends PersonaChangeImpl implements PersonaMartialArtChange {
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
     * The cached value of the '{@link #getTechnique() <em>Technique</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTechnique()
     * @generated
     * @ordered
     */
    protected MartialartTechnique technique;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PersonaMartialArtChangeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Shr5managementPackage.Literals.PERSONA_MARTIAL_ART_CHANGE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public MartialartStyle getStyle() {
        if (style != null && style.eIsProxy()) {
            InternalEObject oldStyle = (InternalEObject)style;
            style = (MartialartStyle)eResolveProxy(oldStyle);
            if (style != oldStyle) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5managementPackage.PERSONA_MARTIAL_ART_CHANGE__STYLE, oldStyle, style));
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.PERSONA_MARTIAL_ART_CHANGE__STYLE, oldStyle, style));
        if (newStyle != null){
            if (!newStyle.getTechniques().contains(getTechnique()))
                setTechnique(null);
            if(getChangeable() instanceof PersonaFertigkeit)
                if(!newStyle.getUsableWith().contains(((PersonaFertigkeit)getChangeable()).getFertigkeit()))
                    setChangeable(null);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public MartialartTechnique getTechnique() {
        if (technique != null && technique.eIsProxy()) {
            InternalEObject oldTechnique = (InternalEObject)technique;
            technique = (MartialartTechnique)eResolveProxy(oldTechnique);
            if (technique != oldTechnique) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5managementPackage.PERSONA_MARTIAL_ART_CHANGE__TECHNIQUE, oldTechnique, technique));
            }
        }
        return technique;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MartialartTechnique basicGetTechnique() {
        return technique;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTechnique(MartialartTechnique newTechnique) {
        MartialartTechnique oldTechnique = technique;
        technique = newTechnique;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.PERSONA_MARTIAL_ART_CHANGE__TECHNIQUE, oldTechnique, technique));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Shr5managementPackage.PERSONA_MARTIAL_ART_CHANGE__STYLE:
                if (resolve) return getStyle();
                return basicGetStyle();
            case Shr5managementPackage.PERSONA_MARTIAL_ART_CHANGE__TECHNIQUE:
                if (resolve) return getTechnique();
                return basicGetTechnique();
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
            case Shr5managementPackage.PERSONA_MARTIAL_ART_CHANGE__STYLE:
                setStyle((MartialartStyle)newValue);
                return;
            case Shr5managementPackage.PERSONA_MARTIAL_ART_CHANGE__TECHNIQUE:
                setTechnique((MartialartTechnique)newValue);
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
            case Shr5managementPackage.PERSONA_MARTIAL_ART_CHANGE__STYLE:
                setStyle((MartialartStyle)null);
                return;
            case Shr5managementPackage.PERSONA_MARTIAL_ART_CHANGE__TECHNIQUE:
                setTechnique((MartialartTechnique)null);
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
            case Shr5managementPackage.PERSONA_MARTIAL_ART_CHANGE__STYLE:
                return style != null;
            case Shr5managementPackage.PERSONA_MARTIAL_ART_CHANGE__TECHNIQUE:
                return technique != null;
        }
        return super.eIsSet(featureID);
    }

    @Override
    public void setChangeable(Erlernbar newChangeable) {
        Erlernbar oldChangeable = changeable;
        changeable = newChangeable;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.PERSONA_CHANGE__CHANGEABLE, oldChangeable, changeable));

        setFrom(0);
        setTo(1);
        if (!changeApplied)
            if (eNotificationRequired())
                eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.Literals.CHANGES__KARMA_COST, 0, 1));

    }

    @Override
    public int getKarmaCost() {
        if (getStyle() == null)
            return 0;

        if (getChangeable() != null) {
            return getKarmaCostAdd(Shr5Package.Literals.PERSONA_MARTIALART_STYLE);
        } else {
            return getKarmaCostAdd(Shr5Package.Literals.PERSONA_MARTIALART_TECHNIQUE);
        }
    }

    @Override
    public void applyChanges() {
        if (getCharacter() == null || getCharacter().getPersona() == null)
            return;

        internalApply();
        if (getChangeable() != null) {
            PersonaMartialartStyle style2 = Shr5Factory.eINSTANCE.createPersonaMartialartStyle();
            style2.setStyle(getStyle());
            if (getChangeable() instanceof PersonaFertigkeit) {
                PersonaFertigkeit pf =(PersonaFertigkeit)getChangeable();
                pf.getSpezialisierungen().add(style2);
                getCharacter().getPersona().getMartialartStyles().add(style2);
                PersonaMartialartTechnique personaMartialartTechnique = Shr5Factory.eINSTANCE.createPersonaMartialartTechnique();
                personaMartialartTechnique.setTechnique(getTechnique());
                style2.getTechniques().add(personaMartialartTechnique);
            }
        } else {
            final MartialartStyle style2 = getStyle();
            EList<PersonaMartialartStyle> martialartStyles = getCharacter().getPersona().getMartialartStyles();
            PersonaMartialartStyle orNull = FluentIterable.from(martialartStyles).filter(new Predicate<PersonaMartialartStyle>() {

                @Override
                public boolean apply(PersonaMartialartStyle input) {
                    return input.getStyle().equals(style2);
                }
            }).first().orNull();
            if(orNull!=null){
                PersonaMartialartTechnique personaMartialartTechnique = Shr5Factory.eINSTANCE.createPersonaMartialartTechnique();
                personaMartialartTechnique.setTechnique(getTechnique());
                orNull.getTechniques().add(personaMartialartTechnique);
            }
        }
    }

} // PersonaMartialArtChangeImpl
