import java.util.Scanner;
class factor_itself{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>0){
        for(int i=n-1; i>=1; i--){
            if(n%i==0){
                System.out.println(i);
                break;
            }
        }
        }
    }
}