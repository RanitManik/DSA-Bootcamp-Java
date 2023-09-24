package T04_Functions_Methods.src;

public class Swap {
    public static void main(String[] args) {
//        before swap ==>
        int a = 10, b = 20;
//        swapping operation ==>
        int temp = a;
        a = b;
        b = temp;
//        after swapping ==>
        System.out.println(a + " " + b);
    }
}
