package Day_08;

public class Linear_search_char_in_an_array {
    public static void main(String[] args) {
        String name = "ranit";
        char target = 'n';
        System.out.println(search(name, target));
    }

    static boolean search(String name, char target) {
        if (name.isEmpty()) {
            return false;
        }
        for (int i = 0; i < name.length(); i++) {
            if (target == name.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}
