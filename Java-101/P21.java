// P21-GCD-LCM-Calculation-Program

/*
    This program asks two different numbers from users then calculates the greatest common factor
    as well as lowest common multiple for those numbers.
 */

import java.util.Scanner;

public class P21 {
    public static void main(String[] args) {

        int num1, num2, ebob, ekok, i;

        i = 1;
        ebob = 1;

        Scanner input = new Scanner (System.in);

        System.out.print("Please provide the 1st number: ");
        num1 = input.nextInt();

        System.out.print("Please provide the 2nd number: ");
        num2 = input.nextInt();

        while (i<=num1 && i<=num2) {
            if (num1%i==0 && num2%i==0) {
                ebob = i;
            }
            i++;
        }

        ekok = (num1*num2)/ebob;

        System.out.println("Greatest common factor equals to " + ebob);
        System.out.println("Lowest common multiple equals to " + ekok);

    }
}
