package A07.strings.src;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b'); // adding the ascii value of 'a' and 'b' as characters
        System.out.println("a" + "b"); // adding the ascii value of 'a' and 'b' as strings ==> concatenating

        System.out.println((char) ('a' + 3)); // This will add 3 to ascii value of 'a' and type cast it to be a character

        System.out.println("a" + 1); // when a string is added with an integer, then integer will be converted to Integer ==> wrapper class Integer ==> will call 'toString()' method after that

        System.out.println("Ranit" + new ArrayList<>()); // The ArrayList will be converted to String by '.toString()' method ==> as no elements in the ArrayList so, there will be only complete square brackets

        System.out.println("ranit" + new Integer(56)); // Integer will be converted directly to string by 'toString()' method

        // System.out.println( 56 + new ArrayList<>());
        // '+' operator in JAVA is defined only for primitives, or if at least one of the values is a Sting in an Expression

        System.out.println(56 + "" + new ArrayList<>()); // This will work fine as there is an empty string object in the expression

    }
}
