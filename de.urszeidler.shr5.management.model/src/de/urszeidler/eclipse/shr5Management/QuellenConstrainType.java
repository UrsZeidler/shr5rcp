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
 * A representation of the literals of the enumeration '<em><b>Quellen Constrain Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Defines the mode of the constrain.
 * <!-- end-model-doc -->
 * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getQuellenConstrainType()
 * @model
 * @generated
 */
public enum QuellenConstrainType implements Enumerator {
    /**
     * The '<em><b>Not Together</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NOT_TOGETHER_VALUE
     * @generated
     * @ordered
     */
    NOT_TOGETHER(0, "notTogether", "notTogether"),

    /**
     * The '<em><b>Need One Of</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NEED_ONE_OF_VALUE
     * @generated
     * @ordered
     */
    NEED_ONE_OF(1, "needOneOf", "needOneOf");

    /**
     * The '<em><b>Not Together</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * No element refers in targets are allow to be in the character togther with the source.
     * <!-- end-model-doc -->
     * @see #NOT_TOGETHER
     * @model name="notTogether"
     * @generated
     * @ordered
     */
    public static final int NOT_TOGETHER_VALUE = 0;

    /**
     * The '<em><b>Need One Of</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * One or ore element refers in targets need  to be in the character togther with the source.
     * <!-- end-model-doc -->
     * @see #NEED_ONE_OF
     * @model name="needOneOf"
     * @generated
     * @ordered
     */
    public static final int NEED_ONE_OF_VALUE = 1;

    /**
     * An array of all the '<em><b>Quellen Constrain Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final QuellenConstrainType[] VALUES_ARRAY =
        new QuellenConstrainType[] {
            NOT_TOGETHER,
            NEED_ONE_OF,
        };

    /**
     * A public read-only list of all the '<em><b>Quellen Constrain Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<QuellenConstrainType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Quellen Constrain Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static QuellenConstrainType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            QuellenConstrainType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Quellen Constrain Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static QuellenConstrainType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            QuellenConstrainType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Quellen Constrain Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static QuellenConstrainType get(int value) {
        switch (value) {
            case NOT_TOGETHER_VALUE: return NOT_TOGETHER;
            case NEED_ONE_OF_VALUE: return NEED_ONE_OF;
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
    private QuellenConstrainType(int value, String name, String literal) {
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
    
} //QuellenConstrainType
