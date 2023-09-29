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