package A05_arrays.src;

import java.util.ArrayList;
import java.util.Scanner;

public class Multidimensional_arraylist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 9 elements of the arraylist 'list': ");

        // initializing a 2d Arraylist ==>
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        // adding elements ==>
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());
            }
        }

        // printing a 2D arraylist ==>
        System.out.println(list);
    }
}
