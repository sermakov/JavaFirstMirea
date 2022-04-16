import java.util.ArrayList;

public class ArrayL3 {
    public static void main(String[] args) {
        ArrayList<String> Clothes = new ArrayList<String>();

        Clothes.add("Nike");
        Clothes.add("Adidas");
        Clothes.add("LV");
        Clothes.add("Supreme");
        Clothes.add(1, "Puma");

        for(String ClothesBrand : Clothes) {
            System.out.println(ClothesBrand);
        }
        System.out.printf("В списке %d элементов \n", Clothes.size());

        Clothes.remove("Supreme");
        Clothes.add(2, "Zara");

        for(String ClothesBrand : Clothes) {
            System.out.println(ClothesBrand);
        }
    }
}
