import java.util.Scanner;

abstract class Vehicle {
    public abstract void startEngine();
    public abstract void stopEngine();
    public abstract void showCharacteristics();
}

class Car extends Vehicle {
    private String brand;
    private String model;
    private int wheels;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.wheels = 4; 
    }

    public void startEngine() {
        System.out.println("Starting the Car Engine... 🏎️");
    }

    public void stopEngine() {
        System.out.println("Stopped the Car Enginge.");
    }

    public void showCharacteristics() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Number of Wheels: " + wheels);
    }
}

class Motorcycle extends Vehicle {
    private String brand;
    private String model;
    private int wheels;

    public Motorcycle(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.wheels = 2; 
    }

    public void startEngine() {
        System.out.println("Starting the Bike Engine... 🏍️");
    }

    public void stopEngine() {
        System.out.println("Stopped the Car Enginge.");
    }

    public void showCharacteristics() {
        System.out.println("Motorcycle Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Number of Wheels: " + wheels);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Viral Vaghela 23BIT224");

        Car car = new Car("Volkswagen", "Tata");
        car.startEngine();
        car.showCharacteristics();
        car.stopEngine();

        System.out.println();

        Motorcycle motorcycle = new Motorcycle("Suzuki Hayabusa", "Welly-90R");
        motorcycle.startEngine();
        motorcycle.showCharacteristics();
        motorcycle.stopEngine();
    }
}
