package L05_Polymorphism_Exercise.P01Vehicles;

public class Car extends Vehicle {

    public Car(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption + 0.9);
    }

    @Override
    public String drive(Double kilometers) {

        return String.format("Car %s",
                super.drive(kilometers));
    }

    @Override
    public void refuel(Double liters) {
        super.setFuelQuantity(super.getFuelQuantity() + liters);
    }
}
