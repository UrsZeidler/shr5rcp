/**
 */
package de.urszeidler.eclipse.shr5.tests;

import junit.textui.TestRunner;
import de.urszeidler.eclipse.shr5.Kleidung;
import de.urszeidler.eclipse.shr5.KleindungsModifikator;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.armorModificationType;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Kleidung</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.Capacity#getCapacityFeature() <em>Capacity Feature</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Capacity#getCapacity() <em>Capacity</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Capacity#getCapacityRemains() <em>Capacity Remains</em>}</li>
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
public class KleidungTest extends AbstraktGegenstandTest {

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static void main(String[] args) {
        TestRunner.run(KleidungTest.class);
    }

	/**
     * Constructs a new Kleidung test case with the given name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public KleidungTest(String name) {
        super(name);
    }

	/**
     * Returns the fixture for this Kleidung test case.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected Kleidung getFixture() {
        return (Kleidung)fixture;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
	@Override
	protected void setUp() throws Exception {
        setFixture(Shr5Factory.eINSTANCE.createKleidung());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see junit.framework.TestCase#tearDown()
     * @generated
     */
	@Override
	protected void tearDown() throws Exception {
        setFixture(null);
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.Capacity#getCapacityFeature() <em>Capacity Feature</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.Capacity#getCapacityFeature()
     * @generated not
     */
    public void testGetCapacityFeature() {
       assertEquals(Shr5Package.Literals.KLEIDUNG__KMODS, getFixture().getCapacityFeature());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.Capacity#getCapacity() <em>Capacity</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.Capacity#getCapacity()
     * @generated  not
     */
    public void testGetCapacity() {
        getFixture().setRuestung(3);
        assertEquals(3, getFixture().getCapacity());
 
        getFixture().setRuestung(6);
        assertEquals(6, getFixture().getCapacity());
 
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.Capacity#getCapacityRemains() <em>Capacity Remains</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.Capacity#getCapacityRemains()
     * @generated not 
     */
    public void testGetCapacityRemains() {
        getFixture().setRuestung(3);
        assertEquals(3, getFixture().getCapacity());

        KleindungsModifikator e = Shr5Factory.eINSTANCE.createKleindungsModifikator();
        e.setRating(2);
        getFixture().getKmods().add(e);
        assertEquals(1, getFixture().getCapacityRemains());

        e.setRating(3);
        assertEquals(0, getFixture().getCapacityRemains());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.Capacity#getCapacityRemains() <em>Capacity Remains</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.Capacity#getCapacityRemains()
     * @generated not 
     */
    public void testGetCapacityRemains_1() {
        getFixture().setRuestung(8);
        assertEquals(8, getFixture().getCapacity());

        KleindungsModifikator e = Shr5Factory.eINSTANCE.createKleindungsModifikator();
        e.setRating(2);
        getFixture().getKmods().add(e);
        assertEquals(6, getFixture().getCapacityRemains());

        e = Shr5Factory.eINSTANCE.createKleindungsModifikator();
        getFixture().getKmods().add(e);
        e.setType(armorModificationType.CHEMICAL_SEAL);
        assertEquals(0, getFixture().getCapacityRemains());
        
        e.setType(armorModificationType.SHOCK_FRILLS);
        assertEquals(4, getFixture().getCapacityRemains());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.Capacity#canAdd(org.eclipse.emf.ecore.EObject) <em>Can Add</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.Capacity#canAdd(org.eclipse.emf.ecore.EObject)
     * @generated not
     */
    public void testCanAdd__EObject() {
        getFixture().setRuestung(3);
        assertEquals(3, getFixture().getCapacity());

        KleindungsModifikator e = Shr5Factory.eINSTANCE.createKleindungsModifikator();
        e.setRating(2);
        getFixture().getKmods().add(e);
        assertEquals(1, getFixture().getCapacityRemains());
        
        e = Shr5Factory.eINSTANCE.createKleindungsModifikator();
        e.setRating(2);
        assertFalse(getFixture().canAdd(e));
        e.setRating(1);
        assertTrue(getFixture().canAdd(e));
    }

} //KleidungTest
