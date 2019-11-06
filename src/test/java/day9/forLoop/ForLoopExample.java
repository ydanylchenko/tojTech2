package day9.forLoop;

public class ForLoopExample {
    public static void main(String[] args) {
        System.out.println("I cannot fall a sleep. Let me count the sheeps");
        for (int sheep = 0; sheep < Byte.MAX_VALUE; sheep++) {
            System.out.println("This is the sheep number " + sheep);
        }
    }
}
