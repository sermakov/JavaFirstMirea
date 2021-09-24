package ru.mirea.task8.lab5;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.Vector;

public class Ex3 {
    public static void run() {
        AnimationGifApplet animationGifApplet = new AnimationGifApplet();
        JFrame frame = new JFrame("Animation");
        frame.add(animationGifApplet, BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);
    }
}

class AnimationGifApplet extends Panel {
    private final Vector<Image> img = new Vector<>();
    private final int maxImg;
    private final MediaTracker tracker;
    private int index = 0;

    public AnimationGifApplet() {
        tracker = new MediaTracker(this);
        try {
            // images loading
            String basePath = new File("").getAbsolutePath() + "/src/ru/mirea/task8/lab5/";
            img.add(ImageIO.read(new File(basePath+"popcat_closed.png")));
            tracker.addImage(img.lastElement(), img.size()-1);
            img.add(ImageIO.read(new File(basePath+"popcat_open.png")));
            tracker.addImage(img.lastElement(), img.size()-1);
            tracker.waitForAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        maxImg = img.size() - 1;

        AnimationThread at = new AnimationThread();
        at.delayedAnimation(this, 120);
        at.start();
    }

    public void paint(Graphics g) {
        if (img.get(0) != null) {
            g.drawImage(img.get(index), 0, 0, this);
            index = (index < maxImg) ? index + 1 : 0;
        }
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(img.get(0).getWidth(this), img.get(0).getHeight(this));
    }

    public void animate() {
        repaint();
    }

    static class AnimationThread extends Thread {
        AnimationGifApplet animationApplet;
        int delay;

        public void delayedAnimation(AnimationGifApplet a, int delay) {
            this.animationApplet = a;
            this.delay = delay;
        }

        public void run() {
            while (true) {
                try {
                    sleep(delay);
                    animationApplet.animate();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}