package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] barcode = {9, 3, 1, 1, 9, 6, 0, 0, 4, 3, 7, 1};

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < barcode.length; i++) {
            if (i % 2 == 0){
                evenSum += barcode[i];
            } else {
                oddSum += barcode[i];
            }
        }

        oddSum = oddSum * 3;

        int total = oddSum + evenSum;

        int remainder = total % 10;
        int checkDigit = 10 - remainder;

        System.out.println("The check digit is " + checkDigit + ".");

    }
}
