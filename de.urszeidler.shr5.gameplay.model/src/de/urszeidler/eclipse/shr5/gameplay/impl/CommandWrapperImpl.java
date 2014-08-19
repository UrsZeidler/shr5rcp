/**
 * (c) Urs Zeilder
 */
package de.urszeidler.eclipse.shr5.gameplay.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import de.urszeidler.eclipse.shr5.gameplay.Command;
import de.urszeidler.eclipse.shr5.gameplay.CommandWrapper;
import de.urszeidler.eclipse.shr5.gameplay.GameplayPackage;
import de.urszeidler.eclipse.shr5.gameplay.SubjectCommand;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Command Wrapper</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class CommandWrapperImpl extends SubjectCommandImpl implements CommandWrapper {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CommandWrapperImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return GameplayPackage.Literals.COMMAND_WRAPPER;
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

} // CommandWrapperImpl
