package Day_04;

import static Day_04.string_return.greet;

public class Passing_Exmaple {
    public static void main(String[] args) {
        String my_name = "Ranit Manik";
        greet(my_name);

    }

    static void greet(String naam) {
        System.out.println(naam);
    }
}
