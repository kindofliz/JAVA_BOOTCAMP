package lesson8.task4and5;

public class Geometry {
    public static void main(String[] args) {

        //Task 4 - Print the area and perimeter of a rectangle and a square.

        Rectangle rectangle = new Rectangle(5,3);
        Square square = new Square(5);

        System.out.println("Rectangle A: " + rectangle.printArea(rectangle.getLength(), rectangle.getWidth()));
        System.out.println("Square A: " + square.printArea(square.getLength(), square.getWidth()));

        System.out.println("Rectangle P: " + rectangle.printPerimeter(rectangle.getLength(), rectangle.getWidth()));
        System.out.println("Square P: " + square.printPerimeter(square.getLength(), square.getWidth()));


        //Task 5 - repeat the above example to print the area of 10 squares. Hint-Use array of objects

        Square[] tenSquares = {new Square(2), new Square(3), new Square(4), new Square(5),
                new Square(6), new Square(7), new Square(8), new Square(9), new Square(10),
                new Square(11)};

        int counter = 0;
        for (Square thisSquare : tenSquares) {
            double side = thisSquare.getWidth();
            counter++;
            System.out.println(counter + " area = " + thisSquare.printArea(side, side));
        }



    }
}
