package Util;

import Context.PointContext;
import org.bytedeco.javacpp.BytePointer;
import org.bytedeco.javacpp.DoublePointer;
import org.bytedeco.opencv.opencv_core.Mat;
import org.bytedeco.opencv.opencv_core.Point;
import org.bytedeco.opencv.opencv_core.UMat;
import org.opencv.core.Core;
import sun.awt.resources.awt;

import java.awt.*;
import java.io.IOException;


import static Util.ColorUtil.getColor;
import static Util.MatUtil.getScreenMat;
import static org.bytedeco.opencv.global.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_highgui.imshow;
import static org.bytedeco.opencv.global.opencv_highgui.waitKey;
import static org.bytedeco.opencv.global.opencv_imgcodecs.imread;
import static org.bytedeco.opencv.global.opencv_imgproc.*;

import java.awt.*;

public class PointUtil {
    public static Point getPoint(Robot robot, String tempPath, boolean isWaitTask) throws IOException {
        Mat screen = getScreenMat(robot);
        Mat baotu = imread(tempPath);
        Mat result = new Mat(screen.cols() - baotu.cols() + 1, screen.rows() - baotu.rows() + 1, CV_32FC1);
        matchTemplate(screen, baotu, result, CV_TM_SQDIFF_NORMED);
//        normalize(result, result, 0, 1, NORM_MINMAX, -1, new Mat());


//        imshow("result", result);
//        waitKey(0);
//        imwrite("F:\\test\\src\\main\\resources\\image\\result.jpg", result);
        double[] d1 = new double[100];
        double[] d2 = new double[100];
        Point p1 = new Point();
        Point p2 = new Point();
        Point point = new Point();
        Mat mat = new Mat();
        minMaxLoc(result, d1, d2, p1, p2, null);
        if (isWaitTask) {
            if (d1[0] < 0.1) {
                point = new Point(p1.x() + baotu.rows() / 2, p1.y() + baotu.cols() / 2);
                return point;
            } else {
                return null;
            }
        } else {
            point = new Point(p1.x() + baotu.rows() / 2, p1.y() + baotu.cols() / 2);
            return point;
        }
    }

    public static boolean isContainColor(int x, int y, int color) throws AWTException {
        boolean b = false;
        for (int i = -5; i < 5; i++) {
            for (int j = -5; j < 5; j++) {
                if (getColor(x + i, y + j).getRGB() == color) {
                    b = true;
                    break;
                }

            }
        }
        return b;

    }
    public static boolean isContainColor_quick(int x, int y, int color) throws AWTException {
        boolean b = false;
                if (getColor(x , y ).getRGB() == color) {
                    b = true;
                }
        return b;

    }
}