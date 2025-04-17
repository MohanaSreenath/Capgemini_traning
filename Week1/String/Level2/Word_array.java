package level2;

import java.util.Scanner;

public class Word_array {
    public static int[] get_spaces(String s) {
        int i, j = 0, count = 0;
        for (i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                count++;
            }
        }
        int[] res = new int[count + 1];
        for (i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                res[j++] = i;
            }
        }
        res[j] = s.length();
        return res;
    }

    public static String[] get_words(String s, int[] index) {
        int i, start = 0;
        String[] res = new String[index.length];
        for (i = 0; i < index.length; i++) {
            res[i] = s.substring(start, index[i]);
            start = index[i]+1;
        }
        return res;
    }
    public static boolean check_builtin(String s,String[] words)
    {
        String[] Str = s.split(" ");
        boolean answer = false;
        for (int i = 0; i < words.length; i++) {
            if (Str[i].equals(words[i])) {

            answer = true;}
            else {
                answer = false;
            }
        }
        for( String str : Str){
            System.out.println(str);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        int[] Spaces = get_spaces(s);
        String[] words = get_words(s, Spaces);
        System.out.println(words.length);
        for (String word : words)
            System.out.println(word);
        boolean answer = check_builtin(s,words);
        System.out.println("Both the methods are "+answer);

    }
}