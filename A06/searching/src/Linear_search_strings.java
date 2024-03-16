package A06.searching.src;

import java.util.Objects;
import java.util.Scanner;

public class Linear_search_strings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the element you want to find from the array: ");
        String[] array = {"ranit", "manik", "is", "god"};
        String target = in.nextLine();
        // calling the function ==>
        System.out.println("The index of the element you are searching in the array is: " + linear_search(array, target)); // index starts from '0' in the java
    }

    // searching in the array: return the index if found the item
    // otherwise if item not found return '-1'
    static int linear_search(String[] arr, String target) {
        if (arr.length == 0) {
            return -1;
        }

        // run a for loop ==>
        for (int index = 0; index < arr.length; index++) {
            // check for an element at every index if or is == target ==>
            String element = arr[index];
            if (Objects.equals(element, target)) {
                return index;
            }
        }
        // this line will execute if none of the above return statements have executed
        // ==> no return statement has been hit in the function
        // ==> hence the target is not found
        return -1; // as '-1' cannot be an index value
    }
}
