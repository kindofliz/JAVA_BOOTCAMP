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

        int[] nums = {3, 2, 1};
        System.out.println("1. The max value is: " + thirdMax(nums));

        int[] nums2 = {1, 2};
        System.out.println("2. The max value is: " + thirdMax(nums2));

        int[] nums3 = {2, 2, 3, 1};
        System.out.println("3. The max value is: " + thirdMax(nums3));

        int[] nums4 = {2, 2, 2, 2};
        System.out.println("4. The max value is: " + thirdMax(nums4));

        int[] nums5 = {-6, 62, -2, 3, 3};
        System.out.println("5. The max value is: " + thirdMax(nums5));

        System.out.println();


        //Individual Task 1: Implement the myAtoi(String s) function, which converts a string to an integer
        System.out.println("[INDIVIDUAL TASK 1]");

        System.out.println("Result: " + myAtoi("98993489"));
        System.out.println("Result: " + myAtoi("-This is not an integer"));
        System.out.println("Result: " + myAtoi("-1234567"));
        System.out.println("Result: " + myAtoi("999999999999999999999999999"));
        System.out.println("Result: " + myAtoi("   -15akjjsb"));
        System.out.println("Result: " + myAtoi("  22adf65"));
        System.out.println("Result: " + myAtoi("nnnf22adf65"));
        System.out.println("Result: " + myAtoi("+992 dfaf"));
        System.out.println();


        //Individual Task 2: Given an integer, convert it to a roman numeral.
        System.out.println("[INDIVIDUAL TASK 2]");

        System.out.println("Converted to roman: " + numToRoman(3));
        System.out.println("Converted to roman: " + numToRoman(4));
        System.out.println("Converted to roman: " + numToRoman(9));
        System.out.println("Converted to roman: " + numToRoman(58));
        System.out.println("Converted to roman: " + numToRoman(1994));
        System.out.println("Converted to roman: " + numToRoman(300));
        System.out.println("Converted to roman: " + numToRoman(15));
        System.out.println("Converted to roman: " + numToRoman(99));
        System.out.println("Converted to roman: " + numToRoman(125));


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

        for (int i = 0; i < nums.length; i++) {
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

        System.out.println("String to check: " + "'" + s + "'");
        //removing whitespaces and then checking if the string still contains anything usable
        s = s.trim();

        if (s == null || s.length() == 0)
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
        for (int i = startIndex; i < s.length(); i++) {
            //If next char is not a digit, the iteration stops
            if (!Character.isDigit(s.charAt(i)))
                break;

            //Converting digit (retrieved in character form) to integer form and storing it in the result
            int digitValue = (s.charAt(i) - '0');
            result = (result * 10) + digitValue;
        }

        //toggle result in case if isNegative is true
        if (isNegative) {
            result = -result;
        }

        //handle underflow
        if (result < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        //handle overflow
        if (result > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        //return result
        return (int) result;

    }

    static public String numToRoman(int num) {

        System.out.println("Integer: " + num);

        //An array 'dictionary' of equivalent numbers and roman numerals
        int[] numbersInt = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String[] romanNumerals = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};

        //Creating an empty string to store the converted result in
        String roman = "";

        //Throwing an error if the input number is out of bounds
        if (num < 1 || num > 3999) {
            throw new IllegalArgumentException();
        }

        //Looping through the array and storing the results
        while (num > 0) {
            int maxValue = 0;
            for (int i = 0; i < numbersInt.length; i++) {
                if (num >= numbersInt[i]) {
                    maxValue = i;
                }
            }

            //Storing the first found result in roman
            roman += romanNumerals[maxValue];
            //Subtracting the first found value from num and going through the loop again if num isn't yet 0
            num -= numbersInt[maxValue];
        }

        /* e.g. of how the process works with input '36'
        1000>36, check with next roman numeral, result =""
        900>36, check with next roman numeral, result =""
        500>36, check with next roman numeral, result =""
        400>36, check with next roman numeral, result =""
        90>36, check with next roman numeral, result =""
        50>36, check with next roman numeral, result =""
        40>36, check with next roman numeral, result =""
        10<36, add corresponding literal 'X' to result , result =X, N = 36-10=26
        10<26, add corresponding literal 'X' to result , result =XX, N = 26-10=16
        10<16, add corresponding literal 'X' to result , result =XXX, N = 16-10=6
        10>6, check with next roman numeral, result =XXX
        9>6, check with next roman numeral, result =XXX
        5<6, add corresponding literal 'V' to result , result =XXXV, N = 6-5=1
        5>1, check with next roman numeral, result =XXXV
        4>1, check with next roman numeral, result =XXXV
        1==1, add corresponding literal 'I' to result , result =XXXVI, N = 1-1=0

        Result = XXXVI
         */

        return roman;

    }
}
