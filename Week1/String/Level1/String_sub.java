import java.util.Scanner;
class String_sub{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string1 : ");
        String str1 = sc.nextLine();
        StringBuilder substring = new StringBuilder();
        for(int i=5; i<str1.length(); i++){
            substring.append(str1.charAt(i));
        }
        String substr = str1.substring(5,str1.length());
        display_result(substring,substr);
        System.out.println("The substring is : "+substring.toString());
        System.out.println("The substring is : "+substr);
        //equals function
        System.out.println(substring.toString().equals(substr));

    }
}