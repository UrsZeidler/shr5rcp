/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EContentAdapter;

import de.urszeidler.eclipse.shr5Management.CharacterGenerator;
import de.urszeidler.eclipse.shr5Management.CharacterGeneratorSystem;
import de.urszeidler.eclipse.shr5Management.CharacterGroup;
import de.urszeidler.eclipse.shr5Management.GeneratorState;
import de.urszeidler.eclipse.shr5Management.ManagedCharacter;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Character Generator</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.CharacterGeneratorImpl#getCharacter <em>Character</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.CharacterGeneratorImpl#getGenerator <em>Generator</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.CharacterGeneratorImpl#getState <em>State</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.CharacterGeneratorImpl#getSelectedGroup <em>Selected Group</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.CharacterGeneratorImpl#getCharacterName <em>Character Name</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.CharacterGeneratorImpl#getCurrentInstruction <em>Current Instruction</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CharacterGeneratorImpl<G extends CharacterGeneratorSystem> extends MinimalEObjectImpl.Container implements CharacterGenerator<G> {
	/**
     * The cached value of the '{@link #getCharacter() <em>Character</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getCharacter()
     * @generated
     * @ordered
     */
	protected ManagedCharacter character;

	/**
     * The cached value of the '{@link #getGenerator() <em>Generator</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getGenerator()
     * @generated
     * @ordered
     */
	protected G generator;

	/**
     * The default value of the '{@link #getState() <em>State</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getState()
     * @generated
     * @ordered
     */
	protected static final GeneratorState STATE_EDEFAULT = GeneratorState.NEW;

	/**
     * The cached value of the '{@link #getState() <em>State</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getState()
     * @generated
     * @ordered
     */
	protected GeneratorState state = STATE_EDEFAULT;

	/**
     * The cached value of the '{@link #getSelectedGroup() <em>Selected Group</em>}' reference.
     * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
     * @see #getSelectedGroup()
     * @generated
     * @ordered
     */
	protected CharacterGroup selectedGroup;

	/**
     * The default value of the '{@link #getCharacterName() <em>Character Name</em>}' attribute.
     * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
     * @see #getCharacterName()
     * @generated
     * @ordered
     */
	protected static final String CHARACTER_NAME_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getCharacterName() <em>Character Name</em>}' attribute.
     * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
     * @see #getCharacterName()
     * @generated
     * @ordered
     */
	protected String characterName = CHARACTER_NAME_EDEFAULT;

	/**
     * The default value of the '{@link #getCurrentInstruction() <em>Current Instruction</em>}' attribute.
     * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
     * @see #getCurrentInstruction()
     * @generated
     * @ordered
     */
	protected static final String CURRENT_INSTRUCTION_EDEFAULT = null;

	private EContentAdapter adapter = new EContentAdapter() {

//		private Notifier myTarger;
//
//		public Notifier getTarget() {
//			return myTarger;
//		}
//
//		public boolean isAdapterForType(Object type) {
//			return false;
//		}

	    protected void addAdapter(org.eclipse.emf.common.notify.Notifier notifier) {
	        super.addAdapter(notifier);
	        
	    };
	    
		public void notifyChanged(Notification notification) {
		    super.notifyChanged(notification);
		    if(getState()==GeneratorState.COMMITED)
		        return;
		    Object notifier = notification.getNotifier();
		    if(notifier==CharacterGeneratorImpl.this)
		        return;
			if (notification.getEventType() == Notification.REMOVING_ADAPTER)
				return;
			Object feature = notification.getFeature();
			
//			if (Shr5managementPackage.Literals.MANAGED_CHARACTER__PERSONA.equals(feature)) {
//				if (getCharacter().getPersona() != null)
//					if (!getCharacter().getPersona().eAdapters().contains(adapter))
//						getCharacter().getPersona().eAdapters().add(adapter);
//				return;
//			}
			if(Shr5managementPackage.Literals.MANAGED_CHARACTER__CHRACTER_SOURCE.equals(feature)
			   || Shr5managementPackage.Literals.MANAGED_CHARACTER__GENERATOR_SRC.equals(feature)
			        )
			    return;
			
			EList<EAttribute> eAllAttributes = eClass().getEAllAttributes();
			for (EAttribute attribute : eAllAttributes) {
				if (attribute != null)
					CharacterGeneratorImpl.this.eNotify(new ENotificationImpl((InternalEObject) CharacterGeneratorImpl.this,
							Notification.SET, attribute, 0, 1));
			}

		}
//
//		public void setTarget(Notifier newTarget) {
//			myTarger = newTarget;
//			// myTarger.eAdapters().add(this);
//
//		}

	};

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	protected CharacterGeneratorImpl() {
		super();
		adapter.setTarget(this);
		this.eAdapters().add(adapter);
	}

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return Shr5managementPackage.Literals.CHARACTER_GENERATOR;
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public ManagedCharacter getCharacter() {
        if (character != null && character.eIsProxy()) {
            InternalEObject oldCharacter = (InternalEObject)character;
            character = (ManagedCharacter)eResolveProxy(oldCharacter);
            if (character != oldCharacter) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5managementPackage.CHARACTER_GENERATOR__CHARACTER, oldCharacter, character));
            }
        }
        return character;
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public ManagedCharacter basicGetCharacter() {
        return character;
    }

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	public NotificationChain basicSetCharacter(ManagedCharacter newCharacter, NotificationChain msgs) {
		ManagedCharacter oldCharacter = character;
		character = newCharacter;

		if (oldCharacter != null) {
			oldCharacter.eAdapters().remove(adapter);
			if (oldCharacter.getPersona() != null)
				oldCharacter.getPersona().eAdapters().remove(adapter);
		}
		if (newCharacter != null) {
			newCharacter.eAdapters().add(adapter);
			if (newCharacter.getPersona() != null)
				newCharacter.getPersona().eAdapters().add(adapter);
		}
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Shr5managementPackage.CHARACTER_GENERATOR__CHARACTER, oldCharacter, newCharacter);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public void setCharacter(ManagedCharacter newCharacter) {
        if (newCharacter != character) {
            NotificationChain msgs = null;
            if (character != null)
                msgs = ((InternalEObject)character).eInverseRemove(this, Shr5managementPackage.MANAGED_CHARACTER__CHRACTER_SOURCE, ManagedCharacter.class, msgs);
            if (newCharacter != null)
                msgs = ((InternalEObject)newCharacter).eInverseAdd(this, Shr5managementPackage.MANAGED_CHARACTER__CHRACTER_SOURCE, ManagedCharacter.class, msgs);
            msgs = basicSetCharacter(newCharacter, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.CHARACTER_GENERATOR__CHARACTER, newCharacter, newCharacter));
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@SuppressWarnings("unchecked")
    public G getGenerator() {
        if (generator != null && generator.eIsProxy()) {
            InternalEObject oldGenerator = (InternalEObject)generator;
            generator = (G)eResolveProxy(oldGenerator);
            if (generator != oldGenerator) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5managementPackage.CHARACTER_GENERATOR__GENERATOR, oldGenerator, generator));
            }
        }
        return generator;
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public G basicGetGenerator() {
        return generator;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setGenerator(G newGenerator) {
        G oldGenerator = generator;
        generator = newGenerator;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.CHARACTER_GENERATOR__GENERATOR, oldGenerator, generator));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public GeneratorState getState() {
        return state;
    }

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	public void setState(GeneratorState newState) {
		GeneratorState oldState = state;
		state = newState == null ? STATE_EDEFAULT : newState;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.CHARACTER_GENERATOR__STATE, oldState,
					state));
			if (newState != oldState)
				eNotify(new ENotificationImpl(this, Notification.SET,
						Shr5managementPackage.CHARACTER_GENERATOR__CURRENT_INSTRUCTION, 0, 1));

		}
		if(newState==GeneratorState.COMMITED){
		    adapter.unsetTarget(this);
		    this.eAdapters().remove(adapter);
		    if(getCharacter()!=null)
		        getCharacter().eAdapters().remove(adapter);
		    if(getCharacter()!=null && getCharacter().getPersona()!=null)
		        getCharacter().getPersona().eAdapters().remove(adapter);
		}
