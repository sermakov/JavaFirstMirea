package ru.mirea.task11.lab6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class ThirdApp {
    public static void run() {
        JFrame frame = new JFrame("Menu App");
        JPanel panel = new JPanel(new BorderLayout());
        JMenuBar menuBar = new JMenuBar();
        JMenu colorMenu = new JMenu("Color menu");

        JTextArea area = new JTextArea();
        area.setPreferredSize(new Dimension(300, 300));

        initColorMenu(colorMenu, area);
        menuBar.add(colorMenu);

        JMenu fontMenu = new JMenu("Font menu");
        initFontMenu(fontMenu, area);
        menuBar.add(fontMenu);

        panel.add(area, BorderLayout.CENTER);
        frame.add(panel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setJMenuBar(menuBar);
        frame.pack();
        frame.setVisible(true);
    }

    private static void initColorMenu(JMenu colorMenu, JTextArea area) {
        colorMenu.setMnemonic(KeyEvent.VK_C);
        colorMenu.getAccessibleContext().setAccessibleDescription("" +
                "Here you can choose text color");
        ButtonGroup colorGroup = new ButtonGroup();
        JRadioButtonMenuItem rbGreen = new JRadioButtonMenuItem("Green");

        JRadioButtonMenuItem rbBlue = new JRadioButtonMenuItem("Blue");
        JRadioButtonMenuItem rbRed = new JRadioButtonMenuItem("Red");
        rbGreen.setActionCommand("Green");
        rbBlue.setActionCommand("Blue");
        rbRed.setActionCommand("Red");
        colorGroup.add(rbGreen);
        colorGroup.add(rbBlue);
        colorGroup.add(rbRed);
        colorMenu.add(rbGreen);
        colorMenu.add(rbBlue);
        colorMenu.add(rbRed);
        setActionListener(rbGreen, area);
        setActionListener(rbBlue, area);
        setActionListener(rbRed, area);
    }

    private static void initFontMenu(JMenu fontMenu, JTextArea area) {
        fontMenu.setMnemonic(KeyEvent.VK_F);
        fontMenu.getAccessibleContext().setAccessibleDescription("" +
                "Here you can choose text font");
        ButtonGroup fontGroup = new ButtonGroup();
        JRadioButtonMenuItem rbTimesNewRoman = new JRadioButtonMenuItem("TimesNewRoman");

        JRadioButtonMenuItem rbArial = new JRadioButtonMenuItem("Arial");
        JRadioButtonMenuItem rbOpenSans = new JRadioButtonMenuItem("OpenSans");
        rbTimesNewRoman.setActionCommand("TimesNewRoman");
        rbArial.setActionCommand("Arial");
        rbOpenSans.setActionCommand("OpenSans");
        fontGroup.add(rbTimesNewRoman);
        fontGroup.add(rbArial);
        fontGroup.add(rbOpenSans);
        fontMenu.add(rbTimesNewRoman);
        fontMenu.add(rbArial);
        fontMenu.add(rbOpenSans);
        setActionListener(rbTimesNewRoman, area);
        setActionListener(rbArial, area);
        setActionListener(rbOpenSans, area);
    }

    private static void setActionListener(JRadioButtonMenuItem rb, JTextArea area) {
        rb.addActionListener(actionEvent -> {
            switch(actionEvent.getActionCommand()) {
                case "Green":
                    area.setForeground(Color.GREEN);
                    break;
                case "Blue":
                    area.setForeground(Color.BLUE);
                    break;
                case "Red":
                    area.setForeground(Color.RED);
                    break;
                case "TimesNewRoman":
                    area.setFont(new Font("Times New Roman", Font.PLAIN, 16));
                    break;
                case "Arial":
                    area.setFont(new Font("Arial", Font.PLAIN, 16));
                    break;
                case "OpenSans":
                    area.setFont(new Font("OpenSans", Font.PLAIN, 16));
                    break;
            }
        });
    }
}
