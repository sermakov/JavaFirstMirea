package ru.mirea.task32;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class GameTest {

    @Test
    void getWord()
    {
        int i = 13;
        String input = "использовать ключ на дверь";
        String s = "";
        int l = input.length();
        if (l < i)
            return;
        while (i != l)
        {
            if (input.charAt(i) == ' ')
                break;
            s = s + input.charAt(i);
            i++;
        }
        String expected = "использовать";
        Assert.assertEquals(expected, s);
    }
}