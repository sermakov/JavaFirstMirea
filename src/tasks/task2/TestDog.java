package tasks.task2;

import java.util.Scanner;

public class TestDog
{
    public TestDog(int n)
    {
        A = new Dog[n];
    }

    public void addDogs(int n1, int n2)
    {
        Scanner StringIn = new Scanner(System.in);
        Scanner IntIn = new Scanner(System.in);
        int a;
        for (int i = n1; i <= n2; i++)
        {
            System.out.println("Name: ");
            String n = StringIn.nextLine();
            System.out.println("Age: ");
            a = IntIn.nextInt();
            A[i] = new Dog(n, a);
        }
    }

    public static void main(String[] args)
    {
        Scanner IntIn = new Scanner(System.in);
        System.out.println("Size: ");
        int a = IntIn.nextInt();
        TestDog dogArray = new TestDog(a);
        System.out.println("Lower index: ");
        int n1 = IntIn.nextInt();
        System.out.println("Higher index: ");
        int n2 = IntIn.nextInt();
        dogArray.addDogs(n1, n2);
        System.out.println("Lower index: ");
        n1 = IntIn.nextInt();
        System.out.println("Higher index: ");
        n2 = IntIn.nextInt();
        dogArray.addDogs(n1, n2);
        a--;
        for (int i = a; i > -1; i--)
            System.out.println(dogArray.A[i]);
    }

    public Dog[] A;
}
