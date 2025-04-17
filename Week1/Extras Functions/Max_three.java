import java.util.Scanner;

public class MaxThree {
    public static void main(String[] args) {
        int num1 = getInput("Enter first number: ");
        int num2 = getInput("Enter second number: ");
        int num3 = getInput("Enter third number: ");
        int max = findMax(num1, num2, num3);
        System.out.println("The maximum number is: " + max);
    }

    private static int getInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextInt();
    }

    private static int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}