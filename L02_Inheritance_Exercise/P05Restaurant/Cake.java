package L02_Inheritance_Exercise.P05Restaurant;

import java.math.BigDecimal;

public class Cake extends Dessert {
    private final static double CAKE_GRAMS = 250;
    private final static double CAKE_CALORIES = 1000;
    private static final BigDecimal CAKE_PRICE = BigDecimal.valueOf(5);

    public Cake(String name) {
        super(CAKE_GRAMS, name, CAKE_PRICE, CAKE_CALORIES);
    }
}
