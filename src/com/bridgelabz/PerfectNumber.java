package com.bridgelabz;

import java.util.Scanner;

public class PerfectNumber {
    /**
     * This method is created to find the Perfect Number.
     *
     * @param args
     */


    public static void main(String[] args) {
        int n, i = 1, sum = 0;

        /**
         * 1)Taking input from user.
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        n = sc.nextInt();

        /**
         * Finding the perfect number.
         */

        while (i <= n / 2) {

            if (n % i == 0) {

                sum =i + sum ;
            }
            i++;
        }

        if (sum == n) {

            System.out.println(n + " is a perfect number.");
        } else {

            System.out.println(n + " is not a perfect number.");
        }
        sc.close();
    }

}
