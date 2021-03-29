package L04_Interfaces_And_Abstraction_Lab.P06Ferrari;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String driveName = scanner.nextLine();
        Ferrari fr = new Ferrari(driveName);

        System.out.println(fr.toString());
    }

}
