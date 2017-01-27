package br.com.drtis;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by webmaster on 27/01/17.
 */
public class CompareTheTriplets {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         String[] alice = scanner.nextLine().split(" ");
         String[] bob = scanner.nextLine().split(" ");

         Integer[] aliceIntegers = Arrays.stream(alice).map(Integer::parseInt).toArray(Integer[]::new);
         Integer[] bobIntegers = Arrays.stream(bob).map(Integer::parseInt).toArray(Integer[]::new);

         int aliceCount = 0, bobCount = 0;

         for (int i = 0; i < aliceIntegers.length; i++) {
             if (aliceIntegers[i] > bobIntegers[i])
                 aliceCount++;
             else if (bobIntegers[i] > aliceIntegers[i])
                 bobCount++;
         }

         System.out.println(aliceCount + " " + bobCount);
     }
}
