package ru.mirea.task2;

//№1

public class Author {

    private String name;
    private String email;
    private char gender;

    public Author (String name, String email, char gender)
    {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public String toString() {
        return "name = " + name +", email = " + email + ", gender = " + gender;
    }
}
