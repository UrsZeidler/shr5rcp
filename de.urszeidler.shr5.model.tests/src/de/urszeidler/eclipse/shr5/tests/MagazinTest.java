/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.tests;

import junit.textui.TestRunner;
import de.urszeidler.eclipse.shr5.Feuerwaffe;
import de.urszeidler.eclipse.shr5.Magazin;
import de.urszeidler.eclipse.shr5.Munition;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Shr5Package;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Magazin</b></em>'.
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
public class MagazinTest extends AbstraktGegenstandTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(MagazinTest.class);
    }

    /**
     * Constructs a new Magazin test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MagazinTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Magazin test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected Magazin getFixture() {
        return (Magazin)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(Shr5Factory.eINSTANCE.createMagazin());
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
        assertEquals(Shr5Package.Literals.MAGAZIN__BULLETS, getFixture().getCapacityFeature());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.Capacity#getCapacity() <em>Capacity</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.Capacity#getCapacity()
     * @generated not
     */
    public void testGetCapacity() {
        Feuerwaffe feuerwaffe = Shr5Factory.eINSTANCE.createFeuerwaffe();
        feuerwaffe.setKapazitaet(10);
        assertEquals(0, getFixture().getCapacity());        
        
        getFixture().setType(feuerwaffe);
        assertEquals(10, getFixture().getCapacity());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.Capacity#getCapacityRemains() <em>Capacity Remains</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.Capacity#getCapacityRemains()
     * @generated not
     */
    public void testGetCapacityRemains() {
        Munition munition = Shr5Factory.eINSTANCE.createMunition();
        Feuerwaffe feuerwaffe = Shr5Factory.eINSTANCE.createFeuerwaffe();
        feuerwaffe.setKapazitaet(10);
        assertEquals(0, getFixture().getCapacityRemains());        
        
        getFixture().setType(feuerwaffe);
        assertEquals(10, getFixture().getCapacityRemains());
        getFixture().getBullets().add(munition);
        getFixture().getBullets().add(munition);
        getFixture().getBullets().add(munition);
        assertEquals(7, getFixture().getCapacityRemains());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.Capacity#canAdd(org.eclipse.emf.ecore.EObject) <em>Can Add</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.Capacity#canAdd(org.eclipse.emf.ecore.EObject)
     * @generated not
     */
    public void testCanAdd__EObject() {
        Munition munition = Shr5Factory.eINSTANCE.createMunition();
        Feuerwaffe feuerwaffe = Shr5Factory.eINSTANCE.createFeuerwaffe();
        feuerwaffe.setKapazitaet(1);
        assertEquals(0, getFixture().getCapacityRemains());        
        
        getFixture().setType(feuerwaffe);
        assertEquals(1, getFixture().getCapacityRemains());
        assertTrue(getFixture().canAdd(munition));
        getFixture().getBullets().add(munition);
        assertFalse(getFixture().canAdd(munition));
   }

} //MagazinTest
