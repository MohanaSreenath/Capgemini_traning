import java.util.Scanner;

public class Exception_five {

    public static void generateException(String[] names) {
        System.out.println(names[names.length]); // Accessing out of bounds index
    }

    public static void handleException(String[] names) {
        try {
            System.out.println(names[names.length]); // Accessing out of bounds index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of names: ");
        int size = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        String[] names = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }
        generateException(names);
        handleException(names);
    }
}