package L05_Polymorphism_Exercise.P01Vehicles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Car car = null;
        Truck truck = null;
        for (int i = 0; i < 2; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            if (i == 0) {
                car = new Car(Double.parseDouble(input[1]), Double.parseDouble(input[2]));
            } else {
                truck = new Truck(Double.parseDouble(input[1]), Double.parseDouble(input[2]));
            }
        }

        int lines = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < lines; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String command = input[0];
            String vehicleType = input[1];

            if (command.equals("Drive")) {
                double kilometers = Double.parseDouble(input[2]);
                if (vehicleType.equals("Car")) {
                    System.out.println(car.drive(kilometers));
                } else {
                    System.out.println(truck.drive(kilometers));
                }
            } else {
                double liters = Double.parseDouble(input[2]);
                if (vehicleType.equals("Car")) {
                    car.refuel(liters);
                } else {
                    truck.refuel(liters);
                }
            }
        }

        System.out.printf("Car: %.2f%n", car.getFuelQuantity());
        System.out.printf("Truck: %.2f", truck.getFuelQuantity());
    }
}