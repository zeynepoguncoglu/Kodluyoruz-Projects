// P13-Divisible-Numbers-Program

/*
    This program asks users for a number till the given number is odd. While asking, it calculates the
    total of the given numbers divisible by 4.
 */

import java.util.Scanner;

public class P13 {
    public static void main(String[] args) {

        int num, count, total;

        total = 0;
        count = 0;

        Scanner input = new Scanner (System.in);

        System.out.print("Please write a number: ");
        num = input.nextInt();

        while (num % 2 != 1) {
            if (num % 4 == 0) {
                System.out.println(num);
                total = total + num;
                System.out.println(total);
                ++count;
            }
            System.out.print("Please write a number: ");
            num = input.nextInt();
        }

        System.out.println(num + "is an odd number.");

        System.out.println("The total of numbers divisible by 4 equals to " + total + ".");

    }
}
