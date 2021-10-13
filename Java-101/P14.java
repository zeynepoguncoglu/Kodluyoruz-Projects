// P14-Power-of-Numbers-Program

/*
    This program asks users for a number then prints the powers of number 4 and 5 till the loop
    reaches the given number.
 */

import java.util.Scanner;

public class P14 {
    public static void main(String[] args) {

        int num;

        Scanner input = new Scanner (System.in);

        System.out.print("Please write a number: ");
        num = input.nextInt();

        System.out.println("Power of number 4 and 5: " + (int) Math.pow(4,0));

        for (int i=1; i<=num; i=i+1) {
            if (Math.pow(4,i)<=num) {
                int a = (int) Math.pow(4,i);
                System.out.println("Power of number 4: " + a);
            }
            if (Math.pow(5,i)<=num) {
                int b = (int) Math.pow(5,i);
                System.out.println("Power of number 5: " + b);
            }
        }

    }
}
