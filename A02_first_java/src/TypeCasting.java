package A02_first_java.src;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //this is known as Type casting
        int num = (int) (546.21f);
        System.out.println(num);

        //this is type promotion rule
        System.out.println(5 / 3.4);
        System.out.print(5 * 5);

        int a = 56;
        char b = 'a';
        float c = 25.56f;
        double d = 264652.656415;
        short e = 1532;
        byte f = 127;
        double result = (a * b) + (c * d) - (e * f);
        System.out.println(result);
        System.out.println((a * b) + " " + (c * d) + " " + (e * f));
    }
}
