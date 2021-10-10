package ru.mirea.task13.opt2;
import java.util.LinkedList;
public class Linked {
    public static void main(String[] args){
        LinkedList<String> link = new LinkedList<String>();
        link.add("Dog");
        link.add("Cat");
        link.add("Rabbit");
        link.add(1,"Bear");
        String str = new String("Monkey");
        link.add(0,str);
        System.out.printf("В списке %d элемента(ов) \n", link.size());
        for(String s : link)
        {
            System.out.println(s);
        }
        if (link.contains("Cat")){
            System.out.println("Список содержит Cat");
        }
        link.removeFirst();
        link.removeLast();
        for(String s : link)
        {
            System.out.println(s);
        }
        System.out.println("Does this link consist Rabbit? "+link.contains("Rabbit"));
        System.out.println("This link first: "+link.peekFirst());
        System.out.println("This link last: "+link.peekLast());
    }
}
