package ru.mirea.task32;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ActRegexUnitTest
{
    public Game game = new Game(0);

    ActRegexUnitTest() throws Exception {}

    @Test
    void actRegexUnitTest1()
    {
        String input = "использовать себя";

        boolean expected = true;

        boolean actual = game.actRegexUnit(input);
        assertEquals(expected, actual);
    }

    @Test
    void actRegexUnitTest2()
    {
        String input = "использовать себя,fadadaslkj dadajlkda";

        boolean expected = true;

        boolean actual = game.actRegexUnit(input);
        assertEquals(expected, actual);
    }

    @Test
    void actRegexUnitTest3()
    {
        String input = "использовать";

        boolean expected = false;

        boolean actual = game.actRegexUnit(input);
        assertEquals(expected, actual);
    }
}