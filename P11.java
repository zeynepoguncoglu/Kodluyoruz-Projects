// P11-Horoscope-Finding-Program

/*
    This program asks users for their birthdate in terms of day and month. Then it calculates
    user's horoscope.
 */

import java.util.Scanner;

public class P11 {
    public static void main(String[] args) {

        int day, month;

        String horoscope;

        Scanner input = new Scanner (System.in);

        System.out.println("When is your birthdate?");

        System.out.print("Day: ");
        day = input.nextInt();

        System.out.print("Month: ");
        month = input.nextInt();

        if (day<=0 || day>31 || month<=0 || month>12) {
            System.out.println("You provided wrong input.");
        }

        else if (month == 1) {
            horoscope = (day<=21) ? "Capricorn" : "Aquarius";
            System.out.print("Your horoscope is " + horoscope);
        }

        else if (month == 2) {
            horoscope = (day<=21) ? "Aquarius" : "Pisces";
            System.out.print("Your horoscope is " + horoscope);
        }

        else if (month == 3) {
            horoscope = (day<=20) ? "Pisces" : "Aries";
            System.out.print("Your horoscope is " + horoscope);
        }

        else if (month == 4) {
            horoscope = (day<=20) ? "Aries" : "Taurus";
            System.out.print("Your horoscope is " + horoscope);
        }

        else if (month == 5) {
            horoscope = (day<=21) ? "Taurus" : "Gemini";
            System.out.print("Your horoscope is " + horoscope);
        }

        else if (month == 6) {
            horoscope = (day<=22) ? "Gemini" : "Cancer";
            System.out.print("Your horoscope is " + horoscope);
        }

        else if (month == 7) {
            horoscope = (day<=22) ? "Cancer" : "Leo";
            System.out.print("Your horoscope is " + horoscope);
        }

        else if (month == 8) {
            horoscope = (day<=22) ? "Leo" : "Virgo";
            System.out.print("Your horoscope is " + horoscope);
        }

        else if (month == 9) {
            horoscope = (day<=22) ? "Virgo" : "Libra";
            System.out.print("Your horoscope is " + horoscope);
        }

        else if (month == 10) {
            horoscope = (day<=22) ? "Libra" : "Scorpio";
            System.out.print("Your horoscope is " + horoscope);
        }

        else if (month == 11) {
            horoscope = (day<=21) ? "Scorpio" : "Sagittarius";
            System.out.print("Your horoscope is " + horoscope);
        }

        else if (month == 12) {
            horoscope = (day<=21) ? "Sagittarius" : "Capricorn";
            System.out.print("Your horoscope is " + horoscope);
        }
    }
}
