package homework.five.vehicle;

public class Garage<T extends Vehicle> {
    private T vehicle;

    public T getVehicle() {
        return vehicle;
    }

    public void setVehicle(T vehicle) {
        this.vehicle = vehicle;
    }
}
