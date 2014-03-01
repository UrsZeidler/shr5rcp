/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.util;

import java.util.Map;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import de.urszeidler.eclipse.shr5.Beschreibbar;
import de.urszeidler.eclipse.shr5.Quelle;
import de.urszeidler.eclipse.shr5Management.*;
import de.urszeidler.eclipse.shr5Management.Adept;
import de.urszeidler.eclipse.shr5Management.Advancement;
import de.urszeidler.eclipse.shr5Management.AttributeChange;
import de.urszeidler.eclipse.shr5Management.Attributes;
import de.urszeidler.eclipse.shr5Management.Changes;
import de.urszeidler.eclipse.shr5Management.CharacterGenerator;
import de.urszeidler.eclipse.shr5Management.CharacterGeneratorSystem;
import de.urszeidler.eclipse.shr5Management.CharacterGroup;
import de.urszeidler.eclipse.shr5Management.Connection;
import de.urszeidler.eclipse.shr5Management.FreeStyle;
import de.urszeidler.eclipse.shr5Management.FreeStyleGenerator;
import de.urszeidler.eclipse.shr5Management.GeneratorState;
import de.urszeidler.eclipse.shr5Management.IncreaseCharacterPart;
import de.urszeidler.eclipse.shr5Management.KarmaGaint;
import de.urszeidler.eclipse.shr5Management.LifestyleToStartMoney;
import de.urszeidler.eclipse.shr5Management.ManagedCharacter;
import de.urszeidler.eclipse.shr5Management.MetaType;
import de.urszeidler.eclipse.shr5Management.Mudan;
import de.urszeidler.eclipse.shr5Management.NonPlayerCharacter;
import de.urszeidler.eclipse.shr5Management.PersonaChange;
import de.urszeidler.eclipse.shr5Management.PersonaValueChange;
import de.urszeidler.eclipse.shr5Management.PlayerCharacter;
import de.urszeidler.eclipse.shr5Management.PriorityCategorie;
import de.urszeidler.eclipse.shr5Management.PrioritySystem;
import de.urszeidler.eclipse.shr5Management.Resourcen;
import de.urszeidler.eclipse.shr5Management.Shr5Generator;
import de.urszeidler.eclipse.shr5Management.Shr5System;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;
import de.urszeidler.eclipse.shr5Management.ShrMgmtList;
import de.urszeidler.eclipse.shr5Management.Skill;
import de.urszeidler.eclipse.shr5Management.SpecialType;
import de.urszeidler.eclipse.shr5Management.Spellcaster;
import de.urszeidler.eclipse.shr5Management.Technomancer;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage
 * @generated
 */
