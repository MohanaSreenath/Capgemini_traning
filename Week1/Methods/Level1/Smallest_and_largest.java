import java.util.Scanner;
class Smallest_and_largest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        int smallest = findSmallest(number1, number2, number3);
        int largest = findLargest(number1, number2, number3);
        System.out.println("The smallest number is " + smallest);   
        System.out.println("The largest number is " + largest);
    }
    public static int findSmallest(int number1, int number2, int number3) {
        return Math.min(Math.min(number1, number2), number3);
    }
    public static int findLargest(int number1, int number2, int number3) {
        return Math.max(Math.max(number1, number2), number3);
    }
}