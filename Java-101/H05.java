// H05-Leap-Year-Calculation-Program

/*
    This program asks for a year information from the user then calculates whether it is a leap year or not.
 */

import java.util.Scanner;

public class H05 {
    public static void main(String[] args) {

        int year;

        Scanner input = new Scanner (System.in);

        System.out.print("Please write a year: ");
        year = input.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0 && year % 400 == 0) {
                System.out.print(year + "is a Leap Year");
            }
            else if (year % 100 == 0 && year % 400 != 0) {
                System.out.print(year + "is not a Leap Year");
            }
            else {
                System.out.print(year + "is a Leap Year");
            }
        }
        else {
            System.out.print(year + "is not a Leap Year");
        }
    }
}