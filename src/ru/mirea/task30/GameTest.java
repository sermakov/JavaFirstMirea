package ru.mirea.task30;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
//НОВОВВЕДЕНИЯ: тестирование метода getWord(String input, int i) класса Game
class GameTest {

    public Game game = new Game();

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
}