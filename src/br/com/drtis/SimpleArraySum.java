package br.com.drtis;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SimpleArraySum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        String line = scanner.nextLine();
        List<Integer> list = Arrays.stream(line.split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int sum = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}
