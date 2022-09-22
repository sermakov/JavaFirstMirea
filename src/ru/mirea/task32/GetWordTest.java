package ru.mirea.task32;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import ru.mirea.task32.Game;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GetWordTest
{
    public Game game = new Game(0);

    GetWordTest() throws Exception {}

    @Test
    void getWordTest1()
    {
        String input = "использовать ключ на дверь";
        int i = 13;

        String expected = "ключ";

        String actual = game.getWord(input, i);
        assertEquals(expected, actual);
    }

    @Test
    void getWordTest2()
    {
        String input = "использовать ключ на дверь";
        int i = 0;

        String expected = "использовать";

        String actual = game.getWord(input, i);
        assertEquals(expected, actual);
    }

    @Test
    void getWordTestInvalid()
    {
        String input = "использовать ключ на дверь";
        int i = 40;

        String expected = "";

        String actual = game.getWord(input, i);
        assertEquals(expected, actual);
    }
}