package com.Udemy.JavaPractice.CollectionFramework;

import java.util.HashMap;
import java.util.Map;
//HashMap is widely used among the collection Frameworks after List and ArrayList
public class MapsDemo {
    public static void main(String[] args) {
        // Stores in pair, key -> value pair, that's why it is called maps as it maps keys and value
        // for example: key is 1 = value is a man. One key- value pair is one Entry. Map can have as many entries as can
        // be defined
        Map<Integer, String> map = new HashMap<Integer, String>(); // Integer is a key, String - value

        map.put(1, "BMW"); // adding values to map
        map.put(6, "Audi");
        map.put(4, "Honda");

        String value1 = map.get(1); // getting/retrieving value back. if the key does not exist in the map entry,
        System.out.println(value1); // it will return Null

        // Keys are unique, value can be duplicated. It will override the old key. When we declared 4 as Honda and later
        map.put(2, "BMW"); // as Merc, it will override Honda and print out Merc
        map.put(4, "Merc");
        String value2 = map.get(4);
        System.out.println(value2);
    }
    }

