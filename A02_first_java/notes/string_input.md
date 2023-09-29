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