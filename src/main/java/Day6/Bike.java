package Day6;

public class Bike implements Vehical {

    @Override
    public void start() {
        System.out.println("Bike starts with a kick");
    }

    @Override
    public void stop()
    {
        System.out.println("Bike stops with a kick.");
    }
}
