import java.util.Scanner;
class Number{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        if (number1 > 0){
            System.out.println("positive");
        }else if (number1 < 0){
            System.out.println("negative");
        }else{
            System.out.println("zero");
        }
    }
}