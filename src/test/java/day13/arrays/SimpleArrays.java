package day13.arrays;

import java.util.Arrays;

public class SimpleArrays {
    public static void main(String[] args) {
//        DEFINITION
        int[] intArray;
//        You can define it in the following way, but prefer the first one
        int anotherIntArray[];

        byte[] byteArray;
        short[] shortsArray;
        boolean[] booleanArray;
        long[] longArray;
        float[] floatArray;
        double[] doubleArray;
        char[] charArray;
        Dog[] dogs;

//       DEFINITION AND INITIALIZATION OF EMPTY ARRAY WITH SIZE
        int arraySize = 5;
//        keyword new
//        size in square brackets
        intArray = new int[5];
        System.out.println(Arrays.toString(intArray));
//       DEFINITION AND INITIALIZATION OF ARRAY WITH VALUES
        anotherIntArray = new int[]{1, 6, 6, 2, 15, 24};
//        OBJECTS ARRAY
        System.out.println(Arrays.toString(anotherIntArray));
        Dog[] myDogs = new Dog[]{new Dog("Ted"), new Dog("Kesha")};
        System.out.println(Arrays.toString(myDogs));

    }
}
