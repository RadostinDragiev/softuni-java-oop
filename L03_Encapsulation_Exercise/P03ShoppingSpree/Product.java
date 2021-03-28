package L03_Encapsulation_Exercise.P03ShoppingSpree;

public class Product {
    private String name;
    private double cost;

    public Product(String name, double cost) {
        this.setName(name);
        this.setCoast(cost);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        Validator.validateName(name);
        this.name = name;

    }

    public double getCoast() {
        return cost;
    }

    private void setCoast(double cost) {
        Validator.validateMoney(cost);
        this.cost = cost;
    }
}
