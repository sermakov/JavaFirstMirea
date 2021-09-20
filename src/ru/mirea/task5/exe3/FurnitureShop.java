package ru.mirea.task5.exe3;
import java.util.Scanner;

public class FurnitureShop {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Sofa sofa = new Sofa( 1.5, "sofa", 100000, "leather");
        Table table = new Table(3, "table", 20000, "wood");
        Chaire chaire = new Chaire(0.6, "chaire", 1000, "velvet");

        System.out.println("slot 1" + sofa.toString() + '\n');
        System.out.println("slot 2" + table.toString() + '\n');
        System.out.println("slot 3" + chaire.toString() + '\n');

        System.out.println("Choose slot: ");
        int N = in.nextInt();

        switch(N){
            case 1: {
                System.out.println("You choose slot 1. Price: " + sofa.getPrice());
                return;
            }
            case 2: {
                System.out.println("You choose slot 2. Price: " + table.getPrice());
                return;
            }
            case 3: {
                System.out.println("You choose slot 3. Price: " + table.getPrice());
                return;
            }
        }

    }
}
