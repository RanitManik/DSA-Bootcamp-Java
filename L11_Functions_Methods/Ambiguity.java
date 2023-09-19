package L11_Functions_Methods;

import java.util.Arrays;

public class Ambiguity {
    public static void main(String[] args) {
        fun(5, 6, 8, 9, 15, 85, 546);
        fun("Ram", "Ranit");
//        fun(); ==> will through an error because at compile time the compiler is unable to decode which method to execute
//        ==> This is called as ambiguity
    }

    static void fun(int... v) {
        System.out.println(Arrays.toString(v));
    }

    static void fun(String... v) {
        System.out.println(Arrays.toString(v));
    }
}
