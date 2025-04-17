import java.util.Scanner;
class Natural{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        if(number1 > 0){
            System.out.println(" the sum of "+number1+" natural numbers is "+(number1*(number1+1))/2);
        }else{
            System.out.println("this is not a natural number");
        }
    }
}