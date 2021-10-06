package tasks.task5;

public abstract class Furniture
{
    public Furniture(int price, int space)
    {
        this.price = price;
        this.space = space;
    }

    public String getType()
    {
        String S1 = "" + this.getClass();
        String S2 = "";
        for (int i = 18; i < S1.length(); i++)
            S2 = S2 + S1.charAt(i);
        return(S2);
    }

    public String toString()
    {
        return("a $" + price + " " +  this.getType() + " for " + space + ".");
    }

    public int price;
    public int space;
}
