package A05_arrays.assignments;

import java.util.List;

public class Program_11 {
    public static int main(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;

        // iterating through the lists
        for (List<String> list : items) {
            String value = "";
            // checking ruleKey and getting the corresponding value
            if (ruleKey.equals("type")) {
                value = list.get(0);
            } else if (ruleKey.equals("color")) {
                value = list.get(1);
            } else if (ruleKey.equals("name")) {
                value = list.get(2);
            }

            // comparing ruleValue with the extracted value
            if (ruleValue.equals(value)) {
                count++;
            }
        }
        return count;
    }
}
