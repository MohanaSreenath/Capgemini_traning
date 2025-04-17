import java.util.Scanner;

public class Simpleintrest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Principal: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter Rate of Interest: ");
        double rate = scanner.nextDouble();
        System.out.print("Enter Time: ");
        double time = scanner.nextDouble();
        double simpleInterest = (principal * rate * time) / 100;
        //output need to be like The Simple Interest is ___ for Principal ___, Rate of Interest ___ and Time ___
        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time);
    }
}