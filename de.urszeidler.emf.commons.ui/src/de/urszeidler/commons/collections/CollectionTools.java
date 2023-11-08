/*
 * $Id: CollectionTools.java 11691 2012-04-24 14:56:48Z uzeidler $ 
 * (C) 2003, 2004, 2005, 2006 by Sebastian Woelk (sw-k software & system engineering) 
 */
package de.urszeidler.commons.collections;


import java.util.Collection;

import de.urszeidler.commons.functors.Closure;
import de.urszeidler.commons.functors.Predicate;
import de.urszeidler.commons.functors.Transformer;

/**
 * This class contains some static convinience functions for collection processing.
 *
 */
public final class CollectionTools {

    private CollectionTools() { /* shielded constructor */}

    /**
     * <p>
     * Answers <code>true </code> if a {@link Predicate} is <code>true</code> for at least one element of an array.
     * </p>
     * <p>
     * A <code>null</code> collection or predicate returns false.
     * </p>
     * 
     * @param <A> the type of the elements in the array
     * @param array the collection to get the input from, may be null
     * @param predicate the predicate to use, may be null
     * @return true if at least one element of the collection matches the predicate
     */
//    public static <A> boolean exists(A[] array, Predicate<A> predicate) {
//        if (array == null || predicate == null) {
//            return false;
//        }
//        return IteratorTools.exists(arrayIterator(array), predicate);
//    }

    /**
     * <p>
     * Answers <code>true</code> if a {@link Predicate} is <code>true</code> for at least one element of a collection.
     * </p>
     * <p>
     * A <code>null</code> collection or predicate returns <code>false</code>.
     * </p>
     * 
     * @param <A> the type of the elements in the collection
     * @param collection the collection to get the input from, may be null
     * @param predicate the predicate to use, may be null
     * @return true if at least one element of the collection matches the predicate
     */
    public static <A> boolean exists(Collection<A> collection, Predicate<A> predicate) {
        if (collection == null || predicate == null) {
            return false;
        }
        return IteratorTools.exists(collection.iterator(), predicate);
    }

    /**
     * Applies the given {@link Closure} to all elements of the passed collection.
     * 
     * @param <A> the type of the collection elements
     * @param collection the collection to process
     * @param closure the {@link Closure} to apply
     */
    public static <A> void forAllDo(Collection<A> collection, Closure<A> closure) {
        if (collection == null || collection.size() == 0)
            return;
        IteratorTools.forAllDo(collection.iterator(), closure);
    }

    /**
     * Applies the given {@link Closure} to all elements of the passed array.
     * 
     * @param <A> the type of the array elements
     * @param array the array to process
     * @param closure the {@link Closure} to apply
     */
//    public static <A> void forAllDo(A[] array, Closure<A> closure) {
//        if (array.length == 0)
//            return;
//        IteratorTools.forAllDo(arrayIterator(array), closure);
//    }

    /**
     * Applies the given {@link Closure} to all elements of the passed collection which are accepted by the provided {@link Predicate}.
     * 
     * @param <A> the type of the collection elements
     * @param collection the collection to process
     * @param predicate the filter {@link Predicate}
     * @param closure the {@link Closure} to apply
     */
    public static <A> void forAllMatchingDo(Collection<A> collection, Predicate<A> predicate, Closure<A> closure) {
        if (collection == null)
            return;
        IteratorTools.forAllMatchingDo(collection.iterator(), predicate, closure);
    }

    /**
     * Applies the given {@link Closure} to all elements of the passed array which are accepted by the provided {@link Predicate}.
     * 
     * @param <A> the type of the array elements
     * @param array the array to process
     * @param predicate the filter {@link Predicate}
     * @param closure the {@link Closure} to apply
     */
//    public static <A> void forAllMatchingDo(A[] array, Predicate<A> predicate, Closure<A> closure) {
//        if (array == null || array.length == 0)
//            return;
//        IteratorTools.forAllMatchingDo(arrayIterator(array), predicate, closure);
//    }

    /**
     * Adds all elements of the passed array to the given target collection.
     * 
     * @param <A> the type of the collection elements
     * @param target the target collection
     * @param array the array to add to the target collection
     * @return the target collection itself
     */
//    public static <A> Collection<A> addAll(Collection<A> target, A[] array) {
//        forAllDo(array, new AddCollectionClosure<A>(target));
//        return target;
//    }

