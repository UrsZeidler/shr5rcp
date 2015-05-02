/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shr5 System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The shr5System describes the values of the different rule factors. 
 * This is the main description of the character generator system for shr5.
 * This system defenition is also used for the karma generator.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Shr5System#getKarmaToResourceFactor <em>Karma To Resource Factor</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Shr5System#getKarmaToMagicFactor <em>Karma To Magic Factor</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Shr5System#getNumberOfMaxAttributes <em>Number Of Max Attributes</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Shr5System#getKnowlegeSkillFactor <em>Knowlege Skill Factor</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Shr5System#getCharismaToConnectionFactor <em>Charisma To Connection Factor</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Shr5System#getMaxResourceToKeep <em>Max Resource To Keep</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Shr5System#getMaxKarmaToResources <em>Max Karma To Resources</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Shr5System#getMaxKarmaToKeep <em>Max Karma To Keep</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Shr5System#getSkillMax <em>Skill Max</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Shr5System#getNumberOfSpecalism <em>Number Of Specalism</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Shr5System#getKarmaToConnectionFactor <em>Karma To Connection Factor</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Shr5System#getBoundSprititServiceCost <em>Bound Spritit Service Cost</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Shr5System#getApplicableGenerators <em>Applicable Generators</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Shr5System#getMaxConnectionRating <em>Max Connection Rating</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Shr5System#getFreeMartialArtTechniques <em>Free Martial Art Techniques</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Shr5System#getMaxMartialArtStyles <em>Max Martial Art Styles</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Shr5System#getSumToTenValue <em>Sum To Ten Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getShr5System()
 * @model
 * @generated
 */
public interface Shr5System extends PrioritySystem {

	/**
     * Returns the value of the '<em><b>Karma To Resource Factor</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Karma To Resource Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The number of resources for one karma.
     * Used by Shr5Generator and the Shr5KarmaGenerator.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Karma To Resource Factor</em>' attribute.
     * @see #setKarmaToResourceFactor(int)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getShr5System_KarmaToResourceFactor()
     * @model required="true"
     * @generated
     */
	int getKarmaToResourceFactor();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.Shr5System#getKarmaToResourceFactor <em>Karma To Resource Factor</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Karma To Resource Factor</em>' attribute.
     * @see #getKarmaToResourceFactor()
     * @generated
     */
	void setKarmaToResourceFactor(int value);

	/**
     * Returns the value of the '<em><b>Karma To Magic Factor</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Karma To Magic Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * For mystical adepts the exchange rate between karma to magic points.
     * Used by Shr5Generator
     * <!-- end-model-doc -->
     * @return the value of the '<em>Karma To Magic Factor</em>' attribute.
     * @see #setKarmaToMagicFactor(int)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getShr5System_KarmaToMagicFactor()
     * @model required="true"
     * @generated
     */
	int getKarmaToMagicFactor();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.Shr5System#getKarmaToMagicFactor <em>Karma To Magic Factor</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Karma To Magic Factor</em>' attribute.
     * @see #getKarmaToMagicFactor()
     * @generated
     */
	void setKarmaToMagicFactor(int value);

	/**
     * Returns the value of the '<em><b>Number Of Max Attributes</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Max Attributes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The number of attributes as hight as the species maximum.
     * Is used by the hasNotMoreMaxAttributes rule.
     * 
     * <!-- end-model-doc -->
     * @return the value of the '<em>Number Of Max Attributes</em>' attribute.
     * @see #setNumberOfMaxAttributes(int)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getShr5System_NumberOfMaxAttributes()
     * @model required="true"
     * @generated
     */
	int getNumberOfMaxAttributes();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.Shr5System#getNumberOfMaxAttributes <em>Number Of Max Attributes</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Number Of Max Attributes</em>' attribute.
     * @see #getNumberOfMaxAttributes()
     * @generated
     */
	void setNumberOfMaxAttributes(int value);

