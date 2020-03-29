import Util.ChangeZhuZhanUtil;
import Util.ResetCloseUtil;
import org.bytedeco.javacpp.DoublePointer;
import org.bytedeco.opencv.opencv_core.Mat;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import Util.TarnsFormat;
import org.bytedeco.opencv.opencv_core.Point;

import javax.imageio.ImageIO;

import static Context.PointContext.sanjieqiyuan;
import static Task.BangPaiTask.doBangPaiTask;
import static Task.BaoTuTask.doBaoTuTask;
import static Task.BaoTuTask.doWaBaoTuTask;
import static Task.FuBenTask.*;
import static Task.GouMaiGuanZhuTask.doGouMaiGuanZhu;
import static Task.GouMaiGuanZhuTask.qianggou;
import static Task.Kaoshi.kejukaoshi;
import static Task.Kaoshi.sanjieqiyuan;
import static Task.MiJingXiangYaoTask.doMiJingXiangYaoTask;
import static Task.ShiMenTask.doShiMenTask;
import static Task.XinHaoTask.doXinHaoTask;
import static Task.YunBiaoTask.doYunBiaoTask;
import static Task.ZhuaGuiTask.doZhuaGuiTask;

import static Task.ZiDongGuanJiTask.doZiDongGuanJi;
import static Util.ChangeZhuZhanUtil.likai;
import static Util.ChangeZhuZhanUtil.zanli;
import static Util.MouseEventUtil.moveMouseAndClick;
import static java.awt.image.BufferedImage.TYPE_3BYTE_BGR;
import static org.bytedeco.opencv.global.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_highgui.imshow;
import static org.bytedeco.opencv.global.opencv_highgui.waitKey;
import static org.bytedeco.opencv.global.opencv_imgcodecs.imread;
import static org.bytedeco.opencv.global.opencv_imgproc.CV_TM_SQDIFF;
import static org.bytedeco.opencv.global.opencv_imgproc.matchTemplate;
import static org.opencv.core.CvType.CV_8UC3;


public class testClass {

    public static  void main(String[] args) throws AWTException,IOException,InterruptedException {
        Robot robot = new Robot();
//        doXinHaoTask(robot);
//        qianggou(robot);
        // 侠士副本,木木在第四个，梦幻在第五个
//        doXiaShiFuBenTask(robot);

//        doZhuaGuiTask(robot);
        // 普通副本
        delayMinute(0);
        ResetCloseUtil.closeAllWindows(robot);
        robot.delay(5000);
        doLvYanRuMengPuTongFuBenTask(robot);
        doLiuLiSuiPuTongFuBenTask(robot);
//        doZhuaGuiTask(robot);
//        zanli(robot);
        likai(robot);
        // 师门脚本
        doShiMenTask(robot);

//        sanjieqiyuan(robot);
//        kejukaoshi(robot);
        // 完成挖宝图的任务
        doBaoTuTask(robot);
//        //抓鬼脚本


        // 个人任务


        // 秘境
        doMiJingXiangYaoTask(robot);
        // 跑镖
        doYunBiaoTask(robot);

        // 帮派任务
//        doBangPaiTask(robot);

        // 挖宝图
//        doWaBaoTuTask(robot);
        // 购买
//        doGouMaiGuanZhu(robot);

//        doXinHaoTask(robot);
//        doXinHaoLuanDianTask(robot);

//         自动关机
        for(int i=0;i<2;i++){
            doZiDongGuanJi(robot);
            robot.delay(5000);
        }

    }









}
