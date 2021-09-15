package ru.mirea.task4.opt1;

public class Author {
    private String name;
    private String email;
    private char gender;

    Author (String name, String email, char gender) {
        this.name = name;
        this.email = email;
        switch(gender)  {
            case ('M'):
                this.gender = gender;
                break;
            case ('F'):
                this.gender = gender;
                break;
            default:
                this.gender = 'U';
                break;
        }
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString()    {
        return (this.name + "(" + this.gender + ") at " + this.email);
    }
}
