package Day_07;

import java.util.Arrays;
import java.util.Scanner;

public class Array_of_objects {
    public static void main(String[] args) {
        System.out.println("Enter the Array inputs: ");
        Scanner in = new Scanner(System.in);

        // array of objects ==>
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));

        // modify array ==>
        str[0] = "Ranit";
        str[1] = "Manik";
        // the first two elements of array 'str' will be overridden

        System.out.println(Arrays.toString(str)); // printing the array after modification
    }
}
