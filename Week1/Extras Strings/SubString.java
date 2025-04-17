package Extras;

public class SubString {
    public static void main(String[] args) {
        String str = "hellohellohello";
        String subStr = "hello";
        int count = 0;
        int index = 0;

        while ((index = str.indexOf(subStr, index)) != -1) {
            count++;
            index += subStr.length();
        }

        System.out.println("Occurrences: " + count);
    }
}