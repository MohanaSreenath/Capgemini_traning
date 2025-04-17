import java.util.Scanner;
class Two_dim{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r,c,i,j;
        r = sc.nextInt();
        c = sc.nextInt(se);
        int arr[][] = new int[r][c];
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("The 2D array is");
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                System.out.print(" "+arr[i][j]);
            }
            System.out.println();
        }
        System.out.println("The 2D array into 1D array is");
        int arr1[] = new int[r*c];
        int k=0;
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                arr1[k] = arr[i][j];
                k++;
            }
        }
        for(i=0;i<r*c;i++){
            System.out.print(" "+arr1[i]);
        }
        System.out.println();
    }
}

        