## Table of contents

1. [Understanding Character Input with Scanner in Java](#understanding-character-input-with-scanner-in-java)
2. [Comma and Plus in Print Statement](#comma-and-plus-in-print-statement)
3. [float vs double in JAVA](#float-vs-double-in-java)
4. [literals in JAVA](#literals-in-java)
5. [Take a String Input in JAVA](#take-a-string-input-in-java)
6. [str.charAt() method](#strcharat-method)
7. [several ways to format and print output in Java](#several-ways-to-format-and-print-output-in-java)
8. [Long Variable](#long-variable)
9. [Loops in Java: for, while, do-while](#loops-in-java-for-while-do-while)
10. [Understanding Math Functions](#understanding-character-input-with-scanner-in-java)
11. [Other Math Functions](#other-math-functions)
12. [nCr (combination) and nPr (permutation):](#ncr-combination-and-npr-permutation)
13. [Reverse a String](#reverse-a-string)
14. [techniques to round floating-point numbers](#techniques-to-round-floating-point-numbers)
15. [Scanner close Method](#scanner-close-method)
16. [Special Characters in Java](#special-characters-in-java)
17. [String.valueOf(num) Method](#stringvalueofnum-method)
18. [Understanding TypeCasting in this code](#understanding-typecasting-in-this-code)
19. [Applying TypeCasting in different situations](#applying-typecasting-in-different-situations)
20. [Debugging TypeCasting in this code](#debugging-typecasting-in-this-code)

---

# Understanding Character Input with Scanner in Java

In the given Java code snippet:

```java
Scanner in=new Scanner(System.in);
        char op=in.next().trim().charAt(0);
```

1. We create a `Scanner` object named `in` to read input from the standard input (usually the keyboard).

2. `in.next()` is used to read a string input from the user. This means the user can enter one or more characters.

3. `.trim()` is called on the input string to remove any leading or trailing whitespace. This ensures that any extra
   spaces or newline characters are removed.

4. `.charAt(0)` extracts the first character from the trimmed input string. Since strings in Java are zero-indexed (the
   first character is at index 0), this line of code retrieves the first character entered by the user.

So, at the end of this code snippet, the variable `op` will contain the first character that the user entered, and you
can use it for further processing in your Java program.

This code allows you to read a single character as input from the user and store it in the variable `op` for use in your
program like i have used it in the calculator.java file.

---

# Comma and Plus in Print Statement

> In summary, the comma provides a convenient way to print multiple values with automatic conversion to strings and
> added
> spaces, while the plus sign is used specifically for string concatenation and requires explicit handling of spaces and
> conversions.

In Java, the comma (,) and the plus sign (+) serve different purposes when used in a print statement.

1. **Comma (,)**:
    - The comma is used to separate different arguments in the `System.out.print` or `System.out.println` statement.
    - It adds a space between the printed values.
    - It automatically converts non-string types to strings and concatenates them.
    - Example:

```java
int num1=10;
        int num2=20;
        System.out.print("The numbers are: ",num1," and ",num2);
```

Output:

```
The numbers are: 10 and 20
```

2. **Plus Sign (+)**:
    - The plus sign is used for string concatenation, which means joining together multiple strings or converting
      non-string types to strings and appending them.
    - It does not automatically add spaces between concatenated values. You need to explicitly include spaces if
      desired.
    - Example:

```java
int num1=10;
        int num2=20;
        System.out.print("The numbers are: "+num1+" and "+num2);
```

Output:

```
The numbers are: 10 and 20
```

**Note**: In modern Java, using `System.out.println` is more common than `System.out.print`. The `println` method
automatically appends a newline character after the output. If you want to achieve the same result with a newline
using `System.out.print`, you would need to add `System.out.print("\n")` after your statement.

---

# float vs double in JAVA

In Java, `float` and `double` are data types used to represent decimal numbers with varying levels of precision.

`float` is a 32-bit single-precision floating-point type, which can store values with up to 7 decimal digits of
precision. It is suitable for most general-purpose floating-point calculations.

`double` is a 64-bit double-precision floating-point type, offering higher precision with up to 15 decimal digits. It is
commonly used for scientific calculations or situations where higher accuracy is required.

In summary, `float` is less precise but takes up less memory, while `double` provides higher precision at the cost of
slightly more memory usage. The choice between them depends on the specific requirements of the application.

---

# literals in JAVA

In Java, a literal is a constant value that is used directly in your code. It's a way to represent fixed values in a
program. For example, `5` is a literal representing the integer value 5, and `3.14` is a literal representing the
floating-point value 3.14.

Here are some common types of literals in Java:

1. **Integer Literals**: These represent whole numbers without any decimal point. For example, `0`, `123`, `-500`, etc.

2. **Floating-Point Literals**: These represent numbers with a decimal point or in scientific notation. For
   example, `3.14`, `2.0`, `1.2345e3` (which represents 1234.5), etc.

3. **Character Literals**: These represent a single character enclosed in single quotes. For
   example, `'A'`, `'3'`, `'\n'` (newline character), etc.

4. **String Literals**: These represent a sequence of characters enclosed in double quotes. For
   example, `"Hello"`, `"123"`, etc.

5. **Boolean Literals**: There are only two boolean literals in Java: `true` and `false`.

6. **Null Literal**: The keyword `null` represents a reference that does not point to any object.

Here are some examples:

```java
int num=42;       // Integer literal
        double pi=3.14;   // Floating-point literal
        char letter='A';  // Character literal
        String message="Hello"; // String literal
        boolean isTrue=true;    // Boolean literal
        Object obj=null;        // Null literal
```

These literals provide a way to represent constant values in your code without having to calculate them or define them
elsewhere. They are often used for initializing variables or passing values to methods.

---

# Take a String Input in JAVA

To take a string input in Java, you can use the `Scanner` class. Here's an example program that demonstrates how to do
this:

```java
import java.util.Scanner;

public class StringInputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        System.out.println("You entered: " + userInput);

        scanner.close();
    }
}
```

Explanation:

1. **Import Statement**:
    - `import java.util.Scanner;`: This imports the `Scanner` class from the `java.util` package, which is used for
      taking input from the user.

2. **Class Declaration**:
    - `public class StringInputExample { ... }`: This defines a public class named `StringInputExample`.

3. **Main Method**:
    - `public static void main(String[] args) { ... }`: This is the entry point of the program.

4. **Creating a Scanner Object**:
    - `Scanner scanner = new Scanner(System.in);`: This creates a new `Scanner` object to read input from the console.

5. **Prompting User for Input**:
    - `System.out.print("Enter a string: ");`: This prints a message asking the user to enter a string.

6. **Reading String Input**:
    - `String userInput = scanner.nextLine();`: This line reads a line of text (including spaces) entered by the user
      and stores it in the variable `userInput`.

7. **Displaying the Input**:
    - `System.out.println("You entered: " + userInput);`: This line prints out the message "You entered:" followed by
      the string that the user input.

8. **Closing the Scanner**:
    - `scanner.close();`: This line closes the `Scanner` to free up system resources.

To run this program, you can copy the code into a Java file (e.g., `StringInputExample.java`) and use a Java compiler to
compile and execute it. When you run the program, it will prompt you to enter a string, and then it will display the
string you entered.

---

# str.charAt() method

The `str.charAt()` method is a function in Java that belongs to the `String` class. It is used to retrieve a specific
character from a string at a specified index position.

Here's the syntax of the `charAt()` method:

```java
char charAt(int index)
```

- `index`: The position of the character you want to retrieve. It should be an integer value within the valid range of
  indices for the string.

The method returns the character at the specified index as a `char` data type.

Here's an example to illustrate how `str.charAt()` works:

```java
String str="Hello";
        char characterAtIndex2=str.charAt(2); // Retrieves the character at index 2

        System.out.println(characterAtIndex2); // Output will be 'l'
```

In this example, the string `str` is "Hello". The call `str.charAt(2)` retrieves the character at index 2, which is 'l',
and assigns it to the variable `characterAtIndex2`.

Remember that string indices in Java are 0-based. So, the first character is at index 0, the second character is at
index 1, and so on.

If you try to access an index that is out of bounds (i.e., less than 0 or greater than or equal to the length of the
string), it will result in a `StringIndexOutOfBoundsException`. Therefore, it's important to ensure that the index is
within the valid range before using `charAt()`.

---

# several ways to format and print output in Java

1. **Using `System.out.println()` with Concatenation:**

```java
double result=123.456789;
        System.out.println("Result: "+result);
```

- Output:

```
Result: 123.456789
```

2. **Using `System.out.printf()` with Format Specifiers:**

```java
double result=123.456789;
        System.out.printf("Result: %.2f%n",result);
```

- Output:

```
Result: 123.46
```

3. **Using `String.format()`:**

```java
double result=123.456789;
        String formattedResult=String.format("Result: %.2f",result);
        System.out.println(formattedResult);
```

- Output:

```
Result: 123.46
```

4. **Using `Formatter` (part of `java.util`):**

```java
import java.util.Formatter;

double result=123.456789;
        Formatter formatter=new Formatter();
        formatter.format("Result: %.2f",result);
        System.out.println(formatter);
```

- Output:

```
Result: 123.46
```

5. **Using `DecimalFormat` (part of `java.text`):**

```java
import java.text.DecimalFormat;

double result=123.456789;
        DecimalFormat decimalFormat=new DecimalFormat("0.00");
        String formattedResult=decimalFormat.format(result);
        System.out.println("Result: "+formattedResult);
```

- Output:

```
Result: 123.46
```

6. **Using `StringJoiner` (part of `java.util`):**

```java
import java.util.StringJoiner;

double result=123.456789;
        StringJoiner joiner=new StringJoiner(": ","Result: ","");
        joiner.add(String.valueOf(result));
        System.out.println(joiner.toString());
```

- Output:

```
Result: 123.456789
```

These are examples of how you can format and print output in Java using various methods. Each method provides a
different level of flexibility and customization depending on your specific needs.

---

# Long Variable

A "**long variable**" typically refers to a data type in programming languages, often used to store integer values that
require a larger range than a standard integer type. It usually occupies more memory space.

For example, in languages like Java or C#, a "long" data type can store a wider range of values compared to an "int"
data type.

Here's an example in Java:

```java
long myLongVariable=1234567890L;
```

In this example, `myLongVariable` is a variable of type `long` and it's assigned the value `1234567890`. The `L` at the
end of the number indicates that it's a long literal.

Keep in mind that the specific details may vary depending on the programming language you're using. If you have a
specific language in mind, feel free to ask for an example in that language!

---

# Loops in Java: for, while, do-while

## For Loop

Use when you know the number of iterations in advance, like going through an array.

```java
for(int i=1;i<=n;i++){
        // Code to execute
        }
```

## While Loop

Use when you don't know how many iterations are needed.

```java
while(condition){
        // Code to execute
        }
```

## Do-While Loop

Similar to `while`, but ensures the code block runs at least once.

```java
do{
        // Code to execute
        }while(condition);
```

---

# Understanding Math Functions

```java
// Q5. Calculate Distance Between Two Points

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

# nCr (combination) and nPr (permutation):

```java
import java.util.Scanner;

public class CombinationPermutationCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        System.out.print("Enter the value of r: ");
        int r = scanner.nextInt();

        long nCr = calculateNcr(n, r);
        long nPr = calculateNpr(n, r);

        System.out.println("nCr (" + n + " choose " + r + ") = " + nCr);
        System.out.println("nPr (" + n + " permute " + r + ") = " + nPr);

        scanner.close();
    }

    // Method to calculate nCr
    static long calculateNcr(int n, int r) {
        // Base cases
        if (r > n) return 0;
        if (r == 0 || n == r) return 1;

        // Dynamic programming table to store results
        long[][] dp = new long[n + 1][r + 1];

        // Initialize base cases
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }

        // Fill up the table using dynamic programming
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= Math.min(i, r); j++) {
                dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
            }
        }

        // Return the result
        return dp[n][r];
    }

    // Method to calculate nPr
    static long calculateNpr(int n, int r) {
        // Base case
        if (r > n) return 0;

        // Initialize result to 1
        long result = 1;

        // Calculate nPr using loop
        for (int i = 0; i < r; i++) {
            result *= (n - i);
        }

        // Return the result
        return result;
    }
}
```

## Explanation:

1. **Import Statement**:
   `import java.util.Scanner;`: This statement imports the `Scanner` class from the `java.util` package, which is
   used for taking input from the user.

2. **Class Declaration**:
   `public class CombinationPermutationCalculator { ... }`: This defines a public class
   named `CombinationPermutationCalculator`.

3. **Main Method**:
   `public static void main(String[] args) { ... }`: This is the entry point of the program. It prompts the user to
   enter values for `n` and `r`, calculates both nCr and nPr, and prints the results.

4. **Taking User Input**:
   `Scanner scanner = new Scanner(System.in);`: This creates a new `Scanner` object to read input from the console.

5. **Getting Values of n and r**:
   `int n = scanner.nextInt();` and `int r = scanner.nextInt();`: These lines prompt the user to enter the values
   of `n` and `r`, and then store those values in the variables `n` and `r`, respectively.

6. **Calculating nCr**:
   `long nCr = calculateNcr(n, r);`: This calls the `calculateNcr` method (explained later) to compute the
   combination (nCr) and stores the result in the variable `nCr`.

7. **Calculating nPr**:
   `long nPr = calculateNpr(n, r);`: This calls the `calculateNpr` method (explained later) to compute the
   permutation (nPr) and stores the result in the variable `nPr`.

8. **Printing Results**:
   `System.out.println("nCr (" + n + " choose " + r + ") = " + nCr);`
   and `System.out.println("nPr (" + n + " permute " + r + ") = " + nPr);`: These lines print out the calculated
   values of nCr and nPr along with informative messages.

9. **Closing the Scanner**:
   `scanner.close();`: This line closes the `Scanner` to free up system resources.

10. **Method for Calculating nCr** (`calculateNcr`):

    This method uses dynamic programming to calculate the combinations (nCr). It handles base cases, initializes a 2D
    array to store results, and fills up the table using dynamic programming.

11. **Method for Calculating nPr** (`calculateNpr`):

This method calculates permutations (nPr) using a loop. It multiplies `n` with `n-1`, `n-2`, and so on, `r` times.

Overall, this program provides a user-friendly interface for calculating both combinations (nCr) and permutations (
nPr)
for given values of `n` and `r`.

---

# Reverse a String

Here's a Java program that reverses a string:

```java
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String reversed = reverseString(input);

        System.out.println("Reversed string: " + reversed);

        scanner.close();
    }

    static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }

        return reversed.toString();
    }
}
```

## Explanation:

1. **Import Statement**:
    - `import java.util.Scanner;`: This imports the `Scanner` class from the `java.util` package, which is used for
      taking input from the user.

2. **Class Declaration**:
    - `public class ReverseString { ... }`: This defines a public class named `ReverseString`.

3. **Main Method**:
    - `public static void main(String[] args) { ... }`: This is the entry point of the program.

4. **Creating a Scanner Object**:
    - `Scanner scanner = new Scanner(System.in);`: This creates a new `Scanner` object to read input from the console.

5. **Prompting User for Input**:
    - `System.out.print("Enter a string: ");`: This prints a message asking the user to enter a string.

6. **Reading String Input**:
    - `String input = scanner.nextLine();`: This line reads a line of text (including spaces) entered by the user and
      stores it in the variable `input`.

7. **Reversing the String**:
    - `String reversed = reverseString(input);`: This calls the `reverseString` method (explained later) to reverse the
      input string and stores the result in the variable `reversed`.

8. **Displaying the Reversed String**:
    - `System.out.println("Reversed string: " + reversed);`: This line prints out the message "Reversed string:"
      followed by the reversed string.

9. **Closing the Scanner**:
    - `scanner.close();`: This line closes the `Scanner` to free up system resources.

10. **Method for Reversing a String** (`reverseString`):

- This method takes a string (`str`) as input and returns the reversed version of the string.

- It uses a `StringBuilder` to efficiently build the reversed string.

- It iterates through the characters of the input string in reverse order and appends them to the `StringBuilder`.

- Finally, it converts the `StringBuilder` to a string using `toString()` and returns the result.

To run this program, you can copy the code into a Java file (e.g., `ReverseString.java`) and use a Java compiler to
compile and execute it. When you run the program, it will prompt you to enter a string, and then it will display the
reversed string.

---

# techniques to round floating-point numbers

In Java, there are several methods and techniques you can use to round floating-point numbers (like `float` or `double`)
to a specified number of decimal places. Here are a few different approaches:

1. **Using `Math.round()`**:
    - The `Math.round()` method is used to round a decimal number to the nearest integer. To round to a specific number
      of decimal places, you can use it in combination with multiplication and division.

   Example:
   ```java
   double num = 3.14159265359;
   double rounded = Math.round(num * 100.0) / 100.0; // Rounds to 2 decimal places
   ```

2. **Using `DecimalFormat`**:
    - The `DecimalFormat` class is part of the `java.text` package and provides a way to format numbers with a specific
      pattern. It allows you to control the number of decimal places.

   Example:
   ```java
   import java.text.DecimalFormat;
   
   double num = 3.14159265359;
   DecimalFormat df = new DecimalFormat("#.##"); // Pattern for 2 decimal places
   String formatted = df.format(num);
   double rounded = Double.parseDouble(formatted);
   ```

3. **Using `String.format()`**:
    - The `String.format()` method allows you to create a formatted string using a specified format pattern. It's
      similar to `printf` but returns a formatted string instead of printing it.

   Example:
   ```java
   double num = 3.14159265359;
   String formatted = String.format("%.2f", num); // Formats to 2 decimal places
   double rounded = Double.parseDouble(formatted);
   ```

4. **Using `BigDecimal`** (for precise rounding):
    - `BigDecimal` is a class in Java that provides arbitrary-precision arithmetic. It can be used for precise rounding
      of decimal numbers.

   Example:
   ```java
   import java.math.BigDecimal;
   
   double num = 3.14159265359;
   BigDecimal bd = new BigDecimal(num);
   bd = bd.setScale(2, BigDecimal.ROUND_HALF_UP); // Rounds to 2 decimal places
   double rounded = bd.doubleValue();
   ```

These are some common methods to round floating-point numbers in Java. Each method has its own use case and advantages,
so you can choose the one that fits your specific requirements and preferences.

---

# Scanner close Method

```java
// Q6. Calculate Commission Percentage

package A03_conditionals_loops.assignments.Intermediate;

import java.util.Scanner;

public class Program_06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Get total sales and commission rate from the user
        System.out.print("Enter total sales: ");
        double totalSales = in.nextDouble();

        System.out.print("Enter commission rate (in percentage): ");
        double commissionRate = in.nextDouble();

        // Calculate commission
        double commission = (totalSales * commissionRate) / 100;

        // Print the commission
        System.out.println("The commission is: " + commission);

        // Close the scanner
        in.close();
    }
}
```

In Java, the `close()` method is used to release any resources associated with a `Scanner` object. This is important
because failing to release these resources can lead to memory leaks or other issues.

In the provided Java program, we use a `Scanner` to get input from the user. After we're done using the `Scanner`, it's
good practice to close it using the `close()` method. This ensures that any system resources associated with
the `Scanner` (such as file handles or other I/O resources) are properly released.

In summary, calling `scanner.close()` is a way to clean up and free up any resources that the `Scanner` was using, which
is important for efficient and reliable program execution.

---

# Special Characters in Java

Java allows the following special characters:

- `!` - Logical NOT operator
- `!=` - Not equal to operator
- `%` - Modulus operator
- `&&` - Logical AND operator
- `&` - Bitwise AND operator
- `*` - Multiplication operator
- `()` - Parentheses for grouping
- `{}` - Curly braces for code blocks
- `[]` - Square brackets for arrays
- `:` - Colon for labels in loops
- `;` - Semicolon to end statements
- `=` - Assignment operator
- `==` - Equal to operator
- `>` `<` - Comparison operators
- `?` - Ternary conditional operator
- `||` - Logical OR operator
- `|` - Bitwise OR operator

---

# String.valueOf(num) Method

`String.valueOf(num)` is a Java method that converts a given value `num` (which can be of any primitive type or an
object) into its corresponding string representation. In this context, `num` is typically an integer.

For example, if `num` is `123`, `String.valueOf(num)` will return the string `"123"`.

Following that, `.length()` is a method available for strings in Java. It returns the number of characters in the
string.

So, `String.valueOf(num).length()` combines these two operations. It converts the integer `num` into its string
representation and then calculates the length (i.e., the number of characters) of that string.

For example, if `num` is `123`, `String.valueOf(num)` returns the string `"123"`, and `.length()` applied to this string
returns `3` because there are three characters in the string `"123"`.

This combination of methods is often used when you need to determine the number of digits in an integer without doing
complex mathematical operations. In the context of the previous Armstrong Number Java program, it's used to find out how
many digits are in the input number.

Let's go through an example to demonstrate the usage of `String.valueOf(num).length()` with some Java code:

```java
public class Example {
    public static void main(String[] args) {
        int num = 12345;

        // Convert num to its string representation
        String numAsString = String.valueOf(num);

        // Get the length of the string
        int length = numAsString.length();

        System.out.println("The number " + num + " as a string is: " + numAsString);
        System.out.println("The length of the string is: " + length);
    }
}
```

## Explanation:

1. `int num = 12345;`: We start with an integer variable `num` which is initialized to `12345`.

2. `String numAsString = String.valueOf(num);`: Here, `String.valueOf(num)` converts the integer `num` into a string. In
   this case, `numAsString` will be `"12345"` (a string).

3. `int length = numAsString.length();`: The `length()` method is then used on the string `numAsString` to find out how
   many characters it contains. In this case, `length` will be `5` because there are five characters in the
   string `"12345"`.

4. The program then prints out the original number as a string and the length of the string.

Output:

```
The number 12345 as a string is: 12345
The length of the string is: 5
```

In summary, `String.valueOf(num)` is used to convert an integer `num` to its string representation,
and `numAsString.length()` is used to find out how many characters are in that string. This can be very useful in
scenarios where you need to work with the individual digits of a number or determine its length without performing
mathematical operations.

---

# Understanding TypeCasting in this code

      Scanner in = new Scanner(System.in);
      System.out.print("Enter the radius of the circle: ");
      int radius = in.nextInt();
      
              float area = (((float) 22 / 7) * radius * radius);
              System.out.println("The Area of the circle is = " + area);

In the provided code, there is a Java program that calculates the area of a circle based on user input. Let's break down
the code and explain the type casting that occurs:

1. `Scanner in = new Scanner(System.in);`: This line creates a new instance of the `Scanner` class, which is used to
   read user input from the console. `System.in` represents the standard input stream, which is usually the keyboard.

2. `System.out.print("Enter the radius of the circle: ");`: This line prints a message to the console, asking the user
   to input the radius of the circle.

3. `int radius = in.nextInt();`: This line uses the `nextInt()` method of the `Scanner` class to read an integer value
   entered by the user. It then assigns this value to the variable `radius`, which is of type `int`.

4. `float area = (((float) 22 / 7) * radius * radius);`: This line calculates the area of the circle. Let's break down
   the type casting:

    - `(float) 22 / 7`: Here, `22` is an integer, and `7` is also an integer. When you perform integer division in Java,
      the result will be an integer. To ensure that we get a floating-point result, we use `(float)` to explicitly
      cast `22` to a `float` before the division operation. This way, the division will yield a floating-point result.

    - The rest of the calculation (`* radius * radius`) involves multiplying the result of the division by the square of
      the radius.

5. `System.out.println("The Area of the circle is = " + area);`: This line prints the calculated area to the
   console. `area` is concatenated with the string `"The Area of the circle is = "` and the result is printed.

In summary, the type casting `(float)` is used to ensure that the division operation yields a floating-point result,
which is crucial for accurate calculation of the area of the circle. Without this type casting, the division would be
performed as integer division, potentially leading to inaccurate results.

---

# Applying TypeCasting in different situations

```
// Q2. Area Of Triangle

package A03_conditionals_loops.assignments;

import java.util.Scanner;

public class Program_02 {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
System.out.print("Enter the base of the triangle: ");
int b = in.nextInt();
System.out.print("Enter the height of the triangle: ");
int h = in.nextInt();

        // Method 1 ==>
        float area_m1 = (float) (0.5 * b * h);
        System.out.println("The area of the triangle is: " + area_m1);

        // Method 2 ==>
        float area_m2 = (((float) 1 / 2) * b * h);
        System.out.println("The area of the triangle is: " + area_m2);

        // Method 3 ==>
        double area_m3 = ((1.0 / 2) * (b * h));
        System.out.println("The area of the triangle is: " + area_m3);
    }
}
```

---

In Method 1, you're using explicit type casting to ensure that the result of the calculation is a `float` type. Here's
the breakdown:

```java
float area_m1=(float)(0.5*b*h);
```

1. `(0.5 * b * h)` calculates half of the base (`b`) times the height (`h`). This gives you the area of the triangle.

2. The result of this calculation is a numeric value, but by default, Java would treat this as a `double` (since
   floating-point literals are interpreted as `double` by default).

3. However, you want the result to be a `float`. So, you use explicit type casting by putting `(float)` in front of the
   calculation. This tells Java to convert the result to a `float`.

4. Finally, you assign this `float` value to the variable `area_m1`.

This method ensures that the result of the calculation is stored as a `float`, which is useful if you want to work with
floating-point numbers with a lower precision compared to `double`. This can be beneficial in scenarios where memory
usage or storage space is a concern.

---

In Method 2, you're using explicit type casting in a slightly different way compared to Method 1. Here's the breakdown:

```java
float area_m2=(((float)1/2)*b*h);
```

1. `(1 / 2)` is a division operation between two integers. Since both `1` and `2` are integers, the result of this
   division will be an integer division. In this case, `1` divided by `2` equals `0` (since the result is truncated to
   the nearest integer).

2. To ensure that the result is treated as a `float`, you use explicit type casting. `(float)` is placed in front
   of `1`, which tells Java to treat `1` as a `float`. So, now the division is between a `float` and an `int`, which
   will result in a `float`.

3. This `float` value is then multiplied by `b` and `h` to calculate the area of the triangle.

4. Finally, you assign this `float` value to the variable `area_m2`.

This method achieves the same result as Method 1, but it uses explicit type casting in a slightly different way. Instead
of explicitly casting the entire calculation, it only casts the numerator to a `float`, which affects the entire
calculation due to the rules of numeric promotion in Java.

---

In Method 3, you're performing the calculation using double precision without any explicit type casting. Here's the
breakdown:

```java
double area_m3=((1.0/2)*(b*h));
```

1. `(1.0 / 2)` is a division operation between two floating-point numbers. Since `1.0` is a `double` literal, the result
   of this division is a `double`. This means you're directly working with `double` precision.

2. `(b * h)` calculates the product of the base (`b`) and height (`h`), which is another `int`.

3. The result of this product operation is then multiplied by `1.0 / 2`, which is a `double`. Since one of the operands
   is a `double`, the result will also be a `double`.

4. Finally, you assign this `double` value to the variable `area_m3`.

This method achieves the same result as Method 1 and Method 2, but it uses double precision directly without any
explicit type casting. It's a straightforward approach for calculating the area of a triangle.

---

# Debugging TypeCasting in this code

```java
float area=((float)(1/2)*(b*h));
        System.out.println("The area of the triangle: is "+area);
```

Your code seems to be written in Java and it calculates the area of a triangle based on the input of its base and
height. However, there's a small mistake in the formula.

In Java, when you perform arithmetic operations with integers, the result is also an integer. So, in this line:

```java
float area=((float)(1/2)*(b*h));
```

The expression `(1 / 2)` is evaluated first, which results in `0` because both `1` and `2` are integers. Then, this `0`
is converted to a float, which remains `0`. This means your area calculation always results in `0`.

To fix this, you should make sure that at least one of the operands in `(1 / 2)` is a float. You can do this by
using `1.0` instead of `1`:

```java
float area=((float)(1.0/2)*(b*h));
```

Alternatively, you can simply write:

```java
float area=(0.5f*(b*h));
```

Both of these options will give you the correct area calculation.

---