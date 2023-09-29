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