package L02_Inheritance_Exercise.P05Restaurant;

import java.math.BigDecimal;

public class Coffee extends HotBeverage {
    private final static double COFFEE_MILLILITERS = 50;
    private final static BigDecimal COFFEE_PRICE = BigDecimal.valueOf(3.5);
    private double caffeine;

    public Coffee(String name, BigDecimal price, double milliliters) {
        super(name, price, milliliters);
    }

    public double getCaffeine() {
        return caffeine;
    }
}
