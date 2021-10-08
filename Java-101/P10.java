// P10-Sorting-Algorithm-Program

/*
    This program asks users for three numbers then sort them by descending order.
 */

import java.util.Scanner;

public class P10 {
    public static void main(String[] args) {

        int num1, num2, num3;

        System.out.print("Please write three numbers: ");
        Scanner input = new Scanner (System.in);
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();

        if (num3 <= num1 && num2 <= num1) {
            if (num3 <= num2) {
                System.out.print(num1 + " - " + num2 + " - " + num3);
            }
            else {
                System.out.print(num1 + " - " + num3 + " - " + num2);
            }
        }

        else if (num3 <= num2 && num1 <= num2) {
            if (num3 <= num1) {
                System.out.print(num2 + " - " + num1 + " - " + num3);
            }
            else {
                System.out.print(num2 + " - " + num3 + " - " + num1);
            }
        }

        else if (num2 <= num3 && num1 <= num3) {
            if (num2 <= num1) {
                System.out.print(num3 + " - " + num1 + " - " + num2);
            }
            else {
                System.out.print(num3 + " - " + num2 + " - " + num1);
            }
        }
    }
}
