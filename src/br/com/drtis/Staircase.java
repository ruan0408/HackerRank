package br.com.drtis;/**
 * Created by ruan0408 on 28/1/17.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Staircase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        String hashes = "";

        char[] chars = new char[n];
        Arrays.fill(chars, ' ');
        String spaces = new String(chars);

        for (int i = 0; i < n; i++) {
            hashes += "#";
            spaces = spaces.substring(0, spaces.length() - 1);
            System.out.println(spaces + hashes);
        }
    }
}
