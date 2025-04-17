import java.util.Scanner;
class Division{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int number1 = input.nextInt();
    int number2 = input.nextInt();
    System.out.println("The Quitient is "+(number1/number2)+"and reminder is "+(number1%number2)+"of two number "+number1+" and "+number2);
  }
}
