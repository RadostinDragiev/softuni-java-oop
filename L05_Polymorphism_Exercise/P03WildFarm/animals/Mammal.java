package L05_Polymorphism_Exercise.P03WildFarm.animals;

import L05_Polymorphism_Exercise.P03WildFarm.food.Food;

import java.text.DecimalFormat;

public class Mammal extends Animal {
    private String livingRegion;

    public Mammal(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight);
        this.livingRegion = livingRegion;
    }

    public String getLivingRegion() {
        return livingRegion;
    }

    @Override
    public void makeSound() {

    }

    @Override
    public void eat(Food food) {

    }

    @Override
    public String toString() {
        DecimalFormat outputFormat = new DecimalFormat("##.##");
        String output = outputFormat.format(super.getAnimalWeight());
        return String.format("%s[%s, %s, %s, %d]",
                super.getAnimalType(),
                this.getAnimalName(),
                output,
                this.livingRegion,
                this.getFoodEaten());
    }
}
