package ru.mirea.task32;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SedavTest {
    class w{
    Item i;

    public w(Item i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return i.getName() + i.containsKey("D") + i.take();
    }
}

    @Test
    void itemFactory() {

        HashMap<String, Integer> actResp0 = new HashMap<>();
        actResp0.put("D", 0);

        HashMap<String, Integer> actResp1 = new HashMap<>();
        actResp0.put("D", 1);

        List<String> what_we_have = new ArrayList<>();
        what_we_have.add(new w(Main.ItemFactory(type.NT, "Андрей", actResp0)).toString());
        what_we_have.add(new w(Main.ItemFactory(type.T, "не_Андрей", actResp1)).toString());

        NonTakeable product1 = new NonTakeable("Андрей", actResp0);
        Takeable product2 = new Takeable("не_Андрей", actResp1);

        List<String> what_we_should_have = new ArrayList<>();
        what_we_should_have.add(new w(product1).toString());
        what_we_should_have.add(new w(product2).toString());

        assertEquals(what_we_have, what_we_should_have);
    }
    @Test
    void itemFactoryWrong() {
        HashMap<String, Integer> actResp0 = new HashMap<>();
        actResp0.put("D", 0);

        List<String> what_we_have = new ArrayList<>();
        what_we_have.add(new w(Main.ItemFactory(type.NT, "Андрей", actResp0)).toString());

        NonTakeable product1 = new NonTakeable("Кто", actResp0);

        List<String> what_we_should_have = new ArrayList<>();
        what_we_should_have.add(new w(product1).toString());

        assertEquals(what_we_have, what_we_should_have);
    }

    @Test
    void findByName(){
        LinkedList<Item> list = new LinkedList();
        HashMap<String, Integer> actResp0 = new HashMap<>();
        actResp0.put("D", 0);
        HashMap<String, Integer> actResp1 = new HashMap<>();
        actResp0.put("не_D", 0);
        list.add(Main.ItemFactory(type.NT, "Андрей", actResp0));
        list.add(Main.ItemFactory(type.NT, "не_Андрей", actResp1));

        assertEquals(1, Game.findByName("не_Андрей", list));
    }
    @Test
    void findByNameWrong(){
        LinkedList<Item> list = new LinkedList();
        HashMap<String, Integer> actResp0 = new HashMap<>();
        actResp0.put("D", 0);
        list.add(Main.ItemFactory(type.NT, "Андрей", actResp0));

        assertEquals(5000, Game.findByName("???", list));
    }

    @Test
    void getResponse() throws IOException {
        HashMap<String, Integer> actResp0 = new HashMap<>();
        actResp0.put("D", 0);
        actResp0.put("Быть", 5000);
        actResp0.put("не_Быть", 5001);

        Scene scene = new Scene("./AMOGUS II/sample.png", actResp0, null);

        assertEquals(5000, scene.getResponse("Быть"));
    }
    @Test
    void getResponseWrong() throws IOException {
        HashMap<String, Integer> actResp0 = new HashMap<>();
        actResp0.put("D", 0);
        actResp0.put("Быть", 5000);
        actResp0.put("не_Быть", 5001);

        Scene scene = new Scene("./AMOGUS II/sample.png", actResp0, null);

        assertEquals(5000, scene.getResponse("не_Быть"));
    }
}