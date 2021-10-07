package ru.mirea.task13.lab7.ex3;

import java.lang.reflect.Array;

public class ArrayB<T> {
   private final int size;
   private int actual_size = 0;
   private final T[] array;

   public ArrayB(Class<T> c, int size){
       this.size = size;
       array = (T[]) Array.newInstance(c, size);
   }

   public T get(int index){
       return array[index];
   }

   public int getLength(){
       return actual_size;
   }

   public void add(T item){
       int i = 0;
       while (i < size && array[i] != null){
           ++i;
       }

       if (size == i){
           System.out.println("Not enough space");
           return;
       }
       actual_size = i;

       array[i] = item;
   }

   public void remove(T item){
       int i = 0;
       while (i < size && array[i] != item){
           ++i;
       }

       if (size == i) {
           System.out.println("Item not found");
           return;
       }

       if (size - 1 - i >= 0) System.arraycopy(array, i + 1, array, i, size - 1 - i);

       array[size - 1] = null;
       actual_size--;

   }


}