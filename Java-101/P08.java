// P08-Average-Grade-Calculation-Program

/*
    This program asks users' grades for different classes and calculates the average accordingly.
    If the grade is below 0 or above 100, it is not taken into account for average calculation.
    If the average is below 55, the user fails.
 */

import java.util.Scanner;

public class P08 {
    public static void main(String[] args) {

        int maths, physics, chemistry, turkish, music;

        int total = 0;

        int num = 0;

        Scanner input = new Scanner (System.in);

        System.out.print("Please enter your Maths grade: ");
        maths = input.nextInt();
        if (maths>=0 && maths<=100) {
            total = total + maths;
            num = num + 1;
        }

        System.out.print("Please enter your Physics grade: ");
        physics = input.nextInt();

        if (physics>=0 && physics<=100) {
            total = total + physics;
            num = num + 1;
        }

        System.out.print("Please enter your Chemistry grade: ");
        chemistry = input.nextInt();

        if (chemistry>=0 && chemistry<=100) {
            total = total + chemistry;
            num = num + 1;
        }

        System.out.print("Please enter your Turkish grade: ");
        turkish = input.nextInt();

        if (turkish>=0 && turkish<=100) {
            total = total + turkish;
            num = num + 1;
        }

        System.out.print("Please enter your Music grade: ");
        music = input.nextInt();

        if (music>=0 && music<=100) {
            total = total + music;
            num = num + 1;
        }

        double average = total/num;

        if (average>=55){
            System.out.print("Your final note is " + average + ". You passed!");
        }
        else {
            System.out.print("Your final note is " + average + ". You failed!");
        }
    }
}
