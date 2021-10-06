package tasks.task8;

public abstract class Shape
{
    public Shape(java.awt.Color color, int x, int y)
    {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public String getShape()
    {
        String s1 = "";
        String s2 = "" + this.getClass();
        int n = s2.length();
        for (int i = 18; i < n; i++)
            s1 = s1 + s2.charAt(i);
        return(s1);
    }

    public java.awt.Color color;
    public int x;
    public int y;
}
