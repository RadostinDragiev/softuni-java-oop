package L05_Polymorphism_Lab.P02Shapes;

public class Rectangle extends Shape {
   private double height;
   private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double calculatePerimeter() {
        Double perimeter = 2 * (this.height + this.width);
        super.setPerimeter(perimeter);

        return perimeter;
    }

    @Override
    public double calculateArea() {
        Double area = this.width * this.height;
        super.setArea(area);

        return area;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
