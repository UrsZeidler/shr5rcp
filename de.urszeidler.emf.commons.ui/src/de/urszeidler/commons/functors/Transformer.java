/**
 * 
 */
package de.urszeidler.commons.functors;

/**
 * @author urs
 * @since 1.0
 */
public interface Transformer<I, O> {

    /**
     * Transforms the input to the output.
     * 
     * @param input
     * @return
     */
    O transform(I input);

}
