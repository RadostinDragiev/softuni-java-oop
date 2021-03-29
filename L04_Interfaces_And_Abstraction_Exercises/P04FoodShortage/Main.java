package L04_Interfaces_And_Abstraction_Exercises.P04FoodShortage;

import java.util.HashMap;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());

        HashMap<String, Buyer> people = new HashMap<>();
        for (int i = 0; i < numberOfPeople; i++) {
            String[] input = scanner.nextLine().split("\\s+");

            if (input.length == 4) {
                people.put(input[0], new Citizen(input[0], Integer.parseInt(input[1]), input[2], input[3]));
            } else {
                people.put(input[0] , new Rebel(input[0], Integer.parseInt(input[1]), input[2]));
            }
        }

        String command = scanner.nextLine();
        while (!command.equals("End")) {
            String name = command;

            Buyer buyer = people.get(name);

            if (buyer != null) {
                buyer.buyFood();
            }

            command = scanner.nextLine();
        }

        int amountOfFood = people.values().stream().mapToInt(Buyer::getFood).sum();

        System.out.println(amountOfFood);
    }
}
