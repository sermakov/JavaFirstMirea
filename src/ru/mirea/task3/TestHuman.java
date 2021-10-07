public class TestHuman
{

    public static void main(String[] args)
    {
        Human Kate = new Human();
        Human.Head head = Kate.new Head("Русый", "Округлая", "Зелёный");
        Human.Hand hand = Kate.new Hand(10, true, "Розовый");
        Human.Leg leg = Kate.new Leg(10,false,"Синий");

        head.getHead();
        hand.getHand();
        leg.getLeg();
    }
    
}
