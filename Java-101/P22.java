// P22-Palindrome-Number-Program

/*
    This program shows the number is palindrome or not.
 */


public class P22 {

    static boolean isPalindrome(int num) {

        int temp = num;
        int reverseNum = 0;
        int lastNum;

        while (temp!=0) {
            lastNum = temp %10;
            reverseNum = (reverseNum*10)+lastNum;
            temp /= 10;
        }

        if (num == reverseNum) {
            return true;
        }

        else {
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(363));

    }
}
