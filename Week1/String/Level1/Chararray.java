package level1;

import java.util.Scanner;
import java.util.Arrays;

public class Chararray {
    public static char[] getarray(String str) {
        char[] chars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        return chars;
    }

    public static char[] getarray_builtin(String str) {
        return str.toCharArray();
    }

    public static void display_result(char[] chars, char[] arr) {
        if (Arrays.equals(chars, arr)) {
            System.out.println("Strings are equal.");
        } else {
            System.out.println("Strings are not equal.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        char[] arr = getarray(str);
        char[] chars = getarray_builtin(str);

        display_result(arr, chars);

        sc.close();  // Closing Scanner
    }
}
