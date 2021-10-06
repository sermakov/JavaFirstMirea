package ru.mirea.task8.opt3;

import java.lang.*;
import javax.swing.*;
import java.awt.*;

public class TestWindow {
    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("Animation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBackground(Color.white);
        frame.setSize(300, 300);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        JLabel picture = new JLabel("", JLabel.CENTER);
        frame.add(picture);

        while(true) {
            picture.setIcon(new ImageIcon("C:\\Users\\IVC1-5\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task8\\opt3\\0.gif","test"));
            Thread.sleep(200);
            picture.setIcon(new ImageIcon("C:\\Users\\IVC1-5\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task8\\opt3\\1.gif","test"));
            Thread.sleep(200);
            picture.setIcon(new ImageIcon("C:\\Users\\IVC1-5\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task8\\opt3\\2.gif","test"));
            Thread.sleep(200);
            picture.setIcon(new ImageIcon("C:\\Users\\IVC1-5\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task8\\opt3\\3.gif","test"));
            Thread.sleep(200);
            picture.setIcon(new ImageIcon("C:\\Users\\IVC1-5\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task8\\opt3\\4.gif","test"));
            Thread.sleep(200);
            picture.setIcon(new ImageIcon("C:\\Users\\IVC1-5\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task8\\opt3\\5.gif","test"));
            Thread.sleep(200);
            picture.setIcon(new ImageIcon("C:\\Users\\IVC1-5\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task8\\opt3\\6.gif","test"));
            Thread.sleep(200);
            picture.setIcon(new ImageIcon("C:\\Users\\IVC1-5\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task8\\opt3\\7.gif","test"));
            Thread.sleep(200);
            picture.setIcon(new ImageIcon("C:\\Users\\Alex\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task8\\opt3\\8.gif","test"));
            Thread.sleep(200);
            picture.setIcon(new ImageIcon("C:\\Users\\Alex\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task8\\opt3\\9.gif","test"));
            Thread.sleep(200);
            picture.setIcon(new ImageIcon("C:\\Users\\Alex\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task8\\opt3\\10.gif","test"));
            Thread.sleep(200);
            picture.setIcon(new ImageIcon("C:\\Users\\Alex\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task8\\opt3\\11.gif","test"));
            Thread.sleep(200);
        }
    }
}
