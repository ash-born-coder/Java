package Task02;

public class Truck extends Vehicle {

    private int cargoCapacity;

    public Truck(String brand, String model, int year, int cargoCapacity) {
        super(brand, model, year);
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Cargo Capacity: " + cargoCapacity + " kg");
    }

    @Override
    public double calculateMaintenanceCost() {
        return (2025 - year) * 150;
    }
}
