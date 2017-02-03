package br.com.drtis;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by webmaster on 27/01/17.
 */
public class PlusMinus {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int size = numbers.length;

        double positive = 0;
        double zero = 0;
        double negative = 0;

        for (int n : numbers) {
            if (n > 0)
                positive++;
            else if (n == 0)
                zero++;
            else
                negative++;
        }

        System.out.println(positive/size);
        System.out.println(negative/size);
        System.out.println(zero/size);
    }
}
