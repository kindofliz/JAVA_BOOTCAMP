package lesson4;

import java.util.Scanner;

public class SaturdayTasks {

    public static void main(String[] args) {

        //FizzBuzz game

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the max number: ");
        int maxNumber = scanner.nextInt();

        for (int i = 1; i <= maxNumber; i++) {
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            } else if ( i % 3 == 0 ) {
                System.out.println("Fizz");
            } else if (i % 5 == 0 ) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }





    }

}
