package com.Udemy.JavaPractice.CollectionFramework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/***Sets store only unique set of elements
 *
 */

public class SetsDemo {

    public static void main(String[] args) {

        // HashSet - Does not maintain order. If our order is BMW, Audi, Honda, it will print out Audi, BMW, Honda
        // HashSet is faster, as it doesn't need to do anything
        Set<String> set = new HashSet<String>();

        set.add("BMW");
        set.add("Audi");
        set.add("Honda");
        set.add("Honda"); // it will print out Honda only once, as sets store only unique set of elements

        // System.out.println(set);
        System.out.println("Hash");
        for (String item: set) {
            System.out.println(item);
        }

        // LinkedHashSet - It maintains the order in which the elements are added
        Set<String> lHSet = new LinkedHashSet<String>();
        lHSet.add("BMW");
        lHSet.add("Audi");
        lHSet.add("Honda");
        System.out.println("Linked");
        for (String item: lHSet) {
            System.out.println(item);
        }

        // TreeSet - It maintains the natural sorting order 1, 2, 3... alphabetical
        // is not faster as HashSet as it maintains the natural sorting order
        Set<String> tSet = new TreeSet<String>();
        tSet.add("BMW");
        tSet.add("Audi");
        tSet.add("Honda");
        System.out.println("Tree");
        for (String item: tSet) {
            System.out.println(item);
        }

        List<String> list = new ArrayList<String>();

        list.add("BMW");
        list.add("Audi");
        list.add("Honda");
        list.add("Honda");
        // System.out.println(list);

    }

}
