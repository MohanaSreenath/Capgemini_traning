package level1;

//import java.util.Scanner;

public class Exception_one {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        String str1 = null;
        try{
            System.out.println(str1.length());
        }
        catch(Exception NullPointerException){
            System.out.println("String is null here enter some thing there");
        }

    }
}
