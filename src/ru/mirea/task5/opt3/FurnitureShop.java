package ru.mirea.task5.opt3;

public class FurnitureShop {
    public static void main(String[] args) {
        Chair chair1 = new Chair("Kitchen",10,300,"Wood",1200, 3);
        Chair chair2 = new Chair( "Bar", 15,1300,"Metal",5200, 4 );
        Table table1 = new Table("Hallway",50,1500,"Wood",4200, 4);
        Table table2 = new Table("Kitchen", 100,3000,"Metal",15200, 8 );

        System.out.println("In our shop we have: ");
        System.out.println("******Tables******\n");
        System.out.println(table1);
        System.out.println();
        System.out.println(table2);
        System.out.println("******Chairs******\n");
        System.out.println(chair1);
        System.out.println();
        System.out.println(chair2);
    }
}
