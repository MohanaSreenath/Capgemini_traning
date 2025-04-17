//Rewrite the program number 12 with the for loop instead of a while loop to find the sum of n Natural Numbers. 
//Hint => 
//Take the user input number and check whether it's a Natural number
//If it's a natural number Compute using formulae as well as compute using for loop
//Compare the two results and print the result

import java.util.Scanner;
class Sum_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int sum = 0;
        int i = 1;
        while (i <= number) {
            sum += i;
            i++;
        }
        System.out.println("Sum of first " + number + " natural numbers using while loop is: " + sum);
        sum = 0;
        for (i = 1; i <= number; i++) {
            sum += i;
        }
        System.out.println("Sum of first " + number + " natural numbers using for loop is: " + sum);
        sc.close();
    }
}
