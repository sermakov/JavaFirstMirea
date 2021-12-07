package ru.mirea.task27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MainCity {
    public static void main(String[] args) {
        City city1 = new City("Russia", "Moscow");
        City city2 = new City("Russia", "Novgorod");
        City city3 = new City("Ukraine", "Kiev");
        City city4 = new City("Ukraine", "Dnepr");
        City city5 = new City("Belarus", "Minsk");
        Map<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
        ArrayList<String> Russia = new ArrayList<String>();
        Russia.add(city1.getCity());
        Russia.add(city2.getCity());
        ArrayList<String> Ukraine = new ArrayList<String>();
        Ukraine.add(city3.getCity());
        Ukraine.add(city4.getCity());
        ArrayList<String> Belarus = new ArrayList<String>();
        Belarus.add(city5.getCity());
        map.put("Russia", Russia);
        map.put("Ukraine", Ukraine);
        map.put("Belarus", Belarus);
        System.out.println(map);
    }
}
