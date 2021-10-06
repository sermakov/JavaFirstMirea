package tasks.task8;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Task3
{
    public static void main(String[] args) throws IOException, InterruptedException
    {
        BufferedImage image = ImageIO.read(new File("D:\\IntelliJ IDEA Community Edition 2021.2.1\\Java\\src\\tasks\\task8\\skin2.png"));
        BufferedImage subImage = image.getSubimage(0, 0, 1, 1);
        JFrame frame = new JFrame("Task3");
        frame.setVisible(true);
        frame.setSize(477,699);
        ImageIcon icon;
        JLabel label;
        while (true)
        {
            for (int i = 0; i < 5; i++)
            {
                frame.setSize(477,700);
                frame.setSize(477,699);
                subImage = image.getSubimage(477 * i, 0, 477, 699);
                icon = new ImageIcon(subImage);
                label = new JLabel(icon);
                frame.add(label);
                Thread.sleep(100);
                frame.remove(label);
                frame.repaint();
            }
        }
    }
}
