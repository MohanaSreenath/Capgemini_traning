import java.util.Scanner;

public class Amar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Amar's age: ");
        int ageAmar = scanner.nextInt();
        System.out.print("Enter Amar's height: ");
        int heightAmar = scanner.nextInt();

        System.out.print("Enter Akbar's age: ");
        int ageAkbar = scanner.nextInt();
        System.out.print("Enter Akbar's height: ");
        int heightAkbar = scanner.nextInt();

        System.out.print("Enter Anthony's age: ");
        int ageAnthony = scanner.nextInt();
        System.out.print("Enter Anthony's height: ");
        int heightAnthony = scanner.nextInt();

        int youngestAge;
        if (ageAmar < ageAkbar) {
            if (ageAmar < ageAnthony) {
                youngestAge = ageAmar;
            } else {
                youngestAge = ageAnthony;
            }
        } else {
            if (ageAkbar < ageAnthony) {
                youngestAge = ageAkbar;
            } else {
                youngestAge = ageAnthony;
            }
        }

        int tallestHeight;
        if (heightAmar > heightAkbar) {
            if (heightAmar > heightAnthony) {
                tallestHeight = heightAmar;
            } else {
                tallestHeight = heightAnthony;
            }
        } else {
            if (heightAkbar > heightAnthony) {
                tallestHeight = heightAkbar;
            } else {
                tallestHeight = heightAnthony;
            }
        }

        System.out.println("Youngest friend's age: " + youngestAge);
        System.out.println("Tallest friend's height: " + tallestHeight);
    }
}