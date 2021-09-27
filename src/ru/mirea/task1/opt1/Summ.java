package ru.mirea.task1.opt1;

public class Summ {
        public static int sumWhile(int [] a) {
            int res = 0;
            int i = 0;
            while (i < a.length) {
                res += a[i];
                i++;
            }
            return res;
        }
            public static int sumFor ( int[] a){
                int res = 0;
                int i = 0;
                for (i = 0; i < a.length; i++) {
                    res += a[i];
                }
                return res;
            }
            public static int sumDoWhile ( int[] a){
                int res = 0;
                int i = 0;
                do {
                    res += a[i];
                    i++;
                } while (i < a.length);
                return res;
            }
        public static void main(String[] args)
        {

            int [] a = {2,1};
            System.out.println(sumWhile(a));
            System.out.println(sumDoWhile(a));
            System.out.println(sumFor(a));
    }
}