public class Shr5managementAdapterFactory extends AdapterFactoryImpl {
	/**
     * The cached model package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected static Shr5managementPackage modelPackage;

	/**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Shr5managementAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = Shr5managementPackage.eINSTANCE;
        }
    }

	/**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
	@Override
	public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

	/**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected Shr5managementSwitch<Adapter> modelSwitch =
		new Shr5managementSwitch<Adapter>() {
            @Override
            public Adapter caseManagedCharacter(ManagedCharacter object) {
                return createManagedCharacterAdapter();
            }
            @Override
            public Adapter caseCharacterGeneratorSystem(CharacterGeneratorSystem object) {
                return createCharacterGeneratorSystemAdapter();
            }
            @Override
            public Adapter casePrioritySystem(PrioritySystem object) {
                return createPrioritySystemAdapter();
            }
            @Override
            public Adapter caseNonPlayerCharacter(NonPlayerCharacter object) {
                return createNonPlayerCharacterAdapter();
            }
            @Override
            public Adapter caseChanges(Changes object) {
                return createChangesAdapter();
            }
            @Override
            public Adapter caseKarmaGaint(KarmaGaint object) {
                return createKarmaGaintAdapter();
            }
            @Override
            public Adapter caseFreeStyle(FreeStyle object) {
                return createFreeStyleAdapter();
            }
            @Override
            public Adapter casePriorityCategorie(PriorityCategorie object) {
                return createPriorityCategorieAdapter();
            }
            @Override
            public Adapter caseShr5System(Shr5System object) {
                return createShr5SystemAdapter();
            }
            @Override
            public Adapter caseMetaType(MetaType object) {
                return createMetaTypeAdapter();
            }
            @Override
            public Adapter caseAttributes(Attributes object) {
                return createAttributesAdapter();
            }
            @Override
            public Adapter caseSkill(Skill object) {
                return createSkillAdapter();
            }
            @Override
            public Adapter caseResourcen(Resourcen object) {
                return createResourcenAdapter();
            }
            @Override
            public Adapter caseSpecialType(SpecialType object) {
                return createSpecialTypeAdapter();
            }
            @Override
            public Adapter caseTechnomancer(Technomancer object) {
                return createTechnomancerAdapter();
            }
            @Override
            public Adapter caseSpellcaster(Spellcaster object) {
                return createSpellcasterAdapter();
            }
            @Override
            public Adapter caseAdept(Adept object) {
                return createAdeptAdapter();
            }
            @Override
            public Adapter caseCharacterGenerator(CharacterGenerator object) {
                return createCharacterGeneratorAdapter();
            }
            @Override
            public Adapter caseFreeStyleGenerator(FreeStyleGenerator object) {
                return createFreeStyleGeneratorAdapter();
            }
            @Override
            public Adapter caseShr5Generator(Shr5Generator object) {
                return createShr5GeneratorAdapter();
            }
            @Override
            public Adapter caseAttributeChange(AttributeChange object) {
                return createAttributeChangeAdapter();
            }
            @Override
            public Adapter casePlayerCharacter(PlayerCharacter object) {
                return createPlayerCharacterAdapter();
            }
            @Override
            public Adapter caseMudan(Mudan object) {
                return createMudanAdapter();
            }
            @Override
            public Adapter caseCharacterGroup(CharacterGroup object) {
                return createCharacterGroupAdapter();
            }
            @Override
            public Adapter caseConnection(Connection object) {
                return createConnectionAdapter();
            }
            @Override
            public Adapter casePersonaChange(PersonaChange object) {
                return createPersonaChangeAdapter();
            }
            @Override
            public Adapter casePersonaValueChange(PersonaValueChange object) {
                return createPersonaValueChangeAdapter();
            }
            @Override
            public Adapter caseGeneratorStateToEStringMapEntry(Map.Entry<GeneratorState, String> object) {
                return createGeneratorStateToEStringMapEntryAdapter();
            }
            @Override
            public Adapter caseAdvancement(Advancement object) {
                return createAdvancementAdapter();
            }
            @Override
            public Adapter caseIncreaseCharacterPart(IncreaseCharacterPart object) {
                return createIncreaseCharacterPartAdapter();
            }
            @Override
            public Adapter caseLifestyleToStartMoney(LifestyleToStartMoney object) {
                return createLifestyleToStartMoneyAdapter();
            }
            @Override
            public Adapter caseShrMgmtList(ShrMgmtList object) {
                return createShrMgmtListAdapter();
            }
            @Override
            public Adapter caseGruntGroup(GruntGroup object) {
                return createGruntGroupAdapter();
            }
            @Override
            public Adapter caseGruntMembers(GruntMembers object) {
                return createGruntMembersAdapter();
            }
            @Override
            public Adapter casePlayerManagement(PlayerManagement object) {
                return createPlayerManagementAdapter();
            }
            @Override
            public Adapter caseGamemasterManagement(GamemasterManagement object) {
                return createGamemasterManagementAdapter();
            }
            @Override
            public Adapter caseBeschreibbar(Beschreibbar object) {
                return createBeschreibbarAdapter();
            }
            @Override
            public Adapter caseQuelle(Quelle object) {
                return createQuelleAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object) {
                return createEObjectAdapter();
            }
        };

	/**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
	@Override
	public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject)target);
    }


	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5Management.ManagedCharacter <em>Managed Character</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5Management.ManagedCharacter
     * @generated
     */
	public Adapter createManagedCharacterAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5Management.CharacterGeneratorSystem <em>Character Generator System</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5Management.CharacterGeneratorSystem
     * @generated
     */
	public Adapter createCharacterGeneratorSystemAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5Management.PrioritySystem <em>Priority System</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5Management.PrioritySystem
     * @generated
     */
	public Adapter createPrioritySystemAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5Management.NonPlayerCharacter <em>Non Player Character</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5Management.NonPlayerCharacter
     * @generated
     */
	public Adapter createNonPlayerCharacterAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5Management.Changes <em>Changes</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5Management.Changes
     * @generated
     */
	public Adapter createChangesAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5Management.KarmaGaint <em>Karma Gaint</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5Management.KarmaGaint
     * @generated
     */
	public Adapter createKarmaGaintAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5Management.FreeStyle <em>Free Style</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5Management.FreeStyle
     * @generated
     */
	public Adapter createFreeStyleAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5Management.PriorityCategorie <em>Priority Categorie</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5Management.PriorityCategorie
     * @generated
     */
	public Adapter createPriorityCategorieAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5Management.Shr5System <em>Shr5 System</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5Management.Shr5System
     * @generated
     */
	public Adapter createShr5SystemAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5Management.MetaType <em>Meta Type</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5Management.MetaType
     * @generated
     */
	public Adapter createMetaTypeAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5Management.Attributes <em>Attributes</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5Management.Attributes
     * @generated
     */
	public Adapter createAttributesAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5Management.Skill <em>Skill</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5Management.Skill
     * @generated
     */
	public Adapter createSkillAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5Management.Resourcen <em>Resourcen</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5Management.Resourcen
     * @generated
     */
	public Adapter createResourcenAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5Management.SpecialType <em>Special Type</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5Management.SpecialType
     * @generated
     */
	public Adapter createSpecialTypeAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5Management.Technomancer <em>Technomancer</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5Management.Technomancer
     * @generated
     */
	public Adapter createTechnomancerAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5Management.Spellcaster <em>Spellcaster</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5Management.Spellcaster
     * @generated
     */
	public Adapter createSpellcasterAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5Management.Adept <em>Adept</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5Management.Adept
     * @generated
     */
	public Adapter createAdeptAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5Management.CharacterGenerator <em>Character Generator</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5Management.CharacterGenerator
     * @generated
     */
	public Adapter createCharacterGeneratorAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5Management.FreeStyleGenerator <em>Free Style Generator</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5Management.FreeStyleGenerator
     * @generated
     */
	public Adapter createFreeStyleGeneratorAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5Management.Shr5Generator <em>Shr5 Generator</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5Management.Shr5Generator
     * @generated
     */
	public Adapter createShr5GeneratorAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5Management.AttributeChange <em>Attribute Change</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5Management.AttributeChange
     * @generated
     */
	public Adapter createAttributeChangeAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5Management.PlayerCharacter <em>Player Character</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5Management.PlayerCharacter
     * @generated
     */
	public Adapter createPlayerCharacterAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5Management.Mudan <em>Mudan</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5Management.Mudan
     * @generated
     */
	public Adapter createMudanAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5Management.CharacterGroup <em>Character Group</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5Management.CharacterGroup
     * @generated
     */
	public Adapter createCharacterGroupAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5Management.Connection <em>Connection</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5Management.Connection
     * @generated
     */
	public Adapter createConnectionAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5Management.PersonaChange <em>Persona Change</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5Management.PersonaChange
     * @generated
     */
    public Adapter createPersonaChangeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5Management.PersonaValueChange <em>Persona Value Change</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5Management.PersonaValueChange
     * @generated
     */
	public Adapter createPersonaValueChangeAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Generator State To EString Map Entry</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see java.util.Map.Entry
     * @generated
     */
	public Adapter createGeneratorStateToEStringMapEntryAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5Management.Advancement <em>Advancement</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5Management.Advancement
     * @generated
     */
	public Adapter createAdvancementAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5Management.IncreaseCharacterPart <em>Increase Character Part</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5Management.IncreaseCharacterPart
     * @generated
     */
	public Adapter createIncreaseCharacterPartAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5Management.LifestyleToStartMoney <em>Lifestyle To Start Money</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5Management.LifestyleToStartMoney
     * @generated
     */
    public Adapter createLifestyleToStartMoneyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5Management.ShrMgmtList <em>Shr Mgmt List</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5Management.ShrMgmtList
     * @generated
     */
    public Adapter createShrMgmtListAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5Management.GruntGroup <em>Grunt Group</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5Management.GruntGroup
     * @generated
     */
    public Adapter createGruntGroupAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5Management.GruntMembers <em>Grunt Members</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5Management.GruntMembers
     * @generated
     */
    public Adapter createGruntMembersAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5Management.PlayerManagement <em>Player Management</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5Management.PlayerManagement
     * @generated
     */
    public Adapter createPlayerManagementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5Management.GamemasterManagement <em>Gamemaster Management</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5Management.GamemasterManagement
     * @generated
     */
    public Adapter createGamemasterManagementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.Beschreibbar <em>Beschreibbar</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.Beschreibbar
     * @generated
     */
	public Adapter createBeschreibbarAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.Quelle <em>Quelle</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.Quelle
     * @generated
     */
	public Adapter createQuelleAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
	public Adapter createEObjectAdapter() {
        return null;
    }

} //Shr5managementAdapterFactory