    /**
     * Returns the first element from the passed array which is accepted by given {@link Predicate}.
     * 
     * @param <A> the type of the elements in the array
     * @param array the array to process
     * @param predicate the filter predicate
     * @return the first element accepted by the {@link Predicate}
     */
//    public static <A> A find(A[] array, Predicate<A> predicate) {
//        return IteratorTools.find(arrayIterator(array), predicate);
//    }

    /**
     * Returns the first element from the passed collection which is accepted by given {@link Predicate}.
     * 
     * @param <A> the type of the collection elements
     * @param collection the collection to search
     * @param predicate the filter predicate
     * @return the first element accepted by the {@link Predicate}
     */
    public static <A> A find(Collection<A> collection, Predicate<A> predicate) {
        if (collection == null)
            return null;
        return IteratorTools.find(collection.iterator(), predicate);
    }

    /**
     * TODO write JavaDoc
     * 
     * @param <O>
     * @param <I>
     * @param collection
     * @param transformer
     * @return
     */
    public static <O, I> Collection<O> collect(Collection<I> collection, Transformer<I, O> transformer) {
        return IteratorTools.collect(collection.iterator(), transformer);
    }

//    /**
//     * TODO write JavaDoc
//     * 
//     * @param <O>
//     * @param <I>
//     * @param array
//     * @param transformer
//     * @return
//     */
//    public static <O, I> Collection<O> collect(I[] array, Transformer<I, O> transformer) {
//        return IteratorTools.collect(arrayIterator(array), transformer);
//    }
//
//    /**
//     * Select all objects from the <code>inputCollection</code> which are matched by the passed {@link Predicate} and put them in a new list instance.
//     * The new list is of type {@link ArrayList}.
//     * 
//     * @param <A> the type of the elements in the collection
//     * @param inputCollection the collection to process
//     * @param predicate the filter predicate
//     * @return a list which contains the matching elements
//     */
//    public static <A> List<A> select(Collection<A> inputCollection, Predicate<A> predicate) {
//        return select(inputCollection, predicate, new ArrayListFactory<A>());
//    }
//
//    /**
//     * Select all objects from the <code>inputCollection</code> which are matched by the passed {@link Predicate} and put them in the result list,
//     * created by the passed {@link ListFactory}.
//     * 
//     * @param <A> the type of the elements in the collection
//     * @param inputCollection the collection to process
//     * @param predicate the filter predicate
//     * @param listFactory a factory which created new list instances
//     * @return a list which contains the matching elements
//     */
//    public static <A> List<A> select(Collection<A> inputCollection, Predicate<A> predicate, ListFactory<A> listFactory) {
//        List<A> answer = listFactory.create();
//        select(inputCollection, predicate, answer);
//        return answer;
//    }
//
//    /**
//     * Selects all entries matching the predicate and returns then to a new collection created by a ArrayListFactory. 
//     * 
//     * @param <A> The type of the elements
//     * @param srcArray the source
//     * @param predicate the predicate 
//     * @return a collection of A matching the predicate
//     */
//    public static <A> Collection<A> select(A[] srcArray, Predicate<A> predicate) {
//        return select(srcArray, predicate, new ArrayListFactory<A>());
//    }
//
//    /**
//     * Selects all entries matching the predicate and returns then to a new collection created by the collectionFactory. 
//     * 
//     * @param <A> the type the elements
//     * @param srcArray the source
//     * @param predicate the predicate to select
//     * @param collectionFactory the factory for the returned collection
//     * @return a collection of A matching the predicate
//     */
//    public static <A> Collection<A> select(A[] srcArray, Predicate<A> predicate, CollectionFactory<?, A> collectionFactory) {
//        if (collectionFactory == null)
//            throw new IllegalArgumentException("The collectionFactory must not be null.");
//        Collection<A> result = collectionFactory.create();
//        if (srcArray == null)
//            return result;
//        for (A element : srcArray) {
//            if (predicate.evaluate(element))
//                result.add(element);
//        }
//        return result;
//    }
//
//    /**
//     * Selects all entries matching the predicate and returns then to a new collection created by the collectionFactory.
//     * 
//     * @param <A> type of the elements
//     * @param inputCollection the input collection
//     * @param predicate the predicate
//     * @param outputCollection the collection to put the elements in
//     */
//    public static <A> void select(Collection<A> inputCollection, Predicate<A> predicate, Collection<A> outputCollection) {
//        if (inputCollection == null || predicate == null || outputCollection == null || inputCollection.size() == 0) {
//            return;
//        }
//        IteratorTools.forAllMatchingDo(inputCollection.iterator(), predicate, new AddCollectionClosure<A>(outputCollection));
//    }
//
//    /**
//     * TODO write JavaDoc
//     * 
//     * @param <I>
//     * @param <O>
//     * @param inputCollection
//     * @param transformer
//     * @return
//     */
//    public final static <I, O> Collection<O> transform(Collection<I> inputCollection, Transformer<I, O> transformer) {
//        return transform(inputCollection, transformer, new ArrayList<O>());
//    }
//
//    /**
//     * TODO write JavaDoc
//     * 
//     * @param <I>
//     * @param <O>
//     * @param inputCollection
//     * @param transformer
//     * @param factory
//     * @return
//     */
//    public final static <I, O> Collection<O> transform(Collection<I> inputCollection, Transformer<I, O> transformer, SetFactory<O> factory) {
//        return transform(inputCollection, transformer, factory.create());
//    }
//
//    /**
//     * TODO write JavaDoc
//     * 
//     * @param <I>
//     * @param <O>
//     * @param inputCollection
//     * @param transformer
//     * @param factory
//     * @return
//     */
//    public static <I, O> Collection<O> transform(Collection<I> inputCollection, Transformer<I, O> transformer, ListFactory<O> factory) {
//        return transform(inputCollection, transformer, factory.create());
//    }
//
//    /**
//     * TODO write JavaDoc
//     * 
//     * @param <I>
//     * @param <O>
//     * @param inputCollection
//     * @param transformer
//     * @param resultCollection
//     */
//    public static <I, O> Collection<O> transform(Collection<I> inputCollection, Transformer<I, O> transformer, Collection<O> resultCollection) {
//        forAllDo(inputCollection, transformingAddCollectionClosure(resultCollection, transformer));
//        return resultCollection;
//    }
//
//    /**
//     * TODO write JavaDoc
//     * 
//     * @param <I>
//     * @param <O>
//     * @param sourceArray
//     * @param transformer
//     * @param destArray
//     * @return
//     */
//    @SuppressWarnings("unchecked")
//    public static <I, O> O[] transform(I[] sourceArray, final O[] destArray, final Transformer<I, O> transformer) {
//        if (sourceArray == null || sourceArray.length == 0)
//            return destArray;
//        if (destArray == null)
//            throw new NullPointerException("The destination array must not be null.");
//        if (destArray.length < sourceArray.length)
//            throw new IllegalArgumentException("The destination array is smaller than the source array.");
//        forAllDo(sourceArray, new Closure<I>() {
//            private int i = 0;
//
//            public void execute(I input) {
//                destArray[i] = transformer.transform(input);
//                i = i + 1;
//            }
//        });
//        return destArray;
//    }
//
//    /**
//     * TODO write JavaDoc
//     * 
//     * @param <E>
//     * @param set
//     * @return
//     */
//    public static <E> Set<E> synchronizedSet(Set<E> set) {
//        return new SynchronizedSet<E>(set);
//    }
//
//    /**
//     * TODO write JavaDoc
//     * 
//     * @param <E>
//     * @param set
//     * @param mutex
//     * @return
//     */
//    public static <E> Set<E> synchronizedSet(Set<E> set, Object mutex) {
//        return new SynchronizedSet<E>(set, mutex);
//    }
//
//    /**
//     * TODO write JavaDoc
//     * 
//     * @param <E>
//     * @param set
//     * @return
//     */
//    public static <E> SortedSet<E> synchronizedSortedSet(SortedSet<E> set) {
//        return new SynchronizedSortedSet<E>(set);
//    }
//
//    /**
//     * TODO write JavaDoc
//     * 
//     * @param <E>
//     * @param set
//     * @param mutex
//     * @return
//     */
//    public static <E> SortedSet<E> synchronizedSortedSet(SortedSet<E> set, Object mutex) {
//        return new SynchronizedSortedSet<E>(set, mutex);
//    }
//
//    /**
//     * Factory method for a filtered collection.
//     * 
//     * @param <E> the type of the collection elements
//     * @param collection the collection to wrap
//     * @param predicate the predicate which realizes the filter
//     * @return the wrapped collection
//     */
//    public static <E> Collection<E> filteredCollection(Collection<E> collection, Predicate<E> predicate) {
//        return new FilteredCollection<E>(collection, predicate);
//    }
//
//    /**
//     * TODO write JavaDoc
//     * 
//     * @param <I>
//     * @param <O>
//     * @param collection
//     * @param transformer
//     * @return
//     */
//    public static <I, O> Collection<O> transformingCollection(Collection<I> collection, Transformer<I, O> transformer) {
//        return new TransformingCollection<I, O>(collection, transformer);
//    }
//
//    /**
//     * TODO write JavaDoc
//     * 
//     * @param <I>
//     * @param <O>
//     * @param set
//     * @param transformer
//     * @return
//     */
//    public static <I, O> Set<O> transformingSet(Set<I> set, Transformer<I, O> transformer) {
//        return new TransformingSet<I, O>(set, transformer);
//    }
//
//    /**
//     * TODO write JavaDoc
//     * 
//     * @param <E>
//     * @param a
//     * @param b
//     * @return
//     */
//    public static <E> Collection<E> intersect(final Collection<E> a, final Collection<E> b) {
//        final Collection<E> result = new ArrayList<E>();
//        final CardinalityMap<E> cMapA = cardinalityMap(a);
//        final CardinalityMap<E> cMapB = cardinalityMap(b);
//        Set<E> singles = new HashSet<E>(a);
//        singles.addAll(b);
//        forAllDo(singles, new Closure<E>() {
//            public void execute(E element) {
//                int amount = Math.min(cMapA.get(element), cMapB.get(element));
//                for (int i = 0; i < amount; i++) {
//                    result.add(element);
//                }
//            }
//        });
//        return result;
//    }
//
//    /**
//     * Creates a list from an Array.
//     *  
//     * @param <T> the type of the elememts
//     * @param array the input array
//     * @return the builded list
//     */
//    public static <T> List<T> buildList(T[] array) {
//        return buildList(array, new ArrayList<T>(array.length));
//    }
//
//    /**
//     * Creates a list from an Array.
//     * 
//     * @param <T> the type of the elememts
//     * @param array the input array
//     * @param factory the factory to create the list
//     * @return the builded list
//     */
//    public static <T> List<T> buildList(T[] array, ListFactory<T> factory) {
//        return buildList(array, factory.create());
//    }
//
//    /**
//     * Adds all elemets in the array to the list.
//     * 
//     * @param <T>the type of the elememts
//     * @param array the input array
//     * @param list the list to add to
//     * @return the list
//     */
//    public static <T> List<T> buildList(T[] array, List<T> list) {
//        forAllDo(array, AddCollectionClosure.addCollectionClosure(list));
//        return list;
//    }

