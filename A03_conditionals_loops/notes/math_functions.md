# Understanding Math Functions

```java
package A03_conditionals_loops.assignments.Intermediate;

import java.util.Scanner;

public class Program_05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter x-coordinate of first point: ");
        double x1 = in.nextDouble();

        System.out.print("Enter y-coordinate of first point: ");
        double y1 = in.nextDouble();

        System.out.print("Enter x-coordinate of second point: ");
        double x2 = in.nextDouble();

        System.out.print("Enter y-coordinate of second point: ");
        double y2 = in.nextDouble();

        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.printf("The distance between the two points is: %.2f", distance);
    }
}

```

In this above Java program, there are several Math functions being used. Let me explain each of them:

1. `Math.sqrt()`: This function returns the square root of a given number. In the context of your program, it's used to
   find the square root of the sum of the squares of the differences in x and y coordinates.

2. `Math.pow(x, y)`: This function is used to raise a number `x` to the power of `y`. In your code, it's used to
   calculate the squared differences in x and y coordinates. For example, `Math.pow(x2 - x1, 2)` calculates the squared
   difference between `x2` and `x1`.

3. `Math.round()`: This function is used to round a decimal number to the nearest integer. In your original code, it was
   used to round the calculated distance to the nearest integer. However, it has been removed in the corrected version
   to provide a more accurate result.

4. `System.out.printf()`: This is a method for formatting output in Java. In your code, it's used to print the final
   result with a specific format. `%f` is a format specifier for floating-point numbers (like `double`), and `%.2f`
   indicates that the number should be printed with two decimal places.

Overall, these Math functions are used together to calculate the distance between two points in a Cartesian plane using
the distance formula. The formula is `sqrt((x2 - x1)^2 + (y2 - y1)^2)`, which represents the Euclidean distance between
the points `(x1, y1)` and `(x2, y2)`.

---

# Other Math Functions

Here are some of the most commonly used Math functions in Java, along with explanations of what they do:

1. **`Math.abs(x)`**:
    - Returns the absolute value of `x`, which is the non-negative value of `x` without regard to its sign.
    - Example: `Math.abs(-5)` returns `5`.

2. **`Math.sqrt(x)`**:
    - Returns the square root of `x`.
    - Example: `Math.sqrt(25)` returns `5`.

3. **`Math.pow(x, y)`**:
    - Returns `x` raised to the power of `y`.
    - Example: `Math.pow(2, 3)` returns `8` (since 2^3 = 8).

4. **`Math.max(x, y)`**:
    - Returns the larger of the two values, `x` and `y`.
    - Example: `Math.max(5, 8)` returns `8`.

5. **`Math.min(x, y)`**:
    - Returns the smaller of the two values, `x` and `y`.
    - Example: `Math.min(5, 8)` returns `5`.

6. **`Math.ceil(x)`**:
    - Returns the smallest integer that is greater than or equal to `x`.
    - Example: `Math.ceil(4.3)` returns `5.0`.

7. **`Math.floor(x)`**:
    - Returns the largest integer that is less than or equal to `x`.
    - Example: `Math.floor(4.8)` returns `4.0`.

8. **`Math.round(x)`**:
    - Rounds `x` to the nearest integer. If the fractional part is exactly 0.5, it rounds towards the nearest even
      number.
    - Example: `Math.round(4.5)` returns `4`.

9. **`Math.random()`**:
    - Returns a random double value between 0.0 (inclusive) and 1.0 (exclusive).
    - Example: `Math.random()` might return `0.732`.

10. **`Math.sin(x)`, `Math.cos(x)`, `Math.tan(x)`**:

- These functions return the sine, cosine, and tangent of the angle `x` (in radians) respectively.
- Example: `Math.sin(Math.PI/2)` returns `1.0` (since sine of 90 degrees is 1).

11. **`Math.log(x)`**:

- Returns the natural logarithm (base e) of `x`.
- Example: `Math.log(Math.E)` returns `1.0` (since the natural logarithm of `e` is 1).

12. **`Math.exp(x)`**:

- Returns `e` raised to the power of `x`.
- Example: `Math.exp(1)` returns `2.71828` (approximately).

These are some of the frequently used Math functions in Java. They are part of the `java.lang.Math` class and provide a
wide range of mathematical operations. Keep in mind that many of these functions accept and return `double` values, so
they are capable of handling both integer and floating-point arithmetic.

---

