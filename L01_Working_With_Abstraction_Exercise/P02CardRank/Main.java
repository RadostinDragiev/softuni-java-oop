package L01_Working_With_Abstraction_Exercise.P02CardRank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("%s:%n", scanner.nextLine());
        for (CardType o : CardType.values()) {
            System.out.printf("Ordinal value: %d; Name value: %s%n", o.ordinal(), o);
        }
    }
}
