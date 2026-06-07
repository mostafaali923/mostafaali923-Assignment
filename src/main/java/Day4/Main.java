
package Day4;

public class Main {

    public static void main(String[] args) {

//        Sum s = new Sum();
//        s.sum2Number(10, 20);
//
//        s.sum2Number(10, 40);
//
//        hamada();
//        total(10, 20);
//
//        Rectangle rectangle = new Rectangle();
//        double x = rectangle.calculateArea();
//
//        System.out.println("the valu of x is " +x);



        Rectangle r1 = new Rectangle();
        r1.setLength(5.5);
        r1.setWidth(3.5);
        double area0fRoom1 = r1.calculateArea();
        System.out.println("The area of room 1 is: " + area0fRoom1);

        Rectangle r2 = new Rectangle();
        r2.setLength(10.5);
        r2.setWidth(10.5);
        double area0fRoom2 = r2.calculateArea();
        System.out.println("The area of room 2 is: " + area0fRoom2);

        System.out.println("------------------------------------");
        double totalArea = area0fRoom1 + area0fRoom2;
        System.out.println("The total area of the two rooms is: " + totalArea);
    }


    public static void hamada() {
        System.out.println("Hello, Hamada");
    }

    public static void total(int x, int y) {
        int sum = x + y;
        System.out.println("The total is: " + sum);


    }
}
