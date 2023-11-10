/**
 * (c) Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.gameplay;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Interrupt Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getInterruptType()
 * @model
 * @generated
 */
public enum InterruptType implements Enumerator {
    /**
     * The '<em><b>Block</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BLOCK_VALUE
     * @generated
     * @ordered
     */
    BLOCK(0, "block", "block"),

    /**
     * The '<em><b>Dodge</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DODGE_VALUE
     * @generated
     * @ordered
     */
    DODGE(1, "dodge", "dodge"),

    /**
     * The '<em><b>Hit the dirt</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #HIT_THE_DIRT_VALUE
     * @generated
     * @ordered
     */
    HIT_THE_DIRT(2, "hit_the_dirt", "hit_the_dirt"),

    /**
     * The '<em><b>Intercept</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #INTERCEPT_VALUE
     * @generated
     * @ordered
     */
    INTERCEPT(3, "intercept", "intercept"),

    /**
     * The '<em><b>Parry</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PARRY_VALUE
     * @generated
     * @ordered
     */
    PARRY(4, "parry", "parry"),

    /**
     * The '<em><b>Full defense</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FULL_DEFENSE_VALUE
     * @generated
     * @ordered
     */
    FULL_DEFENSE(5, "full_defense", "full_defense");

    /**
     * The '<em><b>Block</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Block</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #BLOCK
     * @model name="block"
     * @generated
     * @ordered
     */
    public static final int BLOCK_VALUE = 0;

    /**
     * The '<em><b>Dodge</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Dodge</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DODGE
     * @model name="dodge"
     * @generated
     * @ordered
     */
    public static final int DODGE_VALUE = 1;

    /**
     * The '<em><b>Hit the dirt</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Hit the dirt</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #HIT_THE_DIRT
     * @model name="hit_the_dirt"
     * @generated
     * @ordered
     */
    public static final int HIT_THE_DIRT_VALUE = 2;

    /**
     * The '<em><b>Intercept</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Intercept</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #INTERCEPT
     * @model name="intercept"
     * @generated
     * @ordered
     */
    public static final int INTERCEPT_VALUE = 3;

    /**
     * The '<em><b>Parry</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Parry</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #PARRY
     * @model name="parry"
     * @generated
     * @ordered
     */
    public static final int PARRY_VALUE = 4;

    /**
     * The '<em><b>Full defense</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Full defense</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #FULL_DEFENSE
     * @model name="full_defense"
     * @generated
     * @ordered
     */
    public static final int FULL_DEFENSE_VALUE = 5;

    /**
     * An array of all the '<em><b>Interrupt Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final InterruptType[] VALUES_ARRAY =
        new InterruptType[] {
            BLOCK,
            DODGE,
            HIT_THE_DIRT,
            INTERCEPT,
            PARRY,
            FULL_DEFENSE,
        };

    /**
     * A public read-only list of all the '<em><b>Interrupt Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<InterruptType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Interrupt Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static InterruptType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            InterruptType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Interrupt Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static InterruptType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            InterruptType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Interrupt Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static InterruptType get(int value) {
        switch (value) {
            case BLOCK_VALUE: return BLOCK;
            case DODGE_VALUE: return DODGE;
            case HIT_THE_DIRT_VALUE: return HIT_THE_DIRT;
            case INTERCEPT_VALUE: return INTERCEPT;
            case PARRY_VALUE: return PARRY;
            case FULL_DEFENSE_VALUE: return FULL_DEFENSE;
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
    private InterruptType(int value, String name, String literal) {
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
    
} //InterruptType
