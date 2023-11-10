/**
 * (c) Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.gameplay.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import de.urszeidler.eclipse.shr5.gameplay.Command;
import de.urszeidler.eclipse.shr5.gameplay.FreeAction;
import de.urszeidler.eclipse.shr5.gameplay.GameplayPackage;
import de.urszeidler.eclipse.shr5.gameplay.SubjectCommand;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Free Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class FreeActionImpl extends SubjectCommandImpl implements FreeAction {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FreeActionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return GameplayPackage.Literals.FREE_ACTION;
    }

    @Override
    public void redo() {
        setExecuting(true);

        EList<Command> commands = getSubCommands();
        for (Command command : commands) {
            command.setCmdCallback(getCmdCallback());
            if (command instanceof SubjectCommand) {
                SubjectCommand sc = (SubjectCommand)command;
                sc.setSubject(getSubject());
                sc.setDate(getDate());
            }
            command.redo();
        }
        setExecuted(true);
        executing = false;
    }

} //FreeActionImpl
