import java.util.Scanner;
class Sum_of_n {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        int sum = calculateSum(number);

        System.out.println("The sum of first " + number + " natural numbers is " + sum);
    }

    public static int calculateSum(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        return sum;
    }
}