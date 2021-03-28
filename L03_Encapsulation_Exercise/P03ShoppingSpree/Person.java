package L03_Encapsulation_Exercise.P03ShoppingSpree;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
        this.setName(name);
        this.setMoney(money);
        this.products = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        Validator.validateName(name);
        this.name = name;

    }

    public double getMoney() {
        return money;
    }

    private void setMoney(double money) {
        Validator.validateMoney(money);
        this.money = money;
    }


    public void buyProduct(Product product) {
        if (product.getCoast() <= this.money) {
            this.products.add(product);
            this.money -= product.getCoast();
        } else {
            throw new IllegalArgumentException(String.format("%s can't afford %s%n", this.name, product.getName()));
        }
    }

    @Override
    public String toString() {
        String output = "Nothing bought";

        if (!this.products.isEmpty()) {
            output = this.products.stream()
                    .map(Product::getName)
                    .collect(Collectors.joining(", "));
        }
        return output;
    }
}
