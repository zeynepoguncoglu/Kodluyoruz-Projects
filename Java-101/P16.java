// P16-Exponential-Number-Calculation-Program

/*
    This program asks users for two number - one for the base and one for the exponent.
    Then it calculates the exponential number.
 */

import java.util.Scanner;

public class P16 {
    public static void main(String[] args) {

        int n, k, result;

        result = 1;

        Scanner input = new Scanner (System.in);

        System.out.print("Please write a number which will be the base: ");
        n = input.nextInt();

        System.out.print("Please write a number which will be the exponent: ");
        k = input.nextInt();

        for (int i=1; i<=k; i++) {
            result = result * n;
        }

        System.out.print("The result equals to " + result);

    }
}
