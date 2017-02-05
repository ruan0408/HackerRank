package br.com.drtis;

import java.util.Scanner;

/**
 * Created by ruan0408 on 5/2/17.
 */
public class JavaExceptions2 {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int p = scanner.nextInt();

            if (n < 0 || p < 0)
                System.out.println("java.lang.Exception: n and p should be non-negative");
            else
                System.out.println((int) Math.pow(n, p));
        }
    }
}
