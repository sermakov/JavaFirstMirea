import java.util.Scanner;
import java.io.*;

public class Prac8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        A.run(in);
        B.run();
        C.run(in);
        D.run(in);
        in.close();
    }
}

class A {
    public static void run(Scanner in) {
        String path = "src/ru/mirea/task15/prac8/task1.txt";
        File file = new File(path);
        System.out.println("Enter the line: ");
        String txt = in.nextLine();
        try (FileWriter fw = new FileWriter(file)) {
            System.out.println("File has been successfully opened");
            fw.write(txt);
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("The file has been written");
    }
}

class B {
    public static void run() {
        String path = "src/ru/mirea/task15/prac8/task1.txt";
        File file = new File(path);

        try (Scanner in = new Scanner(file)) {
            System.out.println("File has been successfully opened. Text:");
            while (in.hasNextLine()) System.out.println(in.nextLine());
            System.out.println("The file has been successfully read");
        }
        catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

class C {
    public static void run(Scanner in) {
        String path = "src/ru/mirea/task15/prac8/task1.txt";
        File file = new File(path);
        System.out.println("Enter the line: ");
        String txt2 = in.nextLine();

        try {
            System.out.println("File has been successfully opened");
            FileWriter fstream1 = new FileWriter(path);
            BufferedWriter out1 = new BufferedWriter(fstream1);
            out1.write("");
            out1.close();

            FileOutputStream output = new FileOutputStream(file);
            byte[] buf = txt2.getBytes();
            output.write(buf,0,buf.length);
            output.close();
            System.out.println("The file has been successfully rewritten");
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

class D {
    public static void run(Scanner in) {
        String path = "src/ru/mirea/task15/prac8/task1.txt";
        File file = new File(path);
        System.out.println("Enter the line to append: ");
        String txt = in.nextLine();

        try {
            FileWriter fw = new FileWriter(path,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw);
            System.out.println("File has been successfully opened");

            out.println(txt);
            out.close();

            System.out.println("The text has been successfully appended");
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}