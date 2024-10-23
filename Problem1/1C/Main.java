import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Name: Viral Vaghela");
        System.out.println("Roll No: 23BIT224");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int reversedNum = 0, originalNum = num;

        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a palindrome.");
        } else {
            System.out.println(originalNum + " is not a palindrome.");
        }

        scanner.close();
    }
}
