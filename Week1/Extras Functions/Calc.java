import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose operation: 1. Addition 2. Subtraction 3. Multiplication 4. Division");
        int choice = scanner.nextInt();
        System.out.println("Enter first number:");
        double num1 = scanner.nextDouble();
        System.out.println("Enter second number:");
        double num2 = scanner.nextDouble();

        switch (choice) {
            case 1:
                System.out.println("Result: " + add(num1, num2));
                break;
            case 2:
                System.out.println("Result: " + subtract(num1, num2));
                break;
            case 3:
                System.out.println("Result: " + multiply(num1, num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Result: " + divide(num1, num2));
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid choice.");
        }
        scanner.close();
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }
}