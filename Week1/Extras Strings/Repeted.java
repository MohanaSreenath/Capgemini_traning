package Extras;

public class Repeted {
    public static void main(String[] args) {
        String input = "success";
        System.out.println("Most Frequent Character: '" + findMostFrequentCharacter(input) + "'");
    }

    public static char findMostFrequentCharacter(String str) {
        int[] freq = new int[256];
        for (char c : str.toCharArray()) freq[c]++;
        char result = 0;
        int max = 0;
        for (char c : str.toCharArray()) {
            if (freq[c] > max) {
                max = freq[c];
                result = c;
            }
        }
        return result;
    }
}