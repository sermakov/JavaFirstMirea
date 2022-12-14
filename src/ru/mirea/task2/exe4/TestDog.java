package ru.mirea.task2.exe4;
import java.util.Scanner;

public class TestDog {
    Dog[] array;

    public static void main(String[] args){
        TestDog tDog = new TestDog(3);
        tDog.PrintInfo(3);
    }

    public TestDog(int N){
        array = new Dog[N];
        Scanner in = new Scanner(System.in);
        String[] name = new String[N]; int[] years = new int[N];

        for (int i = 0; i < N; ++i){
            System.out.println("Input name\n");
            name[i] = in.nextLine();
        }

        for (int i = 0; i < N; ++i){
            System.out.println("Input years\n");
            years[i] = in.nextInt();
        }

        for (int i = 0; i < N; ++i){
            array[i] = new Dog(name[i], years[i]);
        }
    }

    public void PrintInfo(int N){
        for (int i = 0; i < N; ++i){
            System.out.println("i: " + i + " " + array[i].toString());
            System.out.println("i: " + i + " human: " + array[i].ConvertYears());
        }
    }
}
