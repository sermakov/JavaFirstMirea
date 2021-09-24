package ru.mirea.task6.lab4;

public class Lab4 {
    public static void main(String[] args) {
        test();
    }
    public static void test() {
        class Pig implements Nameable {
            String name = "Свинка Зеппа";
            @Override
            public String getName() {
                return name;
            }
        }
        class Bread implements Priceable {
            public int price = 50;
            @Override
            public int getPrice() {
                return price;
            }
        }
        Pig t1 = new Pig();
        Bread t2 = new Bread();
        System.out.println(t1.getName());
        System.out.println(t2.getPrice());
    }

}

interface Nameable {
    public String getName();
}

interface Priceable {
    public int getPrice();
}