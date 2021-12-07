package ru.mirea.task27;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MainMap {

    private static Map<String, String> createMap() {
        Map<String, String> Dictionary = new HashMap<String, String>();
        Dictionary.put("Ivanov","Ivan");
        Dictionary.put("Sedov","Petr");
        Dictionary.put("Petrov","Daniil");
        Dictionary.put("Adamson","John");
        Dictionary.put("Berk","Mark");
        Dictionary.put("Anderson","John");
        Dictionary.put("Portman","Stein");
        Dictionary.put("Dalton","Alex");
        Dictionary.put("Backer","Max");
        Dictionary.put("Blare","John");
        return Dictionary;
    }

    private static void removeItemFromMapByValue(Map<String, String> dictionary, String value) {

        Map<String, String> DictionaryCopy = new HashMap<String, String>(dictionary);
        for (Map.Entry<String, String> pair: DictionaryCopy.entrySet())
        {
            if (pair.getValue().equals(value))
                dictionary.remove(pair.getKey());
        }
    }

    private static void removeTheFirstNameDuplicates(Map<String, String> dictionary) {

        Map<String, String> DictionaryCopy = new HashMap<String, String>(dictionary);
        for (Map.Entry<String, String> s : DictionaryCopy.entrySet())
        {
            for (Map.Entry<String, String> s2 : DictionaryCopy.entrySet())
            {
                if(s.getValue().equals(s2.getValue()) && !s.getKey().equals(s2.getKey())) removeItemFromMapByValue(dictionary,s.getValue());
            }
        }
    }

    public static void main(String[] args) {
        Map<String, String> Dictionary = createMap();
        System.out.println(Dictionary);
        removeTheFirstNameDuplicates(Dictionary);
        System.out.println(Dictionary);
    }
}
