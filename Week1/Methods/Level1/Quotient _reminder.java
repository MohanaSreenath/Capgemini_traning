import java.util.Scanner;
class Quotient_remainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the dividend: ");
        int dividend = scanner.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        int[] result = calculateQuotientAndRemainder(dividend, divisor);

        System.out.println("The quotient is " + result[0] + " and the remainder is " + result[1]);
    }

    public static int[] calculateQuotientAndRemainder(int dividend, int divisor) {
        int[] result = new int[2];
        result[0] = dividend / divisor;
        result[1] = dividend % divisor;
        return result;
    }
}
