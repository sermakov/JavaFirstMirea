public class Book
{
    String author, title;
    int year_of_writing, numbers_of_pages, word_count;

    public Book(String author, String title, int year_of_writing, int numbers_of_pages, int word_count)
    {
        this.author = author;
        this.title = title;
        this.year_of_writing = year_of_writing;
        this.numbers_of_pages = numbers_of_pages;
        this.word_count = word_count;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear_of_writing() {
        return year_of_writing;
    }

    public void setYear_of_writing(int year_of_writing) {
        this.year_of_writing = year_of_writing;
    }

    public int getNumbers_of_pages() {
        return numbers_of_pages;
    }

    public void setNumbers_of_pages(int numbers_of_pages) {
        this.numbers_of_pages = numbers_of_pages;
    }

    public int getWord_count() {
        return word_count;
    }

    public void setWord_count(int word_count) {
        this.word_count = word_count;
    }

    public void getBook()
    {
        System.out.println("Автор книги: " + author +
                "\nНазвание книги: " + title +
                "\nГод написания: " +  year_of_writing +
                "\nКоличество страниц: " + numbers_of_pages +
                "\nКоличество слов: " + word_count);
    }
}
