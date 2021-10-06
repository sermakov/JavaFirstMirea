package tasks.task2;

public class Shape
{
    public Shape(String size, String color, String name)
    {
        this.size = size;
        this.color = color;
        this.name = name;
    }

    public String toString()
    {
        return("a " + size + " " + color + " " + name);
    }

    private String size;
    private String color;
    private String name;
}
