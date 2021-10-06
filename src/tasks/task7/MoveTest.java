package tasks.task7;

public class MoveTest
{
    public static void main(String[] args)
    {
        Movable m1 = new MovablePoint(0, 0, 2,1);
        Movable m2 = new MovableCircle(0,0,2,1, 5);
        Movable m3 = new MovableRectangle(0,0,0,0,2,1);
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        m1.moveUp();
        m2.moveUp();
        m3.moveUp();
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
    }
}