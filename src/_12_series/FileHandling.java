package _12_series;

import java.io.*;

public class FileHandling {
    public static void main(String[] args) throws IOException {


        File file = new File("C:\\Users\\bandi\\OneDrive\\Documents\\PrintWriter\\Ratna.txt");


        FileOutputStream fileOutputStream = new FileOutputStream(file);
        DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);

       dataOutputStream.writeUTF("sai kumar");

/*
***************************************************
 */


//        FileInputStream fileInputStream=new FileInputStream(file);
//        DataInputStream dataInputStream= new DataInputStream(fileInputStream);
//       String s= dataInputStream.readUTF();
//        System.out.println(s);

    }
}
