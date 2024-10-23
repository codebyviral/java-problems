package MethodOverloading;
import java.util.Scanner;

public class GeometricArea {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Viral Vaghela 23BIT224");
        System.out.println("Choose a geometric figure:");
        System.out.println("1. Square");
        System.out.println("2. Rectangle");
        System.out.println("3. Circle");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter the side of the square: ");
                double side = scanner.nextDouble();
                System.out.println("Area of the square: " + calculateArea(side));
                break;
            case 2:
                System.out.print("Enter the length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double width = scanner.nextDouble();
                System.out.println("Area of the rectangle: " + calculateArea(length, width));
                break;
            case 3:
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                System.out.println("Area of the circle: " + calculateArea(radius, true));
                break;
            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }

    public static double calculateArea(double side) {
        return side * side;
    }

    public static double calculateArea(double length, double width) {
        return length * width;
    }

    public static double calculateArea(double radius, boolean isCircle) {
        return Math.PI * radius * radius;
    }
}
