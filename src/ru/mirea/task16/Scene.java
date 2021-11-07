package ru.mirea.task16;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Scene
{
    public Scene(String path, String[] action, int[] response) throws IOException
    {
        image = ImageIO.read(new File(path));
        this.action = action;
        this.response = response;
    }

    public BufferedImage image;
    public String[] action;
    public int[] response;
}
