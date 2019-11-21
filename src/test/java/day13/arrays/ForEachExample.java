package day13.arrays;

import java.util.Arrays;

public class ForEachExample {

    public static void main(String[] args) {
        Dog[] dogs = new Dog[]{new Dog("first"), new Dog("seconds"), new Dog("third")};
        System.out.println(Arrays.toString(dogs));
//        fori: will create you a blank for loop
        for (int i = 0; i < dogs.length; i++) {
            System.out.println(dogs[i]);
        }
        int[] vars = new int[]{1, 5, 2, 6, 2};

        for (Dog doggy : dogs) {

            System.out.println(doggy);
        }
        for (int i = 0; i < dogs.length; i++) {
            Dog doggy = dogs[i];
            System.out.println(doggy);
        }


        int[] ints = new int[]{1, 4, 2, 6};
        for (int anInt : ints) {
            System.out.println(ints[2]);
            System.out.println(anInt);
        }
//        iter will create you a blank for each loop
//        for (Dog dog : dogs) {
//
//        }

    }
}
