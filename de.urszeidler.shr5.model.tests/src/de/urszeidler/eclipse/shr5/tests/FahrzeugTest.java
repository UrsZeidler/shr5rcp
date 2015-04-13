/**
 */
package de.urszeidler.eclipse.shr5.tests;

import java.math.BigDecimal;

import junit.framework.TestCase;
import de.urszeidler.eclipse.shr5.AbstaktWaffe;
import de.urszeidler.eclipse.shr5.Fahrzeug;
import de.urszeidler.eclipse.shr5.FahrzeugModifikation;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.WeaponMount;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Fahrzeug</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.GeldWert#getWert() <em>Wert</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.FahrzeugZustand#getZustandMax() <em>Zustand Max</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Capacity#getCapacityFeature() <em>Capacity Feature</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Capacity#getCapacity() <em>Capacity</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Capacity#getCapacityRemains() <em>Capacity Remains</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Fahrzeug#getWeaponMounts() <em>Weapon Mounts</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.Capacity#canAdd(org.eclipse.emf.ecore.EObject) <em>Can Add</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class FahrzeugTest extends TestCase {

	/**
     * The fixture for this Fahrzeug test case.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected Fahrzeug fixture = null;

	/**
     * Constructs a new Fahrzeug test case with the given name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FahrzeugTest(String name) {
        super(name);
    }

	/**
     * Sets the fixture for this Fahrzeug test case.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void setFixture(Fahrzeug fixture) {
        this.fixture = fixture;
    }

	/**
     * Returns the fixture for this Fahrzeug test case.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected Fahrzeug getFixture() {
        return fixture;
    }

	   /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.GeldWert#getWert() <em>Wert</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.GeldWert#getWert()
     * @generated not
     */
    public void testGetWert() {
        getFixture().setWertValue(new BigDecimal(10));        
        assertEquals(10,getFixture().getWert().intValue());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.FahrzeugZustand#getZustandMax() <em>Zustand Max</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.FahrzeugZustand#getZustandMax()
     * @generated not
     */
    public void testGetZustandMax() {
        getFixture().setRumpf(5);
        assertEquals(14,getFixture().getZustandMax());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.Capacity#getCapacityFeature() <em>Capacity Feature</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.Capacity#getCapacityFeature()
     * @generated not
     */
    public void testGetCapacityFeature() {
        assertEquals(Shr5Package.Literals.FAHRZEUG__MODIFIZIERUNGEN, getFixture().getCapacityFeature());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.Capacity#getCapacity() <em>Capacity</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.Capacity#getCapacity()
     * @generated not
     */
    public void testGetCapacity() {
        getFixture().setRumpf(5);
        assertEquals(1,getFixture().getCapacity());        
        getFixture().setRumpf(6);
        assertEquals(2,getFixture().getCapacity());        
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.Capacity#getCapacityRemains() <em>Capacity Remains</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.Capacity#getCapacityRemains()
     * @generated not
     */
    public void testGetCapacityRemains() {
        getFixture().setRumpf(5);
        assertEquals(1,getFixture().getCapacity());        
        getFixture().setRumpf(6);
        assertEquals(2,getFixture().getCapacity());        
        
        
        WeaponMount wm = Shr5Factory.eINSTANCE.createWeaponMount();
        AbstaktWaffe w = Shr5Factory.eINSTANCE.createFeuerwaffe();
        wm.setWeapon(w);
        
        getFixture().getModifizierungen().add(wm);
        assertEquals(1,getFixture().getCapacityRemains());
        
        wm = Shr5Factory.eINSTANCE.createWeaponMount();
        w = Shr5Factory.eINSTANCE.createFeuerwaffe();
        wm.setWeapon(w);
        
        getFixture().getModifizierungen().add(wm);
        assertEquals(0,getFixture().getCapacityRemains());
        
    }
    
    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.Fahrzeug#getWeaponMounts() <em>Weapon Mounts</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.Fahrzeug#getWeaponMounts()
     * @generated not
     */
    public void testGetWeaponMounts() {
        getFixture().setRumpf(5);
        assertEquals(1,getFixture().getWeaponMounts());        
        getFixture().setRumpf(6);
        assertEquals(2,getFixture().getWeaponMounts());        
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.Capacity#canAdd(org.eclipse.emf.ecore.EObject) <em>Can Add</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.Capacity#canAdd(org.eclipse.emf.ecore.EObject)
     * @generated not
     */
    public void testCanAdd__EObject() {
        getFixture().setRumpf(5);
        assertEquals(1,getFixture().getCapacity());        
        getFixture().setRumpf(6);
        assertEquals(2,getFixture().getCapacity());        
        
        WeaponMount wm = Shr5Factory.eINSTANCE.createWeaponMount();
        AbstaktWaffe w = Shr5Factory.eINSTANCE.createFeuerwaffe();
        wm.setWeapon(w);
        
        assertTrue(getFixture().canAdd(wm));
        getFixture().getModifizierungen().add(wm);
        assertEquals(1,getFixture().getCapacityRemains());
        
        wm = Shr5Factory.eINSTANCE.createWeaponMount();
        w = Shr5Factory.eINSTANCE.createFeuerwaffe();
        wm.setWeapon(w);
        
        assertTrue(getFixture().canAdd(wm));
        getFixture().getModifizierungen().add(wm);
        assertEquals(0,getFixture().getCapacityRemains());
        
        wm = Shr5Factory.eINSTANCE.createWeaponMount();
        w = Shr5Factory.eINSTANCE.createFeuerwaffe();
        wm.setWeapon(w);
        
        assertFalse(getFixture().canAdd(wm));
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.GeldWert#getWert() <em>Wert</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.GeldWert#getWert()
     * @generated not
     */
    public void testGetWert1() {
        getFixture().setWertValue(new BigDecimal(10));        
        assertEquals(10,getFixture().getWert().intValue());
        
        FahrzeugModifikation mod = Shr5Factory.eINSTANCE.createWeaponMount();
        mod.setWertValue(new BigDecimal(11));
        getFixture().getModifizierungen().add(mod);
        assertEquals(21,getFixture().getWert().intValue());

    }

} //FahrzeugTest
