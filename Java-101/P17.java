// P17-Total-of-Digits-Calculation-Program

/*
    This program asks users a number then calculates the total of its digits.
 */

import java.util.Scanner;

public class P17 {
    public static void main(String[] args) {

        int num, tempNum, numDigits, total;

        numDigits = 0;
        total = 0;

        Scanner input = new Scanner (System.in);
        System.out.print("Please write a number: ");
        num = input.nextInt();
        tempNum = num;

        while (tempNum!=0) {
            total = total + (tempNum%10);
            tempNum = tempNum / 10;
            numDigits = numDigits + 1;
        }

        System.out.print("The total of digits equals to " + total);

    }
}
