import java.util.Scanner;
class odd_eve_loop{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        for(int i = 1; i <= number1; i++){
            if(i%2==0){
                System.out.println(i+" is even");
            }else{
                System.out.println(i+" is odd");
            }
        }
    }
}
