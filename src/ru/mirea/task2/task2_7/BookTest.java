package ru.mirea.task2.task2_7;

public class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book("Salinger 's Novel",
                "Over the Catcher in the Rye",
                "Novel",
                1951);
        Book book2 = new Book(
                "Daniel Keyes",
                "Flowers for Algernon",
                "Story",
                1959
        );
        Book book3 = new Book(
                "Stanislav Lem",
                "Solaris",
                "Philosophical novel",
                1961
        );
        Book book4 = new Book(
                "Jack London",
                "White Fang",
                "Story",
                1906
        );
        BookShelf bookShelf = new BookShelf(new Book[]{book1, book2, book3, book4}, 4);
        System.out.println(bookShelf.getBookWithEarliestPublicationYear());
        System.out.println(bookShelf.getBookWithLatestPublicationYear());
        System.out.println(bookShelf);
        bookShelf.sortByPublicationYear();
        System.out.println(bookShelf);

    }
}
