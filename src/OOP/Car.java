package OOP;

public class Car extends Vehicle{
    private final int NUMBER_OF_SEATS;

    Car(String name,int numberOfSeats) {
        super(name);
        this.NUMBER_OF_SEATS = numberOfSeats;
    }
    Car(String name) {
        super(name);
        this.NUMBER_OF_SEATS = 4;
    }
    @Override // overriding
    public void run() {
        System.out.println("Car is running");
    }

    @Override
    public int getNumberOfSeats() {
        return this.NUMBER_OF_SEATS;
    }
}
