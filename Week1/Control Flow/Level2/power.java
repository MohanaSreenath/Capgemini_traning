import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base number (positive integer): ");
        int number = scanner.nextInt();
        System.out.print("Enter the power (positive integer): ");
        int power = scanner.nextInt();

        if (number < 0 || power < 0) {
            System.out.println("Please enter positive integers only.");
            return;
        }

        int result = 1;

        for (int i = 1; i <= power; i++) {
            result *= number;
        }

        System.out.println(number + " raised to the power of " + power + " is: " + result);
    }
}
