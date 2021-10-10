import java.util.Arrays;
import java.util.Random;

public class Lab1Var4 {

    public static void main(String[] args) {
        Random rand = new Random();
	    int[] a = new int[rand.nextInt(9)+1];
	    for (int i = 0; i < a.length; i++) {
	        a[i] = (int) (Math.random()*21-10);
        }
	    System.out.println(Arrays.toString(a));
	    Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
