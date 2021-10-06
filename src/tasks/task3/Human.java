package tasks.task3;

public class Human
{
    public Head head;
    public Hand leftHand;
    public Hand rightHand;
    public Leg leftLeg;
    public Leg rightLeg;

    public Human(double HR, double LHL, double RHL, double LLL, double RLL)
    {
        head = new Head(HR);
        leftHand = new Hand(LHL);
        rightHand = new Hand(RHL);
        leftLeg = new Leg(LLL);
        rightLeg = new Leg(RLL);
    }

    public void grow()
    {
        head.grow();
        leftHand.grow();
        rightHand.grow();
        leftLeg.grow();
        rightLeg.grow();
    }
}