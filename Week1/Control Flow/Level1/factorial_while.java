import java.util.Scanner;
class factorial_while{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int fact = 1;
        while(number1>0){
            fact = fact * number1;
            number1--;
        }
        System.out.println(fact);
    }
}