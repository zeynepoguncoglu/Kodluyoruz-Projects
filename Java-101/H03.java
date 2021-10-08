// H03-Flight-Price-Calculation-Program

/*
    This program asks input from users in order to calculate total price of a flight.
    It takes kilometer, age and journey type information from the user.
    Accordingly, it gives a discount.
*/

import java.util.Scanner;

public class H03 {
    public static void main(String[] args) {

        int distance, age, type;

        double kmRate, total;

        kmRate = 0.10;

        Scanner input = new Scanner (System.in);
        System.out.print("What is the distance?: ");
        distance = input.nextInt();

        System.out.print("What is your age?: ");
        age = input.nextInt();

        System.out.print("What is your travel type?\n1- One-Way\n2- Round-Trip\n");
        type = input.nextInt();

        if (distance < 0 || age < 0 || type<1 || type>2 ) {
            System.out.print("You provided wrong input.");
        }

        else {

            total = kmRate * distance;

            if (age < 12) {
                total = total - (total*0.5);
            }

            else if (age >= 12 && age <=24) {
                total = total - (total*0.1);
            }

            else if (age >= 65) {
                total = total - (total*0.3);
            }

            if (type == 2) {
                total = (total - (total*0.2));
                System.out.println("Total amount to be paid: " + (total*2));
            }

            else {
                System.out.println("Total amount to be paid: " + total);
            }
        }
    }
}
