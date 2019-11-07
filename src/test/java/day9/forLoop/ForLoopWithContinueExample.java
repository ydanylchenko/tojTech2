package day9.forLoop;

public class ForLoopWithContinueExample {
    public static void main(String[] args) {
        System.out.println("I cannot fall a sleep. Let me count the sheeps");
        for (int sheep = 0; sheep < 10; sheep++) {
            if (sheep == 7) {
                System.out.println("!!!Hate you sheep #7!");
                continue;
            }
            System.out.println("This is the sheep number " + sheep);
        }
    }
}
