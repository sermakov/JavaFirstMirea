package ru.mirea.task15.opt4;

import java.io.*;

public class AddToEnd {
    public static void main(String[] args){
        try {
            BufferedReader file = new BufferedReader(new FileReader("C:\\Users\\IVC1-5\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task15\\File.txt"));
            String line;
            StringBuffer inputBuffer = new StringBuffer();
            while ((line = file.readLine()) != null) {
                inputBuffer.append(line);
                inputBuffer.append('\n');
            }
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            OutputStream outputStream = new FileOutputStream("C:\\Users\\IVC1-5\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task15\\File.txt");
            String inputStr = inputBuffer.toString();
            outputStream.write(inputStr.getBytes());
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
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
