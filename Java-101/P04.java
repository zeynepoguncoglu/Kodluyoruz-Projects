//  P04-Taximeter-Calculation-Program

/*
    This program asks input from users for the kilometer then calculates the taximeter.
 */

import java.util.Scanner;

public class P04 {
    public static void main(String[] args) {

        int km;
        double startPrice, totalAmount, kmRate;

        System.out.print("Please provide the distance in kilometer: ");

        Scanner input = new Scanner (System.in);
        km = input.nextInt();

        startPrice = 10;
        kmRate = 2.20;

        totalAmount = startPrice + (km*kmRate);

        totalAmount = (totalAmount<=20) ? 20 : totalAmount;

        System.out.print("Total amount is " + totalAmount + ".");
    }
}
