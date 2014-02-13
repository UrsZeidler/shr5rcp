/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.tests;

import junit.framework.TestCase;
import de.urszeidler.eclipse.shr5.PersonaFertigkeit;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5Management.KarmaGaint;
import de.urszeidler.eclipse.shr5Management.ManagedCharacter;
import de.urszeidler.eclipse.shr5Management.PersonaChange;
import de.urszeidler.eclipse.shr5Management.Shr5managementFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Managed Character</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.ManagedCharacter#getStreetCred() <em>Street Cred</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.ManagedCharacter#getNotoriety() <em>Notoriety</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.ManagedCharacter#getKarmaGaint() <em>Karma Gaint</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.ManagedCharacter#getCurrentKarma() <em>Current Karma</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class ManagedCharacterTest extends TestCase {

	/**
     * The fixture for this Managed Character test case.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected ManagedCharacter fixture = null;

	/**
     * Constructs a new Managed Character test case with the given name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ManagedCharacterTest(String name) {
        super(name);
    }

	/**
     * Sets the fixture for this Managed Character test case.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void setFixture(ManagedCharacter fixture) {
        this.fixture = fixture;
    }

	/**
     * Returns the fixture for this Managed Character test case.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected ManagedCharacter getFixture() {
        return fixture;
    }

	/**
	 * Tests the '{@link de.urszeidler.eclipse.shr5Management.ManagedCharacter#getStreetCred() <em>Street Cred</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.urszeidler.eclipse.shr5Management.ManagedCharacter#getStreetCred()
	 * @generated not
	 */
	public void testGetStreetCred() {
		assertEquals("need to be 0",0, getFixture().getStreetCred());		
		KarmaGaint karmaGaint = Shr5managementFactory.eINSTANCE.createKarmaGaint();
		karmaGaint.setKarma(23);
		getFixture().getChanges().add(karmaGaint);
		karmaGaint.applyChanges();
		assertEquals("need to be 2",2, getFixture().getStreetCred());
		karmaGaint.setKarma(29);
		assertEquals("need to be 2",2, getFixture().getStreetCred());
		karmaGaint.setKarma(30);
		assertEquals("need to be 3",3, getFixture().getStreetCred());
	}

	/**
	 * Tests the '{@link de.urszeidler.eclipse.shr5Management.ManagedCharacter#getNotoriety() <em>Notoriety</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.urszeidler.eclipse.shr5Management.ManagedCharacter#getNotoriety()
	 * @generated not
	 */
	public void testGetNotoriety() {
		assertEquals("need to be 0",0, getFixture().getNotoriety());		

		getFixture().setNotorietyBasic(1);
		assertEquals("need to be 1",1, getFixture().getNotoriety());		

	}

	/**
	 * Tests the '{@link de.urszeidler.eclipse.shr5Management.ManagedCharacter#getKarmaGaint() <em>Karma Gaint</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.urszeidler.eclipse.shr5Management.ManagedCharacter#getKarmaGaint()
	 * @generated not
	 */
	public void testGetKarmaGaint() {		
		assertEquals("need to be 0",0, getFixture().getKarmaGaint());		
		KarmaGaint karmaGaint = Shr5managementFactory.eINSTANCE.createKarmaGaint();
		karmaGaint.setKarma(2);
		getFixture().getChanges().add(karmaGaint);
		karmaGaint.applyChanges();
		assertEquals("need to be 2",2, getFixture().getKarmaGaint());
		karmaGaint = Shr5managementFactory.eINSTANCE.createKarmaGaint();
        karmaGaint.setKarma(2);
        getFixture().getChanges().add(karmaGaint);
        karmaGaint.applyChanges();
        assertEquals("need to be 4",4, getFixture().getKarmaGaint());
        
//        PersonaFertigkeit fertigkeit = Shr5Factory.eINSTANCE.createPersonaFertigkeit();
//        assertFalse(getFixture().getPersona().getFertigkeiten().contains(fertigkeit));
//        fertigkeit.setFertigkeit(Shr5Factory.eINSTANCE.createFertigkeit());
//
//        PersonaChange change = Shr5managementFactory.eINSTANCE.createPersonaChange();
//        change.setChangeable(fertigkeit);
//
//        getFixture().getChanges().add(change);
//        assertEquals(-2, change.getKarmaCost());
//        assertEquals(change.getFrom(), 0);
//        assertEquals(change.getTo(), 1);
//
//        change.applyChanges();
//        assertEquals(1, fertigkeit.getStufe());
//        assertTrue(getFixture().getPersona().getFertigkeiten().contains(fertigkeit));
//        assertEquals(true, change.isChangeApplied());
//        assertNotNull(change.getDateApplied());
//
//        assertEquals("need to be 2",2, getFixture().getKarmaGaint());
	}

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5Management.ManagedCharacter#getCurrentKarma() <em>Current Karma</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5Management.ManagedCharacter#getCurrentKarma()
     * @generated not
     */
    public void testGetCurrentKarma() {
        assertEquals("need to be 0",0, getFixture().getCurrentKarma());       
        KarmaGaint karmaGaint = Shr5managementFactory.eINSTANCE.createKarmaGaint();
        karmaGaint.setKarma(2);
        getFixture().getChanges().add(karmaGaint);
        karmaGaint.applyChanges();
        assertEquals("need to be 2",2, getFixture().getCurrentKarma());
        karmaGaint = Shr5managementFactory.eINSTANCE.createKarmaGaint();
        karmaGaint.setKarma(2);
        getFixture().getChanges().add(karmaGaint);
        karmaGaint.applyChanges();
        assertEquals("need to be 4",4, getFixture().getCurrentKarma());
        
        
    }

} //ManagedCharacterTest
