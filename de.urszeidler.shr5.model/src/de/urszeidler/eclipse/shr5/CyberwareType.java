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
 * A representation of the literals of the enumeration '<em><b>Cyberware Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getCyberwareType()
 * @model
 * @generated
 */
public enum CyberwareType implements Enumerator {
    /**
     * The '<em><b>Headware</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #HEADWARE_VALUE
     * @generated
     * @ordered
     */
    HEADWARE(0, "headware", "headware"),

    /**
     * The '<em><b>Bodyware</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BODYWARE_VALUE
     * @generated
     * @ordered
     */
    BODYWARE(0, "bodyware", "bodyware"), /**
     * The '<em><b>Cyberlimb</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CYBERLIMB_VALUE
     * @generated
     * @ordered
     */
    CYBERLIMB(0, "cyberlimb", "cyberlimb");

    /**
     * The '<em><b>Headware</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Headware</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #HEADWARE
     * @model name="headware"
     * @generated
     * @ordered
     */
    public static final int HEADWARE_VALUE = 0;

    /**
     * The '<em><b>Bodyware</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Bodyware</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #BODYWARE
     * @model name="bodyware"
     * @generated
     * @ordered
     */
    public static final int BODYWARE_VALUE = 0;

    /**
     * The '<em><b>Cyberlimb</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Cyberlimb</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CYBERLIMB
     * @model name="cyberlimb"
     * @generated
     * @ordered
     */
    public static final int CYBERLIMB_VALUE = 0;

    /**
     * An array of all the '<em><b>Cyberware Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final CyberwareType[] VALUES_ARRAY =
        new CyberwareType[] {
            HEADWARE,
            BODYWARE,
            CYBERLIMB,
        };

    /**
     * A public read-only list of all the '<em><b>Cyberware Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<CyberwareType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Cyberware Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static CyberwareType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            CyberwareType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Cyberware Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static CyberwareType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            CyberwareType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Cyberware Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static CyberwareType get(int value) {
        switch (value) {
            case HEADWARE_VALUE: return HEADWARE;
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
    private CyberwareType(int value, String name, String literal) {
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
    
} //CyberwareType
