package lesson19;

public class ExceptionsAndErrors {


    public double multiplyByTwo(double someNumber) {
       this.divideByNumber(7, 0);
        return someNumber * 2;
    }

    //Handling the exception without crashing te programme
    public double divideByNumber(int dividable, int divider) throws ArithmeticException {
        try {
            return dividable / divider;
        } catch (ArithmeticException e) {
            System.out.println("There was an arithmetic exception. Exception text is: " + e.getMessage());
            throw e;
        }
    }





}
