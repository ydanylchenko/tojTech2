public class Math {
    public int sum(int a, int b) {
        int result = a + b;
        return result;
    }
    public int sum(int a, int b, int c) {
        int result = a + b + c;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Math().sum(1, 5));
        System.out.println(new Math().sum(1, 5, 11));
    }
}
