package Day6;

public class Car implements Vehical {

    @Override
    public void start() {
        System.out.println("Car starts with a key");
    }

    @Override
    public void stop() {
        Vehical.super.stop();
    }
}