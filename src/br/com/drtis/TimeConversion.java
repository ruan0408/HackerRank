package br.com.drtis;
/**
 * Created by ruan0408 on 28/1/17.
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class TimeConversion {

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        line = line.substring(0, line.length()-2) + " " + line.substring(line.length()-2);

        SimpleDateFormat inputFormat = new SimpleDateFormat("hh:mm:ss a");
        SimpleDateFormat outputFormat = new SimpleDateFormat("HH:mm:ss");

        Date date = inputFormat.parse(line);

        System.out.println(outputFormat.format(date));
    }
}
