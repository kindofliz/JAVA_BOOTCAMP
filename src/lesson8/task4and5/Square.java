package lesson8.task4and5;

public class Square extends Rectangle {

    /*
    Let class 'Square' inherit the 'Rectangle' class with its constructor having
    a parameter for its side (suppose s) calling the constructor of its parent class as 'super(s,s)'.
     */

    public Square(double s) {
        super(s,s);
    }

}