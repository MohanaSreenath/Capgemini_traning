import java.util.Scanner ;
class Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        check_func(number);}
    }
    public static void check_func(int number) {
        if (number >0) {
            System.out.println("The number is positive");
        } else if (number < 0) {
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is zero");
        }
    }
}