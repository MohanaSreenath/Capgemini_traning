import java.util.Scanner;
class Armstrong_while{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        while(n>0){
            int rem = n%10;
            sum = sum + (rem*rem*rem);
            n = n/10;
        }
        if(temp==sum){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not an Armstrong number");
        }
    }
}