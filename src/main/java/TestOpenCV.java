import org.bytedeco.javacpp.DoublePointer;

import org.bytedeco.opencv.opencv_core.Mat;
import org.bytedeco.opencv.opencv_core.Point;
import org.bytedeco.opencv.opencv_imgproc.*;


import java.io.File;

import static org.bytedeco.opencv.global.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_highgui.imshow;
import static org.bytedeco.opencv.global.opencv_highgui.waitKey;
import static org.bytedeco.opencv.global.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;

public class TestOpenCV {
    public static void main(String[] args) {
        String filename = "F:\\test\\src\\main\\resources\\image\\baotu.png";
        String filename1 = "F:\\test\\src\\main\\resources\\image\\pic1.png";
        // image匹配图，image1原图
        Mat temp = imread(filename);
        Mat img = imread(filename1);
        Mat result = new Mat(img.cols() - temp.cols() + 1, img.rows() - temp.rows() + 1, CV_32FC1);
        matchTemplate(img, temp, result, CV_TM_SQDIFF);
        normalize(result, result, 0, 1, NORM_MINMAX, -1, new Mat());
        imshow("result", result);
//        imwrite("F:\\test\\src\\main\\resources\\image\\result.jpg", result);
        DoublePointer d1 = new DoublePointer();
        DoublePointer d2 = new DoublePointer();
        Point p1 = new Point();
        Point p2 = new Point();
        Point point=new Point();
        Mat mat = new Mat();
        minMaxLoc(result, d1, d2, p1, p2, mat);

        point = new Point(p1.x()+temp.rows()/2,p1.y()+temp.cols()/2);
        System.out.println("x:"+point.x()+"y:"+point.y());
//        rectangle(img, new Rect(point.x(), point.y(), temp.cols(), temp.rows()),new Scalar(), 1, 8, 0);
//        imshow("find_result", img);
//        imwrite("find_result.jpg", img);

        waitKey();


    }
}
