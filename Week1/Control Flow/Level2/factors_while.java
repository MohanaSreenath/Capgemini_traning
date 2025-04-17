import java.util.Scanner;

public class factors_while {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int i = 1;
        if(number<0){
        while (i <= number) {
            if (number % i == 0) {
                System.out.println(i);
            }
            i++;
        }}
        else{
            System.out.println("Invalid Input");
        }
        scanner.close();
    }
}