/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.impl;

import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.urszeidler.eclipse.shr5.GeldWert;
import de.urszeidler.eclipse.shr5.KoerperPersona;
import de.urszeidler.eclipse.shr5Management.ManagedCharacter;
import de.urszeidler.eclipse.shr5Management.Resourcen;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resourcen</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.ResourcenImpl#getResource <em>Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourcenImpl extends PriorityCategorieImpl implements Resourcen {
	/**
     * The default value of the '{@link #getResource() <em>Resource</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getResource()
     * @generated
     * @ordered
     */
	protected static final int RESOURCE_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getResource() <em>Resource</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getResource()
     * @generated
     * @ordered
     */
	protected int resource = RESOURCE_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected ResourcenImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return Shr5managementPackage.Literals.RESOURCEN;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getResource() {
        return resource;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setResource(int newResource) {
        int oldResource = resource;
        resource = newResource;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.RESOURCEN__RESOURCE, oldResource, resource));
    }

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public int calcResourceSpend(ManagedCharacter context) {
		if (context == null ||context.getPersona() == null)
			return 0;

		
		BigDecimal wert = calcListenWert(context.getInventar());
		if (context.getPersona() instanceof KoerperPersona) {
			KoerperPersona kp = (KoerperPersona) context.getPersona();
			wert = wert.add(calcListenWert(kp.getKoerperMods()));
		}

		return  wert.intValue();//-resourceKosten;
	}

	/**
	 * Calcs the wert of all {@link GeldWert} in the given list.
	 * 
	 * @param list
	 * @return
	 */
	private static BigDecimal calcListenWert(List<? extends Object> list) {
		BigDecimal summ = new BigDecimal(0);
		for (Object eo : list) {
			if (eo instanceof GeldWert) {
				GeldWert wert = (GeldWert) eo;

				if (wert.getWert() != null)
					summ = summ.add(wert.getWert());
			}
			// TODO : we need some real basic stuff in other lib
		}
		return summ;
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Shr5managementPackage.RESOURCEN__RESOURCE:
                return getResource();
        }
        return super.eGet(featureID, resolve, coreType);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case Shr5managementPackage.RESOURCEN__RESOURCE:
                setResource((Integer)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public void eUnset(int featureID) {
        switch (featureID) {
            case Shr5managementPackage.RESOURCEN__RESOURCE:
                setResource(RESOURCE_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public boolean eIsSet(int featureID) {
        switch (featureID) {
            case Shr5managementPackage.RESOURCEN__RESOURCE:
                return resource != RESOURCE_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
        switch (operationID) {
            case Shr5managementPackage.RESOURCEN___CALC_RESOURCE_SPEND__MANAGEDCHARACTER:
                return calcResourceSpend((ManagedCharacter)arguments.get(0));
        }
        return super.eInvoke(operationID, arguments);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (resource: ");
        result.append(resource);
        result.append(')');
        return result.toString();
    }

} //ResourcenImpl
