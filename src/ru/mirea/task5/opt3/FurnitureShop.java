package ru.mirea.task5.opt3;

public class FurnitureShop {
    public static void main(String[] args)  {
        Sofa sofaForKitchen = new Sofa(3, false);
        Sofa sofaForLivingRoom = new Sofa(4, true);
        Closet closetForBedroom = new Closet(80.0f, 220,
                "Красное дерево", 5, 1);
        Table tableForOffice = new Table();

        Furniture items[] = {(Furniture)sofaForKitchen, (Furniture)closetForBedroom,
                (Furniture)tableForOffice};
        for (int i = 0; i < items.length; i++)  {
            System.out.println("Тип мебели: " + items[i].getTypeOfFurniture()
                    + ", цена этого типа мебели: " + items[i].getCost());
        }

        System.out.print(items[1]);
    }
}
