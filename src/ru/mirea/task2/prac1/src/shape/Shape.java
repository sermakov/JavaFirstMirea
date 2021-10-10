package shape;

public class Shape {
    public int area = 0;
    public Shape(int area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "area=" + area +
                '}';
    }
}

