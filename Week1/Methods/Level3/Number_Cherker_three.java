import java.util.Arrays;

public class NumberChecker {

    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }

    public static int[] storeDigits(int number) {
        String numStr = String.valueOf(number);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }

    public static int[] reverseDigitsArray(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    public static boolean compareArrays(int[] array1, int[] array2) {
        return Arrays.equals(array1, array2);
    }

    public static boolean isPalindrome(int number) {
        int[] digits = storeDigits(number);
        int[] reversed = reverseDigitsArray(digits);
        return compareArrays(digits, reversed);
    }

    public static boolean isDuckNumber(int number) {
        int[] digits = storeDigits(number);
        for (int digit : digits) {
            if (digit == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int number = 12321;
        System.out.println("Count of digits: " + countDigits(number));
        System.out.println("Digits array: " + Arrays.toString(storeDigits(number)));
        System.out.println("Reversed digits array: " + Arrays.toString(reverseDigitsArray(storeDigits(number))));
        System.out.println("Is palindrome: " + isPalindrome(number));
        System.out.println("Is duck number: " + isDuckNumber(number));
    }
}