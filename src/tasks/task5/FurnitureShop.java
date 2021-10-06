package tasks.task5;

public class FurnitureShop
{
    public FurnitureShop(int size)
    {
        A = new Furniture[size];
    }

    public void add(int slot, String type, int price, int space)
    {
        switch(type)
        {
            case "Chair":
            {
                A[slot] = new Chair(price, space);
                break;
            }
            case "Table":
            {
                A[slot] = new Table(price, space);
                break;
            }
            case "Sofa":
            {
                A[slot] = new Sofa(price, space);
                break;
            }
        }
    }

    public void buy(int slot)
    {
        System.out.println("Thank you for purchasing " + A[slot]);
        money = money + A[slot].price;
    }

    public void printMoney()
    {
        System.out.println("$" + money);
    }

    public static void main(String[] args)
    {
        FurnitureShop FS = new FurnitureShop(3);
        FS.add(0, "Chair", 10, 1);
        FS.add(1, "Table", 20, 4);
        FS.add(2, "Sofa", 30, 2);
        FS.printMoney();
        FS.buy(0);
        FS.buy(1);
        FS.buy(2);
        FS.printMoney();
    }

    private Furniture A[];
    private int money = 0;
}
