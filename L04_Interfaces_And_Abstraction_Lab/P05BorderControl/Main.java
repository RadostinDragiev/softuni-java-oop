package L04_Interfaces_And_Abstraction_Lab.P05BorderControl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Identifiable> everyone = new ArrayList<>();

        while (!input.equals("End")) {
            String[] tokens = input.split("\\s+");

            if (tokens.length == 3) {
                everyone.add(new Citizen(tokens[0], Integer.parseInt(tokens[1]), tokens[2]));
            } else {
                everyone.add(new Robot(tokens[1], tokens[0]));
            }

            input = scanner.nextLine();
        }

        String bannedId = scanner.nextLine();

        everyone.forEach(x -> {
            if (x.getId().endsWith(bannedId)) {
                System.out.println(x.getId());
            }
        });
    }
}
