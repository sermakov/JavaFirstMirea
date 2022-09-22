package ru.mirea.task25;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;

public class Scene
{
    public Scene(String path, String[] action, int[] response, LinkedList<Item> inventory) throws IOException
    {
        image = ImageIO.read(new File(path));
        this.action = action;
        this.response = response;
        this.inventory = inventory;
    }

    public BufferedImage image;
    public String[] action;
    public int[] response;
    public LinkedList<Item> inventory;
}
