import java.util.Scanner;
public class Words_array_two {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String input = scanner.nextLine();

        String[] words = splitIntoWords(input);
        String[][] wordLengths = getWordLengths(words);

        System.out.println("Word\tLength");
        for (String[] wordLength : wordLengths) {
            System.out.println(wordLength[0] + "\t" + Integer.parseInt(wordLength[1]));
        }

        scanner.close();
    }

    public static String[] splitIntoWords(String text) {
        StringBuilder word = new StringBuilder();
        int count = 0;
        String[] temp = new String[text.length()]; // Temporary array to hold words

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                word.append(ch);
            } else if (word.length() > 0) {
                temp[count++] = word.toString();
                word.setLength(0);
            }
        }
        if (word.length() > 0) {
            temp[count++] = word.toString();
        }

        String[] result = new String[count];
        System.arraycopy(temp, 0, result, 0, count);
        return result;
    }

    public static int getStringLength(String str) {
        int length = 0;
        for (char c : str.toCharArray()) {
            length++;
        }
        return length;
    }
    // This method calculates the total number of characters in the input string
    public static int countCharacters(String text) {
        int count = 0;
        for (char c : text.toCharArray()) {
            count++;
        }
        return count;
    }
    public static int countWords(String text) {
        String[] words = splitIntoWords(text);
        return words.length;
    }
    public static String[][] getWordLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getStringLength(words[i]));
        }
        return result;
    }
}