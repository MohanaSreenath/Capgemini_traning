import java.util.Scanner;
class Sum_loops{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int sum = 0,sum1 = 0;
        for(int i = 1; i <= number1; i++){
            sum += i;
        }
        System.out.println(sum);
        while(number1 > 0){
            sum1 += number1;
            number1--;
        }
        System.out.println(sum1);
        if(sum == sum1){
            System.out.println("Both are equal");
        }else{  
            System.out.println("Both are not equal");
        }
    }
}