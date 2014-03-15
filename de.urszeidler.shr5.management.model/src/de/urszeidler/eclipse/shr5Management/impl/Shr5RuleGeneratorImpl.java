/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectValidator;

import de.urszeidler.eclipse.shr5.AbstraktPersona;
import de.urszeidler.eclipse.shr5.PersonaFertigkeit;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.Spezies;
import de.urszeidler.eclipse.shr5.util.ShadowrunTools;
import de.urszeidler.eclipse.shr5Management.ManagedCharacter;
import de.urszeidler.eclipse.shr5Management.ModelPlugin;
import de.urszeidler.eclipse.shr5Management.Shr5RuleGenerator;
import de.urszeidler.eclipse.shr5Management.Shr5System;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;
import de.urszeidler.eclipse.shr5Management.util.Shr5managementValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shr5 Rule Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link de.urszeidler.eclipse.shr5Management.impl.Shr5RuleGeneratorImpl#getShr5Generator <em>Shr5 Generator</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public abstract class Shr5RuleGeneratorImpl extends CharacterGeneratorImpl implements Shr5RuleGenerator {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    protected Shr5RuleGeneratorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Shr5managementPackage.Literals.SHR5_RULE_GENERATOR;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public Shr5System getShr5Generator() {
        Shr5System shr5Generator = basicGetShr5Generator();
        return shr5Generator != null && shr5Generator.eIsProxy() ? (Shr5System)eResolveProxy((InternalEObject)shr5Generator) : shr5Generator;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated not
     */
    public Shr5System basicGetShr5Generator() {
        if (generator instanceof Shr5System) {
            Shr5System sr5 = (Shr5System)generator;
            return sr5;
        }
        return null;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated not
     */
    public boolean hasNotMoreMaxAttributes(DiagnosticChain diagnostics, Map<Object, Object> context) {
        if (getShr5Generator() == null)
            return true;
        ManagedCharacter managedCharacter = getCharacter();
        if (managedCharacter == null)
            return true;
        AbstraktPersona persona = managedCharacter.getPersona();
        if (persona == null)
            return true;

        Spezies spezies = persona.getSpezies();
        if (spezies == null)
            return true;

        getShr5Generator().getNumberOfMaxAttributes();
        int counter = 0;
        ArrayList<EAttribute> list = new ArrayList<EAttribute>();
        if (persona.getKonstitutionBasis() >= spezies.getKonstitutionMax())
            list.add(Shr5Package.Literals.KOERPERLICHE_ATTRIBUTE__KONSTITUTION);
        if (persona.getGeschicklichkeitBasis() >= spezies.getGeschicklichkeitMax())
            list.add(Shr5Package.Literals.KOERPERLICHE_ATTRIBUTE__GESCHICKLICHKEIT);
        if (persona.getReaktionBasis() >= spezies.getReaktionMax())
            list.add(Shr5Package.Literals.KOERPERLICHE_ATTRIBUTE__REAKTION);
        if (persona.getStaerkeBasis() >= spezies.getStaerkeMax())
            list.add(Shr5Package.Literals.KOERPERLICHE_ATTRIBUTE__STAERKE);

        if (persona.getCharismaBasis() >= spezies.getCharismaMax())
            list.add(Shr5Package.Literals.GEISTIGE_ATTRIBUTE__CHARISMA);
        if (persona.getLogikBasis() >= spezies.getLogikMax())
            list.add(Shr5Package.Literals.GEISTIGE_ATTRIBUTE__LOGIK);
        if (persona.getWillenskraftBasis() >= spezies.getWillenskraftMax())
            list.add(Shr5Package.Literals.GEISTIGE_ATTRIBUTE__WILLENSKRAFT);
        if (persona.getIntuitionBasis() >= spezies.getIntuitionMax())
            list.add(Shr5Package.Literals.GEISTIGE_ATTRIBUTE__INTUITION);

        if (list.size() > getShr5Generator().getNumberOfMaxAttributes()) {
            if (diagnostics != null) {
                diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR, Shr5managementValidator.DIAGNOSTIC_SOURCE,
                        Shr5managementValidator.SHR5_RULE_GENERATOR__HAS_NOT_MORE_MAX_ATTRIBUTES, ModelPlugin.INSTANCE.getString(
                                "_UI_NotMoreMaxAttributes", new Object[]{ "test Attribute names", getShr5Generator().getNumberOfMaxAttributes(),
                                        "hasNotMoreMaxAttributes", EObjectValidator.getObjectLabel(this, context) }), new Object[]{ this }));
            }
            return false;
        }
        return true;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public boolean hasNoSkillsOverMax(DiagnosticChain diagnostics, Map<Object, Object> context) {
        if (getShr5Generator() == null)
            return true;
        ManagedCharacter managedCharacter = getCharacter();
        if (managedCharacter == null)
            return true;
        AbstraktPersona persona = managedCharacter.getPersona();
        if (persona == null)
            return true;

        List<PersonaFertigkeit> list = new ArrayList<PersonaFertigkeit>();
        EList<PersonaFertigkeit> fertigkeiten = persona.getFertigkeiten();
        for (PersonaFertigkeit personaFertigkeit : fertigkeiten) {
            if (personaFertigkeit.getStufe() > getShr5Generator().getSkillMax())
                list.add(personaFertigkeit);
        }

        if (list.size() != 0) {
            if (diagnostics != null) {
                diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR, Shr5managementValidator.DIAGNOSTIC_SOURCE,
                        Shr5managementValidator.SHR5_RULE_GENERATOR__HAS_NO_SKILLS_OVER_MAX, ModelPlugin.INSTANCE.getString(
                                "_UI_GenericInvariant_diagnostic",
                                new Object[]{ "hasNoSkillsOverMax", EObjectValidator.getObjectLabel(this, context) }), new Object[]{ this }));
            }
            return false;
        }
        return true;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public boolean hasNotMoreSpecalism(DiagnosticChain diagnostics, Map<Object, Object> context) {
        if (getShr5Generator() == null)
            return true;
        ManagedCharacter managedCharacter = getCharacter();
        if (managedCharacter == null)
            return true;
        AbstraktPersona persona = managedCharacter.getPersona();
        if (persona == null)
            return true;

        List<PersonaFertigkeit> list = new ArrayList<PersonaFertigkeit>();
        EList<PersonaFertigkeit> fertigkeiten = persona.getFertigkeiten();
        for (PersonaFertigkeit personaFertigkeit : fertigkeiten) {
            if (personaFertigkeit.getSpezialisierungen().size() > getShr5Generator().getNumberOfSpecalism())
                list.add(personaFertigkeit);
        }

        if (list.size() != 0) {
            if (diagnostics != null) {
                diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR, Shr5managementValidator.DIAGNOSTIC_SOURCE,
                        Shr5managementValidator.SHR5_RULE_GENERATOR__HAS_NOT_MORE_SPECALISM, ModelPlugin.INSTANCE.getString(
                                "_UI_GenericInvariant_diagnostic",
                                new Object[]{ "hasNotMoreSpecalism", EObjectValidator.getObjectLabel(this, context) }), new Object[]{ this }));
            }
            return false;
        }
        return true;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean hasNoAttributesOverSpeciesAtt(DiagnosticChain diagnostics, Map<Object, Object> context) {
        if (getShr5Generator() == null)
            return true;
        ManagedCharacter managedCharacter = getCharacter();
        if (managedCharacter == null)
            return true;
        AbstraktPersona persona = managedCharacter.getPersona();
        if (persona == null)
            return true;

        Spezies spezies = persona.getSpezies();
        if (spezies == null)
            return true;

        getShr5Generator().getNumberOfMaxAttributes();
        //int counter = 0;
        ArrayList<EAttribute> list = new ArrayList<EAttribute>();
        if (persona.getKonstitutionBasis() >= ShadowrunTools.calcRaceMaximum(persona, Shr5Package.Literals.SPEZIES__KONSTITUTION_MAX))// spezies.getKonstitutionMax())
            list.add(Shr5Package.Literals.KOERPERLICHE_ATTRIBUTE__KONSTITUTION);
        if (persona.getGeschicklichkeitBasis() >= ShadowrunTools.calcRaceMaximum(persona, Shr5Package.Literals.SPEZIES__GESCHICKLICHKEIT_MAX))
            list.add(Shr5Package.Literals.KOERPERLICHE_ATTRIBUTE__GESCHICKLICHKEIT);
        if (persona.getReaktionBasis() >= ShadowrunTools.calcRaceMaximum(persona, Shr5Package.Literals.SPEZIES__REAKTION_MAX))
            list.add(Shr5Package.Literals.KOERPERLICHE_ATTRIBUTE__REAKTION);
        if (persona.getStaerkeBasis() >= ShadowrunTools.calcRaceMaximum(persona, Shr5Package.Literals.SPEZIES__STAERKE_MAX))
            list.add(Shr5Package.Literals.KOERPERLICHE_ATTRIBUTE__STAERKE);

        if (persona.getCharismaBasis() >= ShadowrunTools.calcRaceMaximum(persona, Shr5Package.Literals.SPEZIES__CHARISMA_MAX))
            list.add(Shr5Package.Literals.GEISTIGE_ATTRIBUTE__CHARISMA);
        if (persona.getLogikBasis() >= ShadowrunTools.calcRaceMaximum(persona, Shr5Package.Literals.SPEZIES__LOGIK_MAX))
            list.add(Shr5Package.Literals.GEISTIGE_ATTRIBUTE__LOGIK);
        if (persona.getWillenskraftBasis() >= ShadowrunTools.calcRaceMaximum(persona, Shr5Package.Literals.SPEZIES__WILLENSKRAFT_MAX))
            list.add(Shr5Package.Literals.GEISTIGE_ATTRIBUTE__WILLENSKRAFT);
        if (persona.getIntuitionBasis() >= ShadowrunTools.calcRaceMaximum(persona, Shr5Package.Literals.SPEZIES__INTUITION_MAX))
            list.add(Shr5Package.Literals.GEISTIGE_ATTRIBUTE__INTUITION);
        
        if (list.size() != 0) {
            if (diagnostics != null) {
                diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR, Shr5managementValidator.DIAGNOSTIC_SOURCE,
                        Shr5managementValidator.SHR5_RULE_GENERATOR__HAS_NO_ATTRIBUTES_OVER_SPECIES_ATT, ModelPlugin.INSTANCE.getString(
                                "_UI_GenericInvariant_diagnostic",
                                new Object[]{ "hasNoAttributesOverSpeciesAtt", EObjectValidator.getObjectLabel(this, context) }),
                        new Object[]{ this }));
            }
            return false;
        }
        return true;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Shr5managementPackage.SHR5_RULE_GENERATOR__SHR5_GENERATOR:
                if (resolve)
                    return getShr5Generator();
                return basicGetShr5Generator();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case Shr5managementPackage.SHR5_RULE_GENERATOR__SHR5_GENERATOR:
                return basicGetShr5Generator() != null;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    @SuppressWarnings("unchecked")
    public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
        switch (operationID) {
            case Shr5managementPackage.SHR5_RULE_GENERATOR___HAS_NOT_MORE_MAX_ATTRIBUTES__DIAGNOSTICCHAIN_MAP:
                return hasNotMoreMaxAttributes((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
            case Shr5managementPackage.SHR5_RULE_GENERATOR___HAS_NO_SKILLS_OVER_MAX__DIAGNOSTICCHAIN_MAP:
                return hasNoSkillsOverMax((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
            case Shr5managementPackage.SHR5_RULE_GENERATOR___HAS_NOT_MORE_SPECALISM__DIAGNOSTICCHAIN_MAP:
                return hasNotMoreSpecalism((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
            case Shr5managementPackage.SHR5_RULE_GENERATOR___HAS_NO_ATTRIBUTES_OVER_SPECIES_ATT__DIAGNOSTICCHAIN_MAP:
                return hasNoAttributesOverSpeciesAtt((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
        }
        return super.eInvoke(operationID, arguments);
    }

} // Shr5RuleGeneratorImpl
