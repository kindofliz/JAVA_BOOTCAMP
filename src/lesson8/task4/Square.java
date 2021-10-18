package lesson8.task4;

public class Square extends Rectangle {

    private double side;

    public double printArea(double side) {
        double area = Math.pow(side, 2);
        return area;
    }

    public double printPerimeter(double side) {

        double perimeter = 4 * side;
        return perimeter;
    }

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
