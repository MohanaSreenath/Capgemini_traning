package Extras;

public class Order {
    public static void main(String[] args) {
        String str1 = "apple";
        String str2 = "banana";

        int minLength = Math.min(str1.length(), str2.length());
        boolean areEqual = true;

        for (int i = 0; i < minLength; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                areEqual = false;
                if (str1.charAt(i) < str2.charAt(i)) {
                    System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order");
                } else {
                    System.out.println("\"" + str2 + "\" comes before \"" + str1 + "\" in lexicographical order");
                }
                break;
            }
        }

        if (areEqual) {
            if (str1.length() < str2.length()) {
                System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order");
            } else if (str1.length() > str2.length()) {
                System.out.println("\"" + str2 + "\" comes before \"" + str1 + "\" in lexicographical order");
            } else {
                System.out.println("Both strings are equal");
            }
        }
    }
}