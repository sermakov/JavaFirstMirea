package ru.mirea.task2.task2_6;

public class CircleTest2_6 {
    public static void main(String[] args) {
        Circle2_6 circle1 = new Circle2_6( 4, "Purple");
        System.out.println(circle1.toString());
        circle1.setColor("Black");
        circle1.setRadius(12);
        System.out.println(circle1.toString());
        Circle2_6 circle2 = new Circle2_6( 5, "Yellow");
        System.out.print("Circle2 length and area: ");
        System.out.println(circle2.getLength() + " " + circle2.getArea());
        System.out.println("Circles radiuses: " + circle1.getRadius() + " " + circle2.getRadius());
        if (circle1.compareTo(circle2) > 0) {
            System.out.println("Circle1 is bigger");
        }
        else if (circle1.compareTo(circle2) == 0) {
            System.out.println("Circle1 and Circle2 are equal");
        }
        else {
            System.out.println("Circle2 is bigger");
        }
    }
}
