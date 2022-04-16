import java.util.ArrayList;
import java.util.List;

public class Metro {
    private List<String> list = new ArrayList();
    public void addElement(String element){
        list.add(element);
    }
    public void PrintList(boolean flag){
        if (flag) {
            for (int i = 0; i < list.size(); i++)
                if (i % 2 == 0)
                    System.out.println(list.get(i));
        } else {
            for (int i = 0; i < list.size(); i++)
                if (i % 2 != 0)
                    System.out.println(list.get(i));
        }
    }
    public static void main(String[] args) {
        Metro metro = new Metro();
        metro.addElement("Красная");
        metro.addElement("Салатовая");
        metro.addElement("Серая");
        metro.addElement("Желтая");
        metro.addElement("Коричневая");
        metro.addElement("Оранжевая");
        metro.addElement("Фиолетовая");
        metro.addElement("Розовая");
        metro.addElement("Бирюзовая");
        metro.addElement("Синяя");


        System.out.println("Четные элементы списка: ");
        metro.PrintList(true);
        System.out.println(" ");
        System.out.println("Нечетные элементы списка: ");
        metro.PrintList(false);
    }
}