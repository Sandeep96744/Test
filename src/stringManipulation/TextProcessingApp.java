package stringManipulation;

import java.util.HashSet;
import java.util.Set;

public class TextProcessingApp {
    public static void main(String[] args) {
        String text = """
                 Counting the number of characters, words, and lines in the text.
                 Reversing the text.
                 Converting the text to uppercase.
                 Removing duplicate words from the text.
                """;

        System.out.println("No. of Words: " + countWords(text));
        System.out.println("No. of Lines: " + countLines(text));
        System.out.println("Reverse Text: " + reverseText(text));
        System.out.println("Text after removing duplicates:\n" + removeDuplicates(text));

    }

    // Method to count words in the text
    private static int countWords(String text) {
        String[] word = text.split(" ");
        return word.length;
    }

    // Method to count lines in the text
    private static int countLines(String text) {
        String[] line = text.split("\n");
        return line.length;
    }

    // Method to reverse the text
    private static String reverseText(String text) {
        StringBuilder sb = new StringBuilder(text);
        sb.reverse();
        return sb.toString();
    }

    // Method to remove duplicate words from the text
    private static String removeDuplicates(String text) {
        String[] word = text.split(" ");
        Set<String> set = new HashSet<>();

        StringBuilder sb = new StringBuilder();
        for(String s: word) {
            if(!set.contains(s)) {
                sb.append(s + " ");
                set.add(s);
            }
        }
        return sb.toString();
    }
}
