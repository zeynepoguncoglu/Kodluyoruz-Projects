// P12-Divisible-Numbers-Program

/*
    This program asks users for a number then calculates the average of the numbers divisible by 3 and 4
    between 0 and given number.
 */

import java.util.Scanner;

public class P12 {
    public static void main(String[] args) {

        int num, count, total;

        double average;

        count = 0;
        total = 0;
        average = 0;

        Scanner input = new Scanner (System.in);
        System.out.print("Please give a number: ");
        num = input.nextInt();

        for (int i = 0; i <= num; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                total = total + i;
                System.out.println("* " + i + " is divisible by 3 and 4.");
                ++count;
            }
        }

        average = total/count;
        System.out.println("The average of numbers divisible by 3 and 4 equals to " + average + ".");

    }
}
