/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.impl;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.urszeidler.eclipse.shr5.BaseMagischePersona;
import de.urszeidler.eclipse.shr5.Erlernbar;
import de.urszeidler.eclipse.shr5.Fertigkeit;
import de.urszeidler.eclipse.shr5.Fokus;
import de.urszeidler.eclipse.shr5.FokusBinding;
import de.urszeidler.eclipse.shr5.Initation;
import de.urszeidler.eclipse.shr5.KiAdept;
import de.urszeidler.eclipse.shr5.KiKraft;
import de.urszeidler.eclipse.shr5.KoerperPersona;
import de.urszeidler.eclipse.shr5.PersonaEigenschaft;
import de.urszeidler.eclipse.shr5.PersonaFertigkeit;
import de.urszeidler.eclipse.shr5.PersonaFertigkeitsGruppe;
import de.urszeidler.eclipse.shr5.PersonaKomplexForm;
import de.urszeidler.eclipse.shr5.PersonaZauber;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Spezialisierung;
import de.urszeidler.eclipse.shr5.Steigerbar;
import de.urszeidler.eclipse.shr5.Technomancer;
import de.urszeidler.eclipse.shr5.Zauber;
import de.urszeidler.eclipse.shr5.Zauberer;
import de.urszeidler.eclipse.shr5.util.ShadowrunTools;
import de.urszeidler.eclipse.shr5.util.Shr5Switch;
import de.urszeidler.eclipse.shr5Management.CharacterGenerator;
import de.urszeidler.eclipse.shr5Management.IncreaseCharacterPart;
import de.urszeidler.eclipse.shr5Management.PersonaChange;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;
import de.urszeidler.eclipse.shr5Management.util.ShadowrunManagmentTools;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Persona Change</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.PersonaChangeImpl#getChangeable <em>Changeable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersonaChangeImpl extends PersonaValueChangeImpl implements PersonaChange {
    /**
     * The cached value of the '{@link #getChangeable() <em>Changeable</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getChangeable()
     * @generated
     * @ordered
     */
    protected Erlernbar changeable;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PersonaChangeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Shr5managementPackage.Literals.PERSONA_CHANGE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Erlernbar getChangeable() {
        if (changeable != null && changeable.eIsProxy()) {
            InternalEObject oldChangeable = (InternalEObject)changeable;
            changeable = (Erlernbar)eResolveProxy(oldChangeable);
            if (changeable != oldChangeable) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5managementPackage.PERSONA_CHANGE__CHANGEABLE, oldChangeable, changeable));
            }
        }
        return changeable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Erlernbar basicGetChangeable() {
        return changeable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public void setChangeable(Erlernbar newChangeable) {
        Erlernbar oldChangeable = changeable;
        changeable = newChangeable;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.PERSONA_CHANGE__CHANGEABLE, oldChangeable, changeable));

        if (newChangeable != null) {
            Shr5Switch<Object> shr5Switch = new Shr5Switch<Object>() {
                @Override
                public Object caseSteigerbar(Steigerbar object) {
                    setFrom(object.getStufe());
                    setTo(object.getStufe() + 1);
                    return object;
                }

                @Override
                public Object casePersonaEigenschaft(PersonaEigenschaft object) {
                    if (ShadowrunManagmentTools.hasEigenschaft(getCharacter(), object)) {
                        setFrom(1);
                        setTo(0);
                    } else {
                        setFrom(0);
                        setTo(1);
                    }
                    return object;
                }

                @Override
                public Object caseErlernbar(Erlernbar object) {
                    setFrom(0);
                    setTo(1);
                    return object;
                }
            };
            if (!changeApplied) {
                Object ret = shr5Switch.doSwitch(newChangeable);
                if (ret != null)
                    if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.Literals.CHANGES__KARMA_COST, 0, 1));
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Shr5managementPackage.PERSONA_CHANGE__CHANGEABLE:
                if (resolve) return getChangeable();
                return basicGetChangeable();
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
            case Shr5managementPackage.PERSONA_CHANGE__CHANGEABLE:
                setChangeable((Erlernbar)newValue);
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
            case Shr5managementPackage.PERSONA_CHANGE__CHANGEABLE:
                setChangeable((Erlernbar)null);
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
            case Shr5managementPackage.PERSONA_CHANGE__CHANGEABLE:
                return changeable != null;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public void applyChanges() {
        if (getChangeable() == null || getCharacter() == null || getCharacter().getPersona() == null)
            return;

        internalApply();

        Shr5Switch<Object> shr5Switch = new Shr5Switch<Object>() {

            @Override
            public Object casePersonaFertigkeitsGruppe(PersonaFertigkeitsGruppe object) {
                if (getFrom() == 0) {
                    getCharacter().getPersona().getFertigkeitsGruppen().add(object);
                    object.setStufe(getTo());
                    return object;
                }
                return super.casePersonaFertigkeitsGruppe(object);
            }

            @Override
            public Object casePersonaFertigkeit(PersonaFertigkeit object) {
                if (getFrom() == 0) {
                    getCharacter().getPersona().getFertigkeiten().add(object);
                    object.setStufe(getTo());
                    return object;
                }
                return super.casePersonaFertigkeit(object);
            }

            @Override
            public Object caseSpezialisierung(Spezialisierung object) {
                EObject eContainer2 = object.eContainer();
                if (eContainer2 instanceof Fertigkeit) {
                    Fertigkeit f = (Fertigkeit)eContainer2;
                    PersonaFertigkeit personaFertigkeit = ShadowrunTools.findFertigkeit(f, getCharacter().getPersona());
                    personaFertigkeit.getSpezialisierungen().add(object);
                }
                return super.caseSpezialisierung(object);
            }

            @Override
            public Object caseSteigerbar(Steigerbar object) {
                object.setStufe(getTo());
                return object;
            }

            @Override
            public Object caseKiKraft(KiKraft object) {
                if (getCharacter().getPersona() instanceof KiAdept) {
                    KiAdept ka = (KiAdept)getCharacter().getPersona();
                    EList<KiKraft> list = ka.getKikraft();
                    addOrRemoveEntry(object, list);
                }
                return object;
            }

            @Override
            public Object casePersonaZauber(PersonaZauber object) {
                if (getCharacter().getPersona() instanceof Zauberer) {
                    Zauberer z = (Zauberer)getCharacter().getPersona();
                    EList<PersonaZauber> list = z.getZauber();
                    addOrRemoveEntry(object, list);
                }
                return object;
            }

            @Override
            public Object casePersonaKomplexForm(PersonaKomplexForm object) {
                if (getCharacter().getPersona() instanceof Technomancer) {
                    Technomancer persona = (Technomancer)getCharacter().getPersona();
                    EList<PersonaKomplexForm> list = persona.getComplexForms();
                    addOrRemoveEntry(object, list);

                }
                return object;
            }

            @Override
            public Object casePersonaEigenschaft(PersonaEigenschaft object) {
                if (getCharacter().getPersona() instanceof KoerperPersona) {
                    KoerperPersona kp = (KoerperPersona)getCharacter().getPersona();
                    EList<PersonaEigenschaft> eigenschaften = kp.getEigenschaften();
                    addOrRemoveEntry(object, eigenschaften);
                }
                return object;
            }

            @Override
            public Object caseInitation(Initation object) {
                if (getCharacter().getPersona() instanceof BaseMagischePersona) {
                    BaseMagischePersona bm = (BaseMagischePersona)getCharacter().getPersona();
                    EList<Initation> list = bm.getInitationen();
                    addOrRemoveEntry(object, list);
                }
                return object;
            }
            
            @Override
            public Object caseFokus(Fokus object) {
                if (getCharacter().getPersona() instanceof BaseMagischePersona) {
                    BaseMagischePersona bm = (BaseMagischePersona)getCharacter().getPersona();
                    FokusBinding fokusBinding = Shr5Factory.eINSTANCE.createFokusBinding();
                    fokusBinding.setFokus(object);
                    EList<FokusBinding> list = bm.getBoundFoki();
                    addOrRemoveEntry(fokusBinding, list);
                    
                }
                return object;
            }
        };
        shr5Switch.doSwitch(getChangeable());

    }

    /**
     * @generated not
     */
    public int getKarmaCost() {
        if (getChangeable() == null || getCharacter() == null || getCharacter().getPersona() == null)
            return 0;

        Shr5Switch<Integer> sw = new Shr5Switch<Integer>() {
            @Override
            public Integer casePersonaEigenschaft(PersonaEigenschaft object) {
                return getKarmaCostQuallity(object);
            }

            @Override
            public Integer casePersonaFertigkeit(PersonaFertigkeit object) {
                return getKarmaCostSkill(object);
            }

            @Override
            public Integer caseSpezialisierung(Spezialisierung object) {
                return getKarmaCostAdd(object);
            }

            @Override
            public Integer casePersonaFertigkeitsGruppe(PersonaFertigkeitsGruppe object) {
                return getKarmaCostSkillGroup(object);
            }

            @Override
            public Integer caseInitation(Initation object) {
                return getKarmaCostInitation(object);
            }

            @Override
            public Integer caseZauber(Zauber object) {
                return getKarmaCostAdd(object);
            }

            @Override
            public Integer casePersonaKomplexForm(PersonaKomplexForm object) {
                return getKarmaCostAdd(object);
            }
            @Override
            public Integer caseFokus(Fokus object) {
                 return object.getBindungskosten()*-1;
            }
        };

        Integer i = sw.doSwitch(getChangeable());
        if (i != null) {

            return i;
        }
        return 0;
    }

    /**
     * Return the karma cost for spell and complex form.
     */
    private Integer getKarmaCostAdd(EObject eobject) {
        if (getCharacter() == null)
            return 0;
        CharacterGenerator chracterSource = getCharacter().getChracterSource();
        if (chracterSource == null)
            return 0;
        if (eobject != null) {
            IncreaseCharacterPart part = ShadowrunManagmentTools.findAdvancment(chracterSource.getGenerator().getCharacterAdvancements()
                    .getCharacterAdvancements(), eobject.eClass());
            if (part != null) {
                int karmaFactor = part.getKarmaFactor();
                return -1 * Math.abs(karmaFactor * 1);
            }
        }
        return 0;
    }

    /**
     * @generated not
     */
    private int getKarmaCostQuallity(PersonaEigenschaft quallity) {
        if (getCharacter() == null)
            return 0;
        CharacterGenerator chracterSource = getCharacter().getChracterSource();
        if (chracterSource == null)
            return 0;

        if (quallity != null) {
            IncreaseCharacterPart part = ShadowrunManagmentTools.findAdvancment(chracterSource.getGenerator().getCharacterAdvancements()
                    .getCharacterAdvancements(), quallity.eClass());
            if (part != null) {
                int karmaFactor = part.getKarmaFactor();
                return -1 * Math.abs(karmaFactor * quallity.getKarmaKosten());
            }
        }
        return 0;
    }

    /**
     * @generated not
     */
    private int getKarmaCostInitation(Initation initation) {
        if (getCharacter() == null)
            return 0;
        CharacterGenerator chracterSource = getCharacter().getChracterSource();
        if (chracterSource == null)
            return 0;

        if (initation != null) {
            IncreaseCharacterPart part = ShadowrunManagmentTools.findAdvancment(chracterSource.getGenerator().getCharacterAdvancements()
                    .getCharacterAdvancements(), initation.eClass());
            if (part != null) {
                int karmaFactor = part.getKarmaFactor();
                return -1 * Math.abs(karmaFactor * initation.getStufe());
            }
        }
        return 0;
    }

    /**
     * @generated not
     */
    private int getKarmaCostSkill(PersonaFertigkeit skill) {
        if (getCharacter() == null)
            return 0;
        CharacterGenerator chracterSource = getCharacter().getChracterSource();
        if (chracterSource == null)
            return 0;

        if (skill != null) {
            Fertigkeit fertigkeit = skill.getFertigkeit();
            if(fertigkeit==null)
                return 0;
            EClass eClass = fertigkeit.eClass();

            IncreaseCharacterPart part = ShadowrunManagmentTools.findAdvancment(chracterSource.getGenerator().getCharacterAdvancements()
                    .getCharacterAdvancements(), eClass);
            if (part != null) {
                int karmaFactor = part.getKarmaFactor();
                int calcKarmaCosts = ShadowrunTools.calcKarmaCosts(getFrom(), getTo(), karmaFactor);
                return -1 * calcKarmaCosts;// karmaFactor * (getTo());
            }
        }
        return 0;
    }

    /**
     * @generated not
     */
    private int getKarmaCostSkillGroup(PersonaFertigkeitsGruppe skill) {
        if (getCharacter() == null)
            return 0;
        CharacterGenerator chracterSource = getCharacter().getChracterSource();
        if (chracterSource == null)
            return 0;

        if (skill != null) {
            IncreaseCharacterPart part = ShadowrunManagmentTools.findAdvancment(chracterSource.getGenerator().getCharacterAdvancements()
                    .getCharacterAdvancements(), skill.getGruppe().eClass());
            if (part != null) {
                int karmaFactor = part.getKarmaFactor();
                int calcKarmaCosts = ShadowrunTools.calcKarmaCosts(getFrom(), getTo(), karmaFactor);
                return -1 * calcKarmaCosts;// karmaFactor * (getTo());
            }
        }
        return 0;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    private void addOrRemoveEntry(EObject object, List eigenschaften) {
        if (getTo() == 0) {
            eigenschaften.remove(object);
        } else {
            eigenschaften.add(object);
        }
    }

} // PersonaChangeImpl
