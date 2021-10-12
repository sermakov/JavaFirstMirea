package ru.mirea.task12;

public class Sorting {

    public static void selectionSort (Student[] array) {
        for (int left = 0; left < array.length; left++) {
            Student value = array[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value.getID() < array[i].getID()) {
                    array[i + 1] = array[i];
                } else {
                    break;
                }
            }
            array[i + 1] = value;
        }
    }
}