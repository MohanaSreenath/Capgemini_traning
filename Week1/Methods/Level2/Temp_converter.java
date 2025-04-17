import java.util.Scanner;

public class Temp_converter {

    public static class UnitConverter {
        public static double convertFahrenheitToCelsius(double fahrenheit) {
            return (fahrenheit - 32) * 5 / 9;
        }

        public static double convertCelsiusToFahrenheit(double celsius) {
            return (celsius * 9 / 5) + 32;
        }

        public static double convertPoundsToKilograms(double pounds) {
            return pounds * 0.453592;
        }

        public static double convertKilogramsToPounds(double kilograms) {
            return kilograms * 2.20462;
        }

        public static double convertGallonsToLiters(double gallons) {
            return gallons * 3.78541;
        }

        public static double convertLitersToGallons(double liters) {
            return liters * 0.264172;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose conversion type:");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("3. Pounds to Kilograms");
        System.out.println("4. Kilograms to Pounds");
        System.out.println("5. Gallons to Liters");
        System.out.println("6. Liters to Gallons");

        int choice = scanner.nextInt();
        System.out.println("Enter value to convert:");
        double value = scanner.nextDouble();
        double result = 0;

        switch (choice) {
            case 1:
                result = UnitConverter.convertFahrenheitToCelsius(value);
                break;
            case 2:
                result = UnitConverter.convertCelsiusToFahrenheit(value);
                break;
            case 3:
                result = UnitConverter.convertPoundsToKilograms(value);
                break;
            case 4:
                result = UnitConverter.convertKilogramsToPounds(value);
                break;
            case 5:
                result = UnitConverter.convertGallonsToLiters(value);
                break;
            case 6:
                result = UnitConverter.convertLitersToGallons(value);
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        System.out.println("Converted value: " + result);
    }
}