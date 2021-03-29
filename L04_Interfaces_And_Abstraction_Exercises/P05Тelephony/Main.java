package L04_Interfaces_And_Abstraction_Exercises.P05Тelephony;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> phones = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        List<String> sites = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        Smartphone smartphone = new Smartphone(phones, sites);

        System.out.print(smartphone.call());
        System.out.print(smartphone.browse());

    }
}
