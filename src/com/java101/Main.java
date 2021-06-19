package com.java101;

import java.util.Scanner;

public class Main {

    static int makePattern(int number, boolean negativeFlag, int firstNumber) {
        if (number > firstNumber && negativeFlag) {
            return number;
        }
        System.out.print(number + " ");
        if (number <= 0) {
            negativeFlag = true;
            return makePattern(number + 5, negativeFlag, firstNumber);
        } else if (number > 0 || negativeFlag) {
            return makePattern(negativeFlag ? (number + 5) : (number - 5), negativeFlag, firstNumber);
        }
        return makePattern(number - 5, negativeFlag, firstNumber);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please type a number :");
        int number = input.nextInt();

        makePattern(number, false, number);
    }
}
