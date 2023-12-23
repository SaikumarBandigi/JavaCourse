package qr_code;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

public class QRCodeGenerator {

    public static void main(String[] args) {
        String textToEncode = "Your text goes here"; // Replace this with the text you want in the QR code
        int width = 300; // QR code width in pixels
        int height = 300; // QR code height in pixels
        String format = "png"; // Image format (you can also use "jpg", "gif", etc.)

        try {
            // Create QR code writer
            QRCodeWriter writer = new QRCodeWriter();
            BitMatrix bitMatrix = writer.encode(textToEncode, BarcodeFormat.QR_CODE, width, height);

            // Create the BufferedImage for the QR code
            BufferedImage qrImage = MatrixToImageWriter.toBufferedImage(bitMatrix);

            // Save the QR code image to a file
            File qrFile = new File("C:\\Users\\bandi\\OneDrive\\Documents\\PrintWriter\\qrcode." + format);
            ImageIO.write(qrImage, format, qrFile);

            System.out.println("QR code has been generated successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
