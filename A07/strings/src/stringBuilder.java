package A07.strings.src;

public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            System.out.println(ch);
            builder.append(ch).append(" "); // This is not creating new objects ==> it is appending the same object ==> 'StingBuilder' datatype is mutable and can perform operations like an array
        }
        System.out.println(builder);
        builder.deleteCharAt(4);
        System.out.println(builder.toString());
        System.out.println(builder.charAt(5));
        builder.reverse();
        System.out.println(builder);
    }
}
