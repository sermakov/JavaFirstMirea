package tasks.task10;

public class Task3
{
    public static void row(int a, int b)
    {
        System.out.print(a + " ");
        if (a == b)
            return;
        if (a > b)
            row(a - 1, b);
        if (a < b)
            row(a + 1, b);
    }

    public static void main(String[] args)
    {
        row(11, 1);
    }
}