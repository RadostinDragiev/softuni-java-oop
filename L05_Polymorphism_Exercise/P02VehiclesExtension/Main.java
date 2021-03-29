package L05_Polymorphism_Exercise.P02VehiclesExtension;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Car car = null;
        Truck truck = null;
        Bus bus = null;
        for (int i = 0; i < 3; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String vehicleType = input[0];
            double fuelQuantity = Double.parseDouble(input[1]);
            double literPerKm = Double.parseDouble(input[2]);
            double tankCapacity = Double.parseDouble(input[3]);

            switch (vehicleType) {
                case "Car": car = new Car(fuelQuantity, literPerKm, tankCapacity); break;
                case "Truck": truck = new Truck(fuelQuantity, literPerKm, tankCapacity); break;
                case "Bus": bus = new Bus(fuelQuantity, literPerKm, tankCapacity); break;
            }
        }

        int lines = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < lines; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String command = input[0];
            String vehicleType = input[1];

            if (command.contains("Drive")) {
                double kilometers = Double.parseDouble(input[2]);

                if (vehicleType.equals("Car")) {
                    car.drive(kilometers);
                } else if (vehicleType.equals("Truck")) {
                    truck.drive(kilometers);
                } else {
                    if (command.equals("DriveEmpty")) {
                        bus.drive(kilometers);
                    } else {
                        bus.drive(kilometers, "flag");
                    }
                }
            } else {
                double liters = Double.parseDouble(input[2]);

                switch (vehicleType) {
                    case "Car": car.refuel(liters);
                        break;
                    case "Truck": truck.refuel(liters);
                        break;
                    case "Bus": bus.refuel(liters);
                        break;
                }
            }
        }

        System.out.printf("Car: %.2f%n", car.getFuelQuantity());
        System.out.printf("Truck: %.2f%n", truck.getFuelQuantity());
        System.out.printf("Bus: %.2f%n", bus.getFuelQuantity());
    }
}