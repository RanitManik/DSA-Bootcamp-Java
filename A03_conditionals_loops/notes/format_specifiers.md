# Format Specifiers

In Java, `printf` is a method used for formatted output. It allows you to control the appearance of the
output by specifying a format string along with the values you want to print.

Here are some common format specifiers used with `printf`:

1. **`%d`** - This is used for formatting integers. It is often used with variables of type `int`.

   Example:
   ```java
   int number = 10;
   System.out.printf("The number is %d", number);
   // Output: The number is 10
   ```

2. **`%f`** - This is used for formatting floating-point numbers (like `float` or `double`). It allows you to control
   the number of decimal places.

   Example:
   ```java
   double value = 3.14159;
   System.out.printf("The value of pi is approximately %.2f", value);
   // Output: The value of pi is approximately 3.14
   ```

3. **`%s`** - This is used for formatting strings. It is often used with variables of type `String`.

   Example:
   ```java
   String name = "John";
   System.out.printf("Hello, %s!", name);
   // Output: Hello, John!
   ```

4. **`%n`** - This represents a platform-independent newline character.

   Example:
   ```java
   System.out.printf("Line 1%nLine 2");
   // Output:
   // Line 1
   // Line 2
   ```

5. **`%c`** - This is used for formatting characters.

   Example:
   ```java
   char grade = 'A';
   System.out.printf("The grade is %c", grade);
   // Output: The grade is A
   ```

6. **`%b`** - This is used for formatting boolean values.

   Example:
   ```java
   boolean isTrue = true;
   System.out.printf("The statement is %b", isTrue);
   // Output: The statement is true
   ```

7. **`%x`** - This is used for formatting integers in hexadecimal (base 16) format.

   Example:
   ```java
   int number = 255;
   System.out.printf("The number in hexadecimal is %x", number);
   // Output: The number in hexadecimal is ff
   ```

These are just a few examples of format specifiers. There are more available for different types of data. The format
specifiers are replaced by the corresponding values passed as arguments in the `printf` method. This allows you to
control how the output is displayed.

---