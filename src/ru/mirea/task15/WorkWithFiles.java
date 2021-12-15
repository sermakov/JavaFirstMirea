package ru.mirea.task15;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Objects;
import java.util.Scanner;

public class WorkWithFiles {
    public static void main(String[] args) throws Exception {
        FileWriter fw = new FileWriter( "C://Users//PC//Documents//Мучение//ttt.txt" );
        System.out.println("Введите текст: ");
        Scanner scw = new Scanner(System.in);
        String str = scw.nextLine();
        fw.write(str);
        fw.close();
        FileReader fr = new FileReader( "C://Users//PC//Documents//Мучение//ttt.txt" );
        Scanner scr = new Scanner(fr);
        System.out.println("Ваш текст из считаный из файла: ");
        System.out.println(scr.nextLine());
        fr.close();
        FileWriter fwn = new FileWriter( "C://Users//PC//Documents//Мучение//ttt.txt" );
        System.out.println("Введите текст: ");
        Scanner scwn = new Scanner(System.in);
        String strn = scwn.nextLine();
        fwn.write(strn);
        System.out.println("Добавочный текст: ");
        strn = scwn.nextLine();
        fwn.write(" " + strn);
        fwn.close();
    }
}
