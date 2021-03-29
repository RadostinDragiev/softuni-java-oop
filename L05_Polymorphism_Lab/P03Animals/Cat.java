package L05_Polymorphism_Lab.P03Animals;

public class Cat extends Animal {
    public Cat(String name, String favoriteFood) {
        super(name, favoriteFood);
    }

    @Override
    public String explainSelf() {
        return String.format("%s%nMEEOW%n",
                super.explainSelf());
    }
}
