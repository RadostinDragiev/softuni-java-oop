package L05_Polymorphism_Exercise.P01Vehicles;

import java.text.DecimalFormat;

public abstract class Vehicle {
    double fuelQuantity;
    //Fuel consumption in liters per km
    double fuelConsumption;

    public Vehicle(double fuelQuantity, double fuelConsumption) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption;
    }

    protected void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public String drive(Double kilometers) {
        String output = "";

        double consumedFuel = this.fuelConsumption * kilometers;
        if (consumedFuel <= this.fuelQuantity) {
            setFuelQuantity(this.getFuelQuantity() - consumedFuel);
            DecimalFormat myFormat = new DecimalFormat("##.##");
            String outputFormat = myFormat.format(kilometers);
            output = String.format("travelled %s km", outputFormat);
        } else {
            output = "needs refueling";
        }

        return output;
    }

    public abstract void refuel(Double liters);
}
