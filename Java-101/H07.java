// H07-Perfect-Number-Calculation-Program

/*
    This program asks for a number from the user then calculates whether the number is perfect or not.
 */

import java.util.Scanner;

public class H07 {
    public static void main(String[] args) {

        int num, total;
        total = 0;

        Scanner input = new Scanner (System.in);
        System.out.print("Please write a number: ");
        num = input.nextInt();

        for (int i = 1; i<num; i++) {
            if (num % i == 0) {
                total = total + i;
            }
        }

        if (total == num) {
            System.out.print(num + " is a perfect number!");
        }

        else {
            System.out.print(num + " is not a perfect number!");
        }

    }
}
