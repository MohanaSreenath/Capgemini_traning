import java.util.Scanner;

public class Exception_three {
    public static void generateException(String input) {
        String result = input.substring(5, 2);
    }

    public static void handleException(String input) {
        try {
            String result = input.substring(5, 2);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        try {
            generateException(input);
        } catch (RuntimeException e) {
            System.out.println("Exception occurred in generateException: " + e.getMessage());
        }

        handleException(input);
    }
}