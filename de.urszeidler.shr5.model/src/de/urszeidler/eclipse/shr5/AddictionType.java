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
 * A representation of the literals of the enumeration '<em><b>Addiction Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getAddictionType()
 * @model
 * @generated
 */
public enum AddictionType implements Enumerator {
    /**
     * The '<em><b>Psychological</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PSYCHOLOGICAL_VALUE
     * @generated
     * @ordered
     */
    PSYCHOLOGICAL(0, "psychological", "psychological"),

    /**
     * The '<em><b>Physiological</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PHYSIOLOGICAL_VALUE
     * @generated
     * @ordered
     */
    PHYSIOLOGICAL(1, "physiological", "physiological"),

    /**
     * The '<em><b>Both</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BOTH_VALUE
     * @generated
     * @ordered
     */
    BOTH(2, "both", "both");

    /**
     * The '<em><b>Psychological</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Psychological</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #PSYCHOLOGICAL
     * @model name="psychological"
     * @generated
     * @ordered
     */
    public static final int PSYCHOLOGICAL_VALUE = 0;

    /**
     * The '<em><b>Physiological</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Physiological</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #PHYSIOLOGICAL
     * @model name="physiological"
     * @generated
     * @ordered
     */
    public static final int PHYSIOLOGICAL_VALUE = 1;

    /**
     * The '<em><b>Both</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Both</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #BOTH
     * @model name="both"
     * @generated
     * @ordered
     */
    public static final int BOTH_VALUE = 2;

    /**
     * An array of all the '<em><b>Addiction Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final AddictionType[] VALUES_ARRAY =
        new AddictionType[] {
            PSYCHOLOGICAL,
            PHYSIOLOGICAL,
            BOTH,
        };

    /**
     * A public read-only list of all the '<em><b>Addiction Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<AddictionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Addiction Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static AddictionType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            AddictionType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Addiction Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static AddictionType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            AddictionType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Addiction Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static AddictionType get(int value) {
        switch (value) {
            case PSYCHOLOGICAL_VALUE: return PSYCHOLOGICAL;
            case PHYSIOLOGICAL_VALUE: return PHYSIOLOGICAL;
            case BOTH_VALUE: return BOTH;
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
    private AddictionType(int value, String name, String literal) {
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
    
} //AddictionType
