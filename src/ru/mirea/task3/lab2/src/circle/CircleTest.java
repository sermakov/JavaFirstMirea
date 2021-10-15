package circle;

public class CircleTest {
    public static void test() {
        Circle c = new Circle(5);
        System.out.println(c);
        c.setRadius(c.getRadius()+1);
        System.out.println(c);
    }
}
