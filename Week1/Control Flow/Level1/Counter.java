import java.util.Scanner;
class Counter{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        while(number1>0){
            System.out.println(number1);
            number1--;
        }
        System.out.println("Rocket Launch");
    }
}