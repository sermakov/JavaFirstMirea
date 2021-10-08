package ru.mirea.task4.prac2;

public class Author {
    private final String name;
    private String email;
    private final char gender;

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

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String toString() {
        return "Author{name="+name+", email="+email+", gender="+gender+"}";
    }
}

class TestAuthor {
    public static void test() {
        Author a = new Author("Евгений", "ebaika@kasha.ru", 'M');
        System.out.println(a.getName()+" "+a.getEmail()+" "+a.getGender());
        a.setEmail("baka@gog.com");
        System.out.println(a);
    }
}