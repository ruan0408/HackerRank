package br.com.drtis;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by ruan0408 on 28/1/17.
 */
public class CircularArrayRotation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();

        in.nextLine();

        List<Integer> list = Arrays.stream(in.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int rotations = k % n;

        int startIndex = n - rotations;


        List<Integer> frontPart = list.subList(startIndex, list.size());
        List<Integer> endPart = list.subList(0, startIndex);

        frontPart.addAll(endPart);


        for(int a0 = 0; a0 < q; a0++){
            int m = in.nextInt();
            System.out.println(frontPart.get(m));
        }

    }
}
