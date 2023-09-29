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

Explanation:

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