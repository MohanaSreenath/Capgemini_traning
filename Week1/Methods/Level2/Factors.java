import java.util.Scanner;
class Factors{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        int i,count=0;
        for(i=1;i<=number;i++){
            if(number%i==0){
            System.out.println(i);
                count++;
            }}
        int [] factors = new int[count];
        int j=0;
        for(i=1;i<=number;i++){
            if(number%i==0){
                factors[j]=i;
                j++;
            }
        }
        int sum_factors= sum_of_factors(factors);
        System.out.println("The sum of factors of "+number+" is "+sum_factors);
        int product_factors= product_of_factors(factors);
        System.out.println("The product of factors of "+number+" is "+product_factors);
        int square_sum_factors= square_sum_of_factors(factors);
        System.out.println("The square sum of factors of "+number+" is "+square_sum_factors);
        int square_sum_factors_with_pow = square_sum_of_factors_with_pow(factors);
        System.out.println("The square sum of factors using Math.pow of "+number+" is "+square_sum_factors_with_pow);
    }
    public static int sum_of_factors(int[] factors){
        int sum=0;
        for(int i=0;i<factors.length;i++){
            sum+=factors[i];
        }
        return sum;
    }
    public static int product_of_factors(int[] factors){
        int product = 1;
        for (int i = 0; i < factors.length; i++) {
            product *= factors[i];
        }
        return product;
    }
    public static int square_sum_of_factors(int[] factors){
        int sum=0;
        for(int i=0;i<factors.length;i++){
            sum+=factors[i]*factors[i];
        }
        return sum;
    }
    public static int square_sum_of_factors_with_pow(int[] factors){
        int sum=0;
        for(int i=0;i<factors.length;i++){
            sum+=Math.pow(factors[i], 2);
        }
        return sum;
    }
}