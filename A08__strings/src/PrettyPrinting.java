package A08__strings.src;

public class PrettyPrinting {
    public static void main(String[] args) {
        float f = 1.1548125f;
        System.out.println("The original floating point number is: " + f);
        System.out.printf("The formatted floating point number upto two decimal places: %.2f", f); // You have to use 'printf' statements to use Pretty printing

        System.out.println("\nThe original value of PI is: " + Math.PI);
        System.out.printf("The value of PI is: %.3f", Math.PI);

        System.out.printf("Hello I am %s and I am %s", "Ranit", "Developer"); // You can use format specifies like C in JAVA

        // Here is a list of format specifiers you can use in JAVA
        /*
        %c - Character
        %d - Decimal number (base 10)
        %e - Exponential floating-point number
        %f - Floating-point number
        %i - Integer (base 10)
        %0 - Octal number (base 8)
        %s - String
        %u - Unsigned decimal (integer) number
        %x - Hexadecimal number (base 16)
        %t - Date/time
        %n - Newline
         */
    }
}
