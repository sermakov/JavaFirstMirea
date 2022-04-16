import java.util.ArrayList;

public class ArrayL1 {
    public static void main(String[] args) {
        ArrayList<String> states = new ArrayList<String>();

        states.add("Apple");
        states.add("Google");
        states.add("Microsoft");
        states.add("Samsung");
        states.add(1, "Sony");

        System.out.println(states.get(1));
        states.set(1, "LG");

        System.out.printf("В списке %d элементов \n", states.size());
        for(String state : states) {
            System.out.println(state);
        }

        if(states.contains("Apple")) {
            System.out.println("Список содержит IT-компанию Apple");
        }

        states.remove("Apple");
        states.remove(0);

        Object[] countries = states.toArray();
        for(Object country : countries) {
            System.out.println(country);
        }
    }
}
