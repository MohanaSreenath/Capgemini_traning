import java.util.Scanner;
class Factorial_for{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int fact = 1;
        for(int i = number1; i>0; i--){
            fact = fact * i;
        }
        System.out.println(fact);
    }
}