package lesson4;

import java.util.Scanner;

public class SaturdayTasks {

    public static void main(String[] args) {

        //Group Task 0: FizzBuzz game
        Scanner scanner = new Scanner(System.in);
        System.out.println("[GROUP TASK 0]");
        System.out.println("Please enter the number: ");
        int maxNumber = scanner.nextInt();
        fizzBuzz(maxNumber);

        System.out.println();




        //Group Task 1: Return the third distinct maximum number
        System.out.println("[GROUP TASK 1]");

        int[] nums = {3,2,1};
        System.out.println("1. The max value is: " + thirdMax(nums));

        int[] nums2 = {1,2};
        System.out.println("2. The max value is: " + thirdMax(nums2));

        int[] nums3 = {2,2,3,1};
        System.out.println("3. The max value is: " + thirdMax(nums3));

        int[] nums4 = {2,2,2,2};
        System.out.println("4. The max value is: " + thirdMax(nums4));

        int[] nums5 = {-6, 62, -2, 3, 3};
        System.out.println("5. The max value is: " + thirdMax(nums5));
        System.out.println();




        //Individual Task 1: Implement the myAtoi(String s) function, which converts a string to an integer
        System.out.println("[INDIVIDUAL TASK 1]");

        String s = "98993489";
        System.out.println("1. Result: " + myAtoi(s));

        String s2 = "This is not an integer";
        System.out.println("2. Result: " + myAtoi(s2));

        String s3 = "-1234567";
        System.out.println("3. Result: " + myAtoi(s3));

        String s4 = "999999999999999999999999999";
        System.out.println("4. Result: " + myAtoi(s4));

        String s5 = "   -15akjjsb";
        System.out.println("5. Result: " + myAtoi(s5));

        String s6 = "  22adf65";
        System.out.println("6. Result: " + myAtoi(s6));

        String s7 = "+992 dfaf";
        System.out.println("7. Result: " + myAtoi(s7));


    }


    static void fizzBuzz(int maxNumber) {
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
    }

    static int thirdMax(int[] nums) {

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

    static public int myAtoi(String s) {

        //removing whitespaces and then checking if the string still contains anything usable
        s = s.trim();

        if(s == null || s.length() == 0)
            return 0;

        //handling positive/negative signs and moving the index after them
        boolean isNegative = false; //default is (+) positive
        int startIndex = 0;

        if (s.charAt(0) == '-') {
            isNegative = true;
            ++startIndex;
        } else if (s.charAt(0) == '+') {
            ++startIndex;
        }

        //declaring result of type double to handle overflow cases
        double result = 0;

        //loop through the string
        for(int i = startIndex; i < s.length(); i++) {
            //If next char is not a digit, the iteration stops
            if (!Character.isDigit(s.charAt(i)))
                break;

            //Converting digit (retrieved in character form) to integer form and storing it in the result
            int digitValue = (s.charAt(i) - '0');
            result = (result * 10) + digitValue;
        }

        //toggle result in case if isNegative is true
        if(isNegative) {
            result = -result;
        }

        //handle underflow
        if(result < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        //handle overflow
        if(result > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        //return result
        return (int)result;

    }

}
