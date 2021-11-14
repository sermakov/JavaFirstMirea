package ru.mirea.task14;
import java.util.Scanner;
import java.util.Stack;

public class DrunkGame {
    Stack<Integer> card = new Stack<>();
    public void FirstReading() {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        for (int i = 0; i<5; i++) {
            String number =  sc.next();
            a[i] = Integer.parseInt(number.trim());
        }
        for (int i = 0; i<5; i++) {
            card.push((a[4 - i]));
        }
    }
    public void second(int a, int b) {
        card.add(0,a);
        card.add(0,b);
    }
    public int full() {
        if (!card.empty()) {
            return 1;
        }
        return 0;
    }
    public int topCard() {
        return card.peek();
    }
    public int inNew() {
        return card.pop();
    }
    public static void main(String[] args) {
        DrunkGame dg1 = new DrunkGame();
        DrunkGame dg2 = new DrunkGame();
        System.out.print("Значения для первого игрока: ");
        dg1.FirstReading();
        System.out.print("Значения для второго игрока: ");
        dg2.FirstReading();
        while ((dg1.full()==1)||(dg2.full()==1)) {
            if (dg1.topCard() > dg2.topCard()) {
                int a = dg1.topCard();
                int b = dg2.topCard();
            }
        }
    }
}