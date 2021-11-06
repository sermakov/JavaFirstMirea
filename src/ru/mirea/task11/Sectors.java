package ru.mirea.task11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;

public class Sectors extends JFrame
{
    public Sectors()
    {
        super("Sectors");
        DialogWindow[] dial = new DialogWindow[1];
        dial[0] = new DialogWindow("Dialog Window");
        dial[0].setVisible(true);
        setSize(500, 500);
        JPanel pNorth = new JPanel();
        JPanel pSouth = new JPanel();
        JPanel pWest = new JPanel();
        JPanel pEast = new JPanel();
        JPanel pCenter = new JPanel();

        JLabel lNorth = new JLabel("NORTH");
        JLabel lSouth = new JLabel("SOUTH");
        JLabel lWest = new JLabel("WEST");
        JLabel lEast = new JLabel("EAST");
        JLabel lCenter = new JLabel("CENTER");

        pNorth.add(lNorth);
        pSouth.add(lSouth);
        pWest.add(lWest);
        pEast.add(lEast);
        pCenter.add(lCenter);

        pNorth.setBorder(BorderFactory.createRaisedBevelBorder());
        pSouth.setBorder(BorderFactory.createRaisedBevelBorder());
        pWest.setBorder(BorderFactory.createRaisedBevelBorder());
        pEast.setBorder(BorderFactory.createRaisedBevelBorder());
        pCenter.setBorder(BorderFactory.createRaisedBevelBorder());

        pNorth.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent event)
            {
                dial[0].dispatchEvent(new WindowEvent(dial[0], WindowEvent.WINDOW_CLOSING));
                dial[0] = new DialogWindow("North");
                dial[0].setVisible(true);
            }
        });
        pSouth.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent event)
            {
                dial[0].dispatchEvent(new WindowEvent(dial[0], WindowEvent.WINDOW_CLOSING));
                dial[0] = new DialogWindow("South");
                dial[0].setVisible(true);
            }
        });
        pWest.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent event)
            {
                dial[0].dispatchEvent(new WindowEvent(dial[0], WindowEvent.WINDOW_CLOSING));
                dial[0] = new DialogWindow("West");
                dial[0].setVisible(true);
            }
        });
        pEast.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent event)
            {
                dial[0].dispatchEvent(new WindowEvent(dial[0], WindowEvent.WINDOW_CLOSING));
                dial[0] = new DialogWindow("East");
                dial[0].setVisible(true);
            }
        });
        pCenter.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent event)
            {
                dial[0].dispatchEvent(new WindowEvent(dial[0], WindowEvent.WINDOW_CLOSING));
                dial[0] = new DialogWindow("Center");
                dial[0].setVisible(true);
            }
        });

        add(pNorth, BorderLayout.NORTH);
        add(pSouth, BorderLayout.SOUTH);
        add(pWest, BorderLayout.WEST);
        add(pEast, BorderLayout.EAST);
        add(pCenter, BorderLayout.CENTER);
    }

    public static void main(String[] args)
    {
        new Sectors().setVisible(true);
    }
}
