package tasks.task3;

public class CircleTest
{
    public static void main(String[] args)
    {
        Circle C1 = new Circle(1/Math.sqrt(Math.PI));
        Circle C2 = new Circle(0);
        C2.setRadius(1/(2 * Math.PI));
        System.out.println(C2.getRadius());
        System.out.println(C1.getArea());
        System.out.println(C2.getCircumference());
    }
}