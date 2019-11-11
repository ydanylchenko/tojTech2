package day10.loops;

import java.util.Arrays;

public class ForEachLoop {

    public void iterateWithForEach(char[] chars) {
        System.out.println("Let's iterate over the characters in the '" + Arrays.toString(chars) + "' text");
        for (char character : chars) {
            System.out.println("Character on the current position is " + character);
        }
    }

    public void iterateWithForEach(int[] ints) {
        System.out.println("Let's iterate over the integers in the '" + Arrays.toString(ints) + "' array");
        for (int anInt : ints) {
            if (anInt < 0) {
                System.out.println(String.format("This is a negative integer value: %3d", anInt));
            } else if (anInt == 0) {
                System.out.println("It's a zero! Hate you!");
                break;
            } else {
                System.out.println(String.format("This is a positive integer value: %3d", anInt));
            }
        }
    }

    public static void main(String[] args) {
//        As an example:
        String someText = "шизофрения";
        char[] charactersArray = someText.toCharArray();
        new ForEachLoop().iterateWithForEach(charactersArray);
//        As another example:
        int[] integersArray = {1, -6, -7, 2, 71, 0, -8, 24};
        new ForEachLoop().iterateWithForEach(integersArray);
    }
}
