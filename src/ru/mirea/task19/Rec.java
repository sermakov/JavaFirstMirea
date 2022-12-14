import java.util.Scanner;

public class Rec {
    public static void main(String[] args) {
        System.out.println("Введите значения углов треугольника");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        try{
            if ((a == 90) && (b + c != 90))
                throw new Exception();
            if ((b == 90) && (a + c != 90))
                throw new Exception();
            if ((c == 90) && (b + a != 90))
                throw new Exception();
            if ((a != 90) && (b != 90) && (c != 90))
                throw new Exception();
            if (((a == 90) && (b == 90) && (c == 90)) || ((a == 90) && (b == 90)) || ((c == 90) && (b == 90)) ||
                    ((a == 90) && (c == 90)))
                throw new Exception();
            System.out.println("Все верно");
        } catch (Exception e){
            System.out.println("Углы прямоугольного треугольника заданы неверно");
        }
    }
}