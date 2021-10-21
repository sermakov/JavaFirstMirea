package tasks.task15;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task15
{
    public static void main(String[] args) throws IOException
    {
        FileWriter FW = new FileWriter("file.txt");
        Scanner S = new Scanner(System.in);
        String line = S.nextLine();
        FW.write(line);
        line = S.nextLine();
        FW.write("\n" + line);
        FW.flush();
        FileReader FR = new FileReader("file.txt");
        System.out.println("File Contents:");
        int c;
        while ((c = FR.read()) != -1)
            System.out.print((char)c);
        System.out.println();
        line = S.nextLine();
        FW = new FileWriter("file.txt");
        FW.write(line);
        FW.flush();
        FR = new FileReader("file.txt");
        System.out.println("File Contents:");
        while ((c = FR.read()) != -1)
            System.out.print((char)c);
        System.out.println();
        line = S.nextLine();
        FW = new FileWriter("file.txt", true);
        FW.append(line);
        FW.flush();
        FR = new FileReader("file.txt");
        System.out.println("File Contents:");
        while ((c = FR.read()) != -1)
            System.out.print((char)c);
    }
}
