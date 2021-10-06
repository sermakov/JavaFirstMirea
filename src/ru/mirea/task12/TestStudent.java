package ru.mirea.task12;

import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args){
        String Name;
        int ID;
        int Score;
        System.out.print("Input number of Student: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student listOfStudent[] = new Student[n];
        for (int i=0; i < n; i++){
            System.out.print("Input Full Name: ");
            Name = sc.next();
            System.out.print("Input Student ID: ");
            ID = sc.nextInt();
            System.out.print("InputScore: ");
            Score = sc.nextInt();
            listOfStudent[i] = new Student(Name,ID,Score);
            System.out.println("*********");
        }
        for (int i=0; i < n; i++){
            System.out.println(listOfStudent[i]);
        }
        InsertingSort s1= new InsertingSort();
        s1.InsertingSort(listOfStudent);
        System.out.println("After Insert Sorting\n");
        for (int i=0; i < n; i++){
            System.out.println(listOfStudent[i]);
        }
    }
}
