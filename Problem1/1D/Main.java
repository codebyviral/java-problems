import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Name: Viral Vaghela");
        System.out.println("Roll Number: 23BIT224");
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (N): ");
        int N = scanner.nextInt();

        for (int i = 1; i <= N; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " - Bizz-Fizz");
            } else if (i % 3 == 0) {
                System.out.println(i + " - Bizz");
            } else if (i % 5 == 0) {
                System.out.println(i + " - Fizz");
            } else {
                System.out.println(i + " - Neither divisible by 3 or 5");
            }
        }

        scanner.close();
    }
}
