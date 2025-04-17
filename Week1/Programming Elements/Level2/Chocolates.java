import java.util.Scanner;
class Chocolates{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int chocolates = sc.nextInt();
        int children = sc.nextInt();
        int chocolatesLeft = chocolates%children;
        System.out.println("the no of chocolates each child will get is "+chocolates/children+" and the no of chocolates left is "+chocolatesLeft);
}}