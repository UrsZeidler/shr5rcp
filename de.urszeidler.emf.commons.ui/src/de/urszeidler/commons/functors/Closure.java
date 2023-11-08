/*
 * $Id: Closure.java 11632 2012-03-16 17:01:17Z uzeidler $ 
 */
package de.urszeidler.commons.functors;

/**
 * @version $Revision: 11632 $
 */
public interface Closure<T> {
    /**
     * Encapusulate the behavior.
     * 
     * @param input the parameter
     */
    void execute(T input);
}
