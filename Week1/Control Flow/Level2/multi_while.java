import java.util.Scanner;
class multi{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i,n = sc.nextInt();
        if(n>0 && n<=100){
            i=100;
            while(i>=1){
                if(i%n==0){
                    System.out.println(i);
                    i--;
                }
                else{
                    i--;
                }
            }
        }
    }
}