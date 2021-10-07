package ru.mirea.task12.prac6;

import java.util.Scanner;

public class InputList {
    public void input(Student[] listOfStudent, int n) {
        String Name;
        int ID;
        int Score;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Input Full Name: ");
            Name = sc.next();
            System.out.print("Input ID(f.e. 0000): ");
            ID = sc.nextInt();
            System.out.print("Input Score: ");
            Score = sc.nextInt();
            listOfStudent[i] = new Student(Name, ID, Score);
            System.out.println("----------");
        }
    }
}