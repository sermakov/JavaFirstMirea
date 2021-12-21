package ru.mirea.task30;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
//НОВОВВЕДЕНИЯ: тестирование метода getWord(String input, int i) класса Game
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
        String expected = "ключ";
        Assert.assertEquals(expected, s);
    }
}