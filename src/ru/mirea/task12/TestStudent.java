package ru.mirea.task12;

import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args){
        InputList s0 = new InputList();
        String Name;
        int ID;
        int Score;
        System.out.print("Input number of Student: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student listOfStudent[] = new Student[n];
        s0.input(listOfStudent,n);
        Sorting s1= new Sorting();
        QuickSort s2 = new QuickSort();
        MergeSort s3 = new MergeSort();
        System.out.print("What do u want to do?\n");
        System.out.print("1.Sort by ID\n");
        System.out.print("2.Sort by score\n");
        System.out.println("3.Sort by merge\n");
            switch (sc.nextInt()) {
                case 1:
                    System.out.println("---Sorted by ID---");
                    s1.selectionSort(listOfStudent);
                    s0.output(listOfStudent,n);
                    return;
                case 2:
                    System.out.println("---Sorted by Score---");
                    s2.quickSort(listOfStudent,0,n-1);
                    s0.output(listOfStudent,n);
                    return;
                case 3:
                    System.out.println("---Sorted by merge---");
                    System.out.print("Input count of students: ");
                    int n2 = sc.nextInt();
                    Student listOfStudent2[] = new Student[n2];
                    s0.input(listOfStudent2, n2);
                    int mergen = n+n2;
                    Student mergedList[] = new Student[mergen];
                    for (int i = 0; i < n; i++) {
                        mergedList[i] = listOfStudent[i];
                    }
                    for (int i = 0; i < n2; i++) {
                        mergedList[i+n] = listOfStudent2[i];
                    }
                    s3.mergeSort(mergedList,mergen);
                    s0.output(mergedList,mergen);
                    return;
        }
    }
}
