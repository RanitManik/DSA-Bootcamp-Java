# Understanding TypeCasting in this code

      Scanner in = new Scanner(System.in);
      System.out.print("Enter the radius of the circle: ");
      int radius = in.nextInt();
      
              float area = (((float) 22 / 7) * radius * radius);
              System.out.println("The Area of the circle is = " + area);

In the provided code, there is a Java program that calculates the area of a circle based on user input. Let's break down the code and explain the type casting that occurs:

1. `Scanner in = new Scanner(System.in);`: This line creates a new instance of the `Scanner` class, which is used to read user input from the console. `System.in` represents the standard input stream, which is usually the keyboard.

2. `System.out.print("Enter the radius of the circle: ");`: This line prints a message to the console, asking the user to input the radius of the circle.

3. `int radius = in.nextInt();`: This line uses the `nextInt()` method of the `Scanner` class to read an integer value entered by the user. It then assigns this value to the variable `radius`, which is of type `int`.

4. `float area = (((float) 22 / 7) * radius * radius);`: This line calculates the area of the circle. Let's break down the type casting:

   - `(float) 22 / 7`: Here, `22` is an integer, and `7` is also an integer. When you perform integer division in Java, the result will be an integer. To ensure that we get a floating-point result, we use `(float)` to explicitly cast `22` to a `float` before the division operation. This way, the division will yield a floating-point result.

   - The rest of the calculation (`* radius * radius`) involves multiplying the result of the division by the square of the radius.

5. `System.out.println("The Area of the circle is = " + area);`: This line prints the calculated area to the console. `area` is concatenated with the string `"The Area of the circle is = "` and the result is printed.


In summary, the type casting `(float)` is used to ensure that the division operation yields a floating-point result, which is crucial for accurate calculation of the area of the circle. Without this type casting, the division would be performed as integer division, potentially leading to inaccurate results.

---