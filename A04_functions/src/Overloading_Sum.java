package A04_functions.src;

public class Overloading_Sum {
    public static void main(String[] args) {
        System.out.println("This is 1st Method: " + sum(4, 5));
        System.out.println("This is 2nd Method: " + sum(4, 5, 6));
        System.out.println("This is 3rd Method: " + sum(4, 5, 6, 7));
        System.out.println("This is 4th Method: " + sum(4, 5, 6, 7, 8));
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    static int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    static int sum(int a, int b, int c, int d, int e) {
        return a + b + c + d + e;
    }


}
