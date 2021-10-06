package tasks.task5;

public class DishTest
{
    public static void main(String[] args)
    {
        Plate P = new Plate(10);
        Spoon S = new Spoon(1, 5);
        Fork F = new Fork(5, 5);
        System.out.println("P: radius = " + P.getRadius() + ", area = " + P.getArea());
        System.out.println("S: tip radius = " + P.getRadius() + ", tip area = " + S.getArea() + ", length = " + S.getLength());
        System.out.println("F: sharpness = " + F.getSharpness() + ", length = " + S.getLength());
    }
}
