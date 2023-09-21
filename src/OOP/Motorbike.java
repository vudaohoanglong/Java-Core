package OOP;

public class Motorbike extends Vehicle {
    Motorbike(String name) {
        super(name);
    }
    @Override // overriding
    public void run() {
        System.out.println("Motorbike is running");
    }
    @Override
    public int getNumberOfSeats() {
        return 2;
    }
}
