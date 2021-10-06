package tasks.task4;

public class AuthorTest
{
    public static void main(String args[])
    {
        Author author = new Author("J. K. Rowling", "jkrowling@yandex.ru", 'F');
        System.out.println(author.toString());
        System.out.println(author.getName() + " " + author.getEmail() + " " + author.getGender());
        author.setEmail("jkrowling@yahoo.com");
        System.out.println(author.toString());
    }
}
