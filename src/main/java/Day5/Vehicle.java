package Day5;

public class Vehicle {

    public String brand;
    public String color;
    public String year;


    public Vehicle(String brand, String color, String year) {
        this.brand = brand;
        this.color = color;
        this.year = year;


        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
    }

    public void start() {
        System.out.println("Vehicle is starting");

    }
}