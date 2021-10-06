package tasks.task1;

public class main
{
    public static int fact(int x)
    {
        if (x < 0)
            return(-1);
        x++;
        int f = 1;
        for (int i = 2; i < x; i++)
            f = f * i;
        return(f);
    }

    public static void main(String args[])
    {
        System.out.println("Вариант 1");
        int[] A = new int[5];
        int S = 0;
        for (int i = 0; i < 5; i++)
            A[i] = 2*i;
        for (int i = 0; i < 5; i++)
            S = S + A[i];
        System.out.println("for1: "+S);
        S = 0;
        for (int i : A)
            S = S + i;
        System.out.println("for2: "+S);
        S = 0;
        int c = 0;
        while (c < 5)
        {
            S = S + A[c];
            c++;
        }
        System.out.println("while: "+S);
        S = 0;
        c = 0;
        do
        {
            S = S + A[c];
            c++;
        }
        while (c < 5);
        System.out.println("do while: "+S);
        System.out.println("\nВариант 2");
        for (String arg : args)
        {
            System.out.println(arg);
        }
        System.out.println("\nВариант 3");
        for (double i = 1; i < 11; i++)
            System.out.print(1/i + " ");
        System.out.println("\nВариант 4");
        for (int i = 0; i < 5; i++)
        {
            A[i] = (int)(20 * Math.random());
            System.out.print(A[i] + " ");
        }
        System.out.println();
        int swap;
        for (int i = 0; i < 5; i++)
            for (int j = 1; j < 5; j++)
                if (A[j] < A[j - 1])
                {
                    swap = A[j];
                    A[j] = A[j - 1];
                    A[j - 1] = swap;
                }
        for (int i = 0; i < 5; i++)
            System.out.print(A[i] + " ");
        System.out.println("\nВариант 5");
        System.out.println("fact(5) = " + fact(5));
        System.out.println("fact(0) = " + fact(0));
        System.out.println("fact(-5) = " + fact(-5));
    }
}