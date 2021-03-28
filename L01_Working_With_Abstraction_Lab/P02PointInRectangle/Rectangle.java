package L01_Working_With_Abstraction_Lab.P02PointInRectangle;

public class Rectangle {
    private Point bottomLeft;
    private Point topRight;

    public Rectangle(Point bottomLeft, Point topRight) {
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
    }

    public boolean contains(Point point) {
        boolean isPresent = false;

        if (point.getCoordinateX() >=  bottomLeft.getCoordinateX() && point.getCoordinateX() <= topRight.getCoordinateX()) {
            if (point.getCoordinateY() >= bottomLeft.getCoordinateY() && point.getCoordinateY() <= topRight.getCoordinateY()) {
                isPresent = true;
            }
        }

        return isPresent;
    }
}
