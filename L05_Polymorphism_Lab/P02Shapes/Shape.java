package L05_Polymorphism_Lab.P02Shapes;

public abstract class Shape {
    private double perimeter;
    private double area;

    public abstract double calculatePerimeter();

    public abstract double calculateArea();

    protected void setPerimeter(Double perimeter) {
        this.perimeter = perimeter;
    }

    protected void setArea(Double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public double getArea() {
        return area;
    }
}