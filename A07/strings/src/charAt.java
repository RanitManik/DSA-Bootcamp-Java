package A07.strings.src;

public class charAt {
    public static void main(String[] args) {
        String name = "ranit manik"; // Although, internally string is a collection or array of characters ==> you cannot mimic the behaviors like subscripting of an array in a String in JAVA

        System.out.println(name.charAt(0)); // The 'charAt()' method is used to do subscripting in a string
    }
}
