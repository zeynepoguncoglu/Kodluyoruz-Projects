//  P05-Circle-Sector-Area-Calculation-Program

/*
    This program asks input from users in order to calculate the area of the circle's sector.
 */

import java.util.Scanner;

public class P05 {
    public static void main(String[] args) {

        int radius, centralAngle;

        double piNumber = 3.14;

        double area;

        System.out.print("Please provide the radius of the circle: ");

        Scanner input = new Scanner (System.in);
        radius = input.nextInt();

        System.out.print("Please provide the central angle of the circle: ");
        centralAngle = input.nextInt();

        area = (piNumber * (radius * radius) * centralAngle) / 360;

        System.out.print("The area of the sector equals to " + area + ".");
    }
}
