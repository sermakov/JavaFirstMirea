// Использовать конструктор, переменную экземпляра и метод в перечислении
enum Apple3 {
    // цена яблока каждого сорта
    Jonathan(10), GoldenDel(9), RedDel(12), Winesap(15), Cortland(8);

    // Переменная экземпляра price, служит для хранения цены
    private int price;

    // Конструктор Apple3(), ему передается цена
    // (аргументы конструктору передаются в скобках после каждой перечисляемой константы)
    Apple3(int p) {
        price = p;
    }

    // Метод getPrice(), возвращающий значение цены
    int getPrice() {
        return price;
    }
}

class EnumDemo3 {
    public static void main(String[] args) {

        // У каждой константы перечислимого типа имеется своя копия переменной экземпляра price,
        // поэтому для получения цены на определенный сорт яблок достаточно вызвать метод getPrice()
        System.out.println("Яблoкo сорта " + Apple3.valueOf("Winesap") + " стоит " + Apple3.valueOf("Winesap").getPrice());

        // вывести цены на все сорта яблок
        System.out.println("\nЦeны на все сорта яблок:");
        for (Apple3 a : Apple3.values()) {
            System.out.println(a + " стоит " + a.getPrice());
        }
    }
}