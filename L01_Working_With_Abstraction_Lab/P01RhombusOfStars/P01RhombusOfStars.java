package L01_Working_With_Abstraction_Lab.P01RhombusOfStars;

import java.util.Scanner;

public class P01RhombusOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int starsCount = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= starsCount; i++) {
            printSpaces(i, starsCount);
            printStarts(i);
            System.out.println();
        }

        for (int i = starsCount; i >= 0; i--) {
            printSpaces(i, starsCount);
            printStarts(i);
            System.out.println();
        }
    }

    private static void printStarts(int starsCount) {
        for (int j = 0; j < starsCount; j++) {
            System.out.print("* ");
        }
    }

    private static void printSpaces(int starsCount, int n) {
        int spaces = Math.abs(starsCount - n);
        for (int j = 0; j < spaces; j++) {
            System.out.print(' ');
        }
    }
}
