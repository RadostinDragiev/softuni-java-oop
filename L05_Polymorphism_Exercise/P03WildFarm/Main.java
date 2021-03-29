package L05_Polymorphism_Exercise.P03WildFarm;

import L05_Polymorphism_Exercise.P03WildFarm.animals.*;
import L05_Polymorphism_Exercise.P03WildFarm.food.Food;
import L05_Polymorphism_Exercise.P03WildFarm.food.Meat;
import L05_Polymorphism_Exercise.P03WildFarm.food.Vegetable;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String commandLine = scanner.nextLine();
        List<Animal> animals = new ArrayList<>();
        int id = 0;
        while (!commandLine.equals("End")) {
            String[] tokens = commandLine.split("\\s+");
            String animalType = tokens[0];
            String animalName = tokens[1];
            double animalWeight = Double.parseDouble(tokens[2]);
            String livingRegion = tokens[3];

            switch (animalType) {
                case "Mouse":
                    Animal mouse = new Mouse(animalName, animalType, animalWeight, livingRegion);
                    animals.add(mouse);
                    break;
                case "Zebra":
                    Animal zebra = new Zebra(animalName, animalType, animalWeight, livingRegion);
                    animals.add(zebra);
                    break;
                case "Cat":
                    Animal cat = new Cat(animalName, animalType, animalWeight, livingRegion, tokens[4]);
                    animals.add(cat);
                    break;
                case "Tiger":
                    Animal tiger = new Tiger(animalName, animalType, animalWeight, livingRegion);
                    animals.add(tiger);
                    break;
            }

            String[] foodLine = scanner.nextLine().split("\\s+");
            String foodString = foodLine[0];
            int quantity = Integer.parseInt(foodLine[1]);

            Food food = null;
            switch (foodString) {
                case "Vegetable":
                    food = new Vegetable(quantity);
                    break;
                case "Meat":
                    food = new Meat(quantity);
                    break;
            }

            animals.get(id).makeSound();
            animals.get(id).eat(food);

            id++;
            commandLine = scanner.nextLine();
        }

        animals.forEach(x -> System.out.println(x.toString()));
    }
}