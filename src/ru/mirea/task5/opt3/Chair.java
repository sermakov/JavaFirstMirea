package ru.mirea.task5.opt3;

public class Chair extends Furniture {
    private float maxChairLoad;
    private int amountOfLegs;

    public Chair() {
        this.maxChairLoad = 11.0f;
        this.amountOfLegs = 4;
    }

    public Chair(float maxChairLoad, int countOfLeg) {
        super();
        this.maxChairLoad = maxChairLoad;
        this.amountOfLegs = countOfLeg;
    }

    public Chair(String type, float weight, int price, String material, float maxChairLoad, int amountOfLegs) {
        super(type, weight, price, material);
        this.maxChairLoad = maxChairLoad;
        this.amountOfLegs = amountOfLegs;
    }

    public float getChairLoad() {
        return maxChairLoad;
    }

    public void setChairLoad(float maxChairLoad) {
        this.maxChairLoad = maxChairLoad;
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
                + "\nMax chair load: "      + maxChairLoad
                + "\nAmount of chair-legs: "                 + amountOfLegs
                + "\nMaterial of chair: "                           + super.getMaterial()
                + "\nPrice of chair: "                                + super.getPrice() + " USD"
                + "\nWeight of chair: "                                 + super.getWeight()) + " kg";
    }
}
