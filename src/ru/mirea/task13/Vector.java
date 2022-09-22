package ru.mirea.task13;

import java.util.Collection;
import java.util.Iterator;

public class Vector<E> implements Collection
{
    public Vector()
    {
        A = new Object[0];
        capacity = 0;
    }

    public int size()
    {
        return(capacity);
    }

    public boolean isEmpty()
    {
        if (capacity > 0)
            return false;
        return true;
    }

    public Object[] toArray()
    {
        return(A);
    }

    public boolean add(Object o)
    {
        Object[] B = new Object[capacity + 1];
        for (int i = 0; i < capacity; i++)
            B[i] = A[i];
        B[capacity] = o;
        A = B;
        capacity++;
        return true;
    }

    public boolean add(int index, Object o)
    {
        Object[] B = new Object[capacity + 1];
        for (int i = 0; i < index; i++)
            B[i] = A[i];
        B[index] = o;
        index++;
        capacity++;
        for (int i = index; i < capacity; i++)
            B[i] = A[i - 1];
        A = B;
        return true;
    }

    public boolean remove(int index) {
        Object[] B = new Object[capacity - 1];
        for (int i = 0; i < index; i++)
            B[i] = A[i];
        index++;
        for (int i = index; i < capacity; i++)
            B[i - 1] = A[i];
        A = B;
        capacity--;
        return true;
    }

    public E get(int index)
    {
        return((E)A[index]);
    }

    public void clear()
    {
        A = new Object[0];
        capacity = 0;
    }

    public boolean remove(Object o){
        return false;
    }

    public boolean addAll(Collection c) {
        return false;
    }

    public boolean retainAll(Collection c) {
        return false;
    }

    public boolean removeAll(Collection c) {
        return false;
    }

    public boolean containsAll(Collection c) {
        return false;
    }

    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    public boolean contains(Object o) {
        return false;
    }

    public Iterator iterator() {
        return null;
    }

    private Object[] A;
    private int capacity;
}
