package L01_Working_With_Abstraction_Exercise.P03CardsWithPower;

public enum SuitPower {
    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

    private int power;

    SuitPower(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }
}
