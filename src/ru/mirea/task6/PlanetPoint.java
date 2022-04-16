package ru.mirea.task6;
public abstract class PlanetPoint implements Nameable
{
    public int ros;
    public double radius;

    public PlanetPoint(int ros, double radius)
    {
        this.ros = this.ros;
        this.radius = this.radius;
    }

    @Override
    public String toString() {
        return "PlanetPoint{" +
                "ros=" + ros +
                ", radius=" + radius +
                '}';
    }

    abstract public void moveUp();
    abstract public void moveDown();
    abstract public void moveLeft();
    abstract public void moveRight();
}
