package A07.strings.src;

public class Comparison {
    public static void main(String[] args) {
        String a = "RANIT";
        String b = "RANIT";

        System.out.println(a == b); // '==' comparator checks if both the reference variables are pointing to the same string object

        System.out.println(a.equals(b)); // '.equals()' method checks only the values of tww strings it does not check if both the reference variables are pointing to the same string object

        String c = new String("RANIT"); // 'new' keyword is used to create a new object rather than the existing one ==> so in this case it will create another string object in heap "RANIT"

        System.out.println(a == c); // This will return false as 'a' and 'c' are pointing to two different string objects

        System.out.println(a.equals(c)); // This will return true as both objects the reference variables are pointing to have equal value
    }
}
