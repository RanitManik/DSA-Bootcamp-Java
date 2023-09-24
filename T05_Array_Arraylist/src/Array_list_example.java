package T05_Array_Arraylist.src;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_list_example {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // syntax ==>
        ArrayList<Integer> list = new ArrayList<>(4); // here 'list' is the reference variable
        // ArrayList is a class that belongs from the JAVA collection framework
        // classes are written in Capital letters in JAVA

        // Array list Methods ==>
        list.add(65);
        list.add(66);
        list.add(67);
        list.add(68);
        list.add(69);

        System.out.println(list.contains(67));
        System.out.println(list.contains(695));

        list.set(0, 99); // setting 0th index as '99'
        System.out.println(list);

        list.remove(2); // removes a specific index
        System.out.println(list);

        // input ==>
        System.out.println("Enter the values of the elements of list1: ");
        ArrayList<Integer> list1 = new ArrayList<>(4);
        for (int i = 0; i < 5; i++) {
            list1.add(in.nextInt());
        }
        // output using basic print method ==>
        System.out.println(list1);

        // output using get() method ==>
        for (int i = 0; i < 5; i++) {
            System.out.print(list1.get(i) + " "); // pass index here, list[index] syntax will not work here
        }


        // index of an arraylist ==>
        System.out.println("\nThe 1st index of the arraylist is :"); // '\n'(backslash n) works for every programming language
        System.out.println(list1.get(1));

        // how is arraylist capable of storing more than their size?
        // ==>
        /*
        1. size is fixed internally
        2. say arraylist fills by some amount
        ==> it will create a new empty arraylist of double the size
        ==> old elements are copied in the new list
        ==> old one is deleted
        ==> amortized time complexity
         */
    }
}
