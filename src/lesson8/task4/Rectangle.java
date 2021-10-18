package lesson8.task4;

public class Rectangle {

    private double length;
    private double breadth;


    public double printArea(double length, double breadth) {
        double area = length * breadth;
        return area;
    }

    public double printPerimeter(double length, double breadth) {

        double perimeter = 2 * (length + breadth);
        return perimeter;
    }

    public Rectangle() {
    }

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", breadth=" + breadth +
                '}';
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }
}
