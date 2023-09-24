## Table of Contents

1. [Understanding Character Input with Scanner in Java](#Understanding Character Input with Scanner in Java)
2. [comma and plus in print statement](#comma and plus in print statement)

# Understanding Character Input with Scanner in Java

---

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

---

This code allows you to read a single character as input from the user and store it in the variable `op` for use in your
program like i have used it in the calculator.java file.

# comma and plus in print statement

---

In Java, the comma (,) and the plus sign (+) serve different purposes when used in a print statement.

1. **Comma (,)**:
   - The comma is used to separate different arguments in the `System.out.print` or `System.out.println` statement.
   - It adds a space between the printed values.
   - It automatically converts non-string types to strings and concatenates them.
   - Example:

```java
int num1 = 10;
int num2 = 20;
System.out.print("The numbers are: ", num1, " and ", num2);
```

Output:
```
The numbers are: 10 and 20
```

2. **Plus Sign (+)**:
   - The plus sign is used for string concatenation, which means joining together multiple strings or converting non-string types to strings and appending them.
   - It does not automatically add spaces between concatenated values. You need to explicitly include spaces if desired.
   - Example:

```java
int num1 = 10;
int num2 = 20;
System.out.print("The numbers are: " + num1 + " and " + num2);
```

Output:
```
The numbers are: 10 and 20
```

**Note**: In modern Java, using `System.out.println` is more common than `System.out.print`. The `println` method automatically appends a newline character after the output. If you want to achieve the same result with a newline using `System.out.print`, you would need to add `System.out.print("\n")` after your statement.