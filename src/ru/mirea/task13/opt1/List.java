package ru.mirea.task13.opt1;
import java.util.ArrayList;
public class List {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Dog");
        list.add("Cat");
        list.add("Rabbit");
        list.add(1,"Bear");
        System.out.printf("В списке %d элемента(ов) \n", list.size());
        for(String s : list)
        {
            System.out.println(s);
        }
        if (list.contains("Cat")){
            System.out.println("Список содержит Cat");
        }
        if (list.contains("Monkey")){
            System.out.println("Список содержит Monkey");
        }
        else{
            System.out.println("Список не содержит Monkey");
        }
        list.remove("Cat");
        System.out.printf("В списке %d элемента(ов) \n", list.size());
        for(String s : list)
        {
            System.out.println(s);
        }
        System.out.println(list.contains("Rabbit"));
        System.out.println(list.contains("Hello"));
    }
}
