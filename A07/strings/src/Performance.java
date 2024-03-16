package A07.strings.src;

public class Performance {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            System.out.println(ch);
            series += ch + " ";
        }
        System.out.println(series);
        // each time the loop iterates it is copying the old elements and making another string object and pasting the old elements and appending new elements ==> so much memory wastage
        // so for this reason { a, ab, abc, abcd, abcdef, .... , abcdef...z} will have no reference variable ==> wasted ==> This have time complexity of O(N2) ==> very bad
        // we can conclude from this experiment that in this type of operation String is not a great data type as of its immutable nature
        // There is 'StringBuilder' data type to solve these issues above ==> here only one object is made on heap and the changes are made to that object only ==> the reference variable is also not changed
    }
}
