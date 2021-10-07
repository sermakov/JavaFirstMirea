public class Circle
{
    double radius;
    String color;
    public Circle(){}

    public Circle(double radius, String color)
    {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public double getArea()
    {
        return Math.PI * radius * radius;
    }

    public double getCircumference()
    {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle:" +
                "\nРадиус равен " + radius +
                "\nЦвет: " + color +
                "\nПлощадь окружности: " + getArea() +
                "\nДлина окружности: " + getCircumference();

    }
}
