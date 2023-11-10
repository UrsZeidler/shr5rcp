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
 * A representation of the literals of the enumeration '<em><b>Substance Effect</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getSubstanceEffect()
 * @model
 * @generated
 */
public enum SubstanceEffect implements Enumerator {
    /**
     * The '<em><b>Disorientation</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DISORIENTATION_VALUE
     * @generated
     * @ordered
     */
    DISORIENTATION(0, "disorientation", "disorientation"),

    /**
     * The '<em><b>Nausea</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NAUSEA_VALUE
     * @generated
     * @ordered
     */
    NAUSEA(1, "nausea", "nausea"),

    /**
     * The '<em><b>Paralysis</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PARALYSIS_VALUE
     * @generated
     * @ordered
     */
    PARALYSIS(2, "paralysis", "paralysis"),

    /**
     * The '<em><b>Stun Damage</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #STUN_DAMAGE_VALUE
     * @generated
     * @ordered
     */
    STUN_DAMAGE(3, "stunDamage", "stunDamage");

    /**
     * The '<em><b>Disorientation</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Disorientation</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DISORIENTATION
     * @model name="disorientation"
     * @generated
     * @ordered
     */
    public static final int DISORIENTATION_VALUE = 0;

    /**
     * The '<em><b>Nausea</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Nausea</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #NAUSEA
     * @model name="nausea"
     * @generated
     * @ordered
     */
    public static final int NAUSEA_VALUE = 1;

    /**
     * The '<em><b>Paralysis</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Paralysis</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #PARALYSIS
     * @model name="paralysis"
     * @generated
     * @ordered
     */
    public static final int PARALYSIS_VALUE = 2;

    /**
     * The '<em><b>Stun Damage</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Stun Damage</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #STUN_DAMAGE
     * @model name="stunDamage"
     * @generated
     * @ordered
     */
    public static final int STUN_DAMAGE_VALUE = 3;

    /**
     * An array of all the '<em><b>Substance Effect</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final SubstanceEffect[] VALUES_ARRAY =
        new SubstanceEffect[] {
            DISORIENTATION,
            NAUSEA,
            PARALYSIS,
            STUN_DAMAGE,
        };

    /**
     * A public read-only list of all the '<em><b>Substance Effect</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<SubstanceEffect> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Substance Effect</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static SubstanceEffect get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            SubstanceEffect result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Substance Effect</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static SubstanceEffect getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            SubstanceEffect result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Substance Effect</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static SubstanceEffect get(int value) {
        switch (value) {
            case DISORIENTATION_VALUE: return DISORIENTATION;
            case NAUSEA_VALUE: return NAUSEA;
            case PARALYSIS_VALUE: return PARALYSIS;
            case STUN_DAMAGE_VALUE: return STUN_DAMAGE;
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
    private SubstanceEffect(int value, String name, String literal) {
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
    
} //SubstanceEffect
