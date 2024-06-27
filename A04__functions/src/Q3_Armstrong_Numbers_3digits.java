package A04__functions.src;

public class Q3_Armstrong_Numbers_3digits {
    public static void main(String[] args) {
        System.out.print("The three digits armstrong numbers are: ");
        for (int i = 100; i < 1000; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem * rem * rem;
        }
        return sum == original;
    }
}

/*
previously I declared and initialised 'sum' variable as Global variable and get errors in solutions
You are using a global variable `sum` to calculate the sum of cubes of digits,
which means it retains its value across function calls.
This can lead to incorrect results if you input multiple numbers in the same run of the program.

To fix this, you should declare `sum` as a local variable inside the `isArmstrong` function so that
it gets reset to 0 every time the function is called.
 */
