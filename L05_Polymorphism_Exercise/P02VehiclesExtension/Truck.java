package L05_Polymorphism_Exercise.P02VehiclesExtension;

public class Truck extends Vehicle {
    public static final String CLAZZ = "Truck";

    public Truck(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption + 1.6, tankCapacity);
    }

    @Override
    public void drive(Double kilometers) {
        System.out.print(CLAZZ);
        super.drive(kilometers);
    }

    @Override
    public void refuel(Double liters) {
        super.refuel(liters * 0.95);
    }
}
