package edu.isu.cs.cs3308.structures.impl;

import edu.isu.cs.cs3308.structures.RedBlueDoubleStack;

/**
 * @param <E> Datatype to use with RedBlueDoubleStackImpl
 * @author Steve Coburn
 */

public class RedBlueDoubleStackImpl<E> implements RedBlueDoubleStack<E> {
    private LinkedDeque DQ;
    private int RedSize;
    private int BlueSize;

    public RedBlueDoubleStackImpl() {
        DQ = new LinkedDeque<>();
        BlueSize = RedSize = 0;
    }

    @Override
    public void pushRed(E element) {
        if (element != null) {
            DQ.offerFirst(element);
            RedSize++;
        }
    }

    @Override
    public void pushBlue(E element) {
        if (element != null) {
            DQ.offer(element);
            BlueSize++;
        }
    }

    @Override
    public E popRed() {
        RedSize--;
        return (E) DQ.poll();
    }

    @Override
    public E popBlue() {
        BlueSize--;
        return (E) DQ.pollLast();
    }

    @Override
    public E peekRed() {
        return (E)DQ.peek();
    }

    @Override
    public E peekBlue() {
        return (E)DQ.peekLast();
    }

    @Override
    public int sizeBlue() {
        return BlueSize;
    }

    @Override
    public int sizeRed() {
        return RedSize;
    }

    @Override
    public boolean isBlueEmpty() {
        if (BlueSize == 0) return true;
        return false;
    }

    @Override
    public boolean isRedEmpty() {
        if (RedSize == 0) return true;
        return false;
    }
}
