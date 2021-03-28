package L01_Working_With_Abstraction_Exercise.P03CardsWithPower;

public class Card {
    private CardPower cardPower;
    private SuitPower suitPower;

    public Card(CardPower cardPower, SuitPower suitPower) {
        this.cardPower = cardPower;
        this.suitPower = suitPower;
    }

    public int calculatePower() {
        return this.cardPower.getPower() + this.suitPower.getPower();
    }
}
