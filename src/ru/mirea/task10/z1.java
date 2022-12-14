public class z1
{
    public static void z1(int n, int k, int i, int cur)
    {
        if (i == n)
            return;
        if (cur == k)
            z1(n, 0, i, cur + 1);
        else
        {
            System.out.print(cur + " ");
            z1(n, k + 1, i + 1, cur);
        }
    }

    public static void main(String[] args)
    {
        z1(10, 0, 0, 1);
    }
}
