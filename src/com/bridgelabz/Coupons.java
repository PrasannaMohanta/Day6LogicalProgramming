package com.bridgelabz;

public class Coupons {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        char[] code = "123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

        int count = 0;
        int random = getRandomNumber();
        StringBuffer sentence = new StringBuffer();

        while (random > 0) {
            sentence.append(code[random % code.length]);
            random /= code.length;
            count++;
        }

        String CouponCode = sentence.toString();
        System.out.println("Total random number needed to have all distinct numbers is :" + count
                + "\nYour Coupon Code is:" + CouponCode);
    }

    private static int getRandomNumber() {
        return (int) Math.floor(Math.random() * 100000000);

    }

}
