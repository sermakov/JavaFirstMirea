package ru.mirea.task5.lab3.Furniture;

public class Cabinet extends Furniture {
    private int shelves = 0;

    public int getShelves() {
        return shelves;
    }

    public void setShelves(int shelves) {
        this.shelves = shelves;
    }


    public Cabinet(String name, float length, float width, float height, float weight, int shelves) {
        super(name, length, width, height, weight);
        this.shelves = shelves;
    }
}
