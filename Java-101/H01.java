// H01-Body-Mass-Index-Calculation-Program

/*
    This program asks input from users in order to calculate their body mass index (bmi) value.
    It takes height and weight of the users and calculates bmi value based on a formula.
*/

import java.util.Scanner;

public class H01 {
    public static void main(String[] args) {
        double height, weight, bmi;

        System.out.print("Please provide your height in meter: ");

        Scanner input = new Scanner (System.in);
        height = input.nextDouble();

        System.out.print("Please provide your weight in kilogram: ");
        weight = input.nextDouble();

        bmi = weight / (height * height);

        System.out.print("Your Body Mass Index equals to " + bmi + ".");
    }
}
