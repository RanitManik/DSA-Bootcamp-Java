package Day_02;

import java.util.Scanner;

public class Do_while {
    public static void main(String[] args) {
        /*
        do{
        }while(condition)
         */
        System.out.print("Enter the value of n: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i =1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i < n + 1);
    }
}
