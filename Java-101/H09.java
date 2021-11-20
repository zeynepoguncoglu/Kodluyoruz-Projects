// H09-Prime-Number-Calculation-Program

/*
    This program calculates the prime numbers between 1 and 100.
 */

public class H09 {
    public static void main(String[] args) {

        for (int i=2; i<=100; i++) {
            int checkPoint = 0;
            for (int j=2; j<i; j++) {
                if (i%j == 0) {
                    checkPoint = 1;
                    break;
                }
            }

            if (checkPoint == 0) {
                System.out.print(i + " ");
            }
        }

    }
}
