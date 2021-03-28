package L02_Inheritance_Exercise.P05Restaurant;

import java.math.BigDecimal;

public class Food extends Product {
    private double grams;

    public Food(double grams, String name, BigDecimal price) {
        super(name, price);
        this.grams = grams;
    }

    public double getGrams() {
        return grams;
    }
}
