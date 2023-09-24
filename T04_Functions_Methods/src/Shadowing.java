package T04_Functions_Methods.src;

public class Shadowing {
    static int x = 90; // Global variable

    //    This will be shadowed at line 10 as the more local scope gets more priority
    public static void main(String[] args) {
        System.out.println("The value of x in main function: " + x);
        fun();
        int x; //declaration statement
//        System.out.println(x); ==> will through an error as scope will begin when the value is initialised
//        if you try to access the value between the declaration and initialisation statement then it will give an error
        x = 40; // initialization statement
        System.out.println("The value of x in main function: " + x);
    }

    static void fun() {
        System.out.println("The value of x in another function: " + x);
    }
}
