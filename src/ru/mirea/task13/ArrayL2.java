import java.util.LinkedList;

public class ArrayL2 {
    public static void main(String[] args) {
        LinkedList<String> states = new LinkedList<String>();

        states.add("Apple");
        states.add("Google");
        states.addLast("Microsoft");
        states.addFirst("Samsung");
        states.add(1, "Sony");

        System.out.printf("В списке %d элементов \n", states.size());
        System.out.println(states.get(1));
        states.set(1, "LG");

        for(String state : states) {
            System.out.println(state);
        }

        if(states.contains("Apple")) {
            System.out.println("Список содержит IT-компанию Apple");
        }

        states.remove("Apple");
        states.removeFirst();
        states.removeLast();

        LinkedList<Person> people = new LinkedList<Person>();
        people.add(new Person("Mike"));
        people.addFirst(new Person("Tom"));
        people.addLast(new Person("Nick"));
        people.remove(1);

        for(Person p : people) {
            System.out.println(p.getName());
        }
        Person first = people.getFirst();
        System.out.println(first.getName());
    }
}

class Person {
    private String name;
    public Person(String value) {
        name = value;
    }
    String getName() {
        return name;
    }
}

