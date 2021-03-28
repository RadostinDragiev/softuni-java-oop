package L02_Inheritance_Exercise.P05Restaurant;

import java.math.BigDecimal;

public class Starter extends Food {
    private String name;
    private BigDecimal price;

    public Starter(double grams, String name, BigDecimal price) {
    super(grams, name, price);
    this.name = name;
    this.price = price;
}
}
