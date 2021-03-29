package L05_Polymorphism_Exercise.P01Vehicles;

public class Truck extends Vehicle {

    public Truck(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption + 1.6);
    }

    @Override
    public String drive(Double kilometers) {

        return String.format("Truck %s",
                super.drive(kilometers));
    }

    @Override
    public void refuel(Double liters) {
        super.setFuelQuantity(super.getFuelQuantity() + (liters * 0.95));
    }
}
