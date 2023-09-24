package A04_functions.src;

// When two or more methods have the same name but have different arguments, then the condition is called "Method Overloading"
// In compile time, the compiler decides which function to execute by checking the arguments
// For the Method Overloading either the no of arguments should be different, or the type of arguments should be different
public class Method_overloading {
    public static void main(String[] args) {
        fun(5);
        fun(5, 6);
        fun("Hello");
    }

    static void fun(int a) {
        System.out.println("This is first method: " + a);
    }

    static void fun(int a, int b) {
        System.out.println("This is second method: " + a + b);
    }

    static void fun(String name) {
        System.out.println("This is third method: " + name);
    }
}
