package level2;

public class Leading {
    public static void main(String[] args) {
        String input = "   Hello World!   ";
        int[] indices = trimSpaces(input);
        String trimmedUsingMethod = substring(input, indices[0], indices[1]);
        String trimmedUsingBuiltIn = input.trim();
        boolean areEqual = compareStrings(trimmedUsingMethod, trimmedUsingBuiltIn);
        System.out.println("Trimmed using method: " + trimmedUsingMethod);
        System.out.println("Trimmed using built-in: " + trimmedUsingBuiltIn);
        System.out.println("Are both equal: " + areEqual);
    }

    public static int[] trimSpaces(String str) {
        int start = 0, end = str.length() - 1;
        while (start <= end && str.charAt(start) == ' ') start++;
        while (end >= start && str.charAt(end) == ' ') end--;
        return new int[]{start, end + 1};
    }

    public static String substring(String str, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) return false;
        }
        return true;
    }
}