import java.util.Arrays;
import java.util.Random;

import static java.lang.Math.abs;

public class Lab1Var5 {

    public static void main(String[] args) {
        test();
    }
    private static int fac(int x) {
        if (x == 0) return 1;
        for (int m = abs(x); m > 0; m--) x*=m;
        return x;
    }

    private static void test() {
        for (int i = -6; i <= 6; i++) {
            System.out.printf("%d! = %d\n", i, fac(i));
        }
    }
}
