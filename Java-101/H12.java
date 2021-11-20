// H12-Creating-Recursive-Method-Program

/*
    This program asks for a number from user then prints a pattern by using a recursive method.
 */

import java.util.Scanner;

public class H12 {

    static int addition (int n, int original) {

        if (n==original) {
            System.out.print(n + " ");
            return n;
        }

        System.out.print(n + " ");
        return addition(n+5, original);

    }

    static int substraction (int n, int original) {

        if (n<=0) {
            return addition(n, original);
        }

        System.out.print(n + " ");
        return substraction(n-5, original);

    }

    public static void main(String[] args) {
        int num;

        Scanner input = new Scanner(System.in);

        System.out.print("Please write a number: ");
        num = input.nextInt();

        substraction(num, num);




    }
}
