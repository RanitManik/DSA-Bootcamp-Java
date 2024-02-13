package A05_arrays.assignments.Basic;

public class Program_10 {

    public static void main(String[] args) {
        String sentence = "Your input sentence here";
        boolean isPangram = checkIfPangram(sentence);

        System.out.println("Is the sentence a pangram? " + isPangram);
    }

    public static boolean checkIfPangram(String sentence) {
        int[] letterFrequency = new int[26];

        for (char c : sentence.toCharArray()) {
            if (Character.isLetter(c)) {
                letterFrequency[c - 'a']++;
            }
        }

        for (int frequency : letterFrequency) {
            if (frequency == 0) {
                return false; // If any letter is missing, it's not a pangram
            }
        }

        return true; // All letters are present, it's a pangram
    }
}
