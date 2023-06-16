package com.bridgelabz;

import java.util.Scanner;

public class ReverseNumber {
    /**
     * This method is created to print the Reverse  number.
     *
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int num, reversed = 0;

        /**
         * 1)Taking input from user.
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        num = sc.nextInt();

        System.out.println("Original Number: " + num);

        /**
         * Finding the prime number.
         */

        while (num != 0) {

            /**
             * Getting last digit from number.
             */
            int digit = num % 10;
            reversed = reversed * 10 + digit;

            /**
             * Removing the last digit from number.
             */
            num /= 10;
        }

        System.out.println("Reversed Number: " + reversed);
        sc.close();
    }

}
