// H08-Reverse-Triangle-Drawing-Program

/*
    This program asks for a number from the user then draws a reverse triangle.
 */

import java.util.Scanner;

public class H08 {
    public static void main(String[] args) {

        int n, line;

        line = 1;

        Scanner input= new Scanner(System.in);
        System.out.print("Please write a number in order to draw a triangle: ");
        n = input.nextInt();

        for (int i = 0; i <= (n-1) ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = (2*n - 2*i - 2); k >= 0; k--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
