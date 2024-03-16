package A07.strings.src;

public class String_immutability {
    public static void main(String[] args) {
        String Name = "Ranit Kumar Manik";
        System.out.println(Name);

        String a = "Ranit"; // The reference variable 'a' is pointing to a string object "Ranit"
        System.out.println(a);
        String b = "Ranit"; // both of the variables 'a' and 'b' are referring to the same string pool in heap

        a = "Kumar"; // now, The reference variable 'a' is pointing to a new string object "Kumar"
        System.out.println(a);
        System.out.println(b); // The reference variable is still pointing to the same string object "Ranit"
    }
}
