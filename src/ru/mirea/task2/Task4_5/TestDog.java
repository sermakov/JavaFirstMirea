package ru.mirea.task2.Task4_5;

import ru.mirea.task2.Task4_5.Dog;

import java.util.ArrayList;

public class TestDog {
    static ArrayList<Dog> dogs = new ArrayList<Dog>();

    public static void main(String args[]){
        AddDog(new Dog("Чаппи", 5));
        AddDog(new Dog("Бакс", 7));
        AddDog(new Dog("Дозя", 2));

        ShowDogs(dogs);
    }

    public static void AddDog(Dog newDog){
        dogs.add(newDog);
    }

    public static void ShowDogs(ArrayList<Dog> dogs){
        for(Dog dog : dogs)
            System.out.println(dog.toString());
    }
}
