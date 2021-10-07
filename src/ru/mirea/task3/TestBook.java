public class TestBook
{
    public static void main(String[] args) {
        Book book = new Book("Ф.М.Достоевский", "Братья Карамазовы", 1879, 903, 280913);

        book.getBook();

        book.setTitle("Преступление и наказание");
        book.setYear_of_writing(1866);
        book.setNumbers_of_pages(528);
        book.setWord_count(161246);
        System.out.println("");

        System.out.println("Автор книги: " + book.getAuthor());
        System.out.println("Количество страниц в книге: " + book.getNumbers_of_pages());
    }
}
