package ru.mirea.task29;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Load {
        public static void main(String[] args) throws IOException, ClassNotFoundException {
            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Alex\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task29\\Test.sar");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            CurrencyInfo c = (CurrencyInfo) objectInputStream.readObject();
            System.out.println(c);
            objectInputStream.close();
        }
}
