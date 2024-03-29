/**
 */
package de.urszeidler.eclipse.shr5.runtime.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import de.urszeidler.eclipse.shr5.runtime.util.RuntimeAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RuntimeItemProviderAdapterFactory extends RuntimeAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
    /**
     * This keeps track of the root adapter factory that delegates to this adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ComposedAdapterFactory parentAdapterFactory;

    /**
     * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IChangeNotifier changeNotifier = new ChangeNotifier();

    /**
     * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected Collection<Object> supportedTypes = new ArrayList<Object>();

    /**
     * This constructs an instance.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RuntimeItemProviderAdapterFactory() {
        supportedTypes.add(IEditingDomainItemProvider.class);
        supportedTypes.add(IStructuredItemContentProvider.class);
        supportedTypes.add(ITreeItemContentProvider.class);
        supportedTypes.add(IItemLabelProvider.class);
        supportedTypes.add(IItemPropertySource.class);
    }

    /**
     * This keeps track of the one adapter used for all {@link de.urszeidler.eclipse.shr5.runtime.ExtendetData} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ExtendetDataItemProvider extendetDataItemProvider;

    /**
     * This creates an adapter for a {@link de.urszeidler.eclipse.shr5.runtime.ExtendetData}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createExtendetDataAdapter() {
        if (extendetDataItemProvider == null) {
            extendetDataItemProvider = new ExtendetDataItemProvider(this);
        }

        return extendetDataItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link de.urszeidler.eclipse.shr5.runtime.Enviorment} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EnviormentItemProvider enviormentItemProvider;

    /**
     * This creates an adapter for a {@link de.urszeidler.eclipse.shr5.runtime.Enviorment}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createEnviormentAdapter() {
        if (enviormentItemProvider == null) {
            enviormentItemProvider = new EnviormentItemProvider(this);
        }

        return enviormentItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RuntimeCharacterItemProvider runtimeCharacterItemProvider;

    /**
     * This creates an adapter for a {@link de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createRuntimeCharacterAdapter() {
        if (runtimeCharacterItemProvider == null) {
            runtimeCharacterItemProvider = new RuntimeCharacterItemProvider(this);
        }

        return runtimeCharacterItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link de.urszeidler.eclipse.shr5.runtime.Team} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TeamItemProvider teamItemProvider;

    /**
     * This creates an adapter for a {@link de.urszeidler.eclipse.shr5.runtime.Team}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createTeamAdapter() {
        if (teamItemProvider == null) {
            teamItemProvider = new TeamItemProvider(this);
        }

        return teamItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link de.urszeidler.eclipse.shr5.runtime.GruntTeam} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected GruntTeamItemProvider gruntTeamItemProvider;

    /**
     * This creates an adapter for a {@link de.urszeidler.eclipse.shr5.runtime.GruntTeam}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createGruntTeamAdapter() {
        if (gruntTeamItemProvider == null) {
            gruntTeamItemProvider = new GruntTeamItemProvider(this);
        }

        return gruntTeamItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link de.urszeidler.eclipse.shr5.runtime.GruntRuntimeCharacter} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected GruntRuntimeCharacterItemProvider gruntRuntimeCharacterItemProvider;

    /**
     * This creates an adapter for a {@link de.urszeidler.eclipse.shr5.runtime.GruntRuntimeCharacter}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createGruntRuntimeCharacterAdapter() {
        if (gruntRuntimeCharacterItemProvider == null) {
            gruntRuntimeCharacterItemProvider = new GruntRuntimeCharacterItemProvider(this);
        }

        return gruntRuntimeCharacterItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link de.urszeidler.eclipse.shr5.runtime.Drone} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DroneItemProvider droneItemProvider;

    /**
     * This creates an adapter for a {@link de.urszeidler.eclipse.shr5.runtime.Drone}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createDroneAdapter() {
        if (droneItemProvider == null) {
            droneItemProvider = new DroneItemProvider(this);
        }

        return droneItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link de.urszeidler.eclipse.shr5.runtime.MatrixDevice} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MatrixDeviceItemProvider matrixDeviceItemProvider;

    /**
     * This creates an adapter for a {@link de.urszeidler.eclipse.shr5.runtime.MatrixDevice}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createMatrixDeviceAdapter() {
        if (matrixDeviceItemProvider == null) {
            matrixDeviceItemProvider = new MatrixDeviceItemProvider(this);
        }

        return matrixDeviceItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link de.urszeidler.eclipse.shr5.runtime.RiggerConsole} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RiggerConsoleItemProvider riggerConsoleItemProvider;

    /**
     * This creates an adapter for a {@link de.urszeidler.eclipse.shr5.runtime.RiggerConsole}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createRiggerConsoleAdapter() {
        if (riggerConsoleItemProvider == null) {
            riggerConsoleItemProvider = new RiggerConsoleItemProvider(this);
        }

        return riggerConsoleItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link de.urszeidler.eclipse.shr5.runtime.Cyberdeck} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CyberdeckItemProvider cyberdeckItemProvider;

    /**
     * This creates an adapter for a {@link de.urszeidler.eclipse.shr5.runtime.Cyberdeck}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createCyberdeckAdapter() {
        if (cyberdeckItemProvider == null) {
            cyberdeckItemProvider = new CyberdeckItemProvider(this);
        }

        return cyberdeckItemProvider;
    }

    /**
     * This returns the root adapter factory that contains this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ComposeableAdapterFactory getRootAdapterFactory() {
        return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
    }

    /**
     * This sets the composed adapter factory that contains this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
        this.parentAdapterFactory = parentAdapterFactory;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object type) {
        return supportedTypes.contains(type) || super.isFactoryForType(type);
    }

    /**
     * This implementation substitutes the factory itself as the key for the adapter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter adapt(Notifier notifier, Object type) {
        return super.adapt(notifier, this);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object adapt(Object object, Object type) {
        if (isFactoryForType(type)) {
            Object adapter = super.adapt(object, type);
            if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
                return adapter;
            }
        }

        return null;
    }

    /**
     * This adds a listener.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void addListener(INotifyChangedListener notifyChangedListener) {
        changeNotifier.addListener(notifyChangedListener);
    }

    /**
     * This removes a listener.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void removeListener(INotifyChangedListener notifyChangedListener) {
        changeNotifier.removeListener(notifyChangedListener);
    }

    /**
     * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void fireNotifyChanged(Notification notification) {
        changeNotifier.fireNotifyChanged(notification);

        if (parentAdapterFactory != null) {
            parentAdapterFactory.fireNotifyChanged(notification);
        }
    }

    /**
     * This disposes all of the item providers created by this factory. 
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void dispose() {
        if (extendetDataItemProvider != null) extendetDataItemProvider.dispose();
        if (enviormentItemProvider != null) enviormentItemProvider.dispose();
        if (runtimeCharacterItemProvider != null) runtimeCharacterItemProvider.dispose();
        if (teamItemProvider != null) teamItemProvider.dispose();
        if (gruntTeamItemProvider != null) gruntTeamItemProvider.dispose();
        if (gruntRuntimeCharacterItemProvider != null) gruntRuntimeCharacterItemProvider.dispose();
        if (droneItemProvider != null) droneItemProvider.dispose();
        if (matrixDeviceItemProvider != null) matrixDeviceItemProvider.dispose();
        if (riggerConsoleItemProvider != null) riggerConsoleItemProvider.dispose();
        if (cyberdeckItemProvider != null) cyberdeckItemProvider.dispose();
    }

}
