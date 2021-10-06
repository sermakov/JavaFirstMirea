package tasks.task2;

import java.lang.*;

public class Dog
{
    private String name;
    private int age;

    public Dog(String n, int a)
    {
        name = n;
        age = a;
    }

    public Dog(String n)
    {
        name = n;
        age = 0;
    }

    public Dog()
    {
        name = "Pup";
        age = 0;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return(age);
    }

    public String getName()
    {
        return(name);
    }

    public String toString()
    {
        return(name + ", age " + age + ", age(human years) " + age*7);
    }

    public void intoHumanAge()
    {
        System.out.println(name + "'s age in human years is " + age*7 + " years");
    }
}