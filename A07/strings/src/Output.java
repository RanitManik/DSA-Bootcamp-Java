package A07.strings.src;

import java.util.Arrays;

public class Output {
    public static void main(String[] args) { // This statement 'String[] args' means that the main function will take command line arguments and store it into a string named 'args'

        // The PrintStatement class

        System.out.println(50); // The 'println' method is taking an integer argument and converting it to Sting and then printing in the console
        System.out.println(new int[]{1, 2, 4, 5}); // The 'println' method is taking array argument
        System.out.println(Arrays.toString(new int[]{1, 2, 4, 5,})); // Now this is not taking that an array argument ==> it is taking a string argument ==> This is called Function Overriding


        // as in JAVA, primitive data types are stored in Stack memory (as they are not objects) so we have to use a wrapper class to use some wrapper class to convert its location to heap

        Integer num = new Integer(50); // as the primitive data is inside a wrapper class then we can use a lot of methods inside it that we can not use directly for a primitive data type
        System.out.println(num.toString()); // Internally printing an integer datatype is working like that ==> converting to String through some wrapper class and then printing the string in the console

        int num2 = 50; // This will be accessible only from stack
        // System.out.println(num2.toString); // This will through error as the integer is not accessible from heap and not an object, so we cannot use methods on it
    }
}
