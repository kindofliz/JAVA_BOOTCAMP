package lesson19;

import lesson19.exceptions.DBException;
import lesson19.exceptions.DBPasswordAllCapsException;
import lesson19.exceptions.DBPasswordIncorrectException;

public class Lesson19Main {
    public static void main(String[] args) {
        ExceptionsAndErrors exceptions = new ExceptionsAndErrors();

        exceptions.divideByNumber(100, 50); // 2

        //First example
        try {
            exceptions.divideByNumber(999, 0); // an error will be thrown
        } catch (ArithmeticException e) {
            System.out.println("Handle the code differently...");
        }


        //Second example
        try {
            exceptions.multiplyByTwo(5);
        } catch (ArithmeticException e) {
            System.out.println("Even wrapped exceptions will be handled");
        } finally {
            System.out.println("This block will be always called!");
        }


        System.out.println("If there is some other code after the try/catch/finally - it will" +
                "be executed no matter what");


        //Other examples following the presentation
        try {
            System.out.println("Connecting to the Database");
            throw new DBPasswordAllCapsException();
        } catch (DBException e) {
            //handle this exception
            System.out.println("Our exception has been properly handled!");

            if (e instanceof DBPasswordAllCapsException) {
                System.out.println("Exception is of type DBPasswordAllCapsException");
            } else if (e instanceof DBPasswordIncorrectException) {
                System.out.println("Password is incorrect");
            }

        }


        try {
            throw new DBException("Some custom message");
        } catch (Exception e) {
            System.out.println("There was a DB Exception " + e.getMessage());
        }

        try {
            exceptions.multiplyByTwo(5);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("You can continue after printing the staktrace. It won't break!");
        System.out.println("Stacktrace always prints last!");



        //ASSERTIONS
        boolean userAuthenticated = true;
        assert userAuthenticated;
        System.out.println("User is authenticated");

        userAuthenticated = false;
        try {
            assert userAuthenticated;
        } catch (AssertionError e) {
            System.out.println("User is NOT authenticated");
        }






    }

    int method1() {
        try {
            System.out.println("Something");
            return 0;
        } catch (Exception e) {
            //more handling can be added here
            throw e;
        }
    }

    //Would be equal to (only without possibility to add extra handling)
    int method2() throws Exception {
        System.out.println("Something 2");
        return 0;
    }


}
