import java.util.Scanner;

enum Planet1 {
    Меркурий(3.302e23, 2440), Венера(4.869e24, 6052), Земля(5.974e24, 6378), Марс(6.419e23, 3397),
    Юпитер(1.899e27, 71490), Сатурн(5.685e26, 60270), Уран(8.685e25, 25560), Нептун(1.024e26, 24760);

    private double weight, radius, force;

    Planet1(double w, double r) {
        weight = w;
        radius = r;
    }

    public double getForce() {
        force = (6.67408e-11 * weight) / (radius * radius) / 1000000;
        return force;
    }
}

public class Planet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        while (true) {
            System.out.println("Выберите планету: 0) Меркурий 1) Венера 2) Земля 3) Марс 4) Юпитер 5) Сатурн 6) Уран 7) Нептун");
            num = sc.nextInt();
            Planet1 pl;
            if (num < 8) {
                System.out.println("Планета: " + Planet1.values()[num].name());
                System.out.println("Сила притяжения: " + Planet1.values()[num].getForce() + " м/с^2");
            } else System.out.println("Такой планеты нет");
        }
    }
}