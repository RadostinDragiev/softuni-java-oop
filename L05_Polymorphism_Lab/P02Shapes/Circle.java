package L05_Polymorphism_Lab.P02Shapes;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter() {
        Double perimeter = 2 * Math.PI * this.radius;
        super.setPerimeter(perimeter);

        return perimeter;
    }

    @Override
    public double calculateArea() {
        Double area = Math.PI * Math.pow(this.radius, 2);
        super.setArea(area);

        return area;
    }

    public final double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
