import java.util.Scanner;
class Odd_eve_array{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i=0,j=0,k=0,number;
        int arr[] = new int[10];
        int odd[] = new int[10];
        int eve[] = new int[10];
        for(i=0;i<10;i++){
            number = sc.nextInt();
            if(number>0){
                arr[i]=number;
                if(number%2==1){
                    odd[j]=number;
                    j++;
                }
                else{
                    eve[k]=number;
                    k++;
                }
            }
            else{
                break;
            }
        }
        System.out.println("The Array you have given input is");
        for(i=0;i<10;i++){
            if(arr[i]!=0){
            System.out.println(arr[i]);
            }
            else{
                break;
            }
        }
        System.out.println("Odd array is ");
        for(i=0;i<10;i++){
            if(odd[i]!=0){
            System.out.println(odd[i]);
            }
            else{
                break;
            }
        }
        System.out.println("Even Array is ");
        for(i=0;i<10;i++){
            if(eve[i]!=0){
            System.out.println(eve[i]);
            }
            else{
                break;
            }
        }
    }
}