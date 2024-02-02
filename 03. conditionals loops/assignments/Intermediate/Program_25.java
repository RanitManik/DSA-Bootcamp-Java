// Q25. Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August.

package A03_conditionals_loops.assignments.Intermediate;

import java.util.Calendar;

public class Program_25 {
    public static void main(String[] args) {
        // Set the month to August (8) and the year (for example, 2023)
        int month = Calendar.AUGUST;
        int year = 2023;

        // Get the number of days in August
        int daysInAugust = getDaysInMonth(month, year);

        // Initialize a counter for even days
        int evenDays = 0;

        // Loop through the days of August and count the even ones
        for (int day = 1; day <= daysInAugust; day++) {
            if (day % 2 == 0) {
                evenDays++;
            }
        }

        System.out.println("Kunal can go out on " + evenDays + " even days in August " + year + ".");
    }

    // Function to get the number of days in a month
    static int getDaysInMonth(int month, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, 1);
        return calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
    }
}
