package ru.mirea.task15.exe1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class FileWork {
    public static void main(String[] args) {
        String fileName1 = "Info1.txt";
        String fileName2 = "Info2.txt";
        Scanner in = new Scanner(System.in);
            try(FileWriter writer = new FileWriter(fileName1, false)){
                writer.write(in.nextLine());
            }
            catch(IOException ex){
                    System.out.println(ex.getMessage());
            }

        try(FileReader reader = new FileReader(fileName1))
        {
            char[] buf = new char[256];
            int c;
            while((c = reader.read(buf))>0){

                if(c < 256){
                    buf = Arrays.copyOf(buf, c);
                }
                System.out.print(buf);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

        try(FileWriter writer = new FileWriter(fileName2, true)){
                writer.write(in.nextLine());
            }
            catch(IOException ex){
                System.out.println(ex.getMessage());
            }

        try(FileReader reader = new FileReader(fileName2))
        {
            char[] buf = new char[256];
            int c;
            while((c = reader.read(buf))>0){

                if(c < 256){
                    buf = Arrays.copyOf(buf, c);
                }
                System.out.print(buf);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

            try(FileWriter writer = new FileWriter(fileName1, false)){
                writer.write(in.nextLine());
            }
            catch(IOException ex){
                System.out.println(ex.getMessage());
            }

        try(FileReader reader = new FileReader(fileName1))
        {
            char[] buf = new char[256];
            int c;
            while((c = reader.read(buf))>0){

                if(c < 256){
                    buf = Arrays.copyOf(buf, c);
                }
                System.out.print(buf);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }


    }
}
