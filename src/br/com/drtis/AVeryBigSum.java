package br.com.drtis;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by webmaster on 27/01/17.
 */
public class AVeryBigSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        String[] numbers = scanner.nextLine().split(" ");
        long sum = Arrays.stream(numbers).mapToLong(Long::parseLong).sum();

        System.out.println(sum);


    }
}
