package Day6;

public abstract class Shape {

    // Abstraction: hiding implementation details and showing only the essential behavior

    // Focus on = > what an object does, not how it does it,

    /*
    In real life: When you drive a car, you use the steering wheel and pedals (interface),
     but you don't worry about how the engine works (implementation details).
     */

/*
1- Abstract classes
- Can nave both abstract methods (nobody) and concrete methods.
• Cannot be instantiated directly

2- Interfaces
- Pure abstraction (before java  8: only abstract methods; Later: default and static methods allowed)
- class can implement multiple interface

 */

    abstract void draw(); // abstract method: nobody, only signature

    void info() // concrete method
    {
        System.out.println("Shape info: This is a shape.");
    }

}
