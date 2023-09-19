package Day_06;

import java.util.Arrays;

public class Variable_length_arguments {
    public static void main(String[] args) {
        fun(5, 6, 8, 9, 58, 95, 51, 48, 59, 263, 498);
        fun(); // This will print an empty array
        multiple(2, 3, "Kunal", "Ranit", "Pushpa");
        // argument's order have to be the same as of parameters
    }

    // "datatype...v" is used to take as many input as you want
    // This is called as "varargs"

    static void fun(int... v) {
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String... v) {
        System.out.println(Arrays.toString(v));
    }
}