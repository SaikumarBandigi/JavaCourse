package qr_code;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class FinalQR {
    public static void main(String[] args) throws IOException, WriterException {

        String qrContent = "Holla!! this is sai bandigi.. ";
        String imagePath = "C:\\Users\\bandi\\OneDrive\\Documents\\PrintWriter\\sonu.jpg";
        String outputPath = "C:\\Users\\bandi\\OneDrive\\Documents\\PrintWriter\\output_qr_code.png";

        generateQRCodeWithImage(qrContent, imagePath, outputPath);
    }

    private static void generateQRCodeWithImage(String qrContent, String imagePath, String outputPath)
            throws IOException, WriterException {
        int qrSize = 300; // You can adjust the size of the QR code here


        /*
           QRCodeWriter writer = new QRCodeWriter();
           BitMatrix bitMatrix = writer.encode(textToEncode, BarcodeFormat.QR_CODE, width, height);
            BufferedImage qrImage = MatrixToImageWriter.toBufferedImage(bitMatrix);
         */

        // Generate the QR code
        QRCodeWriter qrCodeWriter = new QRCodeWriter();
        BitMatrix bitMatrix = qrCodeWriter.encode(qrContent, BarcodeFormat.QR_CODE, qrSize, qrSize);
        // Load the image
        BufferedImage image = ImageIO.read(new File(imagePath));
        BufferedImage qrImage = MatrixToImageWriter.toBufferedImage(bitMatrix);


        // Create a new BufferedImage to combine QR code and image
        BufferedImage combined = new BufferedImage(qrSize, qrSize, BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics = (Graphics2D) combined.getGraphics();
        graphics.setColor(Color.WHITE);
        graphics.fillRect(0, 0, qrSize, qrSize);
        graphics.drawImage(image, 70, 50, qrSize - 100, qrSize - 100, null);
        graphics.setColor(Color.BLACK);

        // Add the QR code to the combined image
        for (int i = 0; i < qrSize; i++) {
            for (int j = 0; j < qrSize; j++) {
                if (bitMatrix.get(i, j)) {
                    graphics.fillRect(i, j, 1, 1);
                }
            }
        }

        // Save the combined image as PNG
        ImageIO.write(combined, "PNG", new File(outputPath));
    }
}
