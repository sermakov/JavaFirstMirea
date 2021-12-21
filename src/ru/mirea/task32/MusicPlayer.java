package ru.mirea.task32;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class MusicPlayer
{
    public static Clip clip;

    public static void play(String path, boolean repeat, int delay) throws Exception
    {
        File musicPath = new File(path);
        AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
        clip = AudioSystem.getClip();
        clip.open(audioInput);
        clip.start();
        if (repeat)
            clip.loop(Clip.LOOP_CONTINUOUSLY);
        Thread.sleep(delay);
    }
    public static void stop() throws Exception
    {
        clip.stop();
    }
}
