// H13-Prime-Number-Determination-Program

/*
    This program asks for a number from user then determines whether the number is prime or not by
    using a recursive method.
 */

import java.util.Scanner;


public class H13 {

    static boolean isPrime (int num, int i) {
        if (num <= 2)
            return (num == 2) ? true : false;

        if (num % i == 0)
            return false;

        if (i * i > num)
            return true;

        return isPrime(num, i + 1);
    }

    public static void main(String[] args) {

        int num;

        Scanner input= new Scanner(System.in);
        System.out.print("Please write a number: ");
        num = input.nextInt();

        if (isPrime(num,2)) {
            System.out.println(num + " is a prime number.");
        }

        else {
            System.out.println(num + " is not a prime number.");
        }

    }
}
