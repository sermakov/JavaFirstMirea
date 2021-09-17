package ru.mirea.task3.lab2.human;

public class HumanTest {
    public static void test() {
        Human h1 = new Human("Даня");
        Human h2 = new Human("Сергей");
        h2.lookAtHuman(h1);
        h2.step();
        h1.touch(h2);
        h2.die();
    }
}
