package ru.mirea.task5.exe1;

public class TestDish {

    public static void main(String[] args) {
        Dish plate = new Plate(1.8, "square", "white");
        Dish jug = new Jug(2.1, "circle", "red");
        Dish saucer = new Saucer(1.5, "circle", "blue");

        plate.setDishWeight(2.5); plate.setDishShape("circle");
        saucer.setDishWeight(2.6);

        System.out.println( "\n" + "Plate" + "\t" + plate.getDishShape() + " " + plate.getDishWeight());
        System.out.println("Jug" + "\t" + jug.getDishShape() + " " + jug.getDishWeight());
        System.out.println("Saucer" + "\t" + saucer.getDishShape() + " " + saucer.getDishWeight());


    }
}
