import java.util.Scanner;
import java.util.Random;

public class Number_guess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int low = 1, high = 100, guess;
        String feedback;

        while (true) {
            guess = generateGuess(low, high, random);
            System.out.println("Is your number " + guess + "? (high/low/correct)");
            feedback = scanner.nextLine();

            if (feedback.equals("correct")) {
                System.out.println("The computer guessed your number!");
                break;
            } else if (feedback.equals("high")) {
                high = guess - 1;
            } else if (feedback.equals("low")) {
                low = guess + 1;
            }

            if (low > high) {
                System.out.println("Inconsistent feedback. Exiting.");
                break;
            }
        }
        scanner.close();
    }

    private static int generateGuess(int low, int high, Random random) {
        return random.nextInt(high - low + 1) + low;
    }
}