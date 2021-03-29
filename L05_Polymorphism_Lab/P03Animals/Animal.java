package L05_Polymorphism_Lab.P03Animals;

public class Animal {
    private String name;
    private String favouriteFood;

    protected Animal(String name, String favoriteFood) {
        this.name = name;
        this.favouriteFood = favoriteFood;
    }

    public String explainSelf() {
        return String.format("I am %s and my favourite food is %s",
                this.getName(),
                this.getFavouriteFood());
    }

    protected String getName() {
        return name;
    }

    protected String getFavouriteFood() {
        return favouriteFood;
    }
}
