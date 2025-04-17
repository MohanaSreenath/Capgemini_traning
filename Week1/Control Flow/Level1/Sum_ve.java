import java.util.Scanner;
class Sum_ve{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number1,sum=0;
        while(true){
            number1 = sc.nextInt();
            if(number1 < 1){
                break;
            }
            else{
                sum = sum + number1;
            }
        }
        System.out.println("Total :"+sum);
    }
}