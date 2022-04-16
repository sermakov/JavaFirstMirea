package ru.mirea.task4;

public class Autor
{
    private String name;
    private String email;
    private char gender;

    public Autor (String name, String email, char gender)
    {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName (String name)
    {
        return name;
    }

    public String getEmail (String email)
    {
        return email;
    }

    public void setEmail (String email)
    {
        this.email = email;
    }

    public char getGender (char gender)
    {
        return gender;
    }

    @Override
    public String toString()
    {
        return " Autor : name is " + this.name+", email is " + email +", gender is " + this.gender;
    }
}
