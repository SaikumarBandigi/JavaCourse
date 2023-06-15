package _10_series_Exception;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Code {
    public static void main(String[] args) {

        int i = 10, j = 0, k = 0;
try {
    k = i / j;
}catch (Exception e) {
    System.out.println(e);
}
        System.out.println(k);

    }
}