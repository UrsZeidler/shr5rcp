/**
 * 
 */
package de.urszeidler.shr5.ecp.editor;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.ui.IElementFactory;
import org.eclipse.ui.IMemento;

/**
 * @author urs
 */
public class ShrEditorInputFactory implements IElementFactory {

    public static final String ID = ShrEditorInputFactory.class.getName();

    /*
     * (non-Javadoc)
     * @see org.eclipse.ui.IElementFactory#createElement(org.eclipse.ui.IMemento)
     */
    @Override
    public IAdaptable createElement(IMemento memento) {
        return ShrEditorInput.createShrEditorInput(memento);
    }

}
