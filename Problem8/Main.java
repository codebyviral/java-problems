import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input
        System.out.println("Enter a paragraph:");
        String paragraph = scanner.nextLine();
        
        // a. Count sentences and words
        int sentenceCount = countSentences(paragraph);
        System.out.println("\nNumber of sentences: " + sentenceCount);
        
        // Split paragraph into sentences
        String[] sentences = paragraph.split("[.!?]+");
        System.out.println("\nWords in each sentence:");
        for (int i = 0; i < sentences.length; i++) {
            int wordCount = countWords(sentences[i]);
            System.out.println("Sentence " + (i + 1) + ": " + wordCount + " words");
        }
        
        // b. Count characters and their occurrences
        System.out.println("\nTotal characters: " + paragraph.length());
        
        // Create array to store character frequencies (ASCII)
        int[] charCount = new int[128];
        
        // Count character frequencies
        for (int i = 0; i < paragraph.length(); i++) {
            char ch = paragraph.charAt(i);
            charCount[ch]++;
        }
        
        // Display character frequencies
        System.out.println("\nCharacter frequencies:");
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > 0) {
                if (i == 32) { // Space character
                    System.out.println("Space: " + charCount[i]);
                } else {
                    System.out.println((char)i + ": " + charCount[i]);
                }
            }
        }
        
        scanner.close();
    }
    
    // Method to count sentences
    public static int countSentences(String paragraph) {
        int count = 0;
        for (int i = 0; i < paragraph.length(); i++) {
            char ch = paragraph.charAt(i);
            if (ch == '.' || ch == '!' || ch == '?') {
                count++;
            }
        }
        return count;
    }
    
    // Method to count words in a sentence
    public static int countWords(String sentence) {
        sentence = sentence.trim(); // Remove leading/trailing spaces
        if (sentence.isEmpty()) {
            return 0;
        }
        
        // Count words by counting spaces
        int wordCount = 1; // Start with 1 for the first word
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ' && i < sentence.length()-1 && sentence.charAt(i+1) != ' ') {
                wordCount++;
            }
        }
        return wordCount;
    }
}