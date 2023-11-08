/*
 * $Id: TransformingAddCollectionClosure.java 11773 2012-06-08 12:51:52Z uzeidler $
 * (C) 2003, 2004, 2005, 2006 by Sebastian Woelk (sw-k software & system engineering)
 */
package de.urszeidler.commons.functors;

import java.util.Collection;
import java.util.Collections;



/**
 * This class implements a function to tranfsform an alement than add the transformed element to the collection.
 * 
 * @author Sebastian Woelk
 * @version $Revision: 11773 $
 * @param <I>
 * @param <O>
 */
public class TransformingAddCollectionClosure<I, O> implements Closure<I> {

    private final Collection<O> collection;
    private final Transformer<I, O> transformer;

    /**
     * A Convient method to create a instance.
     * 
     * @param <I> the element type to add
     * @param <O> the element type of the collention
     * @param target the collection to add to
     * @param transformer the transformer for transform I->O
     * @return the instance
     */
    public static <I, O> TransformingAddCollectionClosure<I, O> transformingAddCollectionClosure(Collection<O> target, Transformer<I, O> transformer) {
        return new TransformingAddCollectionClosure<I, O>(target, transformer);
    }

    /**
     * Constructs a new instance of TransformingAddCollectionClosure.
     * 
     * @param collection the collection to add to
     * @param transformer the transformer
     */
    public TransformingAddCollectionClosure(final Collection<O> collection, Transformer<I, O> transformer) {
        this.collection = collection;
        this.transformer = transformer;
    }

    /**
     * getter for the collection. It's an unmodifiableCollection.
     * 
     * @return the collection
     */
    public Collection<O> getCollection() {
        return Collections.unmodifiableCollection(collection);
    }

    /**
     * Getter for the transformer.
     * 
     * @return the transformer
     */
    public Transformer<I, O> getTransformer() {
        return transformer;
    }

    /**
     * Transform the input than add the element to the collection.
     * 
     * @param input the input element
     * @see Closure#execute(Object)
     */
    public void execute(I input) {
        collection.add(transformer.transform(input));
    }
}
