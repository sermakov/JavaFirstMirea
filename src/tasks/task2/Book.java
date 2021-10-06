package tasks.task2;

public class Book
{
    private String name;
    private int pages;

    public Book(String n, int p)
    {
        name = n;
        pages = p;
    }

    public Book()
    {
        name = "Empty";
        pages = 0;
    }

    public void setName(String n)
    {
        name = n;
    }

    public void setPages(int p)
    {
        pages = p;
    }

    public String getName()
    {
        return(name);
    }

    public int getPages()
    {
        return(pages);
    }

    public String toString()
    {
        return(name + ", " + pages + " Pages");
    }

    public Book(Book prequel)
    {
        name = prequel.getName() + "I";
        pages = prequel.getPages() * 2;
    }
}