package ru.mirea.task5.opt3;

public abstract class Furniture {
    private float weight;
    private int cost;
    private String materialType;

    public Furniture() {
        this(48.0f, 200, "Металл, ЛДСП");
    }

    public Furniture(float weight, int cost, String materialType) {
        this.weight = weight;
        this.cost = cost;
        this.materialType = materialType;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getMaterialType() {
        return materialType;
    }

    public void setMaterialType(String materialType) {
        this.materialType = materialType;
    }

    @Override
    public abstract String toString();
}
