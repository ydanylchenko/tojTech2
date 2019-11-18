package day12.objectsVsPrimitives;

public class Primitives {

    public static void main(String[] args) {
        int firstDigit = 5;
        int secondDigit = 126;
        System.out.println("First digit is: " + firstDigit);
        System.out.println("Second digit is: " + secondDigit);
        secondDigit = firstDigit;
        System.out.println("After assign of firstDigit value to secondDigit:");
//        firstDigit remains the same
        System.out.println("First digit is: " + firstDigit);
//        secondDigit gets the copy of firstDigit value as it's value
        System.out.println("Second digit is: " + secondDigit);
        firstDigit = 999;
        System.out.println("After update of firstDigit value:");
//        firstDigit gets the 999 value
        System.out.println("First digit is: " + firstDigit);
//        secondDigit remains unchanged as it's separate from the
        System.out.println("Second digit is: " + secondDigit);
    }
}
