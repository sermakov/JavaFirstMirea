package book;

class Book{
    private String name;
    private String author;
    private int year;
    public Book(String p_name, String p_author, int p_year){
        name=p_name;
        author=p_author;
        year=p_year;
    }
    public void setName(String newName){
        this.name=newName;
    }
    public String getName(){
        return this.name;
    }
    public void setAuthor(String newAuthor){
        this.author=newAuthor;
    }
    public String getAuthor(){
        return this.author;
    }
    public void setYear(int newYear){
        this.year=newYear;
    }
    public int getYear(){
        return this.year;
    }
}
class BookTest{
    static public void main(){
        Book b1 = new Book("Над пропастью моржи", "Иван Ерохин", 2020);
        System.out.println(b1.getName());
        System.out.println(b1.getAuthor());
        System.out.println(b1.getYear());
        b1.setName("Колобок");
        b1.setAuthor("Вячеслав Сычев");
        b1.setYear(2015);
        System.out.println();
        System.out.println(b1.getName());
        System.out.println(b1.getAuthor());
        System.out.println(b1.getYear());
    }
}