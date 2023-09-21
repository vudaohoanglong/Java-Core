package OOP;

public class OOP_example {
    public static void main(String[] args) {
        Vehicle newCar = new Car("Car");
        Vehicle newMoto = new Motorbike("Motor");
        System.out.println(newCar.getVehicleName());
        newMoto.stop();
    }
}
