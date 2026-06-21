package Day8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptions {

    public static void main(String[] args) throws Exception {
//        int x = 10;
//        int y = 0;
//        System.out.println(x / y); //Exception in thread "main" java.lang.ArithmeticException


//        divideByZero(10, 0);
//        divideSafely(10, 2);

        readFile();

    }

    static void readFile() {
        try {
            FileInputStream file = new FileInputStream("RouteC4.txt");

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }

    static void divideByZero(int x, int y) {
        try {
            // code that might fail (throw exception )
            divideSafely(x, y);
            System.out.println(x / y);
        } catch (ArithmeticException e) {

            System.out.println("Cannot divide by zero: " + e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {

            // Code that ALWAYS executes, even if exception occurs
            // Perfect for cleanup: closing files, releasing resources

            System.out.println("Cleanup happens here");
        }
    }

    static void divideSafely(int x, int y) {
        if (y == 0) {
            System.out.println("Cannot divide by zero");
        }

        int result = x / y;
        System.out.println("Result is: " + result);
    }

}
