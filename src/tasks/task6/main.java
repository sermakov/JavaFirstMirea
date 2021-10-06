package tasks.task6;

public class main
{
    public static void main(String[] args)
    {
        Nameable A = new Rock("Rock", 0);
        Priceable B = new Rock("Rock", 0);
        Nameable C = new Brick("Brick", 5);
        Priceable D = new Brick("Brick", 5);
        System.out.println("A: " + A.getName());
        System.out.println("B: " + B.getPrice());
        System.out.println("C: " + C.getName());
        System.out.println("D: " + D.getPrice());
    }
}
