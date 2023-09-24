package T04_Functions_Methods.src;

import java.util.Scanner;

public class String_Greet {
    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        Scanner in = new Scanner(System.in);
        String name = in.next();
        String personilized = myGreet(name);
        System.out.println(personilized);
    }

    static String myGreet(String name) {
        String messege = "Hello " + name;
        return messege;
    }
}
