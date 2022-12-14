package ru.mirea.task7.exe1;

public class Square extends Rectangle{
    protected double side;
    Square(){
        this.width = this.length = this.side = 0;
        this.color = "";
        this.filled = false;
    }

    Square(double side){
        this.width = this.length = this.side = side;
        this.color = "";
        this.filled = true;
    }

    Square(double side, String color, boolean filled){
        this.width = this.length = this.side = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.width = this.length = this.side = side;
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
