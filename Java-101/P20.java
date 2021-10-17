// P20-Simple-Banking-Program

/*
    This program is a simple banking application. It asks users username, password and transaction.
    After that it makes simple balance calculations.
 */

import java.util.Scanner;

public class P20 {
    public static void main(String[] args) {

        String userName, password;

        Scanner input = new Scanner(System.in);

        int right = 3;
        int balance = 1500;
        int select;

        while (right > 0) {
            System.out.print("Username :");
            userName = input.nextLine();
            System.out.print("Password : ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Hello, welocome to the Kodluyoruz Bank!");
                System.out.println("1-Para yatırma\n" +
                                    "2-Para Çekme\n" +
                                    "3-Bakiye Sorgula\n" +
                                    "4-Çıkış Yap");
                System.out.print("Please select what you would like to do : ");
                select = input.nextInt();
                switch (select) {
                    case 1:
                        System.out.print("Amount of money : ");
                        int price = input.nextInt();
                        balance += price;
                        System.out.println("Your balance : " + balance);
                        break;
                    case 2:
                        System.out.print("Amount of money : ");
                        price = input.nextInt();
                        if (price > balance) {
                            System.out.println("Your balance is insufficient.");
                        }
                        else {
                            balance -= price;
                            System.out.println("Your balance : " + balance);
                        }
                       break;
                    case 3:
                        System.out.println("Your balance : " + balance);
                    default:
                        break;
                    }
                    System.out.println("See you again.");
                    break;
                }
                else {
                right--;
                System.out.println("Username and/or password is wrong. Please try again");
                if (right == 0) {
                    System.out.println("Your account is blocked. Please communicate to the call center.");
                } else {
                    System.out.println("Your remaining right : " + right);
                }
            }
        }
    }
}




