import java.util.Scanner;
class Factor_itself_while{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = n-1;
        while(i>=1){
            if(n%i==0){
                System.out.println(i);
                break;
            }
            i--;
        }
    }
}