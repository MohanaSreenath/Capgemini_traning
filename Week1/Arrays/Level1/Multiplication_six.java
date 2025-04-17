import java.util.Scanner;
class Multiplication_six{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        int j=0,i,number = sc.nextInt();
        for (i=0; i<4; i++){
            arr[i] = number*(i+1);
        }
        for (i=6; i<10; i++){

            System.out.println(number+" * "+(i)+" = "+arr[j]);
            j++;
        }
    }
}