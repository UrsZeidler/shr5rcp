/**
 * (c) Urs Zeilder
 */
package de.urszeidler.eclipse.shr5.gameplay;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Semantic Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * The type of semanitc action.
 * <!-- end-model-doc -->
 * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getSemanticType()
 * @model
 * @generated
 */
public enum SemanticType implements Enumerator {
    /**
     * The '<em><b>Talk</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TALK_VALUE
     * @generated
     * @ordered
     */
    TALK(0, "talk", "talk"),

    /**
     * The '<em><b>Gesture</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #GESTURE_VALUE
     * @generated
     * @ordered
     */
    GESTURE(1, "gesture", "gesture"), /**
     * The '<em><b>Description</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DESCRIPTION_VALUE
     * @generated
     * @ordered
     */
    DESCRIPTION(2, "description", "description");

    /**
     * The '<em><b>Talk</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Talk</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #TALK
     * @model name="talk"
     * @generated
     * @ordered
     */
    public static final int TALK_VALUE = 0;

    /**
     * The '<em><b>Gesture</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Gesture</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #GESTURE
     * @model name="gesture"
     * @generated
     * @ordered
     */
    public static final int GESTURE_VALUE = 1;

    /**
     * The '<em><b>Description</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Description</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DESCRIPTION
     * @model name="description"
     * @generated
     * @ordered
     */
    public static final int DESCRIPTION_VALUE = 2;

    /**
     * An array of all the '<em><b>Semantic Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final SemanticType[] VALUES_ARRAY =
        new SemanticType[] {
            TALK,
            GESTURE,
            DESCRIPTION,
        };

    /**
     * A public read-only list of all the '<em><b>Semantic Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<SemanticType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Semantic Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static SemanticType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            SemanticType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Semantic Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static SemanticType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            SemanticType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Semantic Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static SemanticType get(int value) {
        switch (value) {
            case TALK_VALUE: return TALK;
            case GESTURE_VALUE: return GESTURE;
            case DESCRIPTION_VALUE: return DESCRIPTION;
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
    private SemanticType(int value, String name, String literal) {
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
    
} //SemanticType
