package L05_Polymorphism_Exercise.P03WildFarm.animals;

import L05_Polymorphism_Exercise.P03WildFarm.food.Food;

public class Mouse extends Mammal {

    public Mouse(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("SQUEEEAAAK!");
    }

    @Override
    public void eat(Food food) {
        if (!food.getClass().getSimpleName().equals("Meat")) {
            super.setFoodEaten(super.getFoodEaten() + food.getQuantity());
        } else {
            System.out.println("Mice are not eating that type of food!");
        }
    }
}
