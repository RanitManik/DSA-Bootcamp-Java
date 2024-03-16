package A07.strings.src;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Ranit Kumar Manik";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase()); // new string object
        System.out.println(name.toUpperCase()); // new string object
        System.out.println(name.indexOf('n'));
        System.out.println("        ranit        ".strip());
        System.out.println(Arrays.toString(name.split(" ")));

    }
}