	/**
     * Returns the value of the '<em><b>Knowlege Skill Factor</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Knowlege Skill Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The factor for free knowlege skills at the character generation.
     * Used by Shr5Generator.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Knowlege Skill Factor</em>' attribute.
     * @see #setKnowlegeSkillFactor(int)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getShr5System_KnowlegeSkillFactor()
     * @model required="true"
     * @generated
     */
	int getKnowlegeSkillFactor();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.Shr5System#getKnowlegeSkillFactor <em>Knowlege Skill Factor</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Knowlege Skill Factor</em>' attribute.
     * @see #getKnowlegeSkillFactor()
     * @generated
     */
	void setKnowlegeSkillFactor(int value);

	/**
     * Returns the value of the '<em><b>Charisma To Connection Factor</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Charisma To Connection Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The factor to calculate the conntection points for free.
     * Used by Shr5Generator.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Charisma To Connection Factor</em>' attribute.
     * @see #setCharismaToConnectionFactor(int)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getShr5System_CharismaToConnectionFactor()
     * @model required="true"
     * @generated
     */
	int getCharismaToConnectionFactor();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.Shr5System#getCharismaToConnectionFactor <em>Charisma To Connection Factor</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Charisma To Connection Factor</em>' attribute.
     * @see #getCharismaToConnectionFactor()
     * @generated
     */
	void setCharismaToConnectionFactor(int value);

    /**
     * Returns the value of the '<em><b>Max Resource To Keep</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max Resource To Keep</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The number of money can be keept at the commitment of the character.
     * Used by Shr5Generator and the Shr5KarmaGenerator.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Max Resource To Keep</em>' attribute.
     * @see #setMaxResourceToKeep(int)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getShr5System_MaxResourceToKeep()
     * @model required="true"
     * @generated
     */
    int getMaxResourceToKeep();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.Shr5System#getMaxResourceToKeep <em>Max Resource To Keep</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Resource To Keep</em>' attribute.
     * @see #getMaxResourceToKeep()
     * @generated
     */
    void setMaxResourceToKeep(int value);

    /**
     * Returns the value of the '<em><b>Max Karma To Resources</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max Karma To Resources</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The maximum of karma that can be transformed in mones.
     * Used by Shr5Generator and the Shr5KarmaGenerator.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Max Karma To Resources</em>' attribute.
     * @see #setMaxKarmaToResources(int)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getShr5System_MaxKarmaToResources()
     * @model required="true"
     * @generated
     */
    int getMaxKarmaToResources();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.Shr5System#getMaxKarmaToResources <em>Max Karma To Resources</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Karma To Resources</em>' attribute.
     * @see #getMaxKarmaToResources()
     * @generated
     */
    void setMaxKarmaToResources(int value);

    /**
     * Returns the value of the '<em><b>Max Karma To Keep</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max Karma To Keep</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The maximum of karma can be keep at committing the character.
     * Used by Shr5Generator and the Shr5KarmaGenerator.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Max Karma To Keep</em>' attribute.
     * @see #setMaxKarmaToKeep(int)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getShr5System_MaxKarmaToKeep()
     * @model
     * @generated
     */
    int getMaxKarmaToKeep();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.Shr5System#getMaxKarmaToKeep <em>Max Karma To Keep</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Karma To Keep</em>' attribute.
     * @see #getMaxKarmaToKeep()
     * @generated
     */
    void setMaxKarmaToKeep(int value);

    /**
     * Returns the value of the '<em><b>Skill Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Skill Max</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The max value a skill can have.
     * Is used by the rule hasNoSkillsOverMax.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Skill Max</em>' attribute.
     * @see #setSkillMax(int)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getShr5System_SkillMax()
     * @model
     * @generated
     */
    int getSkillMax();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.Shr5System#getSkillMax <em>Skill Max</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Skill Max</em>' attribute.
     * @see #getSkillMax()
     * @generated
     */
    void setSkillMax(int value);

    /**
     * Returns the value of the '<em><b>Number Of Specalism</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Number Of Specalism</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The number of specalicies a character can have.
     * Is used by the hasNotMoreSpecalism rule.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Number Of Specalism</em>' attribute.
     * @see #setNumberOfSpecalism(int)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getShr5System_NumberOfSpecalism()
     * @model
     * @generated
     */
    int getNumberOfSpecalism();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.Shr5System#getNumberOfSpecalism <em>Number Of Specalism</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Number Of Specalism</em>' attribute.
     * @see #getNumberOfSpecalism()
     * @generated
     */
    void setNumberOfSpecalism(int value);

