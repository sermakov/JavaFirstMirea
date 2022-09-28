package ru.mirea.task2.task2_5;

public class DogTest {
    public static void main(String[] args) {
        DogKennel dogTester = new DogKennel();
        Dog dog1 = new Dog("Kirki", 7);
        Dog dog2 = new Dog("Dreyk", 5);
        Dog dog3 = new Dog("Somi", 10);
        Dog dog4 = new Dog("Levi", 1);
        dogTester.addDogs(dog1, dog2, new Dog("Billi", 3), dog3, dog4);
        System.out.println(dog2.toString());
        System.out.println(dog1.getName() + "'s age in human years is " + dog1.ageInHumanYears());
        System.out.println(dogTester.toString());
    }

}

