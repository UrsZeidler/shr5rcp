/*
*
 */
package de.urszeidler.commons.functors;

/**
 * This interface represents a predicates, which can evaluate to true or false.
 * 
 * @param <T> the type of the input
 * @since 1.0
 */
public interface Predicate<T> {

    /**
     * Evaluates the predicate.
     * 
     * @param input the input to evaluate
     * @return true/false
     * @since 1.0
     */
    boolean evaluate(T input);
}
