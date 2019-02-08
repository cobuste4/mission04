package edu.isu.cs.cs3308.structures.impl;

import edu.isu.cs.cs3308.structures.Deque;
import edu.isu.cs.cs3308.structures.Queue;

/**
 * @author Steve Coburn
 * @param <E> datatype to use with LinkedDeque
 */
public class LinkedDeque<E> extends LinkedQueue<E> implements Deque<E>  {

    public LinkedDeque() {
        DLL = new DoublyLinkedList<>();
    }

    @Override
    public E peekLast() {
        return DLL.last();
    }

    @Override
    public void offerFirst(E element) {
        if (element != null) {
            DLL.addFirst(element);
        }
    }

    @Override
    public E pollLast() {
        return DLL.removeLast();
    }
}
