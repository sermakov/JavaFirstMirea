package tasks.task5;

public abstract class Dog
{
    protected String name;
    protected int age;

    public Dog(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    public String getBreed()
    {
        String S1 = "" + this.getClass();
        String S2 = "";
        for (int i = 18; i < S1.length(); i++)
            S2 = S2 + S1.charAt(i);
        return(S2);
    }
    public String toString()
    {
        return("This dog is a " + this.getBreed() + " named " + name + ", age " + age + ".");
    }
}
