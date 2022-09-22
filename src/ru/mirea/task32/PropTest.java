package ru.mirea.task32;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import ru.mirea.task32.Game;
import java.util.HashMap;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class PropTest {

    public HashMap<String, Integer> actResp = new HashMap<>();

    @org.junit.jupiter.api.Test
    void getName1() {
        Prop prop = new Prop("name", actResp);
        assertEquals("name", prop.getName());
    }
    @org.junit.jupiter.api.Test
    void getName2() {
        Prop prop = new Prop("surname", actResp);
        assertEquals("surname", prop.getName());
    }
    @org.junit.jupiter.api.Test
    void getNameInvalid() {
        Prop prop = new Prop("Jack", actResp);
        assertEquals("Black", prop.getName());
    }

    @org.junit.jupiter.api.Test
    void getResponse1() {
        actResp.put("D", 1);
        Prop prop = new Prop("name", actResp);
        assertEquals(1, prop.getResponse("D"));
    }
    @org.junit.jupiter.api.Test
    void getResponse2() {
        actResp.put("F", 2);
        Prop prop = new Prop("name", actResp);
        assertEquals(2, prop.getResponse("F"));
    }
    @org.junit.jupiter.api.Test
    void getResponseInvalid() {
        actResp.put("G", 3);
        Prop prop = new Prop("name1", actResp);
        assertEquals(4, prop.getResponse("G"));
    }

    @org.junit.jupiter.api.Test
    void containsKey1() {
        actResp.put("D", 1);
        Prop prop = new Prop("name", actResp);
        assertEquals(true, prop.containsKey("D"));
    }
    @org.junit.jupiter.api.Test
    void containsKey2() {
        actResp.put("F", 1);
        Prop prop = new Prop("name", actResp);
        assertEquals(false, prop.containsKey("D"));
    }
    @org.junit.jupiter.api.Test
    void containsKeyInvalid() {
        actResp.put("G", 1);
        Prop prop = new Prop("name", actResp);
        assertEquals(true, prop.containsKey("D"));
    }
}