package A14__recursion;

public class NumbersExampleRecursion {
    public static void main(String[] args) {
        // Write a function that takes in a number and prints it
        // print the first 5 numbers: 1, 2, 3, 4, 5

        print(1);
    }

    static void print(int n) {
        // Base condition
        if (n == 6) {
            return;
        }

        /*
        If no base condition => Function call will keep happening =>
        Stack will be filled again and again =>
        Memory of the Computer will be exceeding => Stack Overflow Error
        */

        System.out.println(n);
        // Recursion => Function calling itself
        // Why Recursion => It helps us in solving complex problem easily
        // Fun Fact => You can convert any recursion solution into recursion & vice versa
        // Space Complexity => it is not constant because of recursive calls

        print(n + 1);

    }
}
