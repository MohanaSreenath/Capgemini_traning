import java.time.LocalDate;
import java.util.Scanner;

public class Datacom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first date (yyyy-mm-dd):");
        LocalDate date1 = LocalDate.parse(scanner.nextLine());

        System.out.println("Enter the second date (yyyy-mm-dd):");
        LocalDate date2 = LocalDate.parse(scanner.nextLine());

        if (date1.isBefore(date2)) {
            System.out.println("The first date is before the second date.");
        } else if (date1.isAfter(date2)) {
            System.out.println("The first date is after the second date.");
        } else if (date1.isEqual(date2)) {
            System.out.println("The first date is the same as the second date.");
        }

        scanner.close();
    }
}