package ru.mirea.task1;

public class Exercise3 {

    public static void main(String args[]){

         int[] array = new int[]{1,2,3,4,5,6,7,8,9,10};
         int arrayCount = array.length - 1;
         int sum = 0;

         cycleForTest(array, arrayCount, sum);
         cycleWhileTest(array, arrayCount, sum);
         cycleDoWhileTest(array, arrayCount, sum);

    }

    public static void cycleForTest(int[] array, int arrayCount, int sum){
        for (int i = 0; i <= arrayCount; i++)
            sum+=array[i];

        System.out.println(sum);
    }

    public static void cycleWhileTest(int[] array, int arrayCount, int sum){
        while (arrayCount >= 0){
            sum += array[arrayCount];
            arrayCount--;
        }

        System.out.println(sum);
    }

    public static void cycleDoWhileTest(int[] array, int arrayCount, int sum){
        do {
            sum += array[arrayCount];
            arrayCount--;
        }
        while (arrayCount >= 0);

        System.out.println(sum);
    }
}
