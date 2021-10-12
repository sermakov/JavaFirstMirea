package ru.mirea.task12;

import java.util.Arrays;
import java.util.Comparator;

public class QuickSort {

    public static void quickSort(Student[] array, int low, int high) {
        Comparator<Student> pcomp = new SortingStudentsByGPA();
        if (array.length == 0)
            return;
        if (low >= high)
            return;
        int middle = low + (high - low) / 2;
        Student opora = array[middle];
        int i = low, j = high;
        while (i <= j) {
            while (pcomp.compare(array[i], opora) == -1) {
                i++;
            }
            while (pcomp.compare(array[j], opora) == 1) {
                j--;
            }
            if (i <= j) {
                Student temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j)
            quickSort(array, low, j);
        if (high > i)
            quickSort(array, i, high);
    }
}
