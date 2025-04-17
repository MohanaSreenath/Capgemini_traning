import java.util.Scanner;
class voter{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age >= 18){
            System.out.println("the person age is "+age+" and can vote");
        }else{
            System.out.println("the person age is "+age+" and cannot vote");
        }
    }
}