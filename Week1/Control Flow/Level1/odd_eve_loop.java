import java.util.Scanner;
class odd_eve_loop{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int i = 1;
        while(i<=number1){
            if(i%2==0){
                System.out.println(i+" is even");
            }else{
                System.out.println(i+" is odd");
            }
            i++;
        }
    }
}