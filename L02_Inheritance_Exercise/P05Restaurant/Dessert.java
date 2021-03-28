package L02_Inheritance_Exercise.P05Restaurant;

import java.math.BigDecimal;

public class Dessert extends Food{
    private String name;
    private BigDecimal price;
    private double calories;

    public Dessert(double grams, String name, BigDecimal price, double calories) {
        super(grams, name, price);
        this.calories = calories;
    }

    public double getCalories() {
        return calories;
    }
}
