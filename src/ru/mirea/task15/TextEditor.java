package ru.mirea.task15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
public class TextEditor extends JFrame {
    public TextEditor() throws IOException {
        JFrame frame = new JFrame("TextEditor");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.white);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        JTextField Input = new JTextField(10);
        Input.setBounds(125, 150, 150, 30);
        Input.setText("");
        frame.add(Input);
        JLabel Name = new JLabel("Input your nickname:");
        Name.setBounds(125, 100, 150, 30);
        frame.add(Name);
        JButton ok = new JButton("OK");
        ok.setBounds(125, 200, 150, 30);
        frame.add(ok);
        frame.setVisible(true);
        ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textFieldVal = Input.getText();
                PrintWriter writer = null;
                try {
                    writer = new PrintWriter("C:\\Users\\Alex\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task16\\test.txt");
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                }
                writer.println(textFieldVal+"Your score: ");
                writer.close();
                frame.dispose();
            }
        });
    }

    public static void main (String[]args) throws IOException {
        TextEditor frame = new TextEditor();
    }
}
