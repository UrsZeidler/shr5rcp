/*
 * $Id: FilterIterator.java 10826 2011-03-30 10:05:11Z uzeidler $ 
 * (C) 2003, 2004, 2005, 2006 by Sebastian Woelk (sw-k software & system engineering) 
 */
package de.urszeidler.commons.collections;

import java.util.Iterator;
import java.util.NoSuchElementException;

import de.urszeidler.commons.functors.Predicate;

/**
 * This class implements an iterator, which can be configured by a predicate.
 * The code is part of the BTL (Bastis Tool Library).
 * 
 * @author Sebastian Woelk
 * @version $Revision: 10826 $
 * @param <E>
 */
public class FilterIterator<E> implements Iterator<E> {

    private Iterator<E> iterator;
    private Predicate<E> predicate;
    private E nextObject;
    private boolean nextObjectSet = false;

    /**
     * Static factory method to create a new instance.
     * 
     * @param <A>
     * @param iterator iterator the iterator to use
     * @param predicate predicate the predicate to use
     * @return an instance of the FilterIterator<A>
     */
    public static final <A> Iterator<A> filterIterator(Iterator<A> iterator, Predicate<A> predicate) {
        return new FilterIterator<A>(iterator, predicate);
    }

    /**
     * Constructs a new <code>FilterIterator</code> that will use the given iterator and predicate.
     * 
     * @param iterator the iterator to use
     * @param predicate the predicate to use
     */
    public FilterIterator(Iterator<E> iterator, Predicate<E> predicate) {
        super();
        this.iterator = iterator;
        this.predicate = predicate;
    }

    /**
     * Returns true if the underlying iterator contains an object that matches the predicate.
     * 
     * @return true if there is another object that matches the predicate
     */
    public boolean hasNext() {
        if (nextObjectSet) {
            return true;
        } else {
            return setNextObject();
        }
    }

    /**
     * Returns the next object that matches the predicate.
     * 
     * @return the next object which matches the given predicate
     * @throws NoSuchElementException if there are no more elements that match the predicate
     */
    public E next() {
        if (!nextObjectSet) {
            if (!setNextObject()) {
                throw new NoSuchElementException();
            }
        }
        nextObjectSet = false;
        return nextObject;
    }

    /**
     * Removes from the underlying collection of the base iterator the last element returned by this iterator. This method can only be called if
     * <code>next()</code> was called, but not after <code>hasNext()</code>, because the <code>hasNext()</code> call changes the base iterator.
     * 
     * @throws IllegalStateException if <code>hasNext()</code> has already been called.
     */
    public void remove() {
        if (nextObjectSet) {
            throw new IllegalStateException("remove() cannot be called");
        }
        iterator.remove();
    }

    /**
     * Set nextObject to the next object. If there are no more objects then return false. Otherwise, return true.
     */
    private boolean setNextObject() {
        while (iterator.hasNext()) {
            E object = iterator.next();
            if (predicate.evaluate(object)) {
                nextObject = object;
                nextObjectSet = true;
                return true;
            }
        }
        return false;
    }
}
