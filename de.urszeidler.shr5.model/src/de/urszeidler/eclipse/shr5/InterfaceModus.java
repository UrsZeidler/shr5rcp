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
 * A representation of the literals of the enumeration '<em><b>Interface Modus</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getInterfaceModus()
 * @model
 * @generated
 */
public enum InterfaceModus implements Enumerator {
    /**
     * The '<em><b>Augmented Reality</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #AUGMENTED_REALITY_VALUE
     * @generated
     * @ordered
     */
    AUGMENTED_REALITY(0, "augmentedReality", "augmentedReality"),

    /**
     * The '<em><b>Cold Sim</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #COLD_SIM_VALUE
     * @generated
     * @ordered
     */
    COLD_SIM(1, "coldSim", "coldSim"),

    /**
     * The '<em><b>Hot Sim</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #HOT_SIM_VALUE
     * @generated
     * @ordered
     */
    HOT_SIM(2, "hotSim", "hotSim");

    /**
     * The '<em><b>Augmented Reality</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Augmented Reality</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #AUGMENTED_REALITY
     * @model name="augmentedReality"
     * @generated
     * @ordered
     */
    public static final int AUGMENTED_REALITY_VALUE = 0;

    /**
     * The '<em><b>Cold Sim</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Cold Sim</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #COLD_SIM
     * @model name="coldSim"
     * @generated
     * @ordered
     */
    public static final int COLD_SIM_VALUE = 1;

    /**
     * The '<em><b>Hot Sim</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Hot Sim</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #HOT_SIM
     * @model name="hotSim"
     * @generated
     * @ordered
     */
    public static final int HOT_SIM_VALUE = 2;

    /**
     * An array of all the '<em><b>Interface Modus</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final InterfaceModus[] VALUES_ARRAY =
        new InterfaceModus[] {
            AUGMENTED_REALITY,
            COLD_SIM,
            HOT_SIM,
        };

    /**
     * A public read-only list of all the '<em><b>Interface Modus</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<InterfaceModus> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Interface Modus</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static InterfaceModus get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            InterfaceModus result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Interface Modus</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static InterfaceModus getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            InterfaceModus result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Interface Modus</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static InterfaceModus get(int value) {
        switch (value) {
            case AUGMENTED_REALITY_VALUE: return AUGMENTED_REALITY;
            case COLD_SIM_VALUE: return COLD_SIM;
            case HOT_SIM_VALUE: return HOT_SIM;
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
    private InterfaceModus(int value, String name, String literal) {
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
    
} //InterfaceModus
