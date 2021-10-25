// H06-Min-Max-Calculation-Program

/*
    This program asks for a set of numbers from the user then calculates minimum and maximum number
    among those inputs.
 */

import java.util.Scanner;

public class H06 {
    public static void main(String[] args) {

        int num, min, max, count, i;

        i = 1;
        min = 0;
        max = 0;

        Scanner input = new Scanner (System.in);

        System.out.print("How many numbers would you like to enter?: ");
        count = input.nextInt();

        while (i<=count) {
            System.out.print("Please provide #" + i + " : ");
            num = input.nextInt();

            if (num<=min) {
                min = num;
            }

            if (num>=max) {
                max = num;
            }

            i++;
        }
        System.out.println("Smallest number is " + min + ".");
        System.out.println("Greatest number is " + max + ".");

    }
}
