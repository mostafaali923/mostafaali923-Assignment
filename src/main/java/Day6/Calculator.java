package Day6;

public class Calculator {

    /*
    method Overloading (Compile-time Polymorphism)
--Same method name but **different parameter lit** (type, number , or order)
--happens ** in the same class**
--return type *can* be different , but parameters must be different
--resolved at *compile time**
     */


    // Overloading: same name, differ params
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }


}
