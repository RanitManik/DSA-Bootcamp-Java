# Comma and Plus in Print Statement

> In summary, the comma provides a convenient way to print multiple values with automatic conversion to strings and added
spaces, while the plus sign is used specifically for string concatenation and requires explicit handling of spaces and
conversions.

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