package ru.mirea.task5.opt3;

public class Table extends Furniture {
    private float maxTableLoad;
    private int amountOfLegs;

    public Table() {
        this.maxTableLoad = 11.0f;
        this.amountOfLegs = 4;
    }

    public Table(float maxTableLoad, int countOfLeg) {
        super();
        this.maxTableLoad = maxTableLoad;
        this.amountOfLegs = countOfLeg;
    }

    public Table(String type, float weight, int price, String material, float maxTableLoad, int amountOfLegs) {
        super(type, weight, price, material);
        this.maxTableLoad = maxTableLoad;
        this.amountOfLegs = amountOfLegs;
    }

    public float getMaxTableLoad() {
        return maxTableLoad;
    }

    public void setMaxTableLoad(float maxTableLoad) {
        this.maxTableLoad = maxTableLoad;
    }

    public int getAmountOfLegs() {
        return amountOfLegs;
    }

    public void setAmountOfLegs(int amountOfLegs) {
        this.amountOfLegs = amountOfLegs;
    }

    @Override
    public String toString() {
        return ("Type: " + super.getType()
                + "\nMax table load: "      + maxTableLoad
                + "\nAmount of table-legs: "                 + amountOfLegs
                + "\nMaterial of table: "                           + super.getMaterial()
                + "\nPrice of table: "                                + super.getPrice() + " USD"
                + "\nWeight of table: "                                 + super.getWeight()) + " kg";
    }
}

