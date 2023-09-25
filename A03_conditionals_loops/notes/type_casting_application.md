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