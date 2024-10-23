import shapes.*;


public class Main {
    public static void main(String[] args) {
        Square square = new Square(5);
        square.calcArea();
        square.calcPeri();
        square.display();

        Rectangle rectangle = new Rectangle(4, 6);
        rectangle.calcArea();
        rectangle.calcPeri();
        rectangle.display();
    }
}