import java.util.Scanner;
class Fee_in{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int fee = input.nextInt();
        int discount = input.nextInt();
        discount = fee * discount / 100;
        fee = fee - discount;
        System.out.println("The discount amount is INR "+discount+" and final discounted fee is INR "+fee);

    }

}