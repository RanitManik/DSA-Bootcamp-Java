package L11_Functions_Methods;

public class Scoping_in_for_loop {
    public static void main(String[] args) {
        int a = 20;
        int b = 30;
        {
            int num = 35;
            int ch = 'c';
        }
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
            int num = 90;
            int ch = 'd';
            /*
            here also, anything initialised inside can not be used outside the block;
            but anything initialised outside can be used inside the block
             */
        }
//        System.out.println(num); ==> will give error
//        System.out.println(ch); ==> will give error
    }
}
