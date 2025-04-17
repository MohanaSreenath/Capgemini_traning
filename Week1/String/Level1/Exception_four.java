import java.util.Scanner;

package level1;


public class Exception_four {
    public static void main(String[] args) {
        generateException();
        handleException();
    }

    static void generateException() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String input = scanner.nextLine();
        Integer.parseInt(input);
    }

    static void handleException() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String input = scanner.nextLine();
        try {
            Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException occurred: " + e);
        } catch (RuntimeException e) {
            System.out.println("RuntimeException occurred: " + e);
        }
    }
}