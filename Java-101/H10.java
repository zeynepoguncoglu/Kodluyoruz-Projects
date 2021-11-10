// H10-Fibonacci-Number-Calculation-Program

/*
    This program asks for a number from the user then calculates the fibonacci number.
 */

import java.util.Scanner;

public class H10 {
    public static void main(String[] args) {

        int num, count, num1, num2, total;

        count = 1;
        num1 = 0;
        num2 = 1;

        Scanner input= new Scanner(System.in);
        System.out.print("Please write a number: ");
        num = input.nextInt();

        while (count < num) {

            total = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + total);
            num1 = num2;
            num2 = total;
            count ++;

        }
    }
}
