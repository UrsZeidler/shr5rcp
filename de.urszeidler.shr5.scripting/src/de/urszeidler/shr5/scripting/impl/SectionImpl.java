/**
 */
package de.urszeidler.shr5.scripting.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import de.urszeidler.shr5.scripting.ScriptingPackage;
import de.urszeidler.shr5.scripting.Section;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.shr5.scripting.impl.SectionImpl#getTitel <em>Titel</em>}</li>
 *   <li>{@link de.urszeidler.shr5.scripting.impl.SectionImpl#getText <em>Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SectionImpl extends MinimalEObjectImpl.Container implements Section {
    /**
     * The default value of the '{@link #getTitel() <em>Titel</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTitel()
     * @generated
     * @ordered
     */
    protected static final String TITEL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTitel() <em>Titel</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTitel()
     * @generated
     * @ordered
     */
    protected String titel = TITEL_EDEFAULT;

    /**
     * The default value of the '{@link #getText() <em>Text</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getText()
     * @generated
     * @ordered
     */
    protected static final String TEXT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getText()
     * @generated
     * @ordered
     */
    protected String text = TEXT_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SectionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ScriptingPackage.Literals.SECTION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getTitel() {
        return titel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTitel(String newTitel) {
        String oldTitel = titel;
        titel = newTitel;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScriptingPackage.SECTION__TITEL, oldTitel, titel));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText() {
        return text;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setText(String newText) {
        String oldText = text;
        text = newText;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScriptingPackage.SECTION__TEXT, oldText, text));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ScriptingPackage.SECTION__TITEL:
                return getTitel();
            case ScriptingPackage.SECTION__TEXT:
                return getText();
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
            case ScriptingPackage.SECTION__TITEL:
                setTitel((String)newValue);
                return;
            case ScriptingPackage.SECTION__TEXT:
                setText((String)newValue);
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
            case ScriptingPackage.SECTION__TITEL:
                setTitel(TITEL_EDEFAULT);
                return;
            case ScriptingPackage.SECTION__TEXT:
                setText(TEXT_EDEFAULT);
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
            case ScriptingPackage.SECTION__TITEL:
                return TITEL_EDEFAULT == null ? titel != null : !TITEL_EDEFAULT.equals(titel);
            case ScriptingPackage.SECTION__TEXT:
                return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuilder result = new StringBuilder(super.toString());
        result.append(" (titel: ");
        result.append(titel);
        result.append(", text: ");
        result.append(text);
        result.append(')');
        return result.toString();
    }

} //SectionImpl
