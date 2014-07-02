/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Substance Vector</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getSubstanceVector()
 * @model
 * @generated
 */
public enum SubstanceVector implements Enumerator {
    /**
     * The '<em><b>Contact</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CONTACT_VALUE
     * @generated
     * @ordered
     */
    CONTACT(0, "contact", "contact"),

    /**
     * The '<em><b>Inhalation</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #INHALATION_VALUE
     * @generated
     * @ordered
     */
    INHALATION(1, "inhalation", "inhalation"),

    /**
     * The '<em><b>Ingestion</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #INGESTION_VALUE
     * @generated
     * @ordered
     */
    INGESTION(2, "ingestion", "ingestion"),

    /**
     * The '<em><b>Injection</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #INJECTION_VALUE
     * @generated
     * @ordered
     */
    INJECTION(3, "injection", "injection");

    /**
     * The '<em><b>Contact</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Contact</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CONTACT
     * @model name="contact"
     * @generated
     * @ordered
     */
    public static final int CONTACT_VALUE = 0;

    /**
     * The '<em><b>Inhalation</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Inhalation</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #INHALATION
     * @model name="inhalation"
     * @generated
     * @ordered
     */
    public static final int INHALATION_VALUE = 1;

    /**
     * The '<em><b>Ingestion</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Ingestion</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #INGESTION
     * @model name="ingestion"
     * @generated
     * @ordered
     */
    public static final int INGESTION_VALUE = 2;

    /**
     * The '<em><b>Injection</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Injection</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #INJECTION
     * @model name="injection"
     * @generated
     * @ordered
     */
    public static final int INJECTION_VALUE = 3;

    /**
     * An array of all the '<em><b>Substance Vector</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final SubstanceVector[] VALUES_ARRAY =
        new SubstanceVector[] {
            CONTACT,
            INHALATION,
            INGESTION,
            INJECTION,
        };

    /**
     * A public read-only list of all the '<em><b>Substance Vector</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<SubstanceVector> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Substance Vector</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static SubstanceVector get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            SubstanceVector result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Substance Vector</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static SubstanceVector getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            SubstanceVector result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Substance Vector</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static SubstanceVector get(int value) {
        switch (value) {
            case CONTACT_VALUE: return CONTACT;
            case INHALATION_VALUE: return INHALATION;
            case INGESTION_VALUE: return INGESTION;
            case INJECTION_VALUE: return INJECTION;
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
    private SubstanceVector(int value, String name, String literal) {
        this.value = value;
        this.name = name;
        this.literal = literal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getValue() {
      return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
      return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
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
    
} //SubstanceVector
