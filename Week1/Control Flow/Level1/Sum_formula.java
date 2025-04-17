import java.util.Scanner;
class Sum_formula{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int i,sum=0,formula_total=0;
        for(i=1;i<=number1;i++){
            sum = sum + i;
        }
        formula_total=(number1*(number1+1))/2;
        System.out.println("The sum of "+number1+" natural numbers is "+sum+" using Loop");
        System.out.println("The sum of "+number1+" natural numbers is "+formula_total+" using formula");
        if(sum == formula_total){
            System.out.println("Both are equal");
        }else{
            System.out.println("Both are not equal");
        }
    }
}