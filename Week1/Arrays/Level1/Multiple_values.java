import java.util.Scanner;
class Multiple_values{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int i,sum=0;;
        i=0;
        while(true){
            arr[i]=sc.nextInt();
            if(arr[i]==0 || arr[i]<0){
                System.out.println("Program stopped");
                break;
            }
            else if(i>9){
                System.out.println("Array Limit reached");
                break;
            }
        i++;}
    for(i=0;i<10;i++){
        sum=sum+arr[i];
    }
    System.out.println("The total of the values entered up to now is "+sum);
    }
}