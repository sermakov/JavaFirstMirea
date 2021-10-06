package ru.mirea.task13.exe3;

import java.lang.reflect.Array;

public class ArrayB<T> {
   private int size;
   private T[] array;

   public ArrayB(Class<T> c, int size){
       this.size = size;
       array = (T[]) Array.newInstance(c, size);
   }

   public T get(int index){
       return array[index];
   }

   public int getLength(){
       return size;
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

       for (int j = i; j < size - 1; ++j){
           array[j] = array[j + 1];
       }

       array[size - 1] = null;

   }


}
