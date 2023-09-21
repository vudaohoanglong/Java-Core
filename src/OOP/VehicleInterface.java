package OOP;

interface VehicleInterface {
    public int getNumberOfSeats();
    default void stop() {
        System.out.println("Stopped");
    }
}
