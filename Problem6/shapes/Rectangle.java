package shapes;

public class Rectangle implements Polygon {
    float length;
    float breadth;
    float area;
    float perimeter;

    // Constructor to initialize length and breadth of a rectangle
    public Rectangle(float len, float bre) {
        this.length = len;
        this.breadth = bre;
        calcArea();
        calcPeri();
    }

    @Override
    public void calcArea() {
        area = length * breadth; // Area = length * breadth
    }

    @Override
    public void calcPeri() {
        perimeter = 2 * (length + breadth); // Perimeter = 2 * (length + breadth)
    }

    @Override
    public void display() {
        System.out.println("Rectangle:");
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}