package ru.mirea.task29;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        CurrencyInfo c = new CurrencyInfo(73.87f,83.27f,97.72f);
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Alex\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task29\\Test.sar");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(c);
        objectOutputStream.close();
    }
}
