import java.util.Scanner;
class Football_height{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[11];
        int i,mean,sum=0;
        i=0;
        while(i<11){
            arr[i] = sc.nextInt();
            sum=sum+arr[i];
            i++;
        }
        mean=sum/11;
        System.out.println("The average height of football players is "+mean);

    }
}