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
        anotherIntArray = new int[]{1, 6, 6, 2, 15, 24, 0};
//        OBJECTS ARRAY
        System.out.println("Content:" + Arrays.toString(anotherIntArray));
        System.out.println("Size:" + anotherIntArray.length);
        String[] textArray = new String[]{"Ted", "Kesha"};
        System.out.println(Arrays.toString(textArray));
        String[] textArrayWithJustSize = new String[2];
        System.out.println("Content" + Arrays.toString(textArrayWithJustSize));

        Dog poodle = new Dog("Ted");
        Dog jerkyTearier = new Dog("Kesha");

        Dog[] myDogs = new Dog[]{poodle, jerkyTearier};

        Dog[] myOtherDogs = new Dog[4];
        System.out.println("Cell with index 0 has: " + myOtherDogs[0]);
        System.out.println("Cell with index 1 has: " + myOtherDogs[1]);
        myOtherDogs[0] = poodle;
        myOtherDogs[1] = jerkyTearier;
        System.out.println("Cell with index 0 has: " + myOtherDogs[0]);
        System.out.println("Cell with index 1 has: " + myOtherDogs[1]);
        System.out.println("by default" + myOtherDogs);
        System.out.println(Arrays.toString(myOtherDogs));
        System.out.println(poodle);
        System.out.println(myOtherDogs[3]);
    }
}
