package Util;

import org.bytedeco.opencv.opencv_core.Mat;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import static org.bytedeco.opencv.global.opencv_imgcodecs.imread;

public class MatUtil {
    public static Mat getScreenMat(Robot robot) throws IOException {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Rectangle screenRectangle = new Rectangle(screenSize);
        BufferedImage image = robot.createScreenCapture(screenRectangle);
        File screenFile = new File("F:\\test\\src\\main\\resources\\image\\pic1.png");
        ImageIO.write(image, "png", screenFile);
        return imread("F:\\test\\src\\main\\resources\\image\\pic1.png");
    }
}
