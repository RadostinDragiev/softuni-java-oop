package L05_Polymorphism_Lab.P02Shapes;

import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Rectangle");
        Shape rectangle = new Rectangle(17, 26);
        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculatePerimeter());

        System.out.println("Circle");
        Shape circle = new Circle(58);
        System.out.println(circle.calculateArea());
        System.out.println(circle.calculatePerimeter());

    }

}
