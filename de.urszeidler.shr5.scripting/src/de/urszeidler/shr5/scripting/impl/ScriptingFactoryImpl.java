/**
 */
package de.urszeidler.shr5.scripting.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.urszeidler.shr5.scripting.Handout;
import de.urszeidler.shr5.scripting.HandoutType;
import de.urszeidler.shr5.scripting.Placement;
import de.urszeidler.shr5.scripting.PlacementOptions;
import de.urszeidler.shr5.scripting.Script;
import de.urszeidler.shr5.scripting.ScriptHistory;
import de.urszeidler.shr5.scripting.ScriptingFactory;
import de.urszeidler.shr5.scripting.ScriptingPackage;
import de.urszeidler.shr5.scripting.Scripts;
import de.urszeidler.shr5.scripting.Section;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScriptingFactoryImpl extends EFactoryImpl implements ScriptingFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ScriptingFactory init() {
        try {
            ScriptingFactory theScriptingFactory = (ScriptingFactory)EPackage.Registry.INSTANCE.getEFactory(ScriptingPackage.eNS_URI);
            if (theScriptingFactory != null) {
                return theScriptingFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new ScriptingFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ScriptingFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case ScriptingPackage.SCRIPT: return createScript();
            case ScriptingPackage.PLACEMENT: return createPlacement();
            case ScriptingPackage.SCRIPT_HISTORY: return createScriptHistory();
            case ScriptingPackage.SCRIPTS: return createScripts();
            case ScriptingPackage.HANDOUT: return createHandout();
            case ScriptingPackage.SECTION: return createSection();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
            case ScriptingPackage.PLACEMENT_OPTIONS:
                return createPlacementOptionsFromString(eDataType, initialValue);
            case ScriptingPackage.HANDOUT_TYPE:
                return createHandoutTypeFromString(eDataType, initialValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
            case ScriptingPackage.PLACEMENT_OPTIONS:
                return convertPlacementOptionsToString(eDataType, instanceValue);
            case ScriptingPackage.HANDOUT_TYPE:
                return convertHandoutTypeToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Script createScript() {
        ScriptImpl script = new ScriptImpl();
        return script;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Placement createPlacement() {
        PlacementImpl placement = new PlacementImpl();
        return placement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ScriptHistory createScriptHistory() {
        ScriptHistoryImpl scriptHistory = new ScriptHistoryImpl();
        return scriptHistory;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Scripts createScripts() {
        ScriptsImpl scripts = new ScriptsImpl();
        return scripts;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Handout createHandout() {
        HandoutImpl handout = new HandoutImpl();
        return handout;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Section createSection() {
        SectionImpl section = new SectionImpl();
        return section;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PlacementOptions createPlacementOptionsFromString(EDataType eDataType, String initialValue) {
        PlacementOptions result = PlacementOptions.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertPlacementOptionsToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HandoutType createHandoutTypeFromString(EDataType eDataType, String initialValue) {
        HandoutType result = HandoutType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertHandoutTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ScriptingPackage getScriptingPackage() {
        return (ScriptingPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static ScriptingPackage getPackage() {
        return ScriptingPackage.eINSTANCE;
    }

} //ScriptingFactoryImpl
