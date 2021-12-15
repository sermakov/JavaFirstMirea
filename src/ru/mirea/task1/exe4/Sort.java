package ru.mirea.task1.exe4;

public class Sort {
    public static void main(String []args) {
        int[] ar = new int[10];
        for (int i = 0; i < 10; ++i) {
            ar[i] = (int) (Math.random() * 10);
            System.out.println("i: " + i + ' ' + ar[i]);
        }

        int key = 0;
        for (int i = 1; i < 10; i++) {
            key = ar[i];
            int j = i - 1;
            while (j >= 0 && ar[j] > key) {
                ar[j + 1] = ar[j];
                j = j - 1;
            }
            ar[j + 1] = key;
        }

        System.out.println('\n');

        for (int i = 0; i < 10; ++i)
            System.out.println("i: " + i + ' ' + ar[i]);
    }
}
