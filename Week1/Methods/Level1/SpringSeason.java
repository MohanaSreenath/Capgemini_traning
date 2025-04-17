import java.util.Scanner;
class  SpringSeason{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the month: ");
        int month = scanner.nextInt();
        System.out.print("Enter the day: ");
        int day = scanner.nextInt();
        boolean isSpring = isSpringSeason(month, day);
        if (isSpring) {
            System.out.println("It is Spring Season");
        } else {
            System.out.println("It is not Spring Season");
        }
    }
    public static boolean isSpringSeason(int month, int day) {
        return (month == 3 && day >= 20 && day <= 31) || (month == 4 && day >= 1 && day <= 20);
    }
}