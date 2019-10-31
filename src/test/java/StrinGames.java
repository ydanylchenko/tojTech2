import java.util.Arrays;
import java.util.List;

public class StrinGames {

    public static void main(String[] args) {

        List<String> recipes = Arrays.asList("res1", "res2", "res3");
        System.out.println(recipes);
        System.out.println(recipes.size());
        System.out.println(recipes.get(1));

        System.out.println("50 results".substring(0, 2));
        System.out.println("012345".substring(2, 4));


        System.out.println("test".startsWith("TE"));
        System.out.println("TEST".endsWith("t"));
        System.out.println("TEST".contains("E"));

        System.out.println("".length());
        System.out.println("".isEmpty());
        System.out.println("rest".length());
        System.out.println("rest".isEmpty());
        System.out.println("rest".toLowerCase());
        System.out.println("rESt".toLowerCase());
        System.out.println("rest".toUpperCase());


        System.out.println("My\nname\nis \"Yaroslav\"");

        System.out.println("a\t9\tA");
        System.out.println("a\t10\tA");
        System.out.println("a\t9\tA");
        System.out.println("a 9 A");
        System.out.println("a 10 A");
        System.out.println("a 9 A");
    }
}
