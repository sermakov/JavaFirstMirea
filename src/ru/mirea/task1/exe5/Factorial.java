package ru.mirea.task1.exe5;

public class Factorial {

    public static void main(String[] args) {
        Factorial fact = new Factorial();
        System.out.println(fact.factorial(6));
    }

    public int factorial(int x)
    {
        if (x == 0)
            return 1;
        int result = 1;
        for (int i = 1; i <= x; ++i){
            result *= i;
        }
        return result;
    }

}
