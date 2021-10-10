package book;

public class TestBook {
    public static void test() {
        Book b = new Book("Один дома");
        System.out.println(b);
        b.setName(b.getName()+" 2");
        System.out.println(b);
    }
}
