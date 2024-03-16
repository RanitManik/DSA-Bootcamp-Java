package A06.searching.src;

public class Linear_search_String_char_array {
    public static void main(String[] args) {
        String name = "ranit";
        char target = 'n';
        System.out.println(search(name, target));
    }

    static boolean search(String name, char target) {
        if (name.isEmpty()) {
            return false;
        }
        for (char ch : name.toCharArray()) { // converting the string into a char array using toCharArray method
            if (ch == target) {
                return true;
            }
        }
        return false;
    }
}
