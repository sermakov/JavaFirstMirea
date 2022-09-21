package ru.mirea.task32;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class ItemDecoratorTest
{
    @Test
    void getNameTest1()
    {
        HashMap<String, Integer> actResp = new HashMap<>();
        actResp.put("act", 1);
        ItemDecorator sample1 = new ItemDecorator(new Prop("name1", actResp), type.T);
        String expected = "name1";
        String actual = sample1.getName();
        assertEquals(expected, actual);
    }

    @Test
    void getNameTest2()
    {
        HashMap<String, Integer> actResp = new HashMap<>();
        ItemDecorator sample1 = new ItemDecorator(new Prop("name2", actResp), type.NT);
        String expected = "name2";
        String actual = sample1.getName();
        assertEquals(expected, actual);
    }

    @Test
    void getNameTest3()
    {
        HashMap<String, Integer> actResp = new HashMap<>();
        actResp.put("move", 2);
        ItemDecorator sample1 = new ItemDecorator(new Prop("name3", actResp), type.T);
        String expected = "name3";
        String actual = sample1.getName();
        assertEquals(expected, actual);
    }

    @Test
    void getResponseTest1()
    {
        HashMap<String, Integer> actResp = new HashMap<>();
        actResp.put("act", 1);
        ItemDecorator sample1 = new ItemDecorator(new Prop("name1", actResp), type.T);
        int expected = 1;
        int actual = sample1.getResponse("act");
        assertEquals(expected, actual);
    }

    @Test
    void getResponseTest2()
    {
        HashMap<String, Integer> actResp = new HashMap<>();
        ItemDecorator sample1 = new ItemDecorator(new Prop("name2", actResp), type.NT);
        Integer expected = null;
        Integer actual = sample1.getResponse("act");
        assertEquals(expected, actual);
    }

    @Test
    void getResponseTest3()
    {
        HashMap<String, Integer> actResp = new HashMap<>();
        actResp.put("move", 2);
        ItemDecorator sample1 = new ItemDecorator(new Prop("name3", actResp), type.T);
        Integer expected = null;
        Integer actual = sample1.getResponse("act");
        assertEquals(expected, actual);
    }

    @Test
    void takeTest1()
    {
        HashMap<String, Integer> actResp = new HashMap<>();
        actResp.put("act", 1);
        ItemDecorator sample1 = new ItemDecorator(new Prop("name1", actResp), type.T);
        boolean expected = true;
        boolean actual = sample1.take();
        assertEquals(expected, actual);
    }

    @Test
    void takeTest2()
    {
        HashMap<String, Integer> actResp = new HashMap<>();
        ItemDecorator sample1 = new ItemDecorator(new Prop("name2", actResp), type.NT);
        boolean expected = false;
        boolean actual = sample1.take();
        assertEquals(expected, actual);
    }

    @Test
    void takeTest3()
    {
        HashMap<String, Integer> actResp = new HashMap<>();
        actResp.put("move", 2);
        ItemDecorator sample1 = new ItemDecorator(new Prop("name3", actResp), type.T);
        boolean expected = true;
        boolean actual = sample1.take();
        assertEquals(expected, actual);
    }
}