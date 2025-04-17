package Extras;

public class Replace {
    public static String replaceWord(String sentence, String target, String replacement) {
        return sentence.replace(target, replacement);
    }

    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog.";
        String result = replaceWord(sentence, "fox", "cat");
        System.out.println(result);
    }
}