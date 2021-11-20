// H11-Exponential-Number-Calculation-Program

/*
    This program asks for a base and an exponent from user then calculates the exponential number
    by using a recursive method.
 */

import java.util.Scanner;

public class H11 {

    static int num(int a, int b) {

        if (b==0){
            return 1;
        }

        return a * num(a,b-1);
    }

    public static void main(String[] args) {
        int base, exp;

        Scanner input = new Scanner(System.in);

        System.out.print("What is the base?: ");
        base = input.nextInt();

        System.out.print("What is the exponent?: ");
        exp = input.nextInt();

        int result = num(base,exp);
        System.out.println("Result: " + result);

    }
}
