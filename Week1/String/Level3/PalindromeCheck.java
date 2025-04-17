import java.util.Scanner;

public class PalindromeCheck {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter text: ");
String text = sc.nextLine();
sc.close();

boolean result1 = isPalindromeIterative(text);
boolean result2 = isPalindromeRecursive(text, 0, text.length() - 1);
boolean result3 = isPalindromeCharArray(text);

System.out.println("Palindrome Check (Iterative): " + result1);
System.out.println("Palindrome Check (Recursive): " + result2);
System.out.println("Palindrome Check (Char Array): " + result3);
}

public static boolean isPalindromeIterative(String text) {
int start = 0, end = text.length() - 1;
while (start < end) {
if (text.charAt(start) != text.charAt(end)) {
return false;
}
start++;
end--;
}
return true;
}

public static boolean isPalindromeRecursive(String text, int start, int end) {
if (start >= end) return true;
if (text.charAt(start) != text.charAt(end)) return false;
return isPalindromeRecursive(text, start + 1, end - 1);
}
