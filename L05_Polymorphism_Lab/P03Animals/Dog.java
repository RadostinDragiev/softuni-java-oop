package L05_Polymorphism_Lab.P03Animals;

public class Dog extends Animal {

    public Dog(String name, String favoriteFood) {
        super(name, favoriteFood);
    }

    @Override
    public String explainSelf() {
        return String.format("%s%nDJAAF%n",
                super.explainSelf());
    }
}
