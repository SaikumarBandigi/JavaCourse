package _10_series_Exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exception4 {
    public static void main(String[] args) {

        int i = 4, j, k = 0;


        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            j = Integer.parseInt(br.readLine());

            k = i / j;
            System.out.println(k);

        } catch (IOException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
            // e.printStackTrace();
        }

    }
}
