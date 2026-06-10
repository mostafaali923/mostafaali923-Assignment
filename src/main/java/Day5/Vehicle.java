package Day5;

public class Vehicle {

    public String brand;
    public String color;
    public int year;


public Vehicle(String brand, String color, int year) {
    this.brand = brand;
    this.color = color;
    this.year = year;
}

public void start() {
    System.out.println("Vehicle is starting");
}}