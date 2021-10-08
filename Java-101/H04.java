// H04-Chinese-Horoscope-Calculation-Program

/*
    This program asks birth year from users in order to calculate their Chinese Horoscope.
*/

import java.util.Scanner;

public class H04 {
    public static void main(String[] args) {

        int birthYear, remainder;

        Scanner input = new Scanner (System.in);

        System.out.print("What is your birth year?: ");
        birthYear = input.nextInt();

        remainder = birthYear % 12;

        switch (remainder) {
            case 1:
                System.out.println("Your Chinese Horoscope is Horoz.");
                break;
            case 2:
                System.out.println("Your Chinese Horoscope is Köpek.");
                break;
            case 3:
                System.out.println("Your Chinese Horoscope is Domuz.");
                break;
            case 4:
                System.out.println("Your Chinese Horoscope is Fare.");
                break;
            case 5:
                System.out.println("Your Chinese Horoscope is Öküz.");
                break;
            case 6:
                System.out.println("Your Chinese Horoscope is Kaplan.");
                break;
            case 7:
                System.out.println("Your Chinese Horoscope is Tavşan.");
                break;
            case 8:
                System.out.println("Your Chinese Horoscope is Ejderha.");
                break;
            case 9:
                System.out.println("Your Chinese Horoscope is Yılan.");
                break;
            case 10:
                System.out.println("Your Chinese Horoscope is At.");
                break;
            case 11:
                System.out.println("Your Chinese Horoscope is Koyun.");
                break;
            default:
                System.out.println("Your Chinese Horoscope is Maymun.");
                break;
        }
    }
}
