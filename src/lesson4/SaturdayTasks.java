package lesson4;

import java.util.Scanner;

public class SaturdayTasks {

    public static void main(String[] args) {

        //Group Task 0: FizzBuzz game

        Scanner scanner = new Scanner(System.in);

        System.out.println("Group Task 0: Please enter the max number: ");
        int maxNumber = scanner.nextInt();

        for (int i = 1; i <= maxNumber; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
        System.out.println();


        //Group Task 1: Return the third distinct maximum number

        int[] nums = {2,2,3,1};
        System.out.println("Group Task 1: The max value is: " + thirdMax(nums));


        //Individual Task 1: Implement the myAtoi(String s) function, which converts a string to an integer


    }


    static int thirdMax(int nums[]) {

        int index = 0; //counter to check if three distinct max values exist
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i ++)
        {
            /* If current element is smaller than largest*/
            if (nums[i] > largest) {
                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = nums[i];
                index++;
            /* If nums[i] is in between largest and secondLargest then update secondLargest*/
            } else if (nums[i] > secondLargest && nums[i] < largest) {
                thirdLargest = secondLargest;
                secondLargest = nums[i];
                index++;
            /* If nums[i] is in between secondLargest and thirdLargest then update thirdLargest*/
            } else if (nums[i] > thirdLargest && nums[i] < secondLargest) {
                thirdLargest = nums[i];
                index++;
            }
        }
        return index > 2 ? thirdLargest : largest;

    }

}
