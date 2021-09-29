package ru.mirea.task8.opt3;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
public class Window extends JFrame {

    private JLabel pictureLabel;
    private Container controls;

    public Window() {
        super("Animation");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        this.setSize(300,150);
        this.startWindow();
    }
    private void startWindow() {
        controls = new Container();
        controls = getContentPane();
        controls.setLayout(new FlowLayout());
        pictureLabel = new JLabel(new ImageIcon("C:\\Users\\IVC1-5\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task8\\opt3\\nyancat-rainbow-cat.gif","Test"));
        controls.add(pictureLabel);
    }
}