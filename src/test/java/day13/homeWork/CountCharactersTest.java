package day13.homeWork;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountCharactersTest {
    /**
     * This method should return amount of specified characters in the text. Upper and lower case characters are meant to be the same character
     * @param text - text sentence
     * @param character - character amount of which we are counting
     * @return - amount oof character in text
     */
    public static int countCharacters(String text, char character) {
        int amountOfCharactersInText = 0;
//        Implementation goes here.
//        TIP String class has "text".toCharArray() method that transforms String to characters array.
//        ALGORITHM: We need to convert text that is passed to this method to characters array (char[] textCharArray) in order to iterate over it
//        On each iteration we compare the current char with the character that we are looking for (passed to method as argument)
//        If current iteration character equals to the character we are looking for we are increasing the amountOfCharactersInText counter by one
        return amountOfCharactersInText;
    }

    @Test
    public void singleWordTest() {
        assertEquals(2, countCharacters("digitsArray", 'r'));
    }

//    Add additional tests here!
}
