package tasks.task5;

public class Fork extends Dish
{
    public Fork(int s, double l)
    {
        sharpness = s;
        length = l;
    }
    public void setSharpness(int sharpness){
        this.sharpness = sharpness;
    }
    public int getSharpness()
    {
        return(sharpness);
    }
    public double getLength(){
        return(length);
    }
    public void setLength(double length){
        this.length = length;
    }
}