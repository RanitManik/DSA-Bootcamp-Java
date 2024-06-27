package A05__arrays.src;

public class Array {
    public static void main(String[] args) {
        // Q. Store a roll number :
        int roll = 34;
        // Q. Store a name :
        String name = "Ranit Kumar Manik";

        /*
        Array Syntax ==>
        datatype[] variable_name = new datatype[size];
         */

        // Q. Store 10 roll number :
        int[] roll_nos = new int[10];

        // or, directly ==>
        int[] roll_nos2 = {23, 34, 89, 45, 97};

        /*
        explanation of syntax ==>
        reference variable "roll_no2" is pointing to a collection of integer datatype
        here, 'new' keyword is used to create an object of the specified size of the array in the heap memory
         */

        // all the data in an array will be of same datatype

        // breakdown of array ==>
        int[] ros; // declaration of an array, ros is getting defined in the stack ==> happens in compile time
        ros = new int[5]; // actually, here an object is being created in the heap memory ==> happens in runtime ==> Dynamic memory allocation ==> at the runtime memory is being allocated

        /*
         Important points ==>
         1. array objects are in heap
         2. objects are not continuous ==> not in continuous block of memory
         3. Hence, an array may not be continuous ==> it totally depends on JVM as ==> Heap depends on JVM
         */

        // index of an array ==>
        /*
        indexing in java of an array or in general starts from '0'
        print(arr[0]) ==> it will print the '0'th element of the array 'arr'
         */

        System.out.println(roll_nos2[0]);
        System.out.println(ros[1]); // for an integer array by default, all the elements are '0'

        String[] arr = new String[4];
        System.out.println(arr[0]); // for a String array by default, it is null

        // In Java, null is a keyword much like the other keywords public, static or final.
        // It is just a value that shows that the object is referring to nothing.
        // any reference variable has the default value of 'null'

        // primitives [the datatype which can not be broken down into smaller datatype] are stored in stack memory
        // all the other objects or classes or anything are stored in the heap memory
        // for an array each element acts as an object ==> 'arr[0]' is an object
    }
}
