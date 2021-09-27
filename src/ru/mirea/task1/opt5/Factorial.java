package ru.mirea.task1.opt5;
import java.lang.*;
import java.util.Scanner;
public class Factorial {
    public static int factorial(int n){
        int sum=1;
        for(int i=1;i<=n;i++) {
            sum *= i;
        }
        return sum;
        }
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Введите целое число: ");
        if(sc.hasNextInt()){
            n = sc.nextInt();
            System.out.println(factorial(n));
        }
            else{
                System.out.println("Вы ввели не целое число");
        }
        }
    }