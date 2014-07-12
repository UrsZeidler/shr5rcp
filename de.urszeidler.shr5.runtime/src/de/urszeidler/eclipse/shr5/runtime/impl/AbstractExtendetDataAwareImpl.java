/**
 */
package de.urszeidler.eclipse.shr5.runtime.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import de.urszeidler.eclipse.shr5.runtime.AbstractExtendetDataAware;
import de.urszeidler.eclipse.shr5.runtime.ExtendetData;
import de.urszeidler.eclipse.shr5.runtime.RuntimePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Extendet Data Aware</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.runtime.impl.AbstractExtendetDataAwareImpl#getExtendetData <em>Extendet Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractExtendetDataAwareImpl extends MinimalEObjectImpl.Container implements AbstractExtendetDataAware {
    /**
     * The cached value of the '{@link #getExtendetData() <em>Extendet Data</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExtendetData()
     * @generated
     * @ordered
     */
    protected Map<ExtendetData, Object> extendetData;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    protected AbstractExtendetDataAwareImpl() {
        super();
        extendetData = new HashMap<ExtendetData, Object>();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RuntimePackage.Literals.ABSTRACT_EXTENDET_DATA_AWARE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Map<ExtendetData, Object> getExtendetData() {
        return extendetData;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setExtendetData(Map<ExtendetData, Object> newExtendetData) {
        Map<ExtendetData, Object> oldExtendetData = extendetData;
        extendetData = newExtendetData;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.ABSTRACT_EXTENDET_DATA_AWARE__EXTENDET_DATA, oldExtendetData, extendetData));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    public void addToExtendetData(ExtendetData data, Object value) {
        Object object = extendetData.get(data);
        if (object == null) {
            extendetData.put(data, value);
            return;
        }

        try {
            Integer integer = new Integer(object.toString());

            Integer newValue = integer + new Integer(value.toString());
            extendetData.put(data, newValue);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    public int getIntegerValue(ExtendetData data) {
        Object object = extendetData.get(data);
        if (object instanceof Integer) {
            Integer i = (Integer) object;
            return i;
        }
        return 0;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    public void increaseValue(ExtendetData data, int value) {
        int integerValue = getIntegerValue(data);
        extendetData.put(data, integerValue + value);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    public void decreaseValue(ExtendetData data, int value) {
        int integerValue = getIntegerValue(data);
        int value2 = integerValue - value;
        if (value2 < 0)
            value2 = 0;

        extendetData.put(data, value2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    public boolean hasValue(ExtendetData data) {
        return extendetData.containsKey(data);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    @SuppressWarnings("unchecked")
    public void addToList(ExtendetData data, Object value) {
        if (hasValue(data)) {
            Object object = extendetData.get(data);
            if (object instanceof List) {
                List<Object> el = (List<Object>) object;
                el.add(value);
            }
        } else {
            BasicEList<Object> list = new BasicEList<Object>();
            list.add(value);
            extendetData.put(data, list);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    public void addUniqueToList(ExtendetData data, Object value) {
        if (hasValue(data)) {
            Object object = extendetData.get(data);
            if (object instanceof List) {
                List el = (List) object;
                if (!el.contains(value))
                    el.add(value);
            }
        } else {
            BasicEList<Object> list = new BasicEList<Object>();
            list.add(value);
            extendetData.put(data, list);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    public EList<?> getListValue(ExtendetData data) {
        if (hasValue(data)) {
            Object object = extendetData.get(data);
            if (object instanceof EList) {
                EList el = (EList) object;
                return el;
            }
        }
        return ECollections.EMPTY_ELIST;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case RuntimePackage.ABSTRACT_EXTENDET_DATA_AWARE__EXTENDET_DATA:
                return getExtendetData();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case RuntimePackage.ABSTRACT_EXTENDET_DATA_AWARE__EXTENDET_DATA:
                setExtendetData((Map<ExtendetData, Object>)newValue);
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
            case RuntimePackage.ABSTRACT_EXTENDET_DATA_AWARE__EXTENDET_DATA:
                setExtendetData((Map<ExtendetData, Object>)null);
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
            case RuntimePackage.ABSTRACT_EXTENDET_DATA_AWARE__EXTENDET_DATA:
                return extendetData != null;
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
            case RuntimePackage.ABSTRACT_EXTENDET_DATA_AWARE___ADD_TO_EXTENDET_DATA__EXTENDETDATA_OBJECT:
                addToExtendetData((ExtendetData)arguments.get(0), arguments.get(1));
                return null;
            case RuntimePackage.ABSTRACT_EXTENDET_DATA_AWARE___GET_INTEGER_VALUE__EXTENDETDATA:
                return getIntegerValue((ExtendetData)arguments.get(0));
            case RuntimePackage.ABSTRACT_EXTENDET_DATA_AWARE___INCREASE_VALUE__EXTENDETDATA_INT:
                increaseValue((ExtendetData)arguments.get(0), (Integer)arguments.get(1));
                return null;
            case RuntimePackage.ABSTRACT_EXTENDET_DATA_AWARE___DECREASE_VALUE__EXTENDETDATA_INT:
                decreaseValue((ExtendetData)arguments.get(0), (Integer)arguments.get(1));
                return null;
            case RuntimePackage.ABSTRACT_EXTENDET_DATA_AWARE___HAS_VALUE__EXTENDETDATA:
                return hasValue((ExtendetData)arguments.get(0));
            case RuntimePackage.ABSTRACT_EXTENDET_DATA_AWARE___ADD_TO_LIST__EXTENDETDATA_OBJECT:
                addToList((ExtendetData)arguments.get(0), arguments.get(1));
                return null;
            case RuntimePackage.ABSTRACT_EXTENDET_DATA_AWARE___ADD_UNIQUE_TO_LIST__EXTENDETDATA_OBJECT:
                addUniqueToList((ExtendetData)arguments.get(0), arguments.get(1));
                return null;
            case RuntimePackage.ABSTRACT_EXTENDET_DATA_AWARE___GET_LIST_VALUE__EXTENDETDATA:
                return getListValue((ExtendetData)arguments.get(0));
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
        result.append(" (extendetData: ");
        result.append(extendetData);
        result.append(')');
        return result.toString();
    }

} //AbstractExtendetDataAwareImpl
