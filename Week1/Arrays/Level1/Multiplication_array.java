import java.util.Scanner;
class Multiplication_array{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int i,number = sc.nextInt();
        for (i=0; i<10; i++){
            arr[i] = number*(i+1);
        }
        for (i=0; i<10; i++){
            System.out.println(number+" * "+(i+1)+" = "+arr[i]);
        }
    }
}
        