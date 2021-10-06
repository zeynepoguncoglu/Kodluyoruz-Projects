// H02-Total-Price-Calculation-Program

/*
    This program asks input from users in order to calculate total price of a grocery shopping.
    It takes kilogram information for each product then makes the necessary calculation
    so as to determine total price.
    It is assumed that the kilogram given is in the normal limits (equal or above to zero).
*/

import java.util.Scanner;

public class H02 {
    public static void main(String[] args) {

        double pear, apple, tomato, banana, aubergine, totalPrice;

        int kgPear, kgApple, kgTomato, kgBanana, kgAubergine;

        pear = 2.14;
        apple = 3.67;
        tomato = 1.11;
        banana = 0.95;
        aubergine = 5.00;

        System.out.print("Pear kg?: ");
        Scanner input = new Scanner (System.in);
        kgPear = input.nextInt();

        System.out.print("Apple kg?: ");
        kgApple = input.nextInt();

        System.out.print("Tomato kg?: ");
        kgTomato = input.nextInt();

        System.out.print("Banana kg?: ");
        kgBanana = input.nextInt();

        System.out.print("Aubergine kg?: ");
        kgAubergine = input.nextInt();

        totalPrice = (kgPear * pear) + (kgApple * apple) + (kgTomato * tomato) +
                     (kgBanana * banana) + (kgAubergine * aubergine);

        System.out.print("Total Price: " + totalPrice + " TL");

    }

}
