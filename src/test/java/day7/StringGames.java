package day7;

import java.util.Arrays;
import java.util.List;

public class StringGames {

    public static void main(String[] args) {

        List<String> recipes = Arrays.asList("res1", "res2", "res3");
        System.out.println(recipes); // prints [res1, res2, res3]
        System.out.println(recipes.size()); // prints 3
        System.out.println(recipes.get(1)); // prints res2

        System.out.println("50 results".substring(0, 2)); // prints 50
        System.out.println("012345".substring(2, 4)); // prints 23

        System.out.println("test".startsWith("TE")); // prints false
        System.out.println("TEST".endsWith("t")); // prints false
        System.out.println("TEST".contains("E")); // prints true

        System.out.println("".length()); // prints 0
        System.out.println("".isEmpty()); // prints true
        System.out.println("rest".length()); // prints 4
        System.out.println("rest".isEmpty()); // prints false
        System.out.println("rest".toLowerCase()); // prints rest
        System.out.println("rESt".toLowerCase()); // prints rest
        System.out.println("rest".toUpperCase()); // prints REST

        System.out.println("My\nname\nis \"Yaroslav\""); // prints:
//My
//name
//is "Yaroslav"

        System.out.println("a\t9\tA"); // prints a	9	A
        System.out.println("a\t10\tA"); // prints a	10	A
        System.out.println("a\t9\tA"); // prints a	9	A
        System.out.println("a 9 A"); // prints a 9 A
        System.out.println("a 10 A"); // prints a 10 A
        System.out.println("a 9 A"); // prints a 9 A
    }
}
