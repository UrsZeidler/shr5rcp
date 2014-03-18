/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shr5 System</b></em>'.
 * <!-- end-user-doc -->
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
} // Shr5System
