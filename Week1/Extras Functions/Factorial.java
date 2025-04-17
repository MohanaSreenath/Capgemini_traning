import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int number = getInput();
        int result = calculateFactorial(number);
        displayResult(number, result);
    }

    private static int getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        return scanner.nextInt();
    }

    private static int calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calculateFactorial(n - 1);
    }

    private static void displayResult(int number, int result) {
        System.out.println("Factorial of " + number + " is " + result);
    }
}