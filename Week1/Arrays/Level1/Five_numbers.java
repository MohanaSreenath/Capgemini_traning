import java.util.Scanner;
class Five_numbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0; i<5; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<5; i++){
            if(arr[i]>0){
                System.out.println("The number "+arr[i]+" is positive");
                if(arr[i]%2==0){
                    System.out.println("The number "+arr[i]+" is even");
                }
                else{
                    System.out.println("The number "+arr[i]+" is odd");
                }
            }
            else if(arr[i]<0){
                System.out.println("The number "+arr[i]+" is negative");
            }
            else{
                System.out.println("The number "+arr[i]+" is zero");
            }
    }
    if(arr[0]==arr[4]){
        System.out.println("The numbers "+arr[0]+" and "+arr[1]+" are equal");
    }
    else if(arr[0]>arr[4]){
        System.out.println("The number "+arr[0]+" is greater than "+arr[4]);
    }
    else{
        System.out.println("The number "+arr[0]+" is less than "+arr[4]);
    }
    }
}
