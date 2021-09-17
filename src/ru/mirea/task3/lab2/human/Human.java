package ru.mirea.task3.lab2.human;

public class Human {
    protected Leg rightLeg = null;
    protected Leg leftLeg = null;
    protected Hand rightHand = null;
    protected Hand leftHand = null;
    protected Head head = null;
    protected String name = null;
    public void die() {
        System.out.println(name + " сдох.");
    }
    public void touch(Human h) {
        System.out.println(name+" решил и...");
        rightHand.touch(h);
        leftHand.touch(h);
    }
    public void step() {
        System.out.println(name+" решил пойти.");
        rightLeg.step();
        leftLeg.step();
    }
    public void lookAtHuman(Human h) {
        head.lookAt(h);
    }
    public Human(String name) {
        this.name = name;
        head = new Head();
        rightHand = new Hand();
        leftHand = new Hand();
        rightLeg = new Leg();
        leftLeg = new Leg();
    }
}

class Head {
    protected int IQ = 0;
    public void lookAt(Human human) {
        if (human == null) {
            System.out.println("Тут пусто..");
            return;
        }
        System.out.println("Смотрю на "+human.name);
    }
}

class Leg {
    protected int length = 0;
    public void step() {
        System.out.println("Топ.");
    }
}

class Hand {
    protected int strength = 0;
    protected void touch(Human human) {
        if (human == null) {
            System.out.println("Тут пусто..");
            return;
        }
        System.out.printf("*Тыкнул %s*", human.name);
    }
}