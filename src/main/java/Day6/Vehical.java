package Day6;

public interface Vehical {

    void start();  // abstract method

    default void stop() {
        System.out.println("Hello from Vehicle interface ");
    }

    default void stops() {
        System.out.println("Bike stop with a kick");
    }




}
