package ru.mirea.task4.exe1;

public class TestAuthor {

    public static void main(String[] args) {
        Author author1 = new Author("Pushkin", "none", 'm');
        System.out.println(author1);
        System.out.println("Old email: " + author1.getEmail());
        author1.setEmail("alexander@mail.com");
        System.out.println("New email: " + author1.getEmail());
        System.out.println(author1);
    }
}
