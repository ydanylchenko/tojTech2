package day13.homeWork.completed;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class CountCharactersTest {
    /**
     * This method should return amount of specified characters in the text. Upper and lower case characters are meant to be the same character
     *
     * @param text      - text sentence
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
        System.out.println("given text: " + text);
//        Upper case and lower case characters are different characters. As per task description 'Upper and lower case characters are meant to be the same character'
//        In order to compare them in case insensitive way let's make both text we are searching by and the character we are looking for to the lower case
        text = text.toLowerCase();
        character = Character.toLowerCase(character);
//        in order to compare characters we need to iterate over characters of the text. Let's convert text to characters array:
        char[] textCharacters = text.toCharArray();
        System.out.println("text " + text + " is converted to " + Arrays.toString(textCharacters));
        System.out.println("we are looking for amount of '" + character + "' characters in the text");
        for (char textCharacter : textCharacters) {
            System.out.println("amount of matching characters in the text on current iteration is: " + amountOfCharactersInText);
            System.out.println("character in the characters array on current iteration is: " + textCharacter);
            if (textCharacter == character) {
                System.out.println("current character " + textCharacter + " matches the character we are looking for " + character);
                amountOfCharactersInText += 1;
                System.out.println("we increased the counter of found characters by one, now amountOfCharactersInText=" + amountOfCharactersInText);
            } else {
                System.out.println("current character " + textCharacter + " doesn't match the character we are looking for " + character + ". Skipping");
            }
        }
        System.out.println("After iterating over all the characters in the text we found that there're " + amountOfCharactersInText + " matching characters");
//        we return the amountOfCharactersInText value as result of this method execution to the place that called this method
        return amountOfCharactersInText;
    }

    @Test
    public void singleWordTest() {
        assertEquals(2, countCharacters("digitsArray", 'r'));
    }

//    Add additional tests here!

    @Test
    public void caseSensitivity() {
        assertEquals(2, countCharacters(" Мультфильмы", 'м'));
    }

    @Test
    public void noCharInText() {
        assertEquals(0, countCharacters("Car", 'Z'));
    }

    @Test
    public void countSpaces() {
        assertEquals(9, countCharacters("This is some sentence with space and tab \t symbol", ' '));
    }
}
