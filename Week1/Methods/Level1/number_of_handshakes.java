import java.util.Scanner;
class number_of_handshakes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of people: ");
        int people = scanner.nextInt();

        int handshakes = calculateHandshakes(people);

        System.out.println("The number of handshakes is " + handshakes + " for " + people + " people");
    }

    public static int calculateHandshakes(int people) {
        return people * (people - 1) / 2;
    }
}