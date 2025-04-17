import java.util.Scanner;
class Sum_0{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number1,sum=0;
        while(true){
            number1 = sc.nextInt();
            if(number1 == 0){
                break;
            }
            else{
                sum = sum + number1;
            }
        }
        System.out.println("Total :"sum);
        
    }
}