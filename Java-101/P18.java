// P18-Harmonic-Series-Calculation-Program

/*
    This program asks users a number then calculates the harmonic series.
 */

import java.util.Scanner;

public class P18 {
    public static void main(String[] args) {

        int num;
        double harmonicSeries;

        harmonicSeries = 0.0;

        Scanner input = new Scanner (System.in);

        System.out.print("Please write a number: ");
        num = input.nextInt();

        for (int i=1; i<=num; i++) {
            harmonicSeries += (1.0/i);
        }

        System.out.print("The result equals to " + harmonicSeries + ".");
    }
}
