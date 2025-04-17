import java.util.Scanner;
class Km_miles{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the distance in km: ");
        double km = input.nextDouble();
        double miles = km * 0.621371;
        System.out.println("The total miles is "+miles+" for the given "+km+" km");
    }
}