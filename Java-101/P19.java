// P19-Diamond-with-Stars-Program

/*
    This program asks users an odd number then prints a diamond by using stars..
 */

import java.util.Scanner;

public class P19 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please write an odd number: ");
        int n = input.nextInt();

        for (int i = 0; i < (n-1)/2 ; i++) {
            for (int j = 0; j < ((n-1)/2 - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        for (int k = 1; k <= n; k++) {
            System.out.print("*");
        }

        System.out.println(" ");

        for (int i = 0; i < (n-1)/2 ; i++) {
            for (int j = (n-1)/2; j >= ((n-1)/2 - i); j--) {
                System.out.print(" ");
            }
            for (int k = (n-2*i-2); k > (0); k--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
