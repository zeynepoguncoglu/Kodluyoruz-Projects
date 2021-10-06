//  P01-Grade-Point-Average-Calculation-Program

/*
    This program asks inputs from users then calculates the average based on the given inputs.
    Based on the calculated average, it decides that the student passes or fails.
 */

import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {

        int maths, physics, chemistry, turkish, history, music;

        Scanner input = new Scanner (System.in);

        System.out.print("Please enter your Maths grade: ");
        maths = input.nextInt();

        System.out.print("Please enter your Physics grade: ");
        physics = input.nextInt();

        System.out.print("Please enter your Chemistry grade: ");
        chemistry = input.nextInt();

        System.out.print("Please enter your Turkish grade: ");
        turkish = input.nextInt();

        System.out.print("Please enter your History grade: ");
        history = input.nextInt();

        System.out.print("Please enter your Music grade: ");
        music = input.nextInt();

        int total = maths + physics + chemistry + turkish + history + music;

        double average = total / 6;

        System.out.println("Your average is: " + average);

        String result;

        result = (average >= 60) ? "Passed!" : "Failed!";

        System.out.println(result);

    }
}
