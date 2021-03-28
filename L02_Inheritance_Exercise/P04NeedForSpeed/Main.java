package L02_Inheritance_Exercise.P04NeedForSpeed;

public class Main {
    public static void main(String[] args) {
        SportCar car = new SportCar(10, 200);

        car.drive(0);
        System.out.println(car.getFuel());
    }
}
