import java.util.Scanner;

public class VowelCounter {

    public static void main(String[] args) {
        System.out.println("Viral Vaghela 23BIT224");
        VowelCounter counter = new VowelCounter();
        counter.start();
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a sentence (or type 'quit' to exit):");
            String input = scanner.nextLine();

            if (input.equals("quit")) {
                break;
            }
            displayLineCounts(input);
        }

        scanner.close();
    }

    private void displayLineCounts(String sentence) {
        int aLineCount = 0;
        int eLineCount = 0;
        int iLineCount = 0;
        int oLineCount = 0;
        int uLineCount = 0;
        sentence = sentence.toLowerCase();
        for (char c : sentence.toCharArray()) {
            switch (c) {
                case 'a':
                    aLineCount++;
                    break;
                case 'e':
                    eLineCount++;
                    break;
                case 'i':
                    iLineCount++;
                    break;
                case 'o':
                    oLineCount++;
                    break;
                case 'u':
                    uLineCount++;
                    break;
                default:

                    break;
            }
        }
        System.out.println("Counts for the entered sentence:");
        System.out.println("A: " + aLineCount);
        System.out.println("E" + eLineCount);
        System.out.println("I" + iLineCount);
        System.err.println("U" + uLineCount);
    }

}