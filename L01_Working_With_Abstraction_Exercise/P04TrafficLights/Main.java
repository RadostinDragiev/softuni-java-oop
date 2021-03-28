package L01_Working_With_Abstraction_Exercise.P04TrafficLights;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TrafficLight[] trafficLight = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(TrafficLight::valueOf)
                .toArray(TrafficLight[]::new);

        int n = Integer.parseInt(scanner.nextLine());

        TrafficLight[] lights = TrafficLight.values();

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < trafficLight.length; j++) {
                int index = (trafficLight[j].ordinal() + 1) % lights.length;

                trafficLight[j] = lights[index];

                stringBuilder.append(trafficLight[j]).append(" ");
            }
            stringBuilder.append(System.lineSeparator());
        }

        System.out.println(stringBuilder.toString());
    }
}
