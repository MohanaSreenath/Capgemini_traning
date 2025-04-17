import java.util.Scanner;
class Factor_array{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number,i,count=0;
        number = sc.nextInt();
        for(i=1;i<number;i++){
            if(number%i==0){
                System.out.println(i);
                count++;
            }
        }
        int arr[] = new int[count];
        System.out.println("The factors of the given number are");
        int index = 0;
        for(i=1;i<number;i++){
            if(number%i==0){
                System.out.println(i);
                arr[index] = i;
                index++;
            }
        }
        System.out.println("The factors array is");
        for(i=0;i<count;i++){
            if(arr[i]!=0){
                System.out.print(" "+arr[i]);
            }
            else{
                break;
            }
        }
    System.out.println();
    }
}