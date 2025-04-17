import java.util.Scanner;
class Fizzbuzz_arrays{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i=0,j=0,k=0,number;
        number = sc.nextInt();
        int arr[] = new int[number];
        int fizz[] = new int[number];
        int buzz[] = new int[number];
        int fizzbuzz[] = new int[number];
        for(i=0;i<number;i++){
            if(i%3==0 && i%5==0){
                fizzbuzz[j]=i;
                j++;
            }
            else if(i%3==0){
                fizz[k]=i;
                k++;
            }
            else if(i%5==0){
                buzz[k]=i;
                k++;
            }
            else{
                arr[i]=i;
            }
        }
        System.out.println("The Array you have given input is");
        for(i=0;i<number;i++){
            if(arr[i]!=0){
                System.out.println(arr[i]);
            } else {
                break;
            }
        }
        System.out.println("Fizz array is ");
        for(i=1;i<=number;i++)
        System.out.println("Fizz array is ");
        for(i=0;i<number;i++){
            if(fizz[i]!=0){
                System.out.println(fizz[i]);
            } else {
                break;
            }
        }
        System.out.println("Buzz array is ");
        for(i=0;i<number;i++){
            if(buzz[i]!=0){
                System.out.println(buzz[i]);
            } else {
                break;
            }
        }
        System.out.println("FizzBuzz array is ");
        for(i=0;i<number;i++){
            if(fizzbuzz[i]!=0){
                System.out.println(fizzbuzz[i]);
            } else {
                break;
            }
        }
            if(fizzbuzz[i]!=0){
                System.out.println(fizzbuzz[i]);
            } else {
                break;
            }
        }
    }
