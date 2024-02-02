package A05_arrays.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program_18 {
    public List<Integer> addToArrayForm(int[] num, int k) {

        List<Integer> ansArrayForm = new ArrayList<>();
        int carry = 0;

        int i = num.length - 1;
        while (i >= 0 || k > 0 || carry > 0) {
            int sum = carry;
            if (i >= 0) {
                sum += num[i];
            }
            if (k > 0) {
                sum += k % 10;
                k /= 10;
            }

            ansArrayForm.add(sum % 10);
            carry = sum / 10;

            i--;
        }

        // Reverse the list to get the correct order
        Collections.reverse(ansArrayForm);

        return ansArrayForm;
    }
}
