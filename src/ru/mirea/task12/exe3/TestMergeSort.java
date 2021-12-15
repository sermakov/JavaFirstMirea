package ru.mirea.task12.exe3;

public class TestMergeSort {
    public static void main(String[] args) {
        int size = 5;
        StudentsArray array1  = new StudentsArray(size);
        StudentsArray array2 = new StudentsArray(size);

        array1.init(); array2.init();

        array1.print();
        System.out.println();
        array2.print();
        System.out.println();

        MergeSort sort = new MergeSort();
        StudentsArray array3 = new StudentsArray(array1.getSize() + array2.getSize());
        array3 = sort.mergeSort2Lists(array1, array2);
        array3.print();

    }
}
