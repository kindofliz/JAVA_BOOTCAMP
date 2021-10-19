package lesson8.task4and5;

public class Rectangle {

    private double length;
    private double width;


    public double printArea(double length, double width) {
        double area = length * width;
        return area;
    }

    public double printPerimeter(double length, double width) {

        double perimeter = 2 * (length + width);
        return perimeter;
    }


    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", breadth=" + width +
                '}';
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
