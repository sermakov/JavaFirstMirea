package ru.mirea.task5.exe2;

public class TestDog {
    public static void main(String[] args) {
        Dog dobermann = new Dobermann(32, 0.68, "white");
        Dog pitbull = new Pitbull(26, 0.53, "red");
        Dog rottweiler = new Rottweiler(50, 0.6, "blue");

        System.out.println("Dobermann" + "\t" + dobermann.getDogHeight() + " " + dobermann.getDogWeight());
        System.out.println("Pitbull" + "\t" + pitbull.getDogHeight() + " " + pitbull.getDogWeight());
        System.out.println("Rottweiler" + "\t" + rottweiler.getDogHeight() + " " + rottweiler.getDogWeight());

    }
}
