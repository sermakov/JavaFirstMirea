package ru.mirea.task30;

public class main {
    public static void main(String[] args) {
        new User("Евгений", 35, Sex.Male);
        new User("Марина", 34, Sex.Female);
        new User("Алина", 7, Sex.Female);


        System.out.println("Все пользователи:");
        User.getAllUsers().forEach(System.out::println);
        System.out.println("Все пользователи: Male");
        User.getAllUsers(Sex.Male).forEach(System.out::println);
        System.out.println("Все пользователи: Female");
        User.getAllUsers(Sex.Female).forEach(System.out::println);
        System.out.println("================================================");
        System.out.println("       всех пользователей: " + User.getHowManyUsers());
        System.out.println("  всех пользователей Male: " + User.getHowManyUsers(Sex.Male));
        System.out.println("всех пользователей Female: " + User.getHowManyUsers(Sex.Female));
        System.out.println("================================================");
        System.out.println("       общий возраст всех пользователей: " + User.getAllAgeUsers());
        System.out.println("  общий возраст всех пользователей Male: " + User.getAllAgeUsers(Sex.Male));
        System.out.println("общий возраст всех пользователей Female: " + User.getAllAgeUsers(Sex.Female));
        System.out.println("================================================");
        System.out.println("       средний возраст всех пользователей: " + User.getAverageAgeOfAllUsers());
        System.out.println("  средний возраст всех пользователей Male: " + User.getAverageAgeOfAllUsers(Sex.Male));
        System.out.println("средний возраст всех пользователей Female: " + User.getAverageAgeOfAllUsers(Sex.Female));
        System.out.println("================================================");
    }
}
