package ru.mirea.task5.lab3.dish;

public class DishTest {
    public static void test() {
        Dish dish = new Fork("metall", "fork", 50);
        System.out.println(dish.toString());
        dish.setPrice(70);
        System.out.println(dish.toString());

        System.out.println();

        dish = new Plate("porcelain", "plate", 200);
        System.out.println(dish.toString());
        dish.setPrice(250);
        System.out.println(dish.toString());

        System.out.println();

        dish = new Spoon("silver", "spoon", 45);
        System.out.println(dish.toString());
        dish.setPrice(75);
        System.out.println(dish.toString());
   }
}

