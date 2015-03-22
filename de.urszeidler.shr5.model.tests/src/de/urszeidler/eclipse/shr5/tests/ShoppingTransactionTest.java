/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.tests;

import java.math.BigDecimal;

import junit.textui.TestRunner;
import de.urszeidler.eclipse.shr5.GeldWert;
import de.urszeidler.eclipse.shr5.ShoppingTransaction;
import de.urszeidler.eclipse.shr5.Shr5Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Shopping Transaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.ShoppingTransaction#getCaculatedCosts() <em>Caculated Costs</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ShoppingTransactionTest extends CredstickTransactionTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(ShoppingTransactionTest.class);
    }

    /**
     * Constructs a new Shopping Transaction test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ShoppingTransactionTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Shopping Transaction test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected ShoppingTransaction getFixture() {
        return (ShoppingTransaction)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(Shr5Factory.eINSTANCE.createShoppingTransaction());
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
     * Tests the '{@link de.urszeidler.eclipse.shr5.ShoppingTransaction#getCaculatedCosts() <em>Caculated Costs</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.ShoppingTransaction#getCaculatedCosts()
     * @generated not
     */
    public void testGetCaculatedCosts() {
        GeldWert geldwert= Shr5Factory.eINSTANCE.createGegenstand();
        geldwert.setWertValue(new BigDecimal(100));
        getFixture().getItems().add(geldwert);
        
        geldwert= Shr5Factory.eINSTANCE.createGegenstand();
        geldwert.setWertValue(new BigDecimal(100));
        getFixture().getItems().add(geldwert);
        
        assertEquals(200, getFixture().getCaculatedCosts().intValue());
    }

    public void testTransactionSum() throws Exception {
        GeldWert geldwert= Shr5Factory.eINSTANCE.createGegenstand();
        geldwert.setWertValue(new BigDecimal(100));
        getFixture().getItems().add(geldwert);
        
        geldwert= Shr5Factory.eINSTANCE.createGegenstand();
        geldwert.setWertValue(new BigDecimal(100));
        getFixture().getItems().add(geldwert);
        
        assertEquals(200, getFixture().getCaculatedCosts().intValue());
    }
    
    public void testTransactionSumPlusFee() throws Exception {
        GeldWert geldwert= Shr5Factory.eINSTANCE.createGegenstand();
        geldwert.setWertValue(new BigDecimal(100));
        getFixture().getItems().add(geldwert);
        
        geldwert= Shr5Factory.eINSTANCE.createGegenstand();
        geldwert.setWertValue(new BigDecimal(100));
        getFixture().getItems().add(geldwert);
        
        getFixture().setFee(0.1D);
        assertEquals(220, getFixture().getCaculatedCosts().intValue());
    }
} //ShoppingTransactionTest
