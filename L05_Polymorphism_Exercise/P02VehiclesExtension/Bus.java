package L05_Polymorphism_Exercise.P02VehiclesExtension;

public class Bus extends Vehicle {
    private static final String CLAZZ = "Bus";
    private static final Double AIR_CONDITION_CONSUMPTION = 1.4;
    private double originalAirCondition;

    public Bus(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
        this.originalAirCondition = fuelConsumption;
    }

    @Override
    public void drive(Double kilometers) {
        System.out.print(CLAZZ);
        super.drive(kilometers);
    }

    public void drive(Double kilometers, String flag) {
        super.setFuelConsumption(super.getFuelConsumption() + AIR_CONDITION_CONSUMPTION);
        System.out.print(CLAZZ);
        super.drive(kilometers);
        super.setFuelConsumption(originalAirCondition);
    }
}
