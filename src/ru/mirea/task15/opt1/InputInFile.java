package ru.mirea.task15.opt1;

import java.io.*;
import java.io.FileWriter;

public class InputInFile {
        public static void main(String[] args) throws IOException
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            OutputStream outputStream = new FileOutputStream("C:\\Users\\IVC1-5\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task15\\File.txt");
            while (true)
            {
                String data = reader.readLine();
                if(data.equals("exit")){
                    break;
                }
                else {
                    outputStream.write((data +"\r\n").getBytes());
                }
            }
            outputStream.close();
            reader.close();
        }
    }