    /**
     * Returns the value of the '<em><b>Karma To Connection Factor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Karma To Connection Factor</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The factor of Karma for a connection point.
     * Used by the Shr5KarmaGenerator.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Karma To Connection Factor</em>' attribute.
     * @see #setKarmaToConnectionFactor(int)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getShr5System_KarmaToConnectionFactor()
     * @model
     * @generated
     */
    int getKarmaToConnectionFactor();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.Shr5System#getKarmaToConnectionFactor <em>Karma To Connection Factor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Karma To Connection Factor</em>' attribute.
     * @see #getKarmaToConnectionFactor()
     * @generated
     */
    void setKarmaToConnectionFactor(int value);

    /**
     * Returns the value of the '<em><b>Bound Spritit Service Cost</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * THis is the cost for a service of a bound spirit at chracter creation.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Bound Spritit Service Cost</em>' attribute.
     * @see #setBoundSprititServiceCost(int)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getShr5System_BoundSprititServiceCost()
     * @model
     * @generated
     */
    int getBoundSprititServiceCost();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.Shr5System#getBoundSprititServiceCost <em>Bound Spritit Service Cost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Bound Spritit Service Cost</em>' attribute.
     * @see #getBoundSprititServiceCost()
     * @generated
     */
    void setBoundSprititServiceCost(int value);

    /**
     * Returns the value of the '<em><b>Applicable Generators</b></em>' reference list.
     * The list contents are of type {@link org.eclipse.emf.ecore.EClass}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Applicable Generators</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Applicable Generators</em>' reference list.
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getShr5System_ApplicableGenerators()
     * @model
     * @generated
     */
    EList<EClass> getApplicableGenerators();

    /**
     * Returns the value of the '<em><b>Max Connection Rating</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max Connection Rating</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Max Connection Rating</em>' attribute.
     * @see #setMaxConnectionRating(int)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getShr5System_MaxConnectionRating()
     * @model
     * @generated
     */
    int getMaxConnectionRating();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.Shr5System#getMaxConnectionRating <em>Max Connection Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Connection Rating</em>' attribute.
     * @see #getMaxConnectionRating()
     * @generated
     */
    void setMaxConnectionRating(int value);

    /**
     * Returns the value of the '<em><b>Free Martial Art Techniques</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The number of techniques the character gets without karma costs.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Free Martial Art Techniques</em>' attribute.
     * @see #setFreeMartialArtTechniques(int)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getShr5System_FreeMartialArtTechniques()
     * @model
     * @generated
     */
    int getFreeMartialArtTechniques();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.Shr5System#getFreeMartialArtTechniques <em>Free Martial Art Techniques</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Free Martial Art Techniques</em>' attribute.
     * @see #getFreeMartialArtTechniques()
     * @generated
     */
    void setFreeMartialArtTechniques(int value);

    /**
     * Returns the value of the '<em><b>Max Martial Art Styles</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The max style a character can choose at creatation.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Max Martial Art Styles</em>' attribute.
     * @see #setMaxMartialArtStyles(int)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getShr5System_MaxMartialArtStyles()
     * @model
     * @generated
     */
    int getMaxMartialArtStyles();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.Shr5System#getMaxMartialArtStyles <em>Max Martial Art Styles</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Martial Art Styles</em>' attribute.
     * @see #getMaxMartialArtStyles()
     * @generated
     */
    void setMaxMartialArtStyles(int value);

    /**
     * Returns the value of the '<em><b>Sum To Ten Value</b></em>' attribute.
     * The default value is <code>"10"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sum To Ten Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sum To Ten Value</em>' attribute.
     * @see #setSumToTenValue(int)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getShr5System_SumToTenValue()
     * @model default="10"
     * @generated
     */
    int getSumToTenValue();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.Shr5System#getSumToTenValue <em>Sum To Ten Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sum To Ten Value</em>' attribute.
     * @see #getSumToTenValue()
     * @generated
     */
    void setSumToTenValue(int value);
} // Shr5System
