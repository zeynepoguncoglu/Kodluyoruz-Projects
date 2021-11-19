// HR04

import java.util.*;
import java.io.*;

public class HR04 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();

        int i = 1;
        int result;

        while (i<=10) {
            result = N*i;
            System.out.println(N + " x " + i + " = " + result);
            i++;
        }

    }
}
