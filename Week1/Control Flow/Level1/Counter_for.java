import java.util.Scanner;
class Counter_for{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        for(int i = number1; i >= 1; i--){
            System.out.println(i);
        }
        System.out.println("Rocket Launch");
    }
}