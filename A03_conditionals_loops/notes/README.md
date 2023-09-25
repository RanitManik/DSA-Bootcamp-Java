- **Loop Scaopes**

  For loop is used when the number of iterations is known, while loop is used when the number of iterations is
  uncertain, and do-while loop is similar to while but ensures the code runs at least once.

---

- **Special Characters in JAVA**

  Java includes special characters for operations like logical NOT (`!`), not equal to (`!=`), modulus (`%`), logical
  AND (`&&`), bitwise AND (`&`), multiplication (`*`), grouping (`()`), code blocks (`{}`), arrays (`[]`), loop
  labels (`:`), statement termination (`;`), assignment (`=`), equal to (`==`), comparison (`>`, `<`), ternary
  conditional (`?`), logical OR (`||`), and bitwise OR (`|`).

---

- **understanding TypeCasting**

```java
  Scanner in = new Scanner(System.in);
  System.out.print("Enter the radius of the circle: ");
  int radius = in.nextInt();

        float area = (((float) 22 / 7) * radius * radius);
        System.out.println("The Area of the circle is = " + area);
```

  the type casting `(float)` is used to ensure that the division operation yields a floating-point result,
  which is crucial for accurate calculation of the area of the circle. Without this type casting, the division would be
  performed as integer division, potentially leading to inaccurate results.