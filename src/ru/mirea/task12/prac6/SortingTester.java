package ru.mirea.task12.prac6;

import java.util.Comparator;
import java.util.Scanner;

public class SortingTester {
    public static void run() {
        InputList input = new InputList();
        System.out.print("Input count of students: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student listOfStudent[] = new Student[n];
        input.input(listOfStudent, n);



        System.out.println("---Not Sorted---");
        for (int i = 0; i < n;i++) {
            System.out.println(listOfStudent[i]);               //NOT SORTED ARRAY
        }




        System.out.println("---Sorted by ID---");                   //СОРТИРОВКА ПО ID
        Sorting.selectionSort(listOfStudent);
        for (int i = 0; i < n;i++) {
            System.out.println(listOfStudent[i]);
        }



        System.out.println("---Sorted by Score---");
        QuickSort.quickSort(listOfStudent,0,n-1);           //СОРТИРОВКА ПО БАЛЛАМ
        for (int i = 0; i < n;i++) {
            System.out.println(listOfStudent[i]);
        }


        System.out.print("Input count of students: ");      //MERGE
        int n2 = sc.nextInt();
        Student[] listOfStudent2 = new Student[n2];
        input.input(listOfStudent2, n2);

        System.out.println("---MERGED---");
        int mergen = n+n2;
        Student[] mergedList = new Student[mergen];
        System.arraycopy(listOfStudent, 0, mergedList, 0, n);
        System.arraycopy(listOfStudent2, 0, mergedList, n, n2);

        MergeSort.mergeSort(mergedList, mergen);
        for (int i = 0; i < mergen;i++) {
            System.out.println(mergedList[i]);
        }
    }
}