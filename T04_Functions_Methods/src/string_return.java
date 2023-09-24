package T04_Functions_Methods.src;

import java.sql.SQLOutput;

public class string_return {
    public static void main(String[] args) {
        String messege = greet();
        System.out.println(messege);
    }

    static String greet() {
        String greeting = "How are you?";
        return greeting;
    }
}