    /**
     * Picks the first element of the passed collection and returns it. If collection is empty <code>null</code> is returned.
     * 
     * @param <E> the type of the elements in the array
     * @param collection the collection to process
     * @return the first element of the collection if there is one, otherwise <code>null</code>
     */
    public static <E> E getFirstElement(Collection<E> collection) {
        if (collection.isEmpty())
            return null;
        return collection.iterator().next();
    }

    /**
     * <p>
     * Returns the last elements of the passed collection. The last element is found by iterating (!) the entire collection.
     * </p>
     * <p>
     * <b>The use of this procedure may introduce a major performance hit if used on huge collection. Be careful and use this method with caution.</b>
     * </p>
     * <p>
     * If the collection is empty <code>null</code> is returned.
     * </p>
     * 
     * @param <E> the type of the elements in the array
     * @param collection the collection to process
     * @return the last element of the collection if there is one, otherwise <code>null</code> (IMPORTANT: read method JavaDoc)
     */
    public static <E> E getLastElement(Collection<E> collection) {
        if (collection.isEmpty())
            return null;
        E last = null;
        for (E element : collection) {
            last = element;
        }
        return last;
    }

    /**
     * <p>
     * Retrieves the elements at the position <code>index</code> from the passed collection. The element is found by iterating (!) the entire
     * collection.
     * </p>
     * <p>
     * <b>The use of this procedure may introduce a major performance hit if used on huge collection with high indexes. Be careful and use this method
     * with caution.</b>
     * </p>
     * <p>
     * If the collection is empty or <code>index</code> &gt; <code>collection.size()</code>, <code>null</code> is returned.
     * </p>
     * 
     * @param <E> the type of the elements in the array
     * @param collection the collection to process
     * @param index the index of the element to retrieve
     * @return the element at the position of <code>index</code> of the collection is one, otherwise <code>null</code> (IMPORTANT: read method
     * JavaDoc)
     */
    public static <E> E getElementAt(Collection<E> collection, long index) {
        if (collection.isEmpty())
            return null;
        if (index > collection.size() - 1)
            return null;
        long i = 0;
        for (E element : collection) {
            if (i == index)
                return element;
            i = i + 1;
        }
        return null;
    }
}
