package Day4;

// class =>> blueprint , container

import java.util.Scanner;

// Encapsulation => data hiding , data protection , data secuirty

public class Rectangle {

    // Data hiding: Prevent direct modification of field
    // Benefit: improves security, maintainabilty and flexabilty
    Scanner input = new Scanner(System.in);


    private double length; //field
    private double width;

    public void setLength(double length)
    {
        if (length > 0)
            this.length = length;
        else
            System.out.println("Length must be positive.");
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width)
    {
        if (width > 0)
            this.width = width;
        else
            System.out.println("Width must be positive.");
    }
     public double getWidth() {
        return width;
    }
 public double calculateArea() { // method
     return length * width;

    }


//    public double calculateArea() { // method
//        System.out.println("Enter Length of rectangle");
//        length = input.nextDouble();
//        System.out.println("Enter Width of rectangle");
//        width = input.nextDouble();
//        double area = length * width;
//        System.out.println("The area of the rectangle is: " + area);
//        return area;
    }


