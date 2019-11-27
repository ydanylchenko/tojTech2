package day15.returns;

public class ReturnExamples {
    public static void main(String[] args) {
        {
            String word = "thisIsSomeWord";
            System.out.println(word);
            word.toLowerCase();
            System.out.println(word);
            System.out.println(word.toUpperCase());
            System.out.println(word);
            String newWord = word.toLowerCase();
            System.out.println(word);
            System.out.println(newWord);
        }
        {
            int digit = 5;
            System.out.println(digit);
            System.out.println(digit + 1);
            digit = digit * 2;
            System.out.println(digit);
        }
        {
            char someChar = 'A';
            System.out.println(someChar);
            Character.toLowerCase(someChar);
            System.out.println(someChar);
            System.out.println(Character.toLowerCase(someChar));
            char anotherChar = Character.toLowerCase(someChar);
            System.out.println(someChar);
            System.out.println(anotherChar);

        }
    }
}
