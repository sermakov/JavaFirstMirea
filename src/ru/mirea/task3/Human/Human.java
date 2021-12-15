package ru.mirea.task3.Human;

public class Human {
    public static void main(String[] args) {
        Hand hnd = new Hand(67);
        Head hd = new Head("middle");
        Leg lg = new Leg(111);
        lg.setLengthLeg(100);
        System.out.print("Human has hand("+ hnd.getLength() + "sm), leg(" + lg.getLengthLeg() + "sm) and " + hd.getHead() + " head");
    }
}
