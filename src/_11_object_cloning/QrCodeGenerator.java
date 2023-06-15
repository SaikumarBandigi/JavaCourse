package _11_object_cloning;


import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

import java.io.*;

public class QrCodeGenerator {
    public static void main(String[] args) throws IOException {

        String details = "Sai Kumar Bandigi";

        ByteArrayOutputStream out = QRCode.from(details).to(ImageType.JPG).stream();


        File f = new File("C:\\Users\\bandi\\OneDrive\\Documents\\PrintWriter\\MyChannel.jpg");


        FileOutputStream fos = new FileOutputStream(f);

        fos.write(out.toByteArray());


        fos.flush();
/*
I would like to express my heartfelt thanks to your entire team for arranging such a remarkable event.

 */

    }
}
