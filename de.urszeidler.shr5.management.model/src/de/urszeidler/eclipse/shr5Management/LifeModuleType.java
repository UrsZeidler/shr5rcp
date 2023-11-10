/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Life Module Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getLifeModuleType()
 * @model
 * @generated
 */
public enum LifeModuleType implements Enumerator {
    /**
     * The '<em><b>Nationality</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NATIONALITY_VALUE
     * @generated
     * @ordered
     */
    NATIONALITY(0, "nationality", "nationality"),

    /**
     * The '<em><b>Formative Years</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FORMATIVE_YEARS_VALUE
     * @generated
     * @ordered
     */
    FORMATIVE_YEARS(0, "formativeYears", "formativeYears"),

    /**
     * The '<em><b>Teen Years</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TEEN_YEARS_VALUE
     * @generated
     * @ordered
     */
    TEEN_YEARS(0, "teenYears", "teenYears"),

    /**
     * The '<em><b>Further Education</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FURTHER_EDUCATION_VALUE
     * @generated
     * @ordered
     */
    FURTHER_EDUCATION(0, "furtherEducation", "furtherEducation"),

    /**
     * The '<em><b>Real Life</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #REAL_LIFE_VALUE
     * @generated
     * @ordered
     */
    REAL_LIFE(0, "realLife", "realLife");

    /**
     * The '<em><b>Nationality</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Nationality</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #NATIONALITY
     * @model name="nationality"
     * @generated
     * @ordered
     */
    public static final int NATIONALITY_VALUE = 0;

    /**
     * The '<em><b>Formative Years</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Formative Years</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #FORMATIVE_YEARS
     * @model name="formativeYears"
     * @generated
     * @ordered
     */
    public static final int FORMATIVE_YEARS_VALUE = 0;

    /**
     * The '<em><b>Teen Years</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Teen Years</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #TEEN_YEARS
     * @model name="teenYears"
     * @generated
     * @ordered
     */
    public static final int TEEN_YEARS_VALUE = 0;

    /**
     * The '<em><b>Further Education</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Further Education</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #FURTHER_EDUCATION
     * @model name="furtherEducation"
     * @generated
     * @ordered
     */
    public static final int FURTHER_EDUCATION_VALUE = 0;

    /**
     * The '<em><b>Real Life</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Real Life</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #REAL_LIFE
     * @model name="realLife"
     * @generated
     * @ordered
     */
    public static final int REAL_LIFE_VALUE = 0;

    /**
     * An array of all the '<em><b>Life Module Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final LifeModuleType[] VALUES_ARRAY =
        new LifeModuleType[] {
            NATIONALITY,
            FORMATIVE_YEARS,
            TEEN_YEARS,
            FURTHER_EDUCATION,
            REAL_LIFE,
        };

    /**
     * A public read-only list of all the '<em><b>Life Module Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<LifeModuleType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Life Module Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static LifeModuleType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            LifeModuleType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Life Module Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static LifeModuleType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            LifeModuleType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Life Module Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static LifeModuleType get(int value) {
        switch (value) {
            case NATIONALITY_VALUE: return NATIONALITY;
        }
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final int value;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String name;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String literal;

    /**
     * Only this class can construct instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private LifeModuleType(int value, String name, String literal) {
        this.value = value;
        this.name = name;
        this.literal = literal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int getValue() {
      return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getName() {
      return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getLiteral() {
      return literal;
    }

    /**
     * Returns the literal value of the enumerator, which is its string representation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        return literal;
    }
    
} //LifeModuleType
