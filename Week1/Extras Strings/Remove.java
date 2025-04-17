package Extras;

public class Remove {
    public static void main(String[] args) {
        String input = "Hello World";
        char charToRemove = 'l';
        String result = input.replace(Character.toString(charToRemove), "");
        System.out.println("Modified String: " + result);
    }
}