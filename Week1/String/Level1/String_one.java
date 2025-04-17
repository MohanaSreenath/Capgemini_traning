import java.util.Scanner;

class String_one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s1 = sc.next();
        String s2 = sc.next();
        int i, k = s1.length(), m = s2.length();
        if (k == m) {
            boolean answer = Check(s1, s2);
            if (answer) {
                System.out.println("Both are the same");
            }
            else {
                System.out.println("Both are not the same");
            }
        } else {
            System.out.println("Both are not the same");
        }
        System.out.println("now with the built-in function");
        boolean answer2 = Check_equals(s1, s2);
        if (answer2) {
            System. out.println("Both are the same");
        }
        else {
            System.out.println("Both are not the same");
        }
    }

    public static boolean Check(String s1, String s2) {
        int i, m = s1.length();
        for (i = 0; i < m; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        } return true;
    }else{
                    product *= arr[j];
                }
}