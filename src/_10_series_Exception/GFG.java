package _10_series_Exception;

// Java program to demonstrate the working
// of throws keyword in exception handling

import java.io.*;
import java.util.*;

public class GFG {

    public static void writeToFile() throws Exception {
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\bandi\\OneDrive\\Documents\\PrintWriter\\myFile.txt"));
        bw.write("Test");
        bw.close();
        System.out.println("sai");
    }

    public static void main(String[] args) throws Exception {
        try {
            writeToFile();
            System.out.println("success");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
