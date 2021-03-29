package L04_Interfaces_And_Abstraction_Exercises.P03BirthdayCelebrations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        List<Birthable> bdays = new ArrayList<>();
        while (!line.equals("End")) {
            String[] tokens = line.split("\\s+");

            if (tokens[0].equals("Citizen")) {
                bdays.add(new Citizen(tokens[1], Integer.parseInt(tokens[2]), tokens[3], tokens[4]));
            } else if (tokens[0].equals("Pet")) {
                bdays.add(new Pet(tokens[1], tokens[2]));
            } else {
                new Robot(tokens[1], tokens[2]);
            }

            line = scanner.nextLine();
        }

        String yearToFind = scanner.nextLine();
        bdays.stream()
                .filter(x -> x.getBirthDate().endsWith(yearToFind))
                .forEach(x -> System.out.println(x.getBirthDate()));
    }
}
