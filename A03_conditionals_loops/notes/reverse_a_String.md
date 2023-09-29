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
