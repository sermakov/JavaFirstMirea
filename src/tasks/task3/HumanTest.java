package tasks.task3;

public class HumanTest
{
    public static void main(String[] args)
    {
        Human H = new Human(20, 70, 70, 80,80);
        H.head.think();
        System.out.println(H.head.getArea());
        System.out.println(H.head.getVolume());
        H.grow();
        System.out.println(H.head.getArea());
        System.out.println(H.head.getVolume());
        System.out.println(H.leftHand.getLength());
    }
}