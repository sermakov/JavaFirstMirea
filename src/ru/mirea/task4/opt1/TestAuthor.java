package ru.mirea.task4.opt1;

public class TestAuthor {
    public static void main(String[] args)  {
        Author author = new Author("Ivan Ivanov",
                "Iv.Ivanov2019@mireamail.ru", 'M');
        author.setEmail("Ivanov.Iv2021@mireamail.ru");
        System.out.print(author);
    }
}