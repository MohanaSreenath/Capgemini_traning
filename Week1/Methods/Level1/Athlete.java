import java.util.Scanner;
class Athlete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the three sides of the triangular park in meters:");
        int side1 = scanner.nextInt();
        int side2 = scanner.nextInt();
        int side3 = scanner.nextInt();

        double rounds = calculateRounds(side1, side2, side3);
        System.out.println("The number of rounds needed to complete the 5km run is: " + rounds);
    }

    public static double calculateRounds(int side1, int side2, int side3) {
        int perimeter = side1 + side2 + side3;
        double distance = 5000.0; // 5 km in meters
        return distance / perimeter;
    }
}