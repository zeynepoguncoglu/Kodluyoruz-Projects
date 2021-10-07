//  P07-Username-Password-Program

/*
    This program is a basic login page. It asks for username and password from the users.
    It checks the username and password then asks for password reset if needed.
 */

import java.util.Scanner;

public class P07 {
    public static void main(String[] args) {

        String userName, password, newPassword, reply;

        System.out.print("Please enter your username: ");
        Scanner input = new Scanner (System.in);
        userName = input.nextLine();

        System.out.print("Please enter your password: ");
        password = input.nextLine();

        if (userName.equals("zzz") && password.equals("1234")) {
            System.out.println("Welcome " + userName + "!");
        }

        else if (userName.equals("zzz") && !password.equals("1234")) {
            System.out.println("Wrong password! Would you like to reset your password?\nYes\nNo ");
            reply = input.nextLine();
            if (reply.equals("Yes")){
                System.out.println("Please enter your new password: ");
                newPassword = input.nextLine();
                if (newPassword.equals(password) || newPassword.equals("1234")){
                    System.out.println("The password cannot be updated. Please try again.");
                }
                else {
                    System.out.println("Your password is updated successfully!");
                }
            }
            else {
                System.out.println("You didn't want to reset your password for now.");
            }
        }

        else {
            System.out.println("Your username or password is incorrect. Please try again.");
        }

    }
}
