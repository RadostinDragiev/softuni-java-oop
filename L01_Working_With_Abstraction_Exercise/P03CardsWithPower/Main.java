package L01_Working_With_Abstraction_Exercise.P03CardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cardType = scanner.nextLine();
        String suitType = scanner.nextLine();

        Card card = new Card(CardPower.valueOf(cardType), SuitPower.valueOf(suitType));

        System.out.printf("Card name: %s of %s; Card power: %d",cardType, suitType , card.calculatePower());
    }
}
