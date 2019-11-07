package day9.forLoop;

public class ForLoopWithBreakExample {
    public static void main(String[] args) {
        System.out.println("I cannot fall a sleep. Let me count the sheeps");
        for (int sheep = 0; sheep < Integer.MAX_VALUE; sheep++) {
            System.out.println("This is the sheep number " + sheep);
            if (sheep >= 19) {
                System.out.println("It doesn't work. Let me take the sleeping pills");
                break;
            }
        }
    }
}
