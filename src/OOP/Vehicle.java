package OOP;

public abstract class Vehicle implements VehicleInterface{
    private String vehicleName;

    Vehicle(String name) {
        this.vehicleName  = name;
    }
    public abstract void run();

    public String getVehicleName() {
        return this.vehicleName;
    }
    protected void setVehicleName(String name) {
        this.vehicleName = name;
    }
}
