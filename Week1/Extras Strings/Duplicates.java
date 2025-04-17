package Extras;

public class Duplicates {
    public static String removeDuplicates(String input) {
        StringBuilder result = new StringBuilder();
        boolean[] seen = new boolean[256];
        for (char c : input.toCharArray()) {
            if (!seen[c]) {
                seen[c] = true;
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "programming";
        System.out.println(removeDuplicates(input));
    }
}