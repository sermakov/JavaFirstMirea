package ru.mirea.task28;

public class Main
{
    public static void main(String[] args)
    {
        Auto auto = new Auto();
        Auto.Spoiler spoiler = new Auto.Spoiler();
        auto.spoiler = spoiler;
        auto.wheels.colorWheels("Красные");
        auto.spoiler.changeSpoiler("Красный");
        System.out.println(auto);
    }
}
