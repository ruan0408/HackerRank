package br.com.drtis;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by webmaster on 27/01/17.
 */
public class DiagonalDifference {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[n][];

        for (int i = 0; i < n; i++) {
            String[] numbers = scanner.nextLine().split(" ");
            matrix[i] = Arrays.stream(numbers).mapToInt(Integer::parseInt).toArray();
        }

        int sumMainDiagonal = 0;
        int sumSecondaryDiagonal = 0;
        for (int i = 0; i < n; i++) {
            sumMainDiagonal += matrix[i][i];
            sumSecondaryDiagonal += matrix[i][n-1-i];
        }

        System.out.println(Math.abs(sumMainDiagonal - sumSecondaryDiagonal));

    }
}
