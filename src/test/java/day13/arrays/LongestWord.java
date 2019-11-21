package day13.arrays;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Find the longest word from the sentence
 */
public class LongestWord {
    public static void main(String[] args) {
        String text = "We use loops in case if a piece of code should be executed multiple times basing on specific condition The following loops are available in java";
        String[] allWords = text.split(" ");
        System.out.println(Arrays.toString(allWords));
        String theCurrentlyStoredLongestWord = "";
        for (String wordOnCurrentIteration : allWords) {
            if (wordOnCurrentIteration.length() > theCurrentlyStoredLongestWord.length()) {
                theCurrentlyStoredLongestWord = wordOnCurrentIteration;
            }
        }
        System.out.println("The biggest one is: " + theCurrentlyStoredLongestWord);
        System.out.println("It's length:" + theCurrentlyStoredLongestWord.length());
        int charactersCount = theCurrentlyStoredLongestWord.length();
        ArrayList<String> longestWords = new ArrayList<>();
        for (int i = 0; i < allWords.length; i++) {
            if (allWords[i].length() == charactersCount){
                longestWords.add(allWords[i]);
            }
        }
        System.out.println(longestWords);
    }
}
