/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.tests;

import java.math.BigDecimal;

import junit.textui.TestRunner;
import de.urszeidler.eclipse.shr5.Credstick;
import de.urszeidler.eclipse.shr5.CredstickTransaction;
import de.urszeidler.eclipse.shr5.Shr5Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Credstick</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.Credstick#getCurrentValue() <em>Current Value</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class CredstickTest extends AbstraktGegenstandTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(CredstickTest.class);
    }

    /**
     * Constructs a new Credstick test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CredstickTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Credstick test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected Credstick getFixture() {
        return (Credstick)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(Shr5Factory.eINSTANCE.createCredstick());
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
     * Tests the '{@link de.urszeidler.eclipse.shr5.Credstick#getCurrentValue() <em>Current Value</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.Credstick#getCurrentValue()
     * @generated not
     */
    public void testGetCurrentValue() {
      assertEquals(0, getFixture().getCurrentValue().intValue());
      
      CredstickTransaction transaction = Shr5Factory.eINSTANCE.createCredstickTransaction();
      transaction.setAmount(new BigDecimal(100));
      getFixture().getTransactionlog().add(transaction);
      
      assertEquals(100, getFixture().getCurrentValue().intValue());
      
      transaction = Shr5Factory.eINSTANCE.createCredstickTransaction();
      transaction.setAmount(new BigDecimal(-10));
      getFixture().getTransactionlog().add(transaction);
      
      assertEquals(90, getFixture().getCurrentValue().intValue());
    }

} //CredstickTest
