// P15-Combination-Program

/*
    This program asks users for two numbers then calculates the combination by using the formula below:
    C(n,r) = n! / (r! * (n-r)!)
 */

import java.util.Scanner;

public class P15 {
    public static void main(String[] args) {

        int n, r, nFactorial, rFactorial, nrFactorial;

        nFactorial = 1;
        rFactorial = 1;
        nrFactorial = 1;

        Scanner input = new Scanner(System.in);

        System.out.print("Please write the number of elements of a set (n): ");
        n = input.nextInt();

        System.out.print("Please write the number of groups of a set (r): ");
        r = input.nextInt();

        for (int i=1; i<=n; i++) {
            nFactorial = nFactorial * i;
        }

        for (int i=1; i<=r; i++) {
            rFactorial = rFactorial * i;
        }

        for (int i=1; i<=n-r; i++) {
            nrFactorial = nrFactorial * i;
        }

        int combination;

        combination = nFactorial / (rFactorial*nrFactorial);

        System.out.print("C(" + n + "," + r + ") = " + combination);

    }
}
