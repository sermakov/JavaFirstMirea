package ru.mirea.task13.opt3;

public class MyCollection {
    public static class MyArrayList<T> {
        private final int INIT_SIZE = 16;
        private final int CUT_RATE = 4;
        private Object[] array = new Object[INIT_SIZE];
        private int pointer = 0;

        public void add(T item) {
            if(pointer == array.length-1)
                resize(array.length*2);
            array[pointer++] = item;
        }

        public T get(int index) {
            return (T) array[index];
        }
        public void remove(int index) {
            for (int i = index; i<pointer; i++)
                array[i] = array[i+1];
            array[pointer] = null;
            pointer--;
            if (array.length > INIT_SIZE && pointer < array.length / CUT_RATE)
                resize(array.length/2);
        }
        public int size() {
            return pointer;
        }
        private void resize(int newLength) {
            Object[] newArray = new Object[newLength];
            System.arraycopy(array, 0, newArray, 0, pointer);
            array = newArray;
        }
    }
    public static void main(String[] args){
        MyArrayList<String> my = new MyArrayList<String>();
        my.add("GG!");
        my.add("NT");
        my.add("GH");
        my.add("BB");
        my.remove(0);
        my.remove(3);
        System.out.printf("В списке %d элемента(ов) \n", my.size());
        for(int i = 0; i< my.size(); i++) {
            System.out.println(my.get(i));
        }
    }
}
