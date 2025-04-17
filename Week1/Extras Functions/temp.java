import java.util.Scanner;

public class temp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1 to convert Fahrenheit to Celsius");
        System.out.println("Enter 2 to convert Celsius to Fahrenheit");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            System.out.println("Temperature in Celsius: " + fahrenheitToCelsius(fahrenheit));
        } else if (choice == 2) {
            System.out.print("Enter temperature in Celsius: ");
            double celsius = scanner.nextDouble();
            System.out.println("Temperature in Fahrenheit: " + celsiusToFahrenheit(celsius));
        } else {
            System.out.println("Invalid choice");
        }

        scanner.close();
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}