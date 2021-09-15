package ru.mirea.task2.opt2;

public class Ball {
    private Double weight;
    private String color;
    private Double x, y;

    Ball(Double weight, String color)   {
        this.setWeight(weight);
        this.setColor(color);
        this.x = 0.0;
        this.y = 0.0;
    }

    Ball(Double weight) {
        this(weight, "Blue");
    }

    Ball(String color)  {
        this(0.45, color);
    }

    Ball()  {
        this(0.26, "Yellow and White");
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        if (weight >= 0) {
            this.weight = weight;
            return;
        }
        this.weight = 0.45;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color != "") {
            this.color = color;
            return;
        }
        this.color = "Blue";
    }

    public void setLocation(Double X, Double Y) {
        this.x = X;
        this.y = Y;
    }

    public void motion(Double X, Double Y)
    {
        this.x+=X;
        this.y+=Y;
    }

    public Double getDistanceFromCenter()
    {
        return (Math.pow(Math.pow(this.y, 2) + Math.pow(this.x, 2), 0.5));
    }

    @Override
    public String toString()    {
        return("Вес вашего мяча: " + this.weight.toString() + "кг\nЦвет вашего мяча: " + this.color.toString() +
                "\nРасстояние от центра поля: " + this.getDistanceFromCenter().toString() +
                "м\nТекущие координаты:\nX = " + this.x.toString() + "\nY = " + this.y.toString());
    }
}
