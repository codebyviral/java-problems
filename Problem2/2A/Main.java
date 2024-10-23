import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Viral Vaghela 23BIT224");
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        int length = inputString.length();
        for (int i = 1; i <= length; i++) {
            for (int j = 0; j < length - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print(inputString.charAt(k) + " ");
            }
            System.out.println();
        }
    }
}
