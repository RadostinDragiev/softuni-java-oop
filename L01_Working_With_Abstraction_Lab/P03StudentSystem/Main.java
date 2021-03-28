package L01_Working_With_Abstraction_Lab.P03StudentSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StudentSystem studentSystem = new StudentSystem();

        String command = scanner.nextLine();
        while (!command.equals("Exit")) {
            String[] tokens = command.split("\\s+");
            String name = tokens[1];

            switch (tokens[0]) {
                case "Create":
                    int age = Integer.parseInt(tokens[2]);
                    double grade = Double.parseDouble(tokens[3]);
                    studentSystem.addStudent(name, age, grade);
                    break;
                case "Show":
                    System.out.println(studentSystem.showStudent(name));
                    break;
            }

            command = scanner.nextLine();
        }
    }
}
