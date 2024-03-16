package A04.functions.src;

import java.util.Arrays;

public class Overloading_Sum {
    public static void main(String[] args) {
        System.out.println("This is 1st Method: " + sum(4, 5));
        System.out.println("This is 2nd Method: " + sum(4, 5, 6));
        System.out.println("This is 3rd Method: " + sum(4, 5, 6, 7));
        System.out.println("This is 4th Method: " + sum(4, 5, 6, 7, 8));

        // This is a very good example use of Function overloading
        System.out.println(50); // The 'println' method is taking an integer argument
        System.out.println('c'); // The 'println' method is taking a character argument
        System.out.println("Hello World!"); // The 'println' method is taking string argument
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
