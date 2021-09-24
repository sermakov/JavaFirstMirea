package ru.mirea.task5.lab3.furniture;

public class Sofa extends Furniture {
    private int pillows = 0;

    public int getPillows() {
        return pillows;
    }

    public void setPillows(int pillows) {
        this.pillows = pillows;
    }

    public Sofa(String name, float length, float width, float height, float weight, int pillows) {
        super(name, length, width, height, weight);
        this.pillows = pillows;
    }
}
