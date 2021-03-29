package L05_Polymorphism_Exercise.P03WildFarm.animals;

import L05_Polymorphism_Exercise.P03WildFarm.food.Food;

import java.text.DecimalFormat;

public class Cat extends Felime {
    String breed;

    public Cat(String animalName, String animalType, Double animalWeight, String livingRegion, String breed) {
        super(animalName, animalType, animalWeight, livingRegion);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    public void eat(Food food) {
        setFoodEaten(getFoodEaten() + food.getQuantity());
    }

    @Override
    public String toString() {
        DecimalFormat outputFormat = new DecimalFormat("##.##");
        String output = outputFormat.format(super.getAnimalWeight());
        return String.format("%s[%s, %s, %s, %s, %d]",
                super.getAnimalType(),
                this.getAnimalName(),
                this.breed,
                output,
                super.getLivingRegion(),
                this.getFoodEaten());
    }
}
