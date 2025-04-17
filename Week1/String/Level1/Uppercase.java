package level1;

import java.util.Scanner;

public class Uppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();

        String upperStr = toUpperCaseCustom(str);
        String builtInUpperStr = str.toUpperCase();

        boolean areEqual = compareStrings(upperStr, builtInUpperStr);

        System.out.println("Custom Uppercase: " + upperStr);
        System.out.println("Built-in Uppercase: " + builtInUpperStr);
        System.out.println("Are both equal? " + areEqual);
    }

    public static String toUpperCaseCustom(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result.append((char) (ch - 32));
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
