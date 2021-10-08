// P09-Activity-Recommendation-Program

/*
    This program asks users for the temperature. Based on the given temperature, it recommends an activity.
    The program is written by using switch case.
    Besides, it is also written by using if-else conditions alternatively.
 */

import java.util.Scanner;

public class P09 {
    public static void main(String[] args) {

        int temp;

        System.out.print("What is the temperature today in Celcius?: ");
        Scanner input = new Scanner (System.in);
        temp = input.nextInt();

        switch (temp) {

            case 5: case 6: case 7: case 8: case 9: case 10: case 11: case 12: case 13: case 14:
                System.out.print("Temperature is perfect for CINEMA activity!");
                break;
            case 15: case 16: case 17: case 18: case 19: case 20: case 21: case 22: case 23: case 24:
                System.out.print("Temperature is perfect for PICNIC activity!");
                break;
            default:
                String decision = (temp < 5) ? "Temperature is perfect for SKI activity!" :
                                                "Temperature is perfect for SWIMMING activity!";
                System.out.print(decision);
                break;
        }

        /*

        if (temp < 5) {
            System.out.print("Temperature is perfect for SKI activity!");
        }

        else if (temp >= 5 && temp < 15) {
            System.out.print("Temperature is perfect for CINEMA activity!");
        }

        else if (temp >= 15 && temp < 25) {
            System.out.print("Temperature is perfect for PICNIC activity!");
        }

        else if (temp >= 25) {
            System.out.print("Temperature is perfect for SWIMMING activity!");
        }

        */

    }
}
