package L05_Polymorphism_Exercise.P02VehiclesExtension;

import java.text.DecimalFormat;

public abstract class Vehicle {
    double fuelQuantity;
    //Fuel consumption in liters per km
    double fuelConsumption;
    double tankCapacity;

    public Vehicle(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption;
        this.tankCapacity = tankCapacity;
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

    public void drive(Double kilometers) {
        double consumedFuel = this.fuelConsumption * kilometers;
        if (consumedFuel < this.fuelQuantity) {
            setFuelQuantity(this.getFuelQuantity() - consumedFuel);
            DecimalFormat myFormat = new DecimalFormat("##.##");
            String outputFormat = myFormat.format(kilometers);
            System.out.println(String.format(" travelled %s km", outputFormat));
        } else {
            System.out.println(" needs refueling");
        }
    }

    public void refuel(Double liters) {
        if (liters <= 0) {
            System.out.println("Fuel must be a positive number");
        } else {
            double totalUpcomingLiters = this.getFuelQuantity() + liters;
            if (totalUpcomingLiters > this.tankCapacity) {
                System.out.println("Cannot fit fuel in tank");
            } else {
                this.setFuelQuantity(this.getFuelQuantity() + liters);
            }
        }
    }
}
