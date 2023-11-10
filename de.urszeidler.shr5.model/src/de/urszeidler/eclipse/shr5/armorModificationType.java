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
 * A representation of the literals of the enumeration '<em><b>armor Modification Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getarmorModificationType()
 * @model
 * @generated
 */
public enum armorModificationType implements Enumerator {
    /**
     * The '<em><b>Chemical Protection</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CHEMICAL_PROTECTION_VALUE
     * @generated
     * @ordered
     */
    CHEMICAL_PROTECTION(0, "ChemicalProtection", "ChemicalProtection"),

    /**
     * The '<em><b>Chemical Seal</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CHEMICAL_SEAL_VALUE
     * @generated
     * @ordered
     */
    CHEMICAL_SEAL(0, "ChemicalSeal", "ChemicalSeal"),

    /**
     * The '<em><b>Fire Resistance</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FIRE_RESISTANCE_VALUE
     * @generated
     * @ordered
     */
    FIRE_RESISTANCE(0, "FireResistance", "FireResistance"),

    /**
     * The '<em><b>Insulation</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #INSULATION_VALUE
     * @generated
     * @ordered
     */
    INSULATION(0, "Insulation", "Insulation"),

    /**
     * The '<em><b>Nonconductivity</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NONCONDUCTIVITY_VALUE
     * @generated
     * @ordered
     */
    NONCONDUCTIVITY(0, "Nonconductivity", "Nonconductivity"),

    /**
     * The '<em><b>Shock Frills</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SHOCK_FRILLS_VALUE
     * @generated
     * @ordered
     */
    SHOCK_FRILLS(0, "ShockFrills", "ShockFrills"),

    /**
     * The '<em><b>Thermal Damping</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #THERMAL_DAMPING_VALUE
     * @generated
     * @ordered
     */
    THERMAL_DAMPING(0, "ThermalDamping", "ThermalDamping");

    /**
     * The '<em><b>Chemical Protection</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Chemical Protection</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CHEMICAL_PROTECTION
     * @model name="ChemicalProtection"
     * @generated
     * @ordered
     */
    public static final int CHEMICAL_PROTECTION_VALUE = 0;

    /**
     * The '<em><b>Chemical Seal</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Chemical Seal</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CHEMICAL_SEAL
     * @model name="ChemicalSeal"
     * @generated
     * @ordered
     */
    public static final int CHEMICAL_SEAL_VALUE = 0;

    /**
     * The '<em><b>Fire Resistance</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Fire Resistance</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #FIRE_RESISTANCE
     * @model name="FireResistance"
     * @generated
     * @ordered
     */
    public static final int FIRE_RESISTANCE_VALUE = 0;

    /**
     * The '<em><b>Insulation</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Insulation</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #INSULATION
     * @model name="Insulation"
     * @generated
     * @ordered
     */
    public static final int INSULATION_VALUE = 0;

    /**
     * The '<em><b>Nonconductivity</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Nonconductivity</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #NONCONDUCTIVITY
     * @model name="Nonconductivity"
     * @generated
     * @ordered
     */
    public static final int NONCONDUCTIVITY_VALUE = 0;

    /**
     * The '<em><b>Shock Frills</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Shock Frills</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SHOCK_FRILLS
     * @model name="ShockFrills"
     * @generated
     * @ordered
     */
    public static final int SHOCK_FRILLS_VALUE = 0;

    /**
     * The '<em><b>Thermal Damping</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Thermal Damping</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #THERMAL_DAMPING
     * @model name="ThermalDamping"
     * @generated
     * @ordered
     */
    public static final int THERMAL_DAMPING_VALUE = 0;

    /**
     * An array of all the '<em><b>armor Modification Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final armorModificationType[] VALUES_ARRAY =
        new armorModificationType[] {
            CHEMICAL_PROTECTION,
            CHEMICAL_SEAL,
            FIRE_RESISTANCE,
            INSULATION,
            NONCONDUCTIVITY,
            SHOCK_FRILLS,
            THERMAL_DAMPING,
        };

    /**
     * A public read-only list of all the '<em><b>armor Modification Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<armorModificationType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>armor Modification Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static armorModificationType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            armorModificationType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>armor Modification Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static armorModificationType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            armorModificationType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>armor Modification Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static armorModificationType get(int value) {
        switch (value) {
            case CHEMICAL_PROTECTION_VALUE: return CHEMICAL_PROTECTION;
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
    private armorModificationType(int value, String name, String literal) {
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
    
} //armorModificationType
