package ru.mirea.task5.lab3.dog;

import ru.mirea.task5.lab3.Furniture.Cabinet;
import ru.mirea.task5.lab3.Furniture.FurnitureShop;
import ru.mirea.task5.lab3.Furniture.Sofa;

public class DogTest {
    public static void test() {
        FlyingDog flyingDog = new FlyingDog(5, 300000000);
        System.out.println(flyingDog);
        flyingDog.setFlightSpeed(flyingDog.getFlightSpeed()/2);
        System.out.println(flyingDog);
        SpiderDog spiderDog = new SpiderDog(15, 100);
        System.out.println(spiderDog);
        spiderDog.setAmountOfWeb(spiderDog.getAmountOfWeb()/2);
        System.out.println(spiderDog);
    }
}
