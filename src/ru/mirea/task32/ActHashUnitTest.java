package ru.mirea.task32;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ActHashUnitTest
{
    public Game game = new Game(0);

    ActHashUnitTest() throws Exception {}

    @Test
    void actHashUnitTest1()
    {
        String input = "использовать себя";

        int expected = 50000000;

        int actual = game.actHashUnit(input);
        assertEquals(expected, actual);
    }

    @Test
    void actHashUnitTest2()
    {
        String input = "взять себя";

        int expected = 70000000;

        int actual = game.actHashUnit(input);
        assertEquals(expected, actual);
    }

    @Test
    void actHashUnitTestInvalid()
    {
        String input = "использовать дробитель";

        int expected = 0;

        int actual = game.actHashUnit(input);
        assertEquals(expected, actual);
    }
}