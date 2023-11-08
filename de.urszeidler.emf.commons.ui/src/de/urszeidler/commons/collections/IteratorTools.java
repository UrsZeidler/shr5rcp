/*
 * $Id: IteratorTools.java 10799 2011-03-15 17:32:30Z uzeidler $ 
 * (C) 2003, 2004, 2005, 2006 by Sebastian Woelk (sw-k software & system engineering) 
 */
package de.urszeidler.commons.collections;

import static de.urszeidler.commons.collections.FilterIterator.filterIterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import de.urszeidler.commons.functors.Closure;
import de.urszeidler.commons.functors.Predicate;
import de.urszeidler.commons.functors.Transformer;
import de.urszeidler.commons.functors.TransformingAddCollectionClosure;

/**
 * This class implements some static utility methods for iterating over collections and arrays.
 */
public class IteratorTools {

    private IteratorTools() { /* shielded constructor */
    }

    /**
     * TODO write JavaDoc
     * 
     * @param <A>
     * @param iterator
     * @param closure
     */
    public static final <A> void forAllDo(Iterator<A> iterator, Closure<A> closure) {
        if (iterator == null)
            return;
        for (; iterator.hasNext();) {
            closure.execute(iterator.next());
        }
    }

    /**
     * TODO write JavaDoc
     * 
     * @param <A>
     * @param iterator
     * @param predicate
     * @param closure
     */
    public static final <A> void forAllMatchingDo(Iterator<A> iterator, Predicate<A> predicate, Closure<A> closure) {
        forAllDo(filterIterator(iterator, predicate), closure);
    }

    /**
     * Collect the transformed values in an ArrayList.
     * 
     * @param <Out>
     * @param <In>
     * @param iterator the iterator
     * @param transformer the transformer
     * @return
     */
    public static final <Out, In> Collection<Out> collect(Iterator<In> iterator, Transformer<In, Out> transformer) {
        Collection<Out> result = new ArrayList<Out>();
        for (; iterator.hasNext();) {
            result.add(transformer.transform(iterator.next()));
        }
        return result;
    }

    /**
     * TODO write JavaDoc
     * 
     * @param <A>
     * @param iterator
     * @param predicate
     * @return
     */
    public static final <A> Collection<A> select(Iterator<A> iterator, Predicate<A> predicate) {
        Collection<A> result = new ArrayList<A>();
        for (; iterator.hasNext();) {
            A o = iterator.next();
            if (predicate.evaluate(o)) {
                result.add(o);
            }
        }
        return result;
    }

    /**
     * Returns the first element from the passed {@link Iterator} which is accepted by given {@link Predicate}.
     * 
     * @param <A> the type of the elements in the {@link Iterator}
     * @param iterator the iterator to process
     * @param predicate the filter predicate
     * @return the first element accepted by the {@link Predicate}
     */
    public static final <A> A find(Iterator<A> iterator, Predicate<A> predicate) {
        if (iterator == null)
            return null;
        for (; iterator.hasNext();) {
            A o = iterator.next();
            if (predicate.evaluate(o)) {
                return o;
            }
        }
        return null;
    }

    /**
     * Checks if there is any element matching the predicate.
     * 
     * @param <A>
     * @param iterator the iterator to process
     * @param predicate predicate the filter predicate
     * @return true if one entry matches the predicate, false otherwise
     */
    public static final <A> boolean exists(Iterator<A> iterator, Predicate<A> predicate) {
        return find(iterator, predicate) != null;
    }

    // /**
    // * TODO write JavaDoc
    // *
    // * @param <I>
    // * @param <O>
    // * @param array
    // * @param transformer
    // * @return
    // */
    // public static final <I, O> Iterator<O> transformingArrayIterator(I[] array, Transformer<I, O> transformer) {
    // return transformingIterator(arrayIterator(array), transformer);
    // }

    /**
     * TODO write JavaDoc
     * 
     * @param <I>
     * @param <O>
     * @param iterator
     * @param transformer
     * @return
     */
    public static final <I, O> Collection<O> transform(Iterator<I> iterator, Transformer<I, O> transformer) {
        return transform(iterator, transformer, new ArrayList<O>());
    }

    // /**
    // * TODO write JavaDoc
    // *
    // * @param <I>
    // * @param <O>
    // * @param iterator
    // * @param transformer
    // * @param factory
    // * @return
    // */
    // public static final <I, O> Collection<O> transform(Iterator<I> iterator, Transformer<I, O> transformer, SetFactory<O> factory) {
    // return transform(iterator, transformer, factory.create());
    // }

    // /**
    // * TODO write JavaDoc
    // *
    // * @param <I>
    // * @param <O>
    // * @param iterator
    // * @param transformer
    // * @param factory
    // * @return
    // */
    // public static final <I, O> Collection<O> transform(Iterator<I> iterator, Transformer<I, O> transformer, ListFactory<O> factory) {
    // return transform(iterator, transformer, factory.create());
    // }
    //
    /**
     * TODO write JavaDoc
     * 
     * @param <I>
     * @param <O>
     * @param iterator
     * @param transformer
     * @param result
     * @return
     */
    public static final <I, O> Collection<O> transform(Iterator<I> iterator, Transformer<I, O> transformer, Collection<O> result) {
        forAllDo(iterator, TransformingAddCollectionClosure.transformingAddCollectionClosure(result, transformer));
        return result;
    }
}
