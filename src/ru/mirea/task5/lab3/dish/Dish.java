package ru.mirea.task5.lab3.dish;

abstract class Dish{
    String material;
    String sort;
    int price;

    public Dish(String material, String sort, int price) {
        this.material = material;
        this.sort = sort;
        this.price = price;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "material='" + material + '\'' +
                ", sort='" + sort + '\'' +
                ", price=" + price +
                '}';
    }
}
