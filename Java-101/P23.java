// P23-Fibonacci-Number-Calculation-Program

/*
    This program asks for a number from the user then calculates the fibonacci number
    by using a recursive method.
 */


import java.util.Scanner;

public class P23 {

    static int fibonacciNum(int num){

        if (num == 1 || num == 2) {
            return 1;
        }

        return fibonacciNum(num-1) + fibonacciNum(num-2);
    }

    public static void main(String[] args) {

        int num;

        Scanner input= new Scanner(System.in);
        System.out.print("Please write a number: ");
        num = input.nextInt();

        System.out.println(fibonacciNum(num));

        }
}
