import java.util.Scanner;
class Prime{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        for(i=2; i<n; i++){
            if(n%i==0){
                System.out.println("Not a prime number");
                break;
            }
        }
        if(i==n){
            System.out.println("Prime number");
        }
    }
}