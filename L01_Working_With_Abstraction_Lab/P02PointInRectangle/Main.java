package L01_Working_With_Abstraction_Lab.P02PointInRectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] rectangleCoordinates = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        
        Point bottomLeft = new Point(rectangleCoordinates[0], rectangleCoordinates[1]);
        Point topRight = new Point(rectangleCoordinates[2], rectangleCoordinates[3]);
        
        Rectangle rectangle = new Rectangle(bottomLeft, topRight);

        int numberOfPoints = Integer.parseInt(scanner.nextLine());
        checkPointIsPresent(scanner, numberOfPoints, rectangle);
    }

    private static void checkPointIsPresent(Scanner scanner, int numberOfPoints, Rectangle rectangle) {
        for (int i = 0; i < numberOfPoints; i++) {
            int[] pointCoordinates = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            System.out.println(rectangle.contains(new Point(pointCoordinates[0], pointCoordinates[1])));
        }
    }
}
