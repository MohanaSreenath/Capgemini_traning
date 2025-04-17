package level2;

import java.util.Scanner;

public class Length {
    public static int charat(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)!='\0'){
                count++;
            }
        }
        return count;
    }
    public static boolean check_result(int a, int b) {
        return a == b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int a = charat(s);
        int b = s.length();
        boolean answer = check_result(a,b);
        System.out.println(answer);
    }
}
