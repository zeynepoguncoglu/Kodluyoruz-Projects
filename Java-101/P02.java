//  P02-Tax-Calculation-Program

/*
    This program asks input from users then calculates the tax based on the given input.
    Based on the input, the tax rate changes.
 */

import java.util.Scanner;

public class P02 {
    public static void main(String[] args) {

        double amount, taxRate, taxValue, totalValue;

        System.out.print("Please write an amount: ");

        Scanner input = new Scanner (System.in);
        amount = input.nextInt();

        taxRate = (amount>=0 && amount<=1000) ?  0.18 : 0.08;

        taxValue = (amount * taxRate);

        totalValue = taxValue + amount;

        System.out.println("Tax rate is is %" + taxRate*100);

        System.out.println("Value without tax is " + amount);

        System.out.println("Tax value is " + taxValue);

        System.out.println("Total value with tax is " + totalValue);

    }
}
