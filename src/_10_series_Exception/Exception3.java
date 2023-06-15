package _10_series_Exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Exception3 {
    public static void main(String[] args) {

        int i = 0, j, k = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            j = Integer.parseInt(br.readLine());

            k = i / j;

        } catch (IOException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(k);

    }
}
