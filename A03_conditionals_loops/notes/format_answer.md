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