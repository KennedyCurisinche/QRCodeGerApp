package qr.demo.app;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

import net.glxn.qrgen.javase.QRCode;

public class App {

    public static void main(String[] args) throws Exception {
        ByteArrayOutputStream stream = QRCode
                .from("hello howrd")
                .withSize(250, 250)
                .stream();

        ByteArrayInputStream bis = new ByteArrayInputStream(stream.toByteArray());

        BufferedImage img = ImageIO.read(bis);

        File outputfile = new File("C:\\Users\\sayuri\\Downloads\\qrcode.png");
        ImageIO.write(img, "png", outputfile);

    }

}
