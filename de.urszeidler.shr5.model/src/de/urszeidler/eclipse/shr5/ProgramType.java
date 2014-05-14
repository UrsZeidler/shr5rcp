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
 * A representation of the literals of the enumeration '<em><b>Program Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getProgramType()
 * @model
 * @generated
 */
public enum ProgramType implements Enumerator {
    /**
     * The '<em><b>Default Soft</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DEFAULT_SOFT_VALUE
     * @generated
     * @ordered
     */
    DEFAULT_SOFT(0, "defaultSoft", "defaultSoft"),

    /**
     * The '<em><b>Data Soft</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DATA_SOFT_VALUE
     * @generated
     * @ordered
     */
    DATA_SOFT(1, "dataSoft", "dataSoft"),

    /**
     * The '<em><b>Shop Soft</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SHOP_SOFT_VALUE
     * @generated
     * @ordered
     */
    SHOP_SOFT(2, "shopSoft", "shopSoft");

    /**
     * The '<em><b>Default Soft</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Default Soft</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DEFAULT_SOFT
     * @model name="defaultSoft"
     * @generated
     * @ordered
     */
    public static final int DEFAULT_SOFT_VALUE = 0;

    /**
     * The '<em><b>Data Soft</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Data Soft</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DATA_SOFT
     * @model name="dataSoft"
     * @generated
     * @ordered
     */
    public static final int DATA_SOFT_VALUE = 1;

    /**
     * The '<em><b>Shop Soft</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Shop Soft</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SHOP_SOFT
     * @model name="shopSoft"
     * @generated
     * @ordered
     */
    public static final int SHOP_SOFT_VALUE = 2;

    /**
     * An array of all the '<em><b>Program Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final ProgramType[] VALUES_ARRAY =
        new ProgramType[] {
            DEFAULT_SOFT,
            DATA_SOFT,
            SHOP_SOFT,
        };

    /**
     * A public read-only list of all the '<em><b>Program Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<ProgramType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Program Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ProgramType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            ProgramType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Program Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ProgramType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            ProgramType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Program Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ProgramType get(int value) {
        switch (value) {
            case DEFAULT_SOFT_VALUE: return DEFAULT_SOFT;
            case DATA_SOFT_VALUE: return DATA_SOFT;
            case SHOP_SOFT_VALUE: return SHOP_SOFT;
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
    private ProgramType(int value, String name, String literal) {
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
    
} //ProgramType
