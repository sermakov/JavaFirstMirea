package book;


public class Book {
    private String name = "";
    public Book(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Book{name="+name+"}";
    }
}

