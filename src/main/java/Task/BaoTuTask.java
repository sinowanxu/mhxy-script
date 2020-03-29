package Task;

import Context.PointContext;
import Util.ResetCloseUtil;
import org.bytedeco.opencv.opencv_core.Point;

import java.awt.*;
import java.io.IOException;
import java.util.Random;

import static Util.MouseEventUtil.moveMouseAndClick;
import static Util.PointUtil.getPoint;
import static Util.PointUtil.isContainColor;

public class BaoTuTask {
    public static void doBaoTuTask(Robot robot)throws IOException,AWTException {

        ResetCloseUtil.closeAllWindows(robot);
        robot.delay(5000);

        moveMouseAndClick(robot,PointContext.ditu.x,PointContext.ditu.y);
        robot.delay(1000);
        moveMouseAndClick(robot,PointContext.changan.x,PointContext.changan.y);
        robot.delay(1000);
        moveMouseAndClick(robot,PointContext.xiaoditu.x,PointContext.xiaoditu.y);
        robot.delay(1000);
        moveMouseAndClick(robot,PointContext.dianxiaoer.x,PointContext.dianxiaoer.y);
        robot.delay(10000);
        moveMouseAndClick(robot,PointContext.baotu_tingtingwufang.x,PointContext.baotu_tingtingwufang.y);
        robot.delay(1000);
        for(int i=0;i<3;i++){
            moveMouseAndClick(robot,PointContext.renwulan1.x,PointContext.renwulan1.y);
        }

        for(int i=0;i<15;i++){
            robot.delay(60000);
        }




    }

    public static void doWaBaoTuTask(Robot robot) throws AWTException{
        // 点击包裹
        moveMouseAndClick(robot,PointContext.baoguo.x, PointContext.baoguo.y);
        robot.delay(1000);
        // 点击第10格宝图
        moveMouseAndClick(robot,PointContext.baoguo_10.x, PointContext.baoguo_10.y);
        robot.delay(1000);
        // 点击使用
        moveMouseAndClick(robot,PointContext.baotu_shiyong.x, PointContext.baotu_shiyong.y);
        robot.delay(1000);
        new Thread(new Runnable() {
            public void run() {
                try {
                    Robot robot = new Robot();
                    while(true){
                        robot.delay(3000);
                        if(isContainColor(PointContext.baotu_jixuwa.x,PointContext.baotu_jixuwa.y,PointContext.baotu_jixuwa_color)){
                            moveMouseAndClick(robot,PointContext.baotu_jixuwa.x,PointContext.baotu_jixuwa.y);
                        }
                    }

                }catch (AWTException e){
                    e.printStackTrace();
                }

            }
        }).start();

    }
}
