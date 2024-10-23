import java.util.Scanner;

public class Distance {

    public double[] Coordinates(double x1, double x2, double y1, double y2) {
        double[] coords = new double[2];
        coords[0] = (x2 - x1) * (x2 - x1);
        coords[1] = (y2 - y1) * (y2 - y1);
        return coords;
    }

    public double calculateDistance(double[] coords) {
        double distance = Math.sqrt(coords[0] + coords[1]);
        return distance;
    }

    public static void main(String[] args) {
        System.out.println("Viral Vaghela 23BIT224");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value coordinate x1:");
        double x1 = scanner.nextDouble();
        System.out.println("Enter the first value coordinate y1:");
        double y1 = scanner.nextDouble();
        System.out.println("Enter the  value coordinate x2 :");
        double x2 = scanner.nextDouble();
        System.out.println("Enter the  value coordinate y2:");
        double y2 = scanner.nextDouble();
        Distance distance = new Distance();
        double[] coordinates = distance.Coordinates(x1, x2, y1, y2);
        double distanceValue = distance.calculateDistance(coordinates);
        System.out.println("The distance between the two points is: " + distanceValue);

    }
}