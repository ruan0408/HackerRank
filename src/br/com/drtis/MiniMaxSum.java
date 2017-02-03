package br.com.drtis;
/**
 * Created by ruan0408 on 29/1/17.
 */

import java.util.*;

public class MiniMaxSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long[] ints = Arrays.stream(scanner.nextLine().split(" ")).mapToLong(Long::parseLong).toArray();

        Arrays.sort(ints);

        long min = ints[0] + ints[1] + ints[2] + ints[3];
        long max = ints[1] + ints[2] + ints[3] + ints[4];

        System.out.println(min + " " + max);

    }
}
