import java.util.Scanner;

abstract class Shape {
    int length;
    int width;

    abstract void printArea();
}

class Rectangle extends Shape {
    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    void printArea() {
        int area = length * width;
        System.out.println("Rectangle area: " + area);
    }
}

class Triangle extends Shape {
    Triangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    void printArea() {
        double area = 0.5 * length * width;
        System.out.println("Area of the triangle is: " + area);
    }
}

class Circle extends Shape {
    Circle(int radius) {
        this.length = radius;
        this.width = radius;
    }

    void printArea() {
        double area = Math.PI * length * length;
        System.out.println("Area of the Circle is: " + area);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Viral Vaghela 23BIT224");

        // Input for Rectangle
        System.out.println("Enter the length and width of the rectangle:");
        int rectLength = scanner.nextInt();
        int rectWidth = scanner.nextInt();
        Rectangle rectangle = new Rectangle(rectLength, rectWidth);
        rectangle.printArea();

        // Input for Triangle
        System.out.println("Enter the base and height of the triangle:");
        int triBase = scanner.nextInt();
        int triHeight = scanner.nextInt();
        Triangle triangle = new Triangle(triBase, triHeight);
        triangle.printArea();

        // Input for Circle
        System.out.println("Enter the radius of the circle:");
        int radius = scanner.nextInt();
        Circle circle = new Circle(radius);
        circle.printArea();
    }}
