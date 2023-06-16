package com.bridgelabz;

public class FibonacciSeries {
    /**
     * This method is created to find the FibonacciSeries.
     *
     * @param args
     */

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int num1 = 0, num2 = 1, num3, p, count = 25;
        System.out.print(+num1);
        System.out.print(" " + num2);

        /**
         * Calculating Fibonacci Series
         */
        for (p = 2; p < count; p++) {
            num3 = num1 + num2;
            System.out.print(" " + num3);
            num1 = num2;
            num2 = num3;
        }

    }
}
