package Day5;

public class MathUtils {

// Polymorphism = "Many Forms"
    // it allows the same method name or same interface to represent diffrent underlying behaviour

    // 1- compile - ime Polymorphism (Method Overloding )

    /*
    - same method name , diffrebt parametar lists ( diffrent signatures )
    - Decision made at **compile time **

     */

    int add (int a , int b)
    {
        return a + b;
    }

    double add (double a , double b)
    {
        return a + b;
    }


}
