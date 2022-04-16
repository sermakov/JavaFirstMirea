import java.util.Scanner;

public class CircleTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Circle circle = new Circle(5, "Синий");
        circle.setRadius(4d);
        circle.setColor("Фиолетовый");

        System.out.println(circle);


    }
}
