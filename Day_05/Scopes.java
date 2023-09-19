package Day_05;

public class Scopes {
    public static void main(String[] args) {
        int a = 10;
        int b = 30;
        {
//            int a = 78;
            a = 89;
            /*
            already initialised outside the block in the same method.
            so, you can not initialise it again,
            but you can of-course change the value of the variable
            either inside or outside the block; it will affect the main reference variable
            so, you can use, update or modify a ref variable inside and outside the block initialised outside the block
            but can not use, update or modify a ref variable outside the block which is initialised inside the block
             */
            int n = 89;
            System.out.println(a);
            System.out.println(n);
        }
        System.out.println(a);
//        System.out.println(n);
        /*
        if you initialize a value inside a block,
        then it is going to be scoped inside the block only
        that means it can't be used outside the block
         */
    }
}
