package shapes;

public class Square implements Polygon {
    float side;
    float area;
    float perimeter;

    // Constructor to initialize side of square
    public Square(float s) {
        this.side = s;
        calcArea();
        calcPeri();
    }

    @Override
    public void calcArea() {
        area = side * side; // Area = side^2
    }

    @Override
    public void calcPeri() {
        perimeter = 4 * side; // Perimeter = 4 * side
    }

    @Override
    public void display() {
        System.out.println("Square:");
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}