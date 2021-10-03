package ru.mirea.task5.opt3;

public abstract class Furniture {
    private String type;
    private float weight;
    private int price;
    private String material;

    public Furniture() {
        this.type = "Kitchen";
        this.weight = 11f;
        this.price = 100;
        this.material = "Wood";
    }

    public Furniture(String type, float weight, int cost, String materialType) {
        this.type = type;
        this.weight = weight;
        this.price = cost;
        this.material = materialType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int cost) {
        this.price = cost;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public abstract String toString();
}
