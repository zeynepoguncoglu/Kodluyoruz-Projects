//  P06-Calculator-Program

/*
    This program is a basic calculator which supports four basic operations.
    It asks input from users then makes the necessary calculations by using switch case blocks.
 */

import java.util.Scanner;

public class P06 {
    public static void main(String[] args) {

        int num1, num2, selection;

        System.out.print("Please enter the 1st number: ");
        Scanner input = new Scanner (System.in);
        num1 = input.nextInt();

        System.out.print("Please enter the 2nd number: ");
        num2 = input.nextInt();

        System.out.print("Please make the operation selection: \n1- Addition\n2- Subtraction\n" +
                         "3- Multiplication\n4- Division\n");
        selection = input.nextInt();

        switch (selection) {

            case 1:
                System.out.println("You selected 1- Addition.\n" + num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case 2:
                System.out.println("You selected 2- Subtraction.\n" + num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case 3:
                System.out.println("You selected 3- Multiplication.\n" + num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("A number cannot be divided by 0.");
                    break;
                }
                System.out.println("You selected 4- Division.\n" + num1 + " / " + num2 + " = " + (num1 / num2));
                break;
            default:
                System.out.println("You made a wrong selection.");
                break;
        }
    }
}

