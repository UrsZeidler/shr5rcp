/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.tests;

import java.math.BigDecimal;

import de.urszeidler.eclipse.shr5.GeldWert;
import de.urszeidler.eclipse.shr5.ShoppingTransaction;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Shopping Transaction</b></em>'.
 * <!-- end-user-doc -->
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

    
    public void testTransactionSum() throws Exception {
        GeldWert geldwert= Shr5Factory.eINSTANCE.createGegenstand();
        geldwert.setWertValue(new BigDecimal(100));
        getFixture().getItems().add(geldwert);
        
        geldwert= Shr5Factory.eINSTANCE.createGegenstand();
        geldwert.setWertValue(new BigDecimal(100));
        getFixture().getItems().add(geldwert);
        
        assertEquals(200, getFixture().getAmount().intValue());
    }
    
    public void testTransactionSumPlusFee() throws Exception {
        GeldWert geldwert= Shr5Factory.eINSTANCE.createGegenstand();
        geldwert.setWertValue(new BigDecimal(100));
        getFixture().getItems().add(geldwert);
        
        geldwert= Shr5Factory.eINSTANCE.createGegenstand();
        geldwert.setWertValue(new BigDecimal(100));
        getFixture().getItems().add(geldwert);
        
        getFixture().setFee(0.1D);
        assertEquals(220, getFixture().getAmount().intValue());
    }
} //ShoppingTransactionTest
