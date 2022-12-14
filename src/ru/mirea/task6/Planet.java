package ru.mirea.task6;
public abstract class Planet extends PlanetPoint
{
    private String color;

    public Planet(int ros, double radius, String color)
    {
        super(ros, radius);
        this.ros = ros;
        this.radius = radius;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "color='" + color + '\'' +
                '}';
    }

    @Override
    public void moveDown() {}

    @Override
    public void moveLeft() {}

    @Override
    public void moveRight() {}

    @Override
    public void moveUp() {}
}