//		else
//		if(newState!= STATE_EDEFAULT){
//		      adapter.setTarget(this);
//		      if(!this.eAdapters().contains(adapter))
//		          this.eAdapters().add(adapter);
//
//		}
	}

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public CharacterGroup getSelectedGroup() {
        if (selectedGroup != null && selectedGroup.eIsProxy()) {
            InternalEObject oldSelectedGroup = (InternalEObject)selectedGroup;
            selectedGroup = (CharacterGroup)eResolveProxy(oldSelectedGroup);
            if (selectedGroup != oldSelectedGroup) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5managementPackage.CHARACTER_GENERATOR__SELECTED_GROUP, oldSelectedGroup, selectedGroup));
            }
        }
        return selectedGroup;
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public CharacterGroup basicGetSelectedGroup() {
        return selectedGroup;
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public void setSelectedGroup(CharacterGroup newSelectedGroup) {
        CharacterGroup oldSelectedGroup = selectedGroup;
        selectedGroup = newSelectedGroup;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.CHARACTER_GENERATOR__SELECTED_GROUP, oldSelectedGroup, selectedGroup));
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public String getCharacterName() {
        return characterName;
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public void setCharacterName(String newCharacterName) {
        String oldCharacterName = characterName;
        characterName = newCharacterName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.CHARACTER_GENERATOR__CHARACTER_NAME, oldCharacterName, characterName));
    }

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	public String getCurrentInstruction() {
		if (getGenerator() != null) {
			return getGenerator().getInstructions().get(getState());
		}
		return "no generator set";
	}

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case Shr5managementPackage.CHARACTER_GENERATOR__CHARACTER:
                if (character != null)
                    msgs = ((InternalEObject)character).eInverseRemove(this, Shr5managementPackage.MANAGED_CHARACTER__CHRACTER_SOURCE, ManagedCharacter.class, msgs);
                return basicSetCharacter((ManagedCharacter)otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case Shr5managementPackage.CHARACTER_GENERATOR__CHARACTER:
                return basicSetCharacter(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Shr5managementPackage.CHARACTER_GENERATOR__CHARACTER:
                if (resolve) return getCharacter();
                return basicGetCharacter();
            case Shr5managementPackage.CHARACTER_GENERATOR__GENERATOR:
                if (resolve) return getGenerator();
                return basicGetGenerator();
            case Shr5managementPackage.CHARACTER_GENERATOR__STATE:
                return getState();
            case Shr5managementPackage.CHARACTER_GENERATOR__SELECTED_GROUP:
                if (resolve) return getSelectedGroup();
                return basicGetSelectedGroup();
            case Shr5managementPackage.CHARACTER_GENERATOR__CHARACTER_NAME:
                return getCharacterName();
            case Shr5managementPackage.CHARACTER_GENERATOR__CURRENT_INSTRUCTION:
                return getCurrentInstruction();
        }
        return super.eGet(featureID, resolve, coreType);
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@SuppressWarnings("unchecked")
    @Override
	public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case Shr5managementPackage.CHARACTER_GENERATOR__CHARACTER:
                setCharacter((ManagedCharacter)newValue);
                return;
            case Shr5managementPackage.CHARACTER_GENERATOR__GENERATOR:
                setGenerator((G)newValue);
                return;
            case Shr5managementPackage.CHARACTER_GENERATOR__STATE:
                setState((GeneratorState)newValue);
                return;
            case Shr5managementPackage.CHARACTER_GENERATOR__SELECTED_GROUP:
                setSelectedGroup((CharacterGroup)newValue);
                return;
            case Shr5managementPackage.CHARACTER_GENERATOR__CHARACTER_NAME:
                setCharacterName((String)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
	public void eUnset(int featureID) {
        switch (featureID) {
            case Shr5managementPackage.CHARACTER_GENERATOR__CHARACTER:
                setCharacter((ManagedCharacter)null);
                return;
            case Shr5managementPackage.CHARACTER_GENERATOR__GENERATOR:
                setGenerator((G)null);
                return;
            case Shr5managementPackage.CHARACTER_GENERATOR__STATE:
                setState(STATE_EDEFAULT);
                return;
            case Shr5managementPackage.CHARACTER_GENERATOR__SELECTED_GROUP:
                setSelectedGroup((CharacterGroup)null);
                return;
            case Shr5managementPackage.CHARACTER_GENERATOR__CHARACTER_NAME:
                setCharacterName(CHARACTER_NAME_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
	public boolean eIsSet(int featureID) {
        switch (featureID) {
            case Shr5managementPackage.CHARACTER_GENERATOR__CHARACTER:
                return character != null;
            case Shr5managementPackage.CHARACTER_GENERATOR__GENERATOR:
                return generator != null;
            case Shr5managementPackage.CHARACTER_GENERATOR__STATE:
                return state != STATE_EDEFAULT;
            case Shr5managementPackage.CHARACTER_GENERATOR__SELECTED_GROUP:
                return selectedGroup != null;
            case Shr5managementPackage.CHARACTER_GENERATOR__CHARACTER_NAME:
                return CHARACTER_NAME_EDEFAULT == null ? characterName != null : !CHARACTER_NAME_EDEFAULT.equals(characterName);
            case Shr5managementPackage.CHARACTER_GENERATOR__CURRENT_INSTRUCTION:
                return CURRENT_INSTRUCTION_EDEFAULT == null ? getCurrentInstruction() != null : !CURRENT_INSTRUCTION_EDEFAULT.equals(getCurrentInstruction());
        }
        return super.eIsSet(featureID);
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
	public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (state: ");
        result.append(state);
        result.append(", characterName: ");
        result.append(characterName);
        result.append(')');
        return result.toString();
    }

} // CharacterGeneratorImpl
