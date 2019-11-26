package day13.homeWork.completed;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class EasyPalindromeTest {
    /**
     * https://en.wikipedia.org/wiki/Palindrome
     * A palindrome is a word, number, phrase, or other sequence of characters which reads the same backward as forward, such as taco cat or madam or racecar or the number 10801.
     * Sentence-length palindromes may be written when allowances are made for adjustments to capital letters, punctuation, and word dividers, such as "A man, a plan, a canal, Panama!", "Was it a car or a cat I saw?" or "No 'x' in Nixon".
     */
    public static boolean isPalindrome(String word) {
        boolean isPalindrome = false;
//        Implementation goes here. If you want to use StringBuilder please add the second implementation of this method with loops!
//        in order to remove all the punctuation symbols we replace them with empty string
        System.out.println("Was: " + word);
        String wordWithoutPunctuation = word.replaceAll("\\W+", "");
        System.out.println("Now without punctuation: " + wordWithoutPunctuation);
        String wordWithoutPunctuationInLowerCase = wordWithoutPunctuation.toLowerCase();
        System.out.println("And now in lower case: " + wordWithoutPunctuationInLowerCase);
//        String reversedWordWithoutPunctuationInLowerCase = new StringBuilder(wordWithoutPunctuationInLowerCase).reverse().toString();
        String reversedWordWithoutPunctuationInLowerCase = "";
        char[] textCharacters = wordWithoutPunctuationInLowerCase.toCharArray();
        for (int i = textCharacters.length - 1; i >= 0; i--) {
            reversedWordWithoutPunctuationInLowerCase += textCharacters[i];
        }
        System.out.println(wordWithoutPunctuationInLowerCase + " is original word without punctuation and in lower case");
        System.out.println(reversedWordWithoutPunctuationInLowerCase + " is reversed word");
        isPalindrome = reversedWordWithoutPunctuationInLowerCase.equals(wordWithoutPunctuationInLowerCase);
        System.out.println("Are they the same, i.e. is the sentence palindrome?: " + isPalindrome);
        return isPalindrome;
    }

    @Test
    public void singleWordTest() {
        assertTrue(isPalindrome("madam"));
        assertTrue(isPalindrome("racecar"));
        assertTrue(isPalindrome("10801"));
    }

    @Test
    public void caseInsensitiveTest() {
        assertTrue(isPalindrome("oloLO"));
    }

    @Test
    public void sentenceWithSpaceTest() {
//        TIP: In order to remove punctuation and spaces from text use "word".replaceAll("\\W+", "") method.
//        See https://en.wikipedia.org/wiki/Regular_expression
//        and https://www.w3schools.com/jsref/jsref_regexp_wordchar_non.asp
        assertTrue(isPalindrome("taco cat"));
    }

    @Test
    public void sentenceWithSpacesAndPunctuationTest() {
        assertTrue(isPalindrome("A man, a plan, a canal, Panama!"));
        assertTrue(isPalindrome("Was it a car or a cat I saw?"));
        assertTrue(isPalindrome("No 'x' in Nixon"));
    }

    @Test
    public void emptyTextTest() {
        assertTrue(isPalindrome(""));
    }
}
