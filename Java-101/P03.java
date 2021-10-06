//  P03-Triangle-Area-Calculation-Program

/*
    This program asks inputs from users for the lenghts of the edges of a triangle.
    Then the program calculates the area of the triangle.
 */

import java.util.Scanner;

public class P03 {
    public static void main(String[] args) {

        int a, b, c;

        double u, area;

        System.out.println("Please give edge lengths of the triangle.");

        System.out.print("Please give the lengths of the 1st edge: ");

        Scanner input = new Scanner (System.in);
        a = input.nextInt();

        System.out.print("Please give the lengths of the 2nd edge: ");
        b = input.nextInt();

        System.out.print("Please give the lengths of the 3rd edge: ");
        c = input.nextInt();

        u = (a+b+c)/2;

        area = Math.sqrt(u * (u-a) * (u-b) * (u-c));

        System.out.print("The area of the triangle equals to " + area + ".");

    }
}
