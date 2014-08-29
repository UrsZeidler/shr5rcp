/**
 * 
 */
package de.urszeidler.eclipse.shr5.gameplay.util;

import org.eclipse.emf.ecore.EStructuralFeature;

import de.urszeidler.eclipse.shr5.gameplay.Command;

/**
 * @author urs
 *
 */ //prepare, beforeExecute, beforeSubcommands, afterExecute
public interface CommandCallback {
    /**
     * Is used to prepare the command.
     * @param cmd
     * @param eStructuralFeatures
     */
    void prepareCommand(Command cmd,EStructuralFeature ... eStructuralFeatures);
    void beforeExecute(Command cmd,EStructuralFeature ... eStructuralFeatures);
    void beforeSubcommands(Command cmd,EStructuralFeature ... eStructuralFeatures);
   
   /**
    * Is used to prepare the command.
    * @param cmd
    * @param eStructuralFeatures
    */
  void afterCommand(Command cmd,EStructuralFeature ... eStructuralFeatures);

}
