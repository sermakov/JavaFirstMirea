package tasks.task4;

public class Author
{
    private String name, email;
    private char gender;

    public Author(String name, String email, char gender)
    {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName()
    {
        return(name);
    }

    public String getEmail()
    {
        return(email);
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public char getGender()
    {
        return(gender);
    }

    public String toString()
    {
        String gen = "";
        switch(gender)
        {
            case 'M': {gen = "(m)"; break;}
            case 'F': {gen = "(ms)"; break;}
            case 'U': {gen = "(?)"; break;}
        }
        return(name + gen + " at " + email);
    }
}